package cssThemes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
		
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
	
		window.setTitle("Window title");
		
		GridPane gridPane = new GridPane();
		gridPane.setPadding(new Insets(10,10,10,10));
		gridPane.setVgap(5);
		gridPane.setHgap(10);
		
		Label usernameLabel = new Label("Username");
		//usernameLabel.setStyle("-fx-textfill: #e8e8e8");
		usernameLabel.setId("label-bold");
		GridPane.setConstraints(usernameLabel, 0, 0);
		
		TextField usernameTextField = new TextField("username@label.com");
		GridPane.setConstraints(usernameTextField, 1, 0);
		
		Label passwordLabel = new Label("Password");
		GridPane.setConstraints(passwordLabel, 0, 1);
		
		TextField passwordTextField = new TextField();
		passwordTextField.setPromptText("Password Here");
		GridPane.setConstraints(passwordTextField, 1, 1);
		
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		Button signUpButton = new Button("Sign Up");
		signUpButton.getStyleClass().add("button-blue");
		GridPane.setConstraints(signUpButton, 1, 3);
		
		gridPane.getChildren().addAll(usernameLabel, usernameTextField, passwordLabel,passwordTextField, loginButton, signUpButton);
		
		Scene scene = new Scene(gridPane, 500, 500);
		scene.getStylesheets().add("cssThemes/style.css");
		window.setScene(scene);
		window.show();
		
	}

}