package mgr.vikas.admin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AdminController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorPaneCreateSession;

    @FXML
    private AnchorPane anchorPaneSessionForm;

    @FXML
    private Button buttonSessonSave;

    @FXML
    private DatePicker datePeakerSessionEnd;

    @FXML
    private DatePicker datePeakerSessionStart;

    @FXML
    private Label labelSessionMessege;

    @FXML
    private AnchorPane anchorPaneBranchForm;

    @FXML
    private Button buttonBranchSave;

    @FXML
    private TextField textFieldBranchName;

    @FXML
    private ComboBox<?> comboBoxBranchType;

    @FXML
    private ComboBox<?> comboBoxBranchSession;

    @FXML
    private Label labelBranchMessege;

    @FXML
    private AnchorPane anchorPaneBranchForm1;

    @FXML
    private Button buttonSchemeSave;

    @FXML
    private TextField textFieldSecheName;

    @FXML
    private ComboBox<?> comboBoxScheme;

    @FXML
    private ComboBox<?> comboBoxSchemeSession;

    @FXML
    private Label labelSchemeMessege;

    @FXML
    private AnchorPane anchorPaneBranchForm2;

    @FXML
    private Button buttonCourseSave;

    @FXML
    private TextField textFieldCourseName;

    @FXML
    private ComboBox<?> comboBoxCourseBranch;

    @FXML
    private ComboBox<?> comboBoxNewCourseScheme;

    @FXML
    private TextField textFieldCredits;

    @FXML
    private Label labelCourseMessege;

    @FXML
    void buttonCourseSaveOnClick(ActionEvent event) {

    }

    @FXML
    void buttonSchemeSaveOnClick(ActionEvent event) {

    }

    @FXML
    void buttonSessonSaveOnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert anchorPaneCreateSession != null : "fx:id=\"anchorPaneCreateSession\" was not injected: check your FXML file 'admin.fxml'.";
        assert anchorPaneSessionForm != null : "fx:id=\"anchorPaneSessionForm\" was not injected: check your FXML file 'admin.fxml'.";
        assert buttonSessonSave != null : "fx:id=\"buttonSessonSave\" was not injected: check your FXML file 'admin.fxml'.";
        assert datePeakerSessionEnd != null : "fx:id=\"datePeakerSessionEnd\" was not injected: check your FXML file 'admin.fxml'.";
        assert datePeakerSessionStart != null : "fx:id=\"datePeakerSessionStart\" was not injected: check your FXML file 'admin.fxml'.";
        assert labelSessionMessege != null : "fx:id=\"labelSessionMessege\" was not injected: check your FXML file 'admin.fxml'.";
        assert anchorPaneBranchForm != null : "fx:id=\"anchorPaneBranchForm\" was not injected: check your FXML file 'admin.fxml'.";
        assert buttonBranchSave != null : "fx:id=\"buttonBranchSave\" was not injected: check your FXML file 'admin.fxml'.";
        assert textFieldBranchName != null : "fx:id=\"textFieldBranchName\" was not injected: check your FXML file 'admin.fxml'.";
        assert comboBoxBranchType != null : "fx:id=\"comboBoxBranchType\" was not injected: check your FXML file 'admin.fxml'.";
        assert comboBoxBranchSession != null : "fx:id=\"comboBoxBranchSession\" was not injected: check your FXML file 'admin.fxml'.";
        assert labelBranchMessege != null : "fx:id=\"labelBranchMessege\" was not injected: check your FXML file 'admin.fxml'.";
        assert anchorPaneBranchForm1 != null : "fx:id=\"anchorPaneBranchForm1\" was not injected: check your FXML file 'admin.fxml'.";
        assert buttonSchemeSave != null : "fx:id=\"buttonSchemeSave\" was not injected: check your FXML file 'admin.fxml'.";
        assert textFieldSecheName != null : "fx:id=\"textFieldSecheName\" was not injected: check your FXML file 'admin.fxml'.";
        assert comboBoxScheme != null : "fx:id=\"comboBoxScheme\" was not injected: check your FXML file 'admin.fxml'.";
        assert comboBoxSchemeSession != null : "fx:id=\"comboBoxSchemeSession\" was not injected: check your FXML file 'admin.fxml'.";
        assert labelSchemeMessege != null : "fx:id=\"labelSchemeMessege\" was not injected: check your FXML file 'admin.fxml'.";
        assert anchorPaneBranchForm2 != null : "fx:id=\"anchorPaneBranchForm2\" was not injected: check your FXML file 'admin.fxml'.";
        assert buttonCourseSave != null : "fx:id=\"buttonCourseSave\" was not injected: check your FXML file 'admin.fxml'.";
        assert textFieldCourseName != null : "fx:id=\"textFieldCourseName\" was not injected: check your FXML file 'admin.fxml'.";
        assert comboBoxCourseBranch != null : "fx:id=\"comboBoxCourseBranch\" was not injected: check your FXML file 'admin.fxml'.";
        assert comboBoxNewCourseScheme != null : "fx:id=\"comboBoxNewCourseScheme\" was not injected: check your FXML file 'admin.fxml'.";
        assert textFieldCredits != null : "fx:id=\"textFieldCredits\" was not injected: check your FXML file 'admin.fxml'.";
        assert labelCourseMessege != null : "fx:id=\"labelCourseMessege\" was not injected: check your FXML file 'admin.fxml'.";

    }
}
