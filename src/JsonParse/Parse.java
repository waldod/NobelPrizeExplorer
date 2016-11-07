package JsonParse;

import com.google.gson.Gson;

/**
 * Created by GrahamSeaman on 2016-11-02.
 */
public class Parse {
    public void parse(String jsonString){
        Gson gson = new Gson();
        Prizes prizes = gson.fromJson(jsonString, Prizes.class);

        //String name = laureate.getFirstname();
        //System.out.println(name);
        System.out.println(prizes.toString());
    }
}
