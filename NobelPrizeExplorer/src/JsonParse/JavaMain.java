package JsonParse;

import JsonParse.Countries.CountriesMain;
import com.google.gson.Gson;

import java.util.Map;


/**
 * Created by GrahamSeaman on 2016-10-27.
 */
public class JavaMain {
    public void queryAPI(String urlType, Map<String, Object> query){
        String prizeUrl = "http://api.nobelprize.org/v1/prize.json?";
        String laureateUrl = "http://api.nobelprize.org/v1/laureate.json?";

        String jsonString = null;
        ConcurrentStuff behindScene = new ConcurrentStuff();
        if(urlType.contentEquals("prize")){
            behindScene.setUrlName(prizeUrl);
        } else {
            behindScene.setUrlName(laureateUrl);
        }


/*
        Map<String, Object> queryBuiilder = new HashMap<>();
        queryBuiilder.put("year", "1944");
        queryBuiilder.put("category", "physics");
*/

        behindScene.setUrlQuery(query);

        try {
            jsonString = behindScene.info.get();
        } catch (Exception e){
            e.printStackTrace();
        }

        parseJsonObject(urlType, jsonString);
        //System.out.println(jsonResponse.getBody().toString());


    }

    public CountriesMain getAllCountries(){
        CountriesMain countriesMain = new CountriesMain();
        Gson gson = new Gson();
        String countryUrl = "http://api.nobelprize.org/v1/country.json";
        ConcurrentStuff quick = new ConcurrentStuff();
        String countries = null;

        quick.setUrlName(countryUrl);
        try {
            countries = quick.countries.get();
        } catch (Exception e){
            e.printStackTrace();
        }

        countriesMain = gson.fromJson(countries, CountriesMain.class);
        return countriesMain;
    }

    public void parseJsonObject(String urlType, String jsonString){
        Parse parse = new Parse();
        parse.parse(urlType, jsonString);
    }
}
