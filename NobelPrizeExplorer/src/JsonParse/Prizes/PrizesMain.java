package JsonParse.Prizes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrahamSeaman on 2016-11-02.
 */
public class PrizesMain {
    @SerializedName("prizes")
    @Expose
    private List<Prize> prizes = new ArrayList<Prize>();

    public List<Prize> getPrizes() {
        return prizes;
    }

    public void setPrizes(List<Prize> prizes) {
        this.prizes = prizes;
    }

    @Override
    public String toString() {
        return "PrizesMain{" +
                "prizes=" + prizes +
                '}';
    }
}
