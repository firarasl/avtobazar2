package az.autobazar.domain.admin;

import java.util.Date;

public class Color {
    private Long id;
    private String name;
    private String code;
    private Date insert_date;
    private Date update_date;

    public Color(Long id, String name, String code, Date insert_date, Date update_date) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.insert_date = insert_date;
        this.update_date = update_date;
    }

    public Color() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        return "Color{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", insert_date=" + insert_date +
                ", update_date=" + update_date +
                '}';
    }
}
