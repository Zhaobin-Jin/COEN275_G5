package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TaskChangeController {

    @FXML
    private ChoiceBox<?> DayChoiceBox;

    @FXML
    private Label DescriptionLabel;

    @FXML
    private TextField DescriptionTextField;

    @FXML
    private Label DueDateLabel;

    @FXML
    private ChoiceBox<?> MonthChoiceBox;

    @FXML
    private Pane Pane;

    @FXML
    private ChoiceBox<?> PriorityChoiceBox;

    @FXML
    private Label PriorityLabel;

    @FXML
    private ChoiceBox<?> StatusChoiceBox;

    @FXML
    private Label StatusLabel;

    @FXML
    private Text TaskIdDisplay;

    @FXML
    private Text TaskIdText;

    @FXML
    private ChoiceBox<?> YearChoiceBox;

    @FXML
    private Button SubmitButton;

    @FXML
    private Button CancelButton;

    private App app;
    private Stage taskStage;

    // connect app class to controller
    public void setApp(App app) {
        this.app = app;
    }

    public void setTaskStage(Stage taskStage) {
        this.taskStage = taskStage;
    }

    @FXML
    void submit(ActionEvent event) {
        // !!!没有把数据传给后端，只是关闭窗口
        taskStage.close();
    }

    @FXML
    void cancel(ActionEvent event) {
        taskStage.close();
    }

}
