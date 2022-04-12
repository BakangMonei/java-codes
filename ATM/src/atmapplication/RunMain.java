package atmapplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller = new Controller();
        controller.RunDatabase();
        controller.ControllerMain();
        Parent root = FXMLLoader.load(getClass().getResource("__________Login.fxml"));
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 720, 628));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
