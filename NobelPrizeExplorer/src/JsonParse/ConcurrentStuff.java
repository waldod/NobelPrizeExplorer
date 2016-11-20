package JsonParse;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Graham Seaman on 2016-11-15.
 */

//http://stackoverflow.com/questions/9148899/returning-value-from-thread
public class ConcurrentStuff {
    private ExecutorService pool = Executors.newCachedThreadPool();
    private HttpResponse<JsonNode> jsonResponse = null;
    private String urlName;
    private Map<String, Object> urlQuery = null;

    public String getUrlName() {
        return urlName;
    }

    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    public Map<String, Object> getUrlQuery() {
        return urlQuery;
    }

    public void setUrlQuery(Map<String, Object> urlQuery) {
        this.urlQuery = urlQuery;
    }

    Future<String> info = pool.submit(new Callable<String>() {
        @Override
        public String call() throws Exception {

            try {
                jsonResponse = Unirest.get(urlName)
                        .header("accept", "application/json")
                        .queryString(urlQuery)
                        .asJson();

            }catch (UnirestException e){
                e.printStackTrace();
            }
            return jsonResponse.getBody().toString();
        }
    });

    Future<String> countries = pool.submit(new Callable<String>() {
        @Override
        public String call() throws Exception {

            try {
                jsonResponse = Unirest.get(urlName)
                        .header("accept", "application/json")
                        .asJson();

            }catch (UnirestException e){
                e.printStackTrace();
            }
            return jsonResponse.getBody().toString();
        }
    });

    public void shutDown(){
        pool.shutdown();
    }
}
