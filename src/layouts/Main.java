package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Layout");

		StackPane layout = new StackPane();
		Scene scene = new Scene(layout, 500, 500);
		window.setScene(scene);
		window.show();

	}
	
}