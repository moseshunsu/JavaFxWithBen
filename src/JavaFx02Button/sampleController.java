package JavaFx02Button;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sampleController {
    @FXML
    private Button btnMessage;
    @FXML
    private Label lblMessage;
    @FXML
    private TextField tfMessage;

    public void handleBtnMessage(ActionEvent actionEvent) {
        lblMessage.setText(tfMessage.getText());
    }
}
