package mts.marriage.view;

import java.io.Serializable;

public class ParentsResponse implements Serializable {

    private boolean born;

    public boolean isBorn() {
        return born;
    }

    public void setBorn(boolean born) {
        this.born = born;
    }

    @Override
    public String toString() {
        return "ParentsResponse{" +
                "born=" + born +
                '}';
    }
}
