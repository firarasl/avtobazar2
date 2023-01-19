package az.autobazar.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Auto {
    private long id;
    private LocalDateTime publishDate;
    private String brand;
    private String model;
    private BigDecimal price;
    private String seller;
    private String contactNo;
    private int year;
    private String currency;
    private long mainMediaId;
    private int quantity;

    public long getMainMediaId() {
        return mainMediaId;
    }

    public void setMainMediaId(long mainMediaId) {
        this.mainMediaId = mainMediaId;
    }

    public Auto(long id, LocalDateTime publishDate, String brand, String model, BigDecimal price, String seller, String contactNo) {
        this.id = id;
        this.publishDate = publishDate;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.seller = seller;
        this.contactNo = contactNo;
    }

    public Auto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Auto(long id, LocalDateTime publishDate, String brand, String model, BigDecimal price, String seller, String contactNo, int year, String currency, String media, int quantity) {
        this.id = id;
        this.publishDate = publishDate;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.seller = seller;
        this.contactNo = contactNo;
        this.year = year;
        this.currency = currency;
        this.quantity=quantity;
    }

    public Auto(String brand, int quantity) {
        this.brand = brand;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", publishDate=" + publishDate +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", seller='" + seller + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", year=" + year +
                ", mainMediaId=" + mainMediaId +
                ", currency='" + currency + '\'' +
                '}';
    }

}
