package az.autobazar.util;

import az.autobazar.repository.ConnectionPool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtil {

    public static void close(ResultSet rs, PreparedStatement ps, Connection connection) {
        try {

            if(rs != null) {
                rs.close();
            }

            if(ps != null) {
                ps.close();
            }

            if (connection != null) {
                connection.close();
            }

        } catch (Exception e) {

        }
    }
}
