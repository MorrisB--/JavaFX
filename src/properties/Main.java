package properties;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {

		window.setTitle("Window title");

		Person john = new Person();
		john.firstNameProperty().addListener((v, oldValue, newValue) -> {
			System.out.println(newValue);
			System.out.println(john.firstNameProperty());
			System.out.println(john.getFirstName());
		});
		
		button = new Button("Submit");
		button.setOnAction(e -> john.setFirstName("FirstNameTest"));
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 500, 500);
		window.setScene(scene);
		window.show();

	}

}