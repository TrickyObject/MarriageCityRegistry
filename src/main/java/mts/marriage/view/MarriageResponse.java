package mts.marriage.view;

import java.io.Serializable;

public class MarriageResponse implements Serializable {

    private boolean married;
    private String error;

    @Override
    public String toString() {
        return "MarriageResponse{" +
                "married=" + married +
                ", error='" + error + '\'' +
                '}';
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
