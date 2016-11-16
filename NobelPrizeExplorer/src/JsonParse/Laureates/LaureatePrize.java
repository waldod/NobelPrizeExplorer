package JsonParse.Laureates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Seaman on 2016-11-15.
 */
public class LaureatePrize {
    @SerializedName("year")
    @Expose
    private String year;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("share")
    @Expose
    private String share;
    @SerializedName("motivation")
    @Expose
    private String motivation;
    @SerializedName("affiliations")
    @Expose
    private List<Affiliation> affiliations = new ArrayList<Affiliation>();

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public List<Affiliation> getAffiliations() {
        return affiliations;
    }

    public void setAffiliations(List<Affiliation> affiliations) {
        this.affiliations = affiliations;
    }
}
