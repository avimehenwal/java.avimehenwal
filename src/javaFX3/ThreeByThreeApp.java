import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.TilePane;
import javafx.geometry.Pos;

public class ThreeByThreeApp extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

      TilePane tilePane = new TilePane();
      tilePane.setPrefColumns(3);
      tilePane.setPrefRows(3);
      tilePane.setTileAlignment( Pos.CENTER );

      tilePane.getChildren().addAll(
              new Rectangle(50, 50, Color.RED),
              new Rectangle( 50, 50, Color.GREEN ),
              new Rectangle( 50, 50, Color.BLUE ),
              new Rectangle( 50, 50, Color.YELLOW ),
              new Rectangle( 50, 50, Color.CYAN ),
              new Rectangle( 50, 50, Color.PURPLE ),
              new Rectangle( 50, 50, Color.BROWN ),
              new Rectangle( 50, 50, Color.PINK ),
              new Rectangle( 50, 50, Color.ORANGE )
      );

      Scene scene = new Scene(tilePane);
      scene.setFill(Color.LIGHTGRAY);

      primaryStage.setTitle("3x3 Tile Pane");
      primaryStage.setScene( scene );
      primaryStage.show();
  }

  public static void main(String[] args) {launch(args);}
}