package mgr.vikas.nba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import mgr.vikas.database.Connection;

import java.io.IOException;

/**
 * Created by A on 26-03-2016.
 */
public class Login extends Application {
       public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage window = new Stage();
        Connection.connect();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        window.getIcons().add(new Image("/images/Meicon.png"));
        window.initModality(Modality.APPLICATION_MODAL);
        window.initStyle(StageStyle.UNDECORATED);
        window.setScene(new Scene(root,500,300));
        window.showAndWait();
    }
}
