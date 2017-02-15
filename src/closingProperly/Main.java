package closingProperly;

import defaultpackage.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Closing the program");
		window.setOnCloseRequest(e -> {
			/*
			 *  this is needed so after clicking X, the window wont close on its own
			 */
			e.consume();
			closeProgram();
		});

		button = new Button("Close program");
		button.setOnAction(e -> closeProgram());

		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 500, 500);
		window.setScene(scene);
		window.show();

	}

	private void closeProgram() {
		Boolean response = ConfirmBox.display("Title", "Are you sure you want to exit?");
		if (response)
			window.close();
	}

}