package ComboBox;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Scene scene;
	Button button;
	ComboBox<String> comboBox;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
	
		window.setTitle("Window title");
		
		button = new Button("Button");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
				"Name1",
				"Name2",
				"Name3"
				);
		
		comboBox.setPromptText("Pick a name");
		comboBox.setEditable(true);
		
		button.setOnAction(e -> printMovie());
		
		comboBox.setOnAction(e -> System.out.println("Selected: " + comboBox.getValue()));
		
		VBox layout = new VBox(10); // spacing the columns out 20 pixels
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(comboBox, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	private void printMovie() {
		System.out.println(comboBox.getValue());
	}
}