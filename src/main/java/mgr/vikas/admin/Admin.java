package mgr.vikas.admin;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Admin {



    public void mainWindow(String user) throws IOException {

        Stage primaryStage = new Stage();
        Parent pane = FXMLLoader.load(getClass().getResource("/fxml/admin.fxml"));
        primaryStage.setTitle("SAR | Welcome "+user.toUpperCase());
        primaryStage.getIcons().add(new Image("/images/Meicon.png"));
        primaryStage.setScene(new Scene(pane, 1300, 700));
        primaryStage.show();
    }



    public static void closeApplication(){
        Platform.exit();
    }
}
