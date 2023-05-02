package JavaFx05CheckBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class SampleController {
    @FXML
    private CheckBox chkApple;
    @FXML
    private CheckBox chkOrange;
    @FXML
    private CheckBox chkPear;
    @FXML
    private Button btnOK;
    @FXML
    private TextArea taSummary;

    public void handleBtnOk(ActionEvent actionEvent) {
        // convert boolean values to string values
        taSummary.appendText(String.valueOf(chkApple.isSelected() + "\n"));
        taSummary.appendText(String.valueOf(chkOrange.isSelected() + "\n"));
        taSummary.appendText(String.valueOf(chkPear.isSelected() + "\n"));

        if (chkApple.isSelected()) {
            taSummary.appendText(chkApple.getText() + " $1.20 per kg \n");
        }
        if (chkOrange.isSelected()) {
            taSummary.appendText(chkOrange.getText() + " $1.00 per kg \n");
        }
        if (chkPear.isSelected()) {
            taSummary.appendText(chkPear.getText() + " $1.50 per kg \n");
        }
    }
}
