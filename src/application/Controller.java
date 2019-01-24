package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

@FXML
private Label b1;
@FXML
private TextField Save;


	public void Clk(ActionEvent event) {
	try {
		b1.setText(Save.getText());
	}
	catch (Exception e) {
		// TODO: handle exception
	e.printStackTrace();
	}
		
	}
}
