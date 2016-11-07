package JsonParse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;


/**
 * Created by GrahamSeaman on 2016-10-27.
 */
public class Json {
    public static void main(String[] args){
        String sUrl = "http://api.nobelprize.org/v1/prize.json?";
        HttpResponse<JsonNode> jsonResponse = null;
        Gson gson = new Gson();
        Parse parse = new Parse();

        try {
            jsonResponse = Unirest.get(sUrl)
                    .header("accept", "application/json")
                    .queryString("year", "1944")
                    .queryString("yearTo", "1944")
                    .queryString("category", "chemistry")
                    .asJson();

        }catch (UnirestException e){
            e.printStackTrace();
        }
        //System.out.println(jsonResponse.getBody().toString());
        parse.parse(jsonResponse.getBody().toString());

    }
}
