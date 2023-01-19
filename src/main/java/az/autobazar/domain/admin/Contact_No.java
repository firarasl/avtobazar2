package az.autobazar.domain.admin;

public class Contact_No {
    private Long id;
    private Auto_Shop auto_shop;
    private User user;
    private String number;

    public Contact_No(Long id, Auto_Shop auto_shop, User user, String number) {
        this.id = id;
        this.auto_shop = auto_shop;
        this.user = user;
        this.number = number;
    }

    public Contact_No() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Auto_Shop getAuto_shop() {
        return auto_shop;
    }

    public void setAuto_shop(Auto_Shop auto_shop) {
        this.auto_shop = auto_shop;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact_No{" +
                "id=" + id +
                ", auto_shop=" + auto_shop +
                ", user=" + user +
                ", number='" + number + '\'' +
                '}';
    }
}
