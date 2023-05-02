package JavaFx01TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sampleController {
    @FXML
    private Label lbNum1;
    @FXML
    private Label lbNum2;
    @FXML
    private Label lbSum;
    @FXML
    private Button btProd;
    @FXML
    private Button btnSum;
    @FXML
    private TextField tfNum1;
    @FXML
    private TextField tfNum2;
    @FXML
    private TextField tfSum;

    public void handleBtnSum(ActionEvent actionEvent) {
        double num1 = Double.parseDouble(tfNum1.getText());
        double num2 = Double.parseDouble(tfNum2.getText());

        double sum = num1 + num2;

        tfSum.setText(String.valueOf(sum));

    }
}
