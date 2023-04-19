package bsu.comp152;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField display;

    private int firstNumber;

    public void clearPressed(ActionEvent actionEvent) {
        display.setText("");
    }


    public void numberClicked(ActionEvent actionEvent) {
        Button buttonPressed = (Button) actionEvent.getSource();
        String newNumber = buttonPressed.getText();
        String oldNumber = display.getText();
        String newDisplayNumber = oldNumber + newNumber;
        display.setText(newDisplayNumber);
    }

    public void plusPressed(ActionEvent actionEvent) {
        String numberAsString = display.getText();
        firstNumber = Integer.parseInt(numberAsString);
        display.setText("");
    }

    public void equalsPressed(ActionEvent actionEvent) {
        String numberAsString = display.getText();
        int secondNumber = Integer.parseInt(numberAsString);
        display.setText(String.valueOf(firstNumber + secondNumber));
    }
}
