package JsonParse.Laureates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Graham Seaman on 2016-11-15.
 */
public class Laureate {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("born")
    @Expose
    private String born;
    @SerializedName("died")
    @Expose
    private String died;
    @SerializedName("bornCountry")
    @Expose
    private String bornCountry;
    @SerializedName("bornCountryCode")
    @Expose
    private String bornCountryCode;
    @SerializedName("bornCity")
    @Expose
    private String bornCity;
    @SerializedName("diedCountry")
    @Expose
    private String diedCountry;
    @SerializedName("diedCountryCode")
    @Expose
    private String diedCountryCode;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("laureatePrizes")
    @Expose
    private List<LaureatePrize> laureatePrizes = new ArrayList<LaureatePrize>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getDied() {
        return died;
    }

    public void setDied(String died) {
        this.died = died;
    }

    public String getBornCountry() {
        return bornCountry;
    }

    public void setBornCountry(String bornCountry) {
        this.bornCountry = bornCountry;
    }

    public String getBornCountryCode() {
        return bornCountryCode;
    }

    public void setBornCountryCode(String bornCountryCode) {
        this.bornCountryCode = bornCountryCode;
    }

    public String getBornCity() {
        return bornCity;
    }

    public void setBornCity(String bornCity) {
        this.bornCity = bornCity;
    }

    public String getDiedCountry() {
        return diedCountry;
    }

    public void setDiedCountry(String diedCountry) {
        this.diedCountry = diedCountry;
    }

    public String getDiedCountryCode() {
        return diedCountryCode;
    }

    public void setDiedCountryCode(String diedCountryCode) {
        this.diedCountryCode = diedCountryCode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<LaureatePrize> getLaureatePrizes() {
        return laureatePrizes;
    }

    public void setLaureatePrizes(List<LaureatePrize> laureatePrizes) {
        this.laureatePrizes = laureatePrizes;
    }
}
