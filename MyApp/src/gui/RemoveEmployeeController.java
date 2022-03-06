package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RemoveEmployeeController {

    @FXML
    private Button CancelButton;

    @FXML
    private Button RemoveEmployeeButton;

    private App app;
    private Stage removeEmployeeStage;

    // connect app class to controller
    public void setApp(App app) {
        this.app = app;
    }

    public void setRemoveEmployeeStage(Stage removeEmployeeStage) {
        this.removeEmployeeStage = removeEmployeeStage;
    }

    @FXML
    void removeEmployee(ActionEvent event) {
        // !!!没有把数据传给后端，只是关闭窗口
        removeEmployeeStage.close();
    }

    @FXML
    void cancel(ActionEvent event) {
        removeEmployeeStage.close();
    }

}
