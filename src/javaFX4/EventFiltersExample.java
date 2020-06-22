import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Paint;

public class EventFiltersExample extends Application {
    @Override
    public void start(Stage stage) {
        //Draw a Circle
        Circle circle = new Circle();
        circle.setCenterX(300.0f);
        circle.setCenterY(135.0f);
        circle.setRadius(25.0f);
        circle.setFill(Color.BROWN);
        circle.setStrokeWidth(20);

        Text text = new Text("Click on the circle to change its color");
        text.setFont(Font.font(null, FontWeight.BOLD, 15));
        text.setFill(Color.CRIMSON);
        text.setX(150);
        text.setY(50);

        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Paint currentColor = circle.getFill();
                System.out.println("Hello World, currentColor= " + currentColor);
                circle.setFill(Color.DARKGREEN);
                // if (currentColor == "0xa52a2aff") {
                //     circle.setFill(Color.DARKGREEN);
                // } else {
                //     circle.setFill(Color.BROWN);
                // }
            }
        };
        //Registering the event filter
        circle.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);

        //Creating a Group object
        Group root = new Group(circle, text);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting the fill color to the scene
        scene.setFill(Color.LAVENDER);

        //Setting title to the Stage
        stage.setTitle("Event Filters Example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}