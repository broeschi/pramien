package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import person.Person;

public class PersonController {

    @FXML
    private TableView<Person> personTable;
    @FXML
    private TableColumn<Person, String> NameColumn;
    @FXML
    private TableColumn<Person, String> VornameColumn;
    @FXML
    private TextField filterField;
    @FXML
    private Label NameLabel;
    @FXML
    private Label VornameLabel;
    @FXML
    private Label JahrgangLabel;
    @FXML
    private Label LizenzLabel;

    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        NameColumn.setCellValueFactory(cellData -> cellData.getValue().personNameProperty());
        VornameColumn.setCellValueFactory(cellData -> cellData.getValue().personVornameProperty());

        // Clear person details.
        showPersonDetails(null);

        // Listen for selection changes and show the person details when changed.
        personTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }

    private void showPersonDetails(Person person) {
        if (person != null) {
            // Fill the labels with info from the person object.
            NameLabel.setText(person.getPersonName());
            VornameLabel.setText(person.getPersonVorname());
            JahrgangLabel.setText(Integer.toString(person.getPersonJahrgang()));
            LizenzLabel.setText(Integer.toString(person.getPersonLizenz()));
        } else {
            // Person is null, remove all the text.
            NameLabel.setText("");
            VornameLabel.setText("");
            JahrgangLabel.setText("");
            LizenzLabel.setText("");
        }
    }

    @FXML
    private void handleNewPerson() {
        // Handle new person creation
    }

    @FXML
    private void handleEditPerson() {
        // Handle editing person
    }
}