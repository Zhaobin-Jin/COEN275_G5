package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ManagerMainController {

    @FXML
    private Button AssignEmployeeButton;

    @FXML
    private Button ChangeTaskButton;

    @FXML
    private AnchorPane Display;

    @FXML
    private Text IdTextField;

    @FXML
    private Text NameTextField;

    @FXML
    private Pane Pane;

    @FXML
    private Button QuitButton;

    @FXML
    private Button RemoveEmployeeButton;

    @FXML
    private Button RemoveTaskButton;

    @FXML
    private Button TaskCreateButton;

    @FXML
    private TextField TaskDescriptionTextField;

    @FXML
    private Text TitleTextField;

    private App app;

    // connect app class to controller
    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void assignEmployee(ActionEvent event) {

    }

    @FXML
    void removeEmployee(ActionEvent event) {

    }

    @FXML
    void createTask(ActionEvent event) {

    }

    @FXML
    void changeTask(ActionEvent event) {

    }

    @FXML
    void removeTask(ActionEvent event) {

    }

}
