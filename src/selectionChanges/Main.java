package selectionChanges;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
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
		
		ChoiceBox<String> choiceBox = new ChoiceBox<String>();
		choiceBox.getItems().add("Name1");
		choiceBox.getItems().addAll("Name2", "Name3");
		// choiceBox.setValue("Inital Value"); Must be something that is already inside the list
		choiceBox.setValue("Name3");

		choiceBox.getSelectionModel().selectedIndexProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));;
		
		VBox layout = new VBox(10); // spacing the columns out 20 pixels
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(choiceBox, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
}