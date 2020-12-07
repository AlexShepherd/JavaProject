import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
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
        Button attackButton = new Button("Attack");
        Button idkButton = new Button("Exit");
        Text text = new Text("This is a JavaFX text.\nLine 2");



        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.BOTTOM_CENTER);

        gridPane.add(moveUpButton, 5, 5, 1, 1);
        gridPane.add(moveDownButton, 5, 6, 1, 1);
        gridPane.add(moveLeftButton, 4, 6, 1, 1);
        gridPane.add(moveRightButton, 6, 6, 1, 1);
        gridPane.add(attackButton, 1, 6, 1, 1);
        gridPane.add(idkButton, 10, 6, 1, 1);
        gridPane.setGridLinesVisible(true);
        gridPane.setHgap(20);
        gridPane.setVgap(5);
        gridPane.add(text, 5, 4, 1, 1);

        Scene scene = new Scene(gridPane, 512, 512);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
