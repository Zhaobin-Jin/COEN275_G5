package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AssignEmployeeController {

    @FXML
    private Button AddEmployeeButton;

    @FXML
    private Button CancelButton;

    private App app;
    private Stage assignEmployeeStage;

    // connect app class to controller
    public void setApp(App app) {
        this.app = app;
    }

    public void setAssignEmployeeStage(Stage assignEmployeeStage) {
        this.assignEmployeeStage = assignEmployeeStage;
    }

    @FXML
    void addEmployee(ActionEvent event) {
        // !!!没有把数据传给后端，只是关闭窗口
        assignEmployeeStage.close();
    }

    @FXML
    void cancel(ActionEvent event) {
        assignEmployeeStage.close();
    }

}
