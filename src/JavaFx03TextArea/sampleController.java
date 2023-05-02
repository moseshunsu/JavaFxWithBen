package JavaFx03TextArea;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class sampleController {
    @FXML
    private TextArea taComments;
    @FXML
    private TextField tfComments;
    @FXML
    private Button btnOk;

    public void handleBtnOk(ActionEvent actionEvent) {
//        taComments.setText(tfComments.getText());
        taComments.appendText(tfComments.getText() + "\n");
    }
}
