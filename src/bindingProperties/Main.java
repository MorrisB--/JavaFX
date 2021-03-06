package bindingProperties;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		window.setTitle("Window title");

		TextField userInput = new TextField();
		userInput.setMaxWidth(200);
		Label firstLabel = new Label("Welcome to the site");
		Label secondLabel = new Label();
		
		HBox bottomText = new HBox(firstLabel, secondLabel);
		bottomText.setAlignment(Pos.CENTER);
		
		VBox vBox = new VBox(10, userInput, bottomText);
		vBox.setAlignment(Pos.CENTER);

		secondLabel.textProperty().bind(userInput.textProperty());
		
		Scene scene = new Scene(vBox, 500, 500);
		window.setScene(scene);
		window.show();

	}

}