package FXML;

import javafx.scene.control.Button;

public class Controller {

	public Button button;
    
    public void handleButtonClick() {
    	System.out.println("Button clicked");
    	button.setText("Clicked");
    }

}