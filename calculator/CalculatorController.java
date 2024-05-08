package calculator;

import java.net.URL;
import javafx.event.ActionEvent;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {
	
	@FXML TextField display;
	
	private String currentInput = "";
	private double firstOperand = 0;
	private String operator = "";
	
	@FXML
	public void handleNumberButtonClick(ActionEvent event) {
		Button button = (Button) event.getSource();
		String value = button.getText();
		currentInput += value;
		display.setText(currentInput);
	}
	
	@FXML
	public void handleOperatorButtonClick(ActionEvent event) {
		Button button = (Button) event.getSource();
		operator = button.getText();
		firstOperand = Double.parseDouble(display.getText());
		currentInput = "";
	}

	@FXML
	public void handleEqualsButtonClick(ActionEvent event) {
		double secondOperand = Double.parseDouble(display.getText());
		double result = 0;
		switch (operator) {
		case "+":
			result = firstOperand + secondOperand;
			break;
		case "-":
			result = firstOperand - secondOperand;
			break;
		case "*":
			result = firstOperand * secondOperand;
			break;
		case "/":		    
		    if (secondOperand != 0) {
		        result = firstOperand / secondOperand;
		    } else {
		        display.setText("Error");
		        return;
		    }
		    break;
		}
		display.setText(String.valueOf(result));
		currentInput = "";
	}
	
	@FXML
	public void handleClearButtonClick(ActionEvent event) {
		display.clear();
		currentInput = "";
		firstOperand = 0;
		operator = "";
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		display.setEditable(false);
		
	}

}
