package javaFX6;

import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller implements Initializable {

    public void changeScreenButtonPushed(ActionEvent event) throws IOException
    {
//        Parent tableViewParent = FXMLLoader.load(getClass().getResource("tableView.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(tableViewParent, 300, 275));
//        primaryStage.show();
        
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("table.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);

        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

}