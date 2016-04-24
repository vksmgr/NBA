package mgr.vikas.nba;


import com.sun.prism.paint.Color;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import mgr.vikas.admin.Admin;
import mgr.vikas.login.*;
import mgr.vikas.login.Login;


import java.io.IOException;

import static com.sun.prism.paint.Color.RED;

public class LoginController {

    @FXML
    private AnchorPane loginDialog;

    @FXML
    private Button buttonLogin;

    @FXML
    private Button closeButton;

    @FXML
    private AnchorPane anchorPaneHeder;

    @FXML
    private Label labelTitle;

    @FXML
    private Label labelShowError;

    @FXML
    private TextField textFieldUsername;

    @FXML
    private TextField textFieldPassword;

    //my variables it's just private local variables;
    private String user = null;

    @FXML
    void buttonLoginClicked(ActionEvent event) throws IOException {
        /*if(textFieldUsername.getText().equalsIgnoreCase("username")&&textFieldPassword.getText().equals("password")){
           // new Admin().mainWindow();
            closeDialog();
        }*/
        user = textFieldUsername.getText();
        String s = new Login().loginMe(user, textFieldPassword.getText());
        if(s.equalsIgnoreCase("0")){
            System.out.println("Sorry Not login");
            labelShowError.setText("INVALID USERNAME OR PASSWORD.");
            labelShowError.setStyle(" -fx-font-size: 12pt;\n" +
                    "    -fx-font-family: \"Segoe UI\";\n" +
                    "    -fx-text-fill: red;\n" +
                    "    -fx-opacity: 1;");

        }else if(s.equalsIgnoreCase("1")) {
            System.out.println("Welcome Administrator" );
            new Admin().mainWindow(user);
            closeDialog();
        }else if(s.equalsIgnoreCase("2")){
            System.out.println("Welcome HOD" );
        }else if(s.equalsIgnoreCase("3")){
            System.out.println("Welcome Professor" );

        }
    }

    @FXML
    void closeButtonOnclicked(ActionEvent event) {
        closeDialog();
    }
    void closeDialog(){
        Stage window = (Stage) closeButton.getScene().getWindow();
        window.close();
    }

}
