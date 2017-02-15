package defaultpackage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Test extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
		
		Label title = new Label("Title");
		title.setPadding(new Insets(10));
		Label username = new Label("Username");
		TextField usernameTextBox = new TextField();
		Label password = new Label("Password");
		TextField passwordTextBox = new TextField();
		passwordTextBox.setMaxWidth(300);
		VBox vBox = new VBox();
		
		vBox.getChildren().addAll(title, username, usernameTextBox, password, passwordTextBox);
		vBox.setAlignment(Pos.TOP_CENTER);
		
		Scene scene = new Scene(vBox, 500, 500);
		
		window.setScene(scene);
		window.show();
		
	}

}
