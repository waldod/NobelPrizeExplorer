package JavaFX;

import JsonParse.Prizes.PrizeLaureate;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class InterfaceController {

    @FXML
    private TableView<PrizeLaureate> laureateTable;
    @FXML
    private TableColumn<PrizeLaureate, String> firstName;
    @FXML
    private TableColumn<PrizeLaureate, String> lastName;
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
    private Label motivationLabel;


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
        countryBox.setItems(javaFxMain.getCountries());

    }

    public void laureateDetails(PrizeLaureate prizeLaureate){
        if (prizeLaureate != null){
            firstNameLabel.setText(prizeLaureate.getFirstname());
            lastNameLabel.setText(prizeLaureate.getSurname());
            motivationLabel.setText(prizeLaureate.getMotivation());
        } else {

        }
    }

}
