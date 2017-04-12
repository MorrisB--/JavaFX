package menus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
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
		
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction(e -> System.out.println("New... clicked"));
		fileMenu.getItems().add(newFile);
		
		fileMenu.getItems().add(new MenuItem("New..."));
		fileMenu.getItems().add(new MenuItem("Open..."));
		fileMenu.getItems().add(new MenuItem("Save..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Settings..."));
		fileMenu.getItems().add(new SeparatorMenuItem());
		fileMenu.getItems().add(new MenuItem("Exit..."));

		// underscore before the name acts as a shortcut (alt + e)
		Menu editMenu = new Menu("_Edit");
		editMenu.getItems().add(new MenuItem("Copy"));
		editMenu.getItems().add(new MenuItem("Cut"));
		
		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Pasting stuff"));
		paste.setDisable(true);
		editMenu.getItems().add(paste);
		
		// Help menu
		Menu helpMenu = new Menu("Help");
		CheckMenuItem showLines = new CheckMenuItem("Show Line Numbers");
		showLines.setOnAction(e -> {
			if (showLines.isSelected())
				System.out.println("Show Lines True");
			else
				System.out.println("Show Lines False");
		});
		CheckMenuItem autoSave = new CheckMenuItem("Enable/Disable Autosave");
		autoSave.setSelected(true);
		helpMenu.getItems().addAll(showLines, autoSave);
		
		// Theme RadioMenuItems
		Menu themeMenu = new Menu("Theme");
		ToggleGroup themeToggle = new ToggleGroup();
		RadioMenuItem dark = new RadioMenuItem("Dark");
		RadioMenuItem light = new RadioMenuItem("Light");
		RadioMenuItem blue = new RadioMenuItem("Blue");
		/*dark.setToggleGroup(themeToggle);
		light.setToggleGroup(themeToggle);
		blue.setToggleGroup(themeToggle);*/
		themeToggle.getToggles().addAll(dark, light, blue);
		themeMenu.getItems().addAll(dark, light, blue);
		
		//Main menu bar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu, themeMenu);
		
		layout = new BorderPane();
		layout.setTop(menuBar);
		Scene scene = new Scene(layout, 400, 300);
		window.setScene(scene);
		window.show();
	}
	

}
