package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PieChartController {
	
	private TableView<PieClass> table = new TableView<PieClass>();
	@FXML public Button saveInput;
	
	@FXML public Button submit;
	
	@FXML public TextField fieldInput;
	
	public void submitAction(ActionEvent event)
	{
		String read= fieldInput.getText();
		//public int intRead= Integer.parseInt(read);
		
		final ObservableList<PieClass> data =
	            FXCollections.observableArrayList(
	            new PieClass("Jacob", "Smith", 10),
	            new PieClass("Isabella", "Johnson", 20),
	            new PieClass("Ethan", "Williams", 30),
	            new PieClass("Emma", "Jones", 40),
	            new PieClass("Michael", "Brown", 50));
			
	}
	
	public void showWindow (ActionEvent event) throws Exception
	{
		Stage primaryStage = new Stage();
		
		Parent root= FXMLLoader.load(getClass().getResource("/application//ShowChart.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	
	

}
