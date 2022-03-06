package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

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

    private Stage primaryStage;

    // connect primary stage to task stage
    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
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
    void modifyTask(ActionEvent event) throws IOException {
        // new stage (new window)
        Stage taskStage = new Stage();
        taskStage.setTitle("Modify Task");
        taskStage.setResizable(false);

        // view
        FXMLLoader taskloader = new FXMLLoader(App.class.getResource("TaskChange.fxml"));
        taskloader.setController(new TaskChangeController());
        Pane taskPane = taskloader.load();

        // controller
        TaskChangeController taskChangeController = taskloader.getController();
        taskChangeController.setApp(this.app);
        taskChangeController.setTaskStage(taskStage);

        // scene on stage
        Scene taskScene = new Scene(taskPane);
        taskStage.setScene(taskScene);

        // specify the modality for new mainWindow
        taskStage.initModality(Modality.WINDOW_MODAL);

        // specify the owner window for new windowModal
        taskStage.initOwner(primaryStage);

        taskStage.show();

    }

    @FXML
    void removeTask(ActionEvent event) {

    }

}
