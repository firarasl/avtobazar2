package az.autobazar.repository.impl;

import az.autobazar.domain.Role;
import az.autobazar.domain.User;
import az.autobazar.domain.UserStatus;
import az.autobazar.repository.ConnectionPool;
import az.autobazar.repository.SqlQuery;
import az.autobazar.repository.UserRepository;
import az.autobazar.util.JdbcUtil;
import az.autobazar.util.SecurityUtil;
import org.apache.log4j.Logger;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static az.autobazar.constants.ConfigurationConstants.TOKEN_EXPIRE_DURATION;

public class UserRepositoryImpl implements UserRepository {

    private static final Logger logger = Logger.getLogger(UserRepositoryImpl.class.getName());

    @Override
    public boolean checkEmail(String email) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean result = false;

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.CHECK_EMAIL);
            ps.setString(1, email);
            rs = ps.executeQuery();
            result = rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return result;
    }

    @Override
    public boolean checkMobile(String mobile) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean result = false;

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.CHECK_MOBILE);
            ps.setString(1, mobile);
            ps.setString(2, mobile);
            rs = ps.executeQuery();
            result = rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return result;
    }

    @Override
    public void addUser(User user) {
        // 4.register user
        // 4.1.insert into user
        // 4.2.insert into user role
        // 4.3.generate token and insert token
        // 4.4.send activation email

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean success = true;

        try {
            connection = ConnectionPool.getConnection();

              /*
            *  public static final String ADD_USER = "insert into user(name, surname, email, password, mobile1, user_status, status) " +
            "values(?, ?, ?, ?, ?,  0, 1)";
            * */
            // 4.1.insert into user
            ps = connection.prepareStatement(SqlQuery.ADD_USER, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getName());
            ps.setString(2, user.getSurname());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());

            if (user.getMobile1() != null) {
                ps.setString(5, user.getMobile1());
            } else {
                ps.setNull(5, Types.VARCHAR);
            }

            int count = ps.executeUpdate();

            if (count > 0) {
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    long id = rs.getLong(1);
                    user.setId(id);
                }

                // 4.2.insert into user role
                ps = connection.prepareStatement(SqlQuery.ADD_USER_ROLE);
                ps.setLong(1, user.getId());
                ps.setInt(2, Role.AUTOBAZAR_USER.getId());
                count = ps.executeUpdate();
                if (count > 0) {

                    // 4.3.generate token and insert token
//                    public static final String ADD_TOKEN = "insert into token(
//                    value, type, user_id, generation_time, expire_time) " +
//                            "values(?, ?, ?, ?, ?)";
                    ps = connection.prepareStatement(SqlQuery.ADD_TOKEN);
                    String token = SecurityUtil.generateToken();
                    ps.setString(1, token);
                    ps.setInt(2, 0);
                    ps.setLong(3, user.getId());
                    ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                    ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now().plusDays(TOKEN_EXPIRE_DURATION)));
                    count = ps.executeUpdate();
                    if (count > 0) {

                        // todo 4.4.send activation email
                    } else {
                        success = false;
                    }
                } else {
                    success = false;
                }

            } else {
                success = false;
            }

            if (success) {
                connection.commit();
                System.out.println("registrion complete");
            } else {
                connection.rollback();
                System.out.println("registration failure");
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            throw new RuntimeException("Error occurred registration for user = " + user, e);
        }
    }

    @Override
    public Optional<User> getUserByEmail(String email) {
        Optional<User> optionalUser = Optional.empty();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.GET_USER_BY_EMAIL);
            /*
            String GET_USER_BY_EMAIL = "select id, name, surname, email, password,
                mobile1, mobile2, " +
            "   registration_date, activation_date, user_status " +
            "from user " +
            "where email = ? and status = 1";
            * */
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setSurname(rs.getString("surname"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));

                if (rs.getString("mobile1") != null) {
                    user.setMobile1(rs.getString("mobile1"));
                }

                if (rs.getString("mobile2") != null) {
                    user.setMobile2(rs.getString("mobile2"));
                }

                user.setRegistrationDate(rs.getTimestamp("registration_date").toLocalDateTime());

                if (rs.getTimestamp("activation_date") != null) {
                    user.setActivationDate(rs.getTimestamp("activation_date").toLocalDateTime());
                }

                user.setUserStatus(UserStatus.from(rs.getInt("user_status")));

                optionalUser = Optional.of(user);
            }

        } catch (Exception e) {
            logger.error("Error getting user by email " + email, e);
            throw new RuntimeException("Error getting user by email " + email, e);
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return optionalUser;
    }


    @Override
    public List<Role> getUserRoles(long userId) {

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Role> roleList = new ArrayList<>();
        /*"select r.id, r.name " +
            "from user_role ur join user u on ur.user_id = u.id and ur.status = 1 and u.status = 1 " +
            "   join role r on ur.role_id = r.id and r.status = 1 " +
            "where u.id = ?";
*/
        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.GET_USER_ROLES);
            ps.setLong(1, userId);
            rs = ps.executeQuery();


            while (rs.next()) {
                Role role = Role.fromValue(rs.getInt("id"));
                role.setSuccessPage(rs.getString("success_page"));
                role.setPriority(rs.getInt("priority"));
                roleList.add(role);

            }


        } catch (Exception e) {

            logger.error("error on getting user roles user id = " + userId, e);
            throw new RuntimeException("error on getting user roles user id = " + userId, e);

        } finally {
            JdbcUtil.close(rs, ps, connection);
        }


        return roleList;
    }
}
