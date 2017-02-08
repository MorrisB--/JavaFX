import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main3 extends Application {

	Stage window;
	Button button;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		window = primaryStage;
		window.setTitle("Alert");

		button = new Button("Click");
		button.setOnAction(e -> AlertBox.display("button title", "button message"));

		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene = new Scene(layout, 500, 500);
		window.setScene(scene);
		window.show();

	}

}