package tableView;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	TableView<Product> table;

	public static void main(String[] args) {
		launch(args);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage window) throws Exception {
		window.setTitle("TableView");
		
		// name columns
		TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
		nameColumn.setMinWidth(100);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		// price columns
		TableColumn<Product, Double> priceColumn = new TableColumn<>("Price");
		priceColumn.setMinWidth(100);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		// quantity columns
		TableColumn<Product, Integer> quantityColumn = new TableColumn<>("Quantity");
		quantityColumn.setMinWidth(100);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(table);
		
		Scene scene = new Scene(vBox);
		window.setScene(scene);
		window.show();
	}
	
	public ObservableList<Product> getProduct() {
		// just for testing
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product());
		products.add(new Product("Cheese", 10.4, 20));
		products.add(new Product("Potato", 14.51, 12));
		return products;
	}
}
