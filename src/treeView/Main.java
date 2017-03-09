package treeView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
	
	Scene scene;
	Button button;
	TreeView<String> treeView;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage window) throws Exception {
	
		window.setTitle("Window title");
		
		TreeItem<String> root, item1, item2;
		root = new TreeItem<>();
		root.setExpanded(true);
		
		item1 = makeBranch("item1", root);
		makeBranch("temp1", item1);
		makeBranch("temp2", item1);
		makeBranch("temp3", item1);

		item2 = makeBranch("item1", root);
		makeBranch("test1", item2);
		makeBranch("text2", item2);
		
		treeView = new TreeView<>(root);
		treeView.setShowRoot(false);
		treeView.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
			if (newValue != null)
				System.out.println(newValue.getValue());
		});
		
		VBox layout = new VBox(10); // spacing the columns out 20 pixels
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(treeView);
		
		scene = new Scene(layout, 300, 250);
		window.setScene(scene);
		window.show();
		
	}
	
	private TreeItem<String> makeBranch(String string, TreeItem<String> parent) {
		
		TreeItem<String> item = new TreeItem<>(string);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}
	

}