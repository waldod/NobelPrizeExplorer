package JsonParse.Prizes;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GrahamSeaman on 2016-10-27.
 */
public class PrizeLaureate {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("firstname")
    @Expose
    private String firstname;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("motivation")
    @Expose
    private String motivation;
    @SerializedName("share")
    @Expose
    private String share;

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

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }


    @Override
    public String toString() {
        return "PrizeLaureate{" +
                "id='" + id + '\'' +
                "\nfirstname='" + firstname + '\'' +
                "\nsurname='" + surname + '\'' +
                "\nmotivation='" + motivation + '\'' +
                "\nshare='" + share + '\'' +
                '}';
    }

}
