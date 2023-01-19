package az.autobazar.domain;

import java.util.Arrays;

public enum UserStatus {
    PENDING(0), ACTIVE(1), DELETED(2);

    UserStatus(int status) {
        this.status = status;
    }

    private int status;

    public int getStatus() {
        return status;
    }

    public static UserStatus from(int status) {
        return Arrays.stream(values())
                .filter(f -> f.status == status)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Unknown user status " + status));
    }
}
