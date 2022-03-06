package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {

    private Stage primaryStage;
    private Scene scene;
    private FXMLLoader loader;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage; // connect primary stage
        primaryStage.setTitle("Task Manager");
        mainWindow();
    }

    public void mainWindow() throws IOException {

        // view
        loader = new FXMLLoader(App.class.getResource("Login.fxml"));
        loader.setController(new LoginController());
        Pane pane = loader.load();
        primaryStage.setResizable(false);

        // controller
        LoginController loginController = loader.getController();
        loginController.setApp(this);

        // scene on stage
        scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
        primaryStage.setMinWidth(primaryStage.getWidth());
        primaryStage.setMinHeight(primaryStage.getHeight());
    }

    public void changeScene(String fxml) throws IOException {

        // view
        loader = new FXMLLoader(App.class.getResource(fxml));
        if (fxml == "ManagerMain.fxml") {
            loader.setController(new ManagerMainController());
        } else if (fxml == "EmployeeMain.fxml") {
            loader.setController(new EmployeeMainController());
        } else {
            loader.setController(new LoginController());
        }
        Pane pane = loader.load();

        // controller
        if (fxml == "ManagerMain.fxml") {
            ManagerMainController managerMainController = loader.getController();
            managerMainController.setApp(this);
            managerMainController.setPrimaryStage(this.primaryStage);
        } else if (fxml == "EmployeeMain.fxml") {
            EmployeeMainController employeeMainController = loader.getController();
            employeeMainController.setApp(this);
            employeeMainController.setPrimaryStage(this.primaryStage);
        } else {
            LoginController loginController = loader.getController();
            loginController.setApp(this);
            loginController.setPrimaryStage(this.primaryStage);
        }

        // scene on Stage
        scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}