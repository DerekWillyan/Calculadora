package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {

	@FXML
	private TextField num1;
	@FXML
	private TextField num2;
	@FXML
	private Button somar;
	@FXML
	private Button subtrair;
	@FXML
	private Button multiplicar;
	@FXML
	private Button dividir;
	@FXML
	private Label resul;
	
	@FXML
	public void onbtnSomar() {
		
		double num1 = Double.parseDouble(this.num1.getText());
		double num2 = Double.parseDouble(this.num2.getText());
		
		double somar = num1+num2;
		
		resul.setText(String.format("%.2f", somar));
		
	}
	@FXML
	public void onbtnSubtrair() {
		
		double num1 = Double.parseDouble(this.num1.getText());
		double num2 = Double.parseDouble(this.num2.getText());
		
		double subtrair = num1-num2;
		
		resul.setText(String.format("%.2f", subtrair));
		
	}
	@FXML
	public void onbtnMultiplicar() {
		
		double num1 = Double.parseDouble(this.num1.getText());
		double num2 = Double.parseDouble(this.num2.getText());
		
		double multiplicar = num1*num2;
		
		resul.setText(String.format("%.2f", multiplicar));
		
	}
	@FXML
	public void onbtnDividir() {
		
		double num1 = Double.parseDouble(this.num1.getText());
		double num2 = Double.parseDouble(this.num2.getText());
		
		double dividir = num1/num2;
		
		resul.setText(String.format("%.2f", dividir));
	}
	
}
