package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EmployeeMainController {

    @FXML
    private Button ChangeStatusButton;

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
    private Text TitleTextField;

    private App app;

    // connect app class to controller
    public void setApp(App app) {
        this.app = app;
    }

    private Stage primaryStage;

    // connect primary stage to task stage
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    void changeStatus(ActionEvent event) {

    }

}
