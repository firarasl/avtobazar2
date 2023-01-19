package az.autobazar.domain.admin;

import java.math.BigDecimal;
import java.util.Date;

public class Currency {
    private Long id;
    private String name;
    private BigDecimal rat;
    private Date insert_date;
    private Date update_date;

    public Currency(Long id, String name, BigDecimal rat, Date insert_date, Date update_date) {
        this.id = id;
        this.name = name;
        this.rat = rat;
        this.insert_date = insert_date;
        this.update_date = update_date;
    }

    public Currency() {
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

    public BigDecimal getRat() {
        return rat;
    }

    public void setRat(BigDecimal rat) {
        this.rat = rat;
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
        return "Currency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rat=" + rat +
                ", insert_date=" + insert_date +
                ", update_date=" + update_date +
                '}';
    }
}
