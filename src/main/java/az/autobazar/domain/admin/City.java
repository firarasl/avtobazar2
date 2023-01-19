package az.autobazar.domain.admin;

import java.util.Date;

public class City {
    private Long id;
    private String type;
    private int sort_order;
    private Date insert_date;
    private Date update_date;

    public City(Long id, String type, int sort_order, Date insert_date, Date update_date) {
        this.id = id;
        this.type = type;
        this.sort_order = sort_order;
        this.insert_date = insert_date;
        this.update_date = update_date;
    }

    public City() {
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

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
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
        return "City{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", sort_order=" + sort_order +
                ", insert_date=" + insert_date +
                ", update_date=" + update_date +
                '}';
    }
}
