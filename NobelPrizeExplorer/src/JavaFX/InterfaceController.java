package JavaFX;

import JsonParse.Countries.CountriesMain;
import JsonParse.Laureates.LaureatesMain;
import JsonParse.Prizes.PrizeLaureate;
import JsonParse.Prizes.PrizesMain;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class InterfaceController {

    @FXML
    private TabPane mainWindows;
    @FXML
    private TableView<PrizesMain> prizeTable;
    @FXML
    private TableColumn<PrizesMain, String> names;
    @FXML
    private TableColumn<PrizesMain, String> prizeInfo;
    @FXML
    private TableView<LaureatesMain> laureateTable;
    @FXML
    private  TableColumn<LaureatesMain, String> laureateNames;
    @FXML
    private TableColumn<LaureatesMain, String> laureateInfo;
    @FXML
    private TableView<CountriesMain> countryTable;
    @FXML
    private ComboBox<String> catergoryBox;
    @FXML
    private ComboBox<Integer> yearfromBox;
    @FXML
    private ComboBox<Integer> yeartoBox;
    @FXML
    private ComboBox<Integer> numlaureatesBox;
    @FXML
    private ComboBox<String> countryBox;
    @FXML
    private ComboBox<String> countryBox2;
    @FXML
    private ComboBox<String> countryCodeBox;
    @FXML
    private ComboBox<String> countryCodeBox2;
    @FXML
    private ComboBox<String> genderBox;

/*    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label yearBornLabel;
    @FXML
    private Label categoryLabel;
    @FXML
    private Label idLabel;
    @FXML
    private Label motivationLabel;*/


    private JavaFxMain javaFxMain;

    public InterfaceController() {

    }

    @FXML
    private void initialize(){
        //firstName.setCellValueFactory(cellData->cellData.getValue().getFirstname());
    }

    public void setJavaFxMain(JavaFxMain javaFxMain){
        this.javaFxMain = javaFxMain;

        yearfromBox.setItems(javaFxMain.getYears());
        yeartoBox.setItems(javaFxMain.getYears());
        numlaureatesBox.setItems(javaFxMain.getNumLaureates());
        countryBox.setItems(javaFxMain.getCountryNames());
        countryBox2.setItems(javaFxMain.getCountryNames());
        countryCodeBox.setItems(javaFxMain.getCountriesCode());
        countryCodeBox2.setItems(javaFxMain.getCountriesCode());
        catergoryBox.setItems(javaFxMain.getCatergories());
    }

    public void laureateDetails(PrizeLaureate prizeLaureate) {

    }

    //public void

}
