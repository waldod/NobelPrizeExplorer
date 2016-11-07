package JsonParse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by GrahamSeaman on 2016-10-27.
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laureate laureate = (Laureate) o;

        if (getId() != null ? !getId().equals(laureate.getId()) : laureate.getId() != null) return false;
        if (getFirstname() != null ? !getFirstname().equals(laureate.getFirstname()) : laureate.getFirstname() != null)
            return false;
        if (getSurname() != null ? !getSurname().equals(laureate.getSurname()) : laureate.getSurname() != null)
            return false;
        if (getMotivation() != null ? !getMotivation().equals(laureate.getMotivation()) : laureate.getMotivation() != null)
            return false;
        return getShare() != null ? getShare().equals(laureate.getShare()) : laureate.getShare() == null;

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstname() != null ? getFirstname().hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getMotivation() != null ? getMotivation().hashCode() : 0);
        result = 31 * result + (getShare() != null ? getShare().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Laureate{" +
                "id='" + id + '\'' +
                "\nfirstname='" + firstname + '\'' +
                "\nsurname='" + surname + '\'' +
                "\nmotivation='" + motivation + '\'' +
                "\nshare='" + share + '\'' +
                '}';
    }

}
