import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {
    public static void main (String [] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Fallout Game");
        Button moveUpButton = new Button("↑");
        Button moveDownButton = new Button("↓");
        Button moveLeftButton = new Button("←");
        Button moveRightButton = new Button("→");
        Button attackButton = new Button();
        Button idkButton = new Button();

        GridPane gridPane = new GridPane();

        gridPane.add(moveUpButton, 5, 5, 1, 1);
        gridPane.add(moveDownButton, 5, 6, 1, 1);
        gridPane.add(moveLeftButton, 4, 6, 1, 1);
        gridPane.add(moveRightButton, 6, 6, 1, 1);

        Scene scene = new Scene(gridPane, 512, 512);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
