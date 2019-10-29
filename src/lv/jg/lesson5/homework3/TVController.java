package lv.jg.lesson5.homework3;

import java.util.Objects;

public class TVController {
    private TV tv;

    public void setTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVController tvController = (TVController) o;
        return Objects.equals(tv, tvController.tv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tv);
    }

    @Override
    public String toString() {
        return "TVController{"
                + "tv=" + tv + '}';
    }
}
