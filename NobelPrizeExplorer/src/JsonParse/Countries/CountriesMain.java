package JsonParse.Countries;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Seaman on 2016-11-15.
 */
public class CountriesMain {
    @SerializedName("countries")
    @Expose
    private List<Country> countries = new ArrayList<Country>();

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "CountriesMain{" +
                "countries=" + countries +
                '}';
    }
}
