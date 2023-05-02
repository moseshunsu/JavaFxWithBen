package JavaFx04ExecutableJarFile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController {
    @FXML
    private Label lblMessage;
    @FXML
    private Button btnOk;

    public void handleBtnOk(ActionEvent actionEvent) {
        lblMessage.setText("OK button is clicked");
    }
}
