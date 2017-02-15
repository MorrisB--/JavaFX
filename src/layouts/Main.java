package layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
		
		HBox topMenu = new HBox();
		Button buttonA = new Button("buttonA");
		Button buttonB = new Button("buttonB");
		Button buttonC = new Button("buttonC");
		topMenu.getChildren().addAll(buttonA, buttonB, buttonC);
		
		VBox leftMenu = new VBox();
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		leftMenu.getChildren().addAll(button1, button2, button3);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(topMenu);
		borderPane.setLeft(leftMenu);

		//StackPane layout = new StackPane();
		Scene scene = new Scene(borderPane, 500, 500);
		window.setScene(scene);
		window.show();

	}
	
}