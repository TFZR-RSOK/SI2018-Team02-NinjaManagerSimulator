package views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Main;

public class HomePageController {

	private Main main;
	
	@FXML
	private void goToCompareNinjas() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/CompareNinjas.fxml"));
		Parent compareNinjas = loader.load();
		Scene scene = new Scene(compareNinjas);
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Compare Ninjas");
		primaryStage.setScene(scene);
		primaryStage.show();
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
		primaryStage.show();
	}
	
	@FXML
	private void goToNinjaDatabase() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("/views/NinjaDatabase.fxml"));
		Parent ninjaDatabase = loader.load();
		Scene scene = new Scene(ninjaDatabase);
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Ninja Database");
		primaryStage.setScene(scene);
		primaryStage.show();
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
		primaryStage.show();
	}
	


}
