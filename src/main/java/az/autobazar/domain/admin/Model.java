package az.autobazar.domain.admin;

import java.util.Date;

public class Model {
    private Long id;
    private String name;
    private Series series;
    private Date insert_date;
    private Date update_date;

    public Model(Long id, String name, Series series, Date insert_date, Date update_date) {
        this.id = id;
        this.name = name;
        this.series = series;
        this.insert_date = insert_date;
        this.update_date = update_date;
    }

    public Model() {
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

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
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
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", series=" + series +
                ", insert_date=" + insert_date +
                ", update_date=" + update_date +
                '}';
    }
}
