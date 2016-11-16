package JsonParse.Laureates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Seaman on 2016-11-15.
 */
public class LaureatesMain {
    @SerializedName("laureates")
    @Expose
    private List<Laureate> laureates = new ArrayList<Laureate>();

    public List<Laureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    @Override
    public String toString() {
        return "LaureatesMain{" +
                "laureates=" + laureates +
                '}';
    }
}
