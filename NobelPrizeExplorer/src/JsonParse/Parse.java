package JsonParse;

import JsonParse.Countries.CountriesMain;
import JsonParse.Laureates.LaureatesMain;
import JsonParse.Prizes.PrizesMain;
import com.google.gson.Gson;

/**
 * Created by GrahamSeaman on 2016-11-02.
 */

//http://www.jsonschema2pojo.org/

public class Parse {
    public void parse(String searchType, String jsonString){
        Gson gson = new Gson();
        PrizesMain prizesMain = null;
        LaureatesMain laureatesMain = null;
        CountriesMain countriesMain = null;

        if (searchType.contentEquals("prize")) {
            prizesMain = gson.fromJson(jsonString, PrizesMain.class);
        } else if (searchType.contentEquals("laureate")){
            laureatesMain = gson.fromJson(jsonString, LaureatesMain.class);
        } else {

        }


        if(countriesMain != null){
            System.out.println(countriesMain.toString());
        } else if (prizesMain != null) {
            System.out.println(prizesMain.toString());
        } else if (laureatesMain != null){
            System.out.println(laureatesMain.toString());
        } else {

        }
    }
}
