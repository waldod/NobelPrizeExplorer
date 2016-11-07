package JsonParse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GrahamSeaman on 2016-10-27.
 */
public class Prize {
    private String year;
    private String category;
    private List<Laureate> laureates = new ArrayList<Laureate>();

    public Prize() {}

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

    public List<Laureate> getLaureates() {
        return laureates;
    }

    public void setLaureates(List<Laureate> laureates) {
        this.laureates = laureates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prize prize = (Prize) o;

        if (getYear() != null ? !getYear().equals(prize.getYear()) : prize.getYear() != null) return false;
        if (getCategory() != null ? !getCategory().equals(prize.getCategory()) : prize.getCategory() != null)
            return false;
        return getLaureates() != null ? getLaureates().equals(prize.getLaureates()) : prize.getLaureates() == null;

    }

    @Override
    public int hashCode() {
        int result = getYear() != null ? getYear().hashCode() : 0;
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        result = 31 * result + (getLaureates() != null ? getLaureates().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Prize{" +
                "year='" + year + '\'' +
                "\n category='" + category + '\'' +
                "\n laureates=" + laureates +
                "}\n";
    }
}
