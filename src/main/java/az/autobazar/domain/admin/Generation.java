package az.autobazar.domain.admin;

import java.util.Date;

public class Generation {
    private Long id;
    private String name;
    private Date from_year;
    private Date to_year;
    private Date insert_date;
    private Date update_date;

    public Generation(Long id, String name, Date from_year, Date to_year, Date insert_date, Date update_date) {
        this.id = id;
        this.name = name;
        this.from_year = from_year;
        this.to_year = to_year;
        this.insert_date = insert_date;
        this.update_date = update_date;
    }

    public Generation() {
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

    public Date getFrom_year() {
        return from_year;
    }

    public void setFrom_year(Date from_year) {
        this.from_year = from_year;
    }

    public Date getTo_year() {
        return to_year;
    }

    public void setTo_year(Date to_year) {
        this.to_year = to_year;
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
        return "Generation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", from_year=" + from_year +
                ", to_year=" + to_year +
                ", insert_date=" + insert_date +
                ", update_date=" + update_date +
                '}';
    }
}
