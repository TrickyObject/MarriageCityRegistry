package mts.marriage.view;

import java.io.Serializable;

public class MarriageResponse implements Serializable {

    private boolean married;

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

}
