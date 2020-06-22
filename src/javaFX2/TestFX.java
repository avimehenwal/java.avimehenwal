import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TestFX extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 300);
        scene.setFill(Color.LIGHTPINK);

        Circle circle = new Circle(60, 40, 30, Color.GREEN);

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Text text = new Text(10, 90, "Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        text.setFill(Color.DARKRED);

        Font font = new Font(20);
        text.setFont(font);

        root.getChildren().add(circle);
        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Application Title");
    }

    public static void main(String[] args) {
        launch();
    }

}

