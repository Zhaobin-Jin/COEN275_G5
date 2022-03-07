package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EmployeeMainController implements Initializable {

    @FXML
    private AnchorPane Display;

    @FXML
    private Text IdTextField;

    @FXML
    private Text NameTextField;

    @FXML
    private Pane Pane;

    @FXML
    private Label TaskStatusLabel;

    @FXML
    private ChoiceBox<String> TaskStatusChoiceBox;

    @FXML
    private Button LogoutButton;

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
    private String[] statusList = { "Assigned", "In-progress", "Completed" };

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        TaskStatusChoiceBox.getItems().addAll(statusList);
        TaskStatusChoiceBox.setOnAction(this::getStatus);
    }

    public int getStatus(ActionEvent event) {
        String status = TaskStatusChoiceBox.getValue();
        int sint;
        if (status == "Assigned") {
            sint = 0;
        } else if (status == "In-progress") {
            sint = 1;
        } else {
            sint = 2;
        }
        return sint;
    }

    @FXML
    void userLogout(ActionEvent event) throws IOException {
        app.changeScene("Login.fxml");
    }

}
