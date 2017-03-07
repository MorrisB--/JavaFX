package listView;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Scene scene;
	Button button;
	ListView<String> listView;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
	
		window.setTitle("Window title");
		
		button = new Button("Button");
		
		listView = new ListView<>();
		listView.getItems().addAll("Item1", "Item2", "Item3");
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);		
		
		button.setOnAction(e -> buttonClicked());
		
		VBox layout = new VBox(10); // spacing the columns out 20 pixels
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(listView, button);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	private void buttonClicked() {
		ObservableList<String> items = listView.getSelectionModel().getSelectedItems();
		
		String message = "";
		
		for (String m: items)
			message += m + " ";
		System.out.println(message);
	}
	

}