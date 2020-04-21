package Frontend;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Text text = new Text();
        text.setText("Team Mamba");

        text.setX(50);
        text.setY(50);

        Group root = new Group(text);

        Scene scene = new Scene(root, 500, 500);
        stage.setTitle("ATM");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}