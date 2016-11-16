package JavaFX;

import JsonParse.Countries.CountriesMain;
import JsonParse.Countries.Country;
import JsonParse.JavaMain;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaFxMain extends Application {
    private Stage primaryStage;
    private BorderPane rootLayout;
    private CountriesMain allCountries;

    @Override
    public void start(Stage primaryStage){
        //Parent root = FXMLLoader.load(getClass().getResource("NoblePrizeInterface.fxml"));
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Nobel LaureatePrize Explorer");
        JavaMain javaCode = new JavaMain();
        Map<String, Object> queryInfo = new HashMap<>();
        String urlType = null;
        String test = null;

        getCountries();

        urlType = "country";
        queryInfo.put("category", "physics");

        //javaCode.queryAPI(urlType, queryInfo);
        javaCode.parseJsonObject(urlType, test);
        System.out.println(test);
        

        startRootLayout();

        showInterface();
    }

    public void startRootLayout(){
        try {
            //Load Root
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            //Show scene
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showInterface(){
        try {
            //Load Interface
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("NobelPrizeInterface.fxml"));
            AnchorPane uInterface = (AnchorPane) loader.load();

            //Set interface into center of root
            rootLayout.setCenter(uInterface);

            //Controller
            InterfaceController controller = loader.getController();
            controller.setJavaFxMain(this);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private ObservableList<Integer> years = FXCollections.observableArrayList();
    private ObservableList<Integer> numLaureates = FXCollections.observableArrayList();
    private ObservableList<String> countries = FXCollections.observableArrayList();

    public JavaFxMain(){
        setCountriesList();
        for(int i = 1901; i < 2016; i++){
            years.add(i);
        }
        for(int i = 1; i < 5; i++){
            numLaureates.add(i);
        }
    }

    public ObservableList<Integer> getYears(){
        return years;
    }

    public ObservableList<Integer> getNumLaureates(){
        return numLaureates;
    }

    private void setCountriesList(){
        JavaMain getinfo = new JavaMain();
        allCountries = getinfo.getAllCountries();
        List<Country> countryList = new ArrayList<>();
        countryList = allCountries.getCountries();
        for(int i = 0; i < allCountries.getCountries().size(); i++){
            String countryName = countryList.get(i).getName();
            countries.add(countryName);
        }
    }

    public ObservableList<String> getCountries(){
        return countries;
    }

    public Stage getPrimaryStage(){
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
