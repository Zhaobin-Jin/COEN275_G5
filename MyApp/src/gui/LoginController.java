package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private Button LoginButton;

    @FXML
    private Text Message;

    @FXML
    private Pane Pane;

    @FXML
    private Label PasswordLabel;

    @FXML
    private PasswordField PasswordTextField;

    @FXML
    private Label UserIdLabel;

    @FXML
    private TextField UserIdTextField;

    private Main main;

    // connect main class to controller
    public void setMain(Main main) {
        this.main = main;
    }

    @FXML
    public void userLogin(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void checkLogin() throws IOException {
        Main m = new Main();

        // 测试用!!!!! 这里需要去数据库里检查用户名和密码
        if (UserIdTextField.getText().toString().equals("manager")
                && PasswordTextField.getText().toString().equals("275")) {
            Message.setText("Success!");
            m.changeScene("ManagerMain.fxml");
        }

        else if (UserIdTextField.getText().toString().equals("employee")
                && PasswordTextField.getText().toString().equals("275")) {
            Message.setText("Success!");
            m.changeScene("EmployeeMain.fxml");
        }

        else if (UserIdTextField.getText().isEmpty()) {
            Message.setText("Please enter your user ID!");
        }

        else if (PasswordTextField.getText().isEmpty()) {
            Message.setText("Please enter your password!");
        }

        else {
            Message.setText("Wrong username or password!");
        }
    }

}
