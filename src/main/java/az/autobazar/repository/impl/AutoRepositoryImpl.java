package az.autobazar.repository.impl;

import az.autobazar.domain.Auto;
import az.autobazar.domain.Media;
import az.autobazar.domain.Role;
import az.autobazar.repository.AutoRepository;
import az.autobazar.repository.ConnectionPool;
import az.autobazar.repository.SqlQuery;
import az.autobazar.util.JdbcUtil;
import com.mysql.cj.exceptions.ConnectionIsClosedException;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AutoRepositoryImpl implements AutoRepository {

    private static final Logger logger = Logger.getLogger(AutoRepositoryImpl.class.getName());

    public List<Auto> getAutoList() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Auto> autoList = new ArrayList<>();

        try {

            connection = ConnectionPool.getConnection();

            ps = connection.prepareStatement(SqlQuery.GET_AUTO_LIST);
            rs = ps.executeQuery();
            while (rs.next()) {
                Auto auto = new Auto();
                auto.setId(rs.getLong("id"));
                auto.setPublishDate(rs.getTimestamp("publish_date").toLocalDateTime());
                auto.setBrand(rs.getString("brand"));
                auto.setModel(rs.getString("model"));
                auto.setPrice(rs.getBigDecimal("price"));
                auto.setSeller(rs.getString("seller"));
                auto.setContactNo(rs.getString("contact_no"));
                autoList.add(auto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return autoList;
    }

    public int getAutoCount() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int count = 0;

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.GET_AUTO_COUNT);
            rs = ps.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return count;
    }

    public List<Auto> getAutoList(int start, int length) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Auto> autoList = new ArrayList<>();

        try {

            connection = ConnectionPool.getConnection();

            ps = connection.prepareStatement(SqlQuery.GET_AUTO_LIST_AJAX);
            ps.setInt(1, start);
            ps.setInt(2, start + length);
            rs = ps.executeQuery();
            while (rs.next()) {
                Auto auto = new Auto();
                auto.setId(rs.getLong("id"));
                auto.setPublishDate(rs.getTimestamp("publish_date").toLocalDateTime());
                auto.setBrand(rs.getString("brand"));
                auto.setModel(rs.getString("model"));
                auto.setPrice(rs.getBigDecimal("price"));
                auto.setSeller(rs.getString("seller"));
                auto.setContactNo(rs.getString("contact_no"));
                autoList.add(auto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return autoList;
    }

    public Auto getAutoById(long id) {
        return null;
    }


    public List<Auto> getLast12Autos() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Auto> autoList = new ArrayList<>();

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.GET_LAST_12_AUTOS);
            rs = ps.executeQuery();


            while (rs.next()) {
                Auto auto = new Auto();
                auto.setId(rs.getLong("id"));
                auto.setPublishDate(rs.getTimestamp("create_date").toLocalDateTime());
                auto.setBrand(rs.getString("brand_name"));
                auto.setYear(rs.getInt("year"));
                auto.setPrice(rs.getBigDecimal("price"));
                auto.setCurrency(rs.getString("currency"));
                auto.setModel(rs.getString("model_name"));
                auto.setMainMediaId(rs.getLong("main_media_id"));

                autoList.add(auto);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return autoList;

    }

    public List<Auto> getQuantityOfBrands() {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Auto> brandList = new ArrayList<>();

        try {

            connection = ConnectionPool.getConnection();

            ps = connection.prepareStatement(SqlQuery.GET_QUANTITY_OF_BRANDS);
            rs = ps.executeQuery();
            while (rs.next()) {
                Auto auto = new Auto();
                auto.setQuantity(rs.getInt("quantity"));
                auto.setBrand(rs.getString("brand_name"));
                brandList.add(auto);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return brandList;
    }

    @Override
    public void addMedia(Media media) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.ADD_MEDIA, Statement.RETURN_GENERATED_KEYS);
            /*
            *  String ADD_MEDIA = "insert into media(id, auto_id, original_filename,
            *   file_name, main, " +
            " video, mobile, mime_type, file_length, status) " +
            "values(null, ?, ?, ?, ?, ?, ?, ?, ?, 1)";
            * */
            ps.setLong(1, media.getAutoId());
            ps.setString(2, media.getOriginalFileName());
            ps.setString(3, media.getFileName());
            ps.setInt(4, media.isMain() ? 1 : 0);
            ps.setInt(5, media.isVideo() ? 1 : 0);
            ps.setInt(6, media.isMobile() ? 1 : 0);
            ps.setString(7, media.getContentType());
            ps.setLong(8, media.getLength());

            int count = ps.executeUpdate();
            if(count > 0) {
                rs = ps.getGeneratedKeys();
                if(rs.next()) {
                    media.setId(rs.getLong(1));
                    connection.commit();
                }
            } else {
                connection.rollback();
                throw new RuntimeException("Error adding media " + media);
            }
        }  catch (Exception e) {
            logger.error("Error adding media " + media, e);
            throw new RuntimeException("Error adding media " + media, e);
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }
    }

    @Override
    public Optional<Media> getMediaById(long id) {
        Optional<Media> optionalMedia = Optional.empty();

        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = ConnectionPool.getConnection();
            ps = connection.prepareStatement(SqlQuery.GET_MEDIA_BY_ID);
            /*
            *  String GET_MEDIA_BY_ID = "select id, auto_id, original_filename, file_name,
            *  main, video, mobile," +
            " mime_type, file_length " +
            "from media " +
            "where id = ? and status = 1";
            * */
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
              Media media = new Media();
              media.setId(rs.getLong("id"));
              media.setAutoId(rs.getLong("auto_id"));
              media.setOriginalFileName(rs.getString("original_filename"));
              media.setFileName(rs.getString("file_name"));
              media.setMain(rs.getInt("main") == 1);
              media.setVideo(rs.getInt("video") == 1);
              media.setMobile(rs.getInt("mobile") == 1);
              media.setContentType(rs.getString("mime_type"));
              media.setLength(rs.getLong("file_length"));

              optionalMedia = Optional.of(media);
            }
        }  catch (Exception e) {
            logger.error("Error getting media by id " + id, e);
            throw new RuntimeException("Error getting media by id " + id, e);
        } finally {
            JdbcUtil.close(rs, ps, connection);
        }

        return optionalMedia;
    }

    @Override
    public List<Media> getMediaList(long autoId) {
        // todo implement
        return null;
    }
}
