package az.autobazar.domain.admin;

import java.sql.DatabaseMetaData;
import java.util.Date;

public class Auto_Type {
    private Long id;
    private String type;
    private Date insert_date;
    private Date update_date;

    public Auto_Type(Long id, String type, Date insert_date, Date update_date) {
        this.id = id;
        this.type = type;
        this.insert_date = insert_date;
        this.update_date = update_date;
    }

    public Auto_Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getInsert_date() {
        return insert_date;
    }

    public void setInsert_date(Date insert_date) {
        this.insert_date = insert_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "Auto_Type{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", insert_date=" + insert_date +
                ", update_date=" + update_date +
                '}';
    }
}
