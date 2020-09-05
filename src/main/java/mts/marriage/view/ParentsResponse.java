package mts.marriage.view;

import java.io.Serializable;

public class ParentsResponse implements Serializable {

    private boolean born;
    private String error;

    @Override
    public String toString() {
        return "ParentsResponse{" +
                "born=" + born +
                ", error='" + error + '\'' +
                '}';
    }

    public boolean isBorn() {
        return born;
    }

    public void setBorn(boolean born) {
        this.born = born;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
