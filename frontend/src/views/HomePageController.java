package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import main.Main;

public class HomePageController {

	private Main main;
	@FXML
	private void goToCompareNinjas() throws IOException {
		main.showCompareNinjasScene();
	}
	


}
