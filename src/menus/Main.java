package menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	BorderPane layout;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("TableView");
		
		Menu fileMenu = new Menu("File");
		fileMenu.getItems().add(new MenuItem("New Project..."));
		fileMenu.getItems().add(new MenuItem("Import..."));
		fileMenu.getItems().add(new MenuItem("Export..."));

		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu);
		
		layout = new BorderPane();
		layout.setTop(menuBar);
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
	}
	

}
