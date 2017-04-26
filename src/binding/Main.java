package binding;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
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

		IntegerProperty x = new SimpleIntegerProperty(3);
		IntegerProperty y = new SimpleIntegerProperty();
		
		y.bind(x.multiply(10));
		System.out.println(x.getValue() + "\n" + y.getValue());
		
		x.setValue(9);
		System.out.println(x.getValue());
		System.out.println(y.getValue());

		button = new Button("Submit");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 500, 500);
		window.setScene(scene);
		window.show();

	}

}