package views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import main.Main;

/*
 * @author Milica Knezevic
 * @version beta 1.0 
 */

public class HomePageController {

	
	Main main = new Main();
	
	@FXML
	private void goToCompareNinjas() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/CompareNinjas.fxml"));
		Parent compareNinjas = loader.load();
		Scene scene = new Scene(compareNinjas);
		Stage compareNinjasStage = new Stage();
		compareNinjasStage.setTitle("Compare Ninjas");
	    compareNinjasStage.setScene(scene);
		compareNinjasStage.setResizable(false);
		compareNinjasStage.show();
		
	}
	
	@FXML
	private void goToKaguyaSimulator() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/KaguyaSimulator.fxml"));
		Parent kaguyaSimulator = loader.load();
		Scene scene = new Scene(kaguyaSimulator);
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Kaguya Simulator");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	
	@FXML
	private void goToNinjaDatabase() throws IOException {
		
		WebView web = new WebView();
	   	web.getEngine().load("https://www.ninjamanager.com/");
	   	Scene scene = new Scene(web);
	   	Stage stage = new Stage();
	   	stage.setScene(scene);
	   	stage.show();
	}
	
	@FXML
	private void goToTeamBuilder() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/TeamBuilder.fxml"));
		Parent teamBuilder = loader.load();
		Scene scene = new Scene(teamBuilder);
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Team Builder");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
	}
	


}
