package az.autobazar.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class AutoBazarBase implements Serializable {
    private static final long serialVersionUID = -6742326716376621203L;

    protected long id;
    protected LocalDateTime insertDate;
    protected LocalDateTime lastUpdate;
    protected int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
