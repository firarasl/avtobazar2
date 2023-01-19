package az.autobazar.domain.admin;

import java.util.Date;

public class Series {
    private Long id;
    private String name;
    private Brand brand;
    private Date from_year;
    private Date to_year;

    public Series(Long id, String name, Brand brand, Date from_year, Date to_year) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.from_year = from_year;
        this.to_year = to_year;
    }

    public Series() {
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
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

    @Override
    public String toString() {
        return "Series{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", from_year=" + from_year +
                ", to_year=" + to_year +
                '}';
    }
}
