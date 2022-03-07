package gui;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TaskChangeController implements Initializable {

    @FXML
    private Label DescriptionLabel;

    @FXML
    private TextField DescriptionTextField;

    @FXML
    private Label DueDateLabel;

    @FXML
    private Pane Pane;

    @FXML
    private ChoiceBox<String> PriorityChoiceBox;

    @FXML
    private Label PriorityLabel;

    @FXML
    private Label StatusLabel;

    @FXML
    private Label StatusContentLabel;

    @FXML
    private Text TaskIdDisplay;

    @FXML
    private Text TaskIdText;

    @FXML
    private TextField YearTextField;

    @FXML
    private TextField MonthTextField;

    @FXML
    private TextField DayTextField;

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
    private String[] priorityList = { "High", "Normal", "Low" };

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        PriorityChoiceBox.getItems().addAll(priorityList);
    }

    public int getPriority(ActionEvent event) {
        String priority = PriorityChoiceBox.getValue();
        int pint;
        if (priority == "High") {
            pint = 0;
        } else if (priority == "Normal") {
            pint = 1;
        } else {
            pint = 2;
        }
        return pint;
    }

    public String getDescription() {
        return DescriptionTextField.getText().toString();
    }

    @FXML
    void submit(ActionEvent event) {
        String description = this.getDescription();
        int priority = this.getPriority(event);
        Date date = this.getDate();

        // !!!没有把数据传给后端，只是关闭窗口
        taskStage.close();
    }

    @FXML
    void cancel(ActionEvent event) {
        taskStage.close();
    }

    public Date getDate() {
        return new Date(this.getYear() - 1900, this.getMonth() - 1, this.getDay());
    }

    public int getYear() {
        return Integer.parseInt(YearTextField.getText().toString());
    }

    public int getMonth() {
        return Integer.parseInt(MonthTextField.getText().toString());
    }

    public int getDay() {
        return Integer.parseInt(DayTextField.getText().toString());
    }

}
