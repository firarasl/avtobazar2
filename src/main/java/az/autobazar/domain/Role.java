package az.autobazar.domain;

import java.util.Arrays;

public enum Role {
    AUTOBAZAR_USER(1),
    AUTOBAZAR_ADMIN(2),
    AUTOBAZAR_MODERATOR(3),
    AUTOSHOP_ADMIN(4),
    AUTOSHOP_MODERATOR(5);

    private int id;


    private  String successPage;
    private int priority;


    public String getSuccessPage() {
        return successPage;
    }

    public void setSuccessPage(String successPage) {
        this.successPage = successPage;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    Role(int id) {
        this.id = id;
    }

    public static Role fromValue(int v) {
        Role role = null;

//        if(v == 1) {
//            role = AUTOBAZAR_USER;
//        } else if(v == 2) {
//            role = AUTOBAZAR_ADMIN;
//        } else if(v == 3) {
//            role = AUTOBAZAR_MODERATOR;
//        }

        role = Arrays.stream(values())
                .filter(f -> f.id == v)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown role id " + v));

        return role;
    }

    public int getId() {
        return id;
    }
}
