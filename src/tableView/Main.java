package tableView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("TableView");
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll();
		
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}
}
