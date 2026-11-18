
package floodMonitor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class FloodApplication extends Application {

    @Override
    public void start(Stage stage) {

        Label message = new Label(
            "Welcome to Smart Flood Monitoring System!"
        );

        StackPane root = new StackPane(message);

        Scene scene = new Scene(root, 900, 600);

        stage.setTitle("Smart Flood Monitoring System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
// 