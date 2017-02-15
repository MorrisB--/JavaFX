package defaultpackage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application /*implements EventHandler<ActionEvent>*/{

	Stage window;
	Button button;
	TextArea textArea;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX Title");
		button = new Button("Submit");
		
		/*button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Working");
			}
		});*/

		button.setOnAction(e -> System.out.println("Using lamda"));
		//StackPane layout = new StackPane();
		//layout.getChildren().add(button);
		
        textArea = new TextArea("Enter here.");
        
        VBox vbox = new VBox(textArea, button);
		Scene scene = new Scene(vbox, 500, 500);

        System.out.println(textArea.getText());

		window.setScene(scene);
		window.show();
	}

	/**
	 * This method is called whenever a user clicks a button.
	 * @param arg0
	 */
/*	@Override
	public void handle(ActionEvent event) {

		if(event.getSource() == button)
			System.out.println(textArea.getText());
	}*/

}