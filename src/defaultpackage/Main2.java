package defaultpackage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main2 extends Application{
	
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
	
		Label label1 = new Label("First scene");
		Button button1 = new Button("Change to scene 2");
		button1.setOnAction(e -> window.setScene(scene2));
		
		VBox layout1 = new VBox(20); // spacing the columns out 20 pixels
		
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 200, 200);
		
		Label label2 = new Label("Second scene");
		Button button2 = new Button("Change to scene 1");
		button2.setOnAction(e -> window.setScene(scene1));
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 600, 300);
		
		window.setScene(scene1);
		window.setTitle("Window title");
		window.show();
		
	}

}