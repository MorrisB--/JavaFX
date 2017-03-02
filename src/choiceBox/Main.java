package choiceBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Scene scene;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
	
		window.setTitle("Window title");
		
		button = new Button("Button");
		
		VBox layout = new VBox(10); // spacing the columns out 20 pixels
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	private void handleCheckBoxOptions(CheckBox box1, CheckBox box2) {
		String message = "Boxes checked: ";
		
		if (box1.isSelected())
			message += "Beans. ";
		
		if (box2.isSelected())
			message += box2.getText() + ". ";
		
		System.out.println(message);
	}

	
	
	

}