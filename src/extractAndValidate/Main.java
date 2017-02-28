package extractAndValidate;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
		
		TextField nameInput = new TextField();
		button = new Button("Send age");
		button.setOnAction(e -> isInt(nameInput, nameInput.getText()));
		
		VBox layout = new VBox(10); // spacing the columns out 20 pixels
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(nameInput, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}

	private boolean isInt(TextField nameInput, String message) {
		try {
			int age = Integer.parseInt(message);
			System.out.println("Age is: " + age);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("Enter a valid age");
		}
		
		return false;
	}
	
	
	

}