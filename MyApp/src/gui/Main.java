package gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage; // connect primary stage
        mainWindow();
    }

    public void mainWindow() throws IOException {

        // view
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("Login.fxml"));
        loader.setController(new LoginController());
        Pane pane = loader.load();
        primaryStage.setResizable(false);

        // controller
        LoginController loginController = loader.getController();
        loginController.setMain(this);

        // scene on Stage
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        primaryStage.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch(args);
    }
}