package JsonParse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrahamSeaman on 2016-11-02.
 */
public class Prizes {
    private List<Prize> prizes = new ArrayList<Prize>();

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prizes prizes1 = (Prizes) o;

        return getPrizes() != null ? getPrizes().equals(prizes1.getPrizes()) : prizes1.getPrizes() == null;

    }

    @Override
    public int hashCode() {
        return getPrizes() != null ? getPrizes().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Prizes{" +
                "prizes=" + prizes +
                '}';
    }
}
