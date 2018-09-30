package main;

import java.io.IOException;
import java.sql.SQLException;

import Tables.ConnectionDBL;
import Tables.NinjaDBL;
import classes.Fight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/*
 * @author Milica Knezevic - milicaknezevic13@gmail.com
 * @version beta 1.0 
 */

public class Main extends Application {

	private Stage primaryStage;
	private AnchorPane mainLayout;
	
	public static Fight fight;
	@Override
	public void start(Stage primaryStage) throws IOException, SQLException {
		
		this.primaryStage = primaryStage;
		this.primaryStage.getIcons().add(new Image("file:favicon.jpg"));
		this.primaryStage.setTitle("Ninja Manager Simulator");
		showMainView();
	}
	
	private void showMainView() throws IOException, SQLException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/Homepage.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		scene.getStylesheets().add(getClass().getResource("/views/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		ConnectionDBL.Connect();
		NinjaDBL.insertNamesIntoArray();
		ConnectionDBL.Disconnect();
		fight = new Fight();
		primaryStage.show();
	}
	
	

	public static void main(String[] args) {
		launch(args);

	}
}
