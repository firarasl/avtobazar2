package az.autobazar.repository;

public class SqlQuery {

    public static final String GET_AUTO_COUNT = "select count(id) from auto";

    public static final String GET_AUTO_LIST = "select id, publish_date, brand, model, price, seller, contact_no from auto";

    public static final String GET_AUTO_LIST_AJAX = "select * from ( " +
            "    select rownum rn, id, publish_date, brand, model, price, seller, contact_no " +
            "    from auto " +
            ") where rn between ? + 1 and ?";

    public static final String CHECK_EMAIL = "select id from user " +
            "where email = ? and status = 1";


    public static final String INSERT_NAME_LASTNAME_MOBILE = "INSERT INTO user(name, surname, email) VALUES(?, ?, ?)";

    public static final String CHECK_MOBILE = "select id from user " +
            "where (mobile1 = ? or mobile2 = ?) and status = 1";

    public static final String ADD_USER = "insert into user(name, surname, email, password, mobile1, user_status, status) " +
            "values(?, ?, ?, ?, ?, 0, 1)";

    public static final String ADD_USER_ROLE = "insert into user_role(user_id, role_id) values(?, ?)";

    public static final String ADD_TOKEN = "insert into token(value, type, user_id, generation_time, expire_time) " +
            "values(?, ?, ?, ?, ?)";

    public static final String GET_USER_BY_EMAIL = "select id, name, surname, email, password, mobile1, mobile2, " +
            "   registration_date, activation_date, user_status " +
            "from user " +
            "where email = ? and status = 1";

    public static final String GET_USER_ROLES = "select r.id,  r.name, r.success_page, " +
            "r.priority " +
            "from user_role ur join user u on ur.user_id = u.id and ur.status = 1 and u.status = 1 " +
            "   join role r on ur.role_id = r.id and r.status = 1 " +
            "where u.id = ? " +
            "order by r.priority";




    public static final String GET_LAST_12_AUTOS = "SELECT a.id, a.create_date, " +
            "b.id brand_id, b.name as brand_name, " +
            "d.id model_id, d.name model_name," +
            "a.year, a.price," +
            "c.name as currency, m.id as main_media_id " +
            "FROM auto a JOIN brand b ON a.brand_id=b.id " +
            "join model d on d.brand_ID = b.id and d.status = 1 " +
            "JOIN currency c ON a.currency_id=c.id " +
            "JOIN media m ON a.id=m.auto_id and m.main = 1 and m.status = 1 " +
            "ORDER BY a.id desc LIMIT 12";


    public static final String GET_QUANTITY_OF_BRANDS="SELECT COUNT(a.id) as quantity, b.name as brand_name, b.id " +
            "FROM auto a JOIN brand b " +
            "ON a.brand_id=b.id and a.status = 1 and b.status = 1 " +
            "GROUP BY b.name, b.id " +
            "ORDER BY COUNT(a.id) desc ";

    public static final String ADD_MEDIA = "insert into media(id, auto_id, original_filename, file_name, main, " +
            " video, mobile, mime_type, file_length, status) " +
            "values(null, ?, ?, ?, ?, ?, ?, ?, ?, 1)";

    public static final String GET_MEDIA_BY_ID = "select id, auto_id, original_filename, file_name, main, video, mobile," +
            " mime_type, file_length " +
            "from media " +
            "where id = ? and status = 1";
}
