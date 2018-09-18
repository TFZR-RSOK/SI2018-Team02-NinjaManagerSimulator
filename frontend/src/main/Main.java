package main;

import java.io.IOException;

import classes.Fight;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Stage primaryStage;
	private AnchorPane mainLayout;
	
	public static Fight fight;
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Ninja Manager Simulator");
		showMainView();
	}
	
	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/Homepage.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		scene.getStylesheets().add(getClass().getResource("/views/application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		fight = new Fight();
		primaryStage.show();
	}
	
	

	public static void main(String[] args) {
		launch(args);

	}
}
