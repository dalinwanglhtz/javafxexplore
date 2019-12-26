package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainController {

	@FXML
	private TextArea displayText;
	
	@FXML
	public void getPathVariable(ActionEvent event) {
		String pathVar = System.getenv("Path");
		displayText.setText(pathVar);
		displayText.setWrapText(true);
	}
	
	@FXML
	public void clearDisplayText(ActionEvent event) {
		displayText.setText("");
	}
}
