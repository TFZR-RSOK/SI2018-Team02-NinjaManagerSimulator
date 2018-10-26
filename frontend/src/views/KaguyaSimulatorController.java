package views;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.apache.commons.io.IOUtils;
import org.mapdb.elsa.ElsaMaker;
import org.mapdb.elsa.ElsaSerializer;

import Tables.ConnectionDBL;
import Tables.KaguyaDBL;
import Tables.NapadiDBL;
import Tables.NinjaDBL;
import classes.Team;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import main.*;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class KaguyaSimulatorController implements Initializable {
	
	// Construct Elsa Serializer
	// Elsa uses Maker Pattern to configure extra features
	ElsaSerializer serializer = new ElsaMaker().make();
	
	@FXML
	private ImageView KSPicGen1, KSPicGen2, KSPicGen3, KSPicJounin1, KSPicJounin2, KSPicKage;
	
	@FXML
	private ComboBox<String> KSCBDiff;
	
	@FXML
	private Label lblGen1Lvl, lblGen2Lvl, lblGen3Lvl, lblJounin1Lvl, lblJounin2Lvl, lblKageLvl,
					lblNameGen1, lblNameGen2, lblNameGen3, lblNameJounin1, lblNameJounin2, lblNameKage,
					lblChanceId;
	
	public void saveLVL(int redniBroj, Label lblLvl) {
		Main.fight.getTeam().get_ninjas().get(redniBroj).setLevel(Double.parseDouble(lblLvl.getText()));
	}
	
	@FXML
	public void SaveButton() throws IOException {
		saveLVL(0, lblGen1Lvl);
		saveLVL(1, lblGen2Lvl);
		saveLVL(2, lblGen3Lvl);
		saveLVL(3, lblJounin1Lvl);
		saveLVL(4, lblJounin2Lvl);
		saveLVL(5, lblKageLvl);

		Team data = Main.fight.getTeam();

		// serijalizacija

		// Elsa Serializer takes DataOutput and DataInput.
		// Use streams to create it.
		
		FileOutputStream fos = new FileOutputStream("C:/xampp/mysql/data/ninjamanagersimulator/Team.ser");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DataOutputStream out2 = new DataOutputStream(fos);

		// write data into OutputStream
		serializer.serialize(out2, data);
	}

	public void loadAll(ImageView picFrameGen1, ImageView picFrameGen2, ImageView picFrameGen3, ImageView picFrameJounin1,
			ImageView picFrameJounin2, ImageView picFrameKage) throws FileNotFoundException {
		
		TeamBuilderController.loadSlika(picFrameGen1, 0);
		TeamBuilderController.loadSlika(picFrameGen2, 1);
		TeamBuilderController.loadSlika(picFrameGen3, 2);
		TeamBuilderController.loadSlika(picFrameJounin1, 3);
		TeamBuilderController.loadSlika(picFrameJounin2, 4);
		TeamBuilderController.loadSlika(picFrameKage, 5);
		
		lblNameGen1.setText(Main.fight.getTeam().get_ninjas().get(0).getName());
		lblNameGen2.setText(Main.fight.getTeam().get_ninjas().get(1).getName());
		lblNameGen3.setText(Main.fight.getTeam().get_ninjas().get(2).getName());
		lblNameJounin1.setText(Main.fight.getTeam().get_ninjas().get(3).getName());
		lblNameJounin2.setText(Main.fight.getTeam().get_ninjas().get(4).getName());
		lblNameKage.setText(Main.fight.getTeam().get_ninjas().get(5).getName());
		
		lblGen1Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getLevel())));
		lblGen2Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getLevel())));
		lblGen3Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getLevel())));
		lblJounin1Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getLevel())));
		lblJounin2Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getLevel())));
		lblKageLvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getLevel())));
	}
	
	@FXML
	public void LoadButton() throws IOException {

		// deserijalizacija
		
		InputStream is = new FileInputStream("C:/xampp/mysql/data/ninjamanagersimulator/Team.ser");
		byte[] bytes = IOUtils.toByteArray(is);

		// Construct DataInput
		DataInputStream in = new DataInputStream(
		new ByteArrayInputStream(bytes));
	
		// now deserialize data using DataInput
		Team data2 = (Team)serializer.deserialize(in);
		
		Main.fight.setTeam(data2);

		loadAll(KSPicGen1, KSPicGen2, KSPicGen3, KSPicJounin1, KSPicJounin2, KSPicKage);
	}

	@FXML
	public void FightButton() {
		double sansa = 0;
		lblChanceId.setText(String.format("%.0f", sansa) + " %");		
		sansa = Main.fight.fightSimulation();
		if (sansa == 100) {
			lblChanceId.setText("100 %");
		} else {
			lblChanceId.setText(String.format("%.2f", sansa) + " %");
		}
	}

	@FXML
	public void PlusGen1() {
		Main.fight.getTeam().get_ninjas().get(0).setLevelPlus(Main.fight.getTeam().get_ninjas().get(0).getLevel());
		Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();
		lblGen1Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getLevel())));
	}

	@FXML
	public void PlusGen2() {
		Main.fight.getTeam().get_ninjas().get(1).setLevelPlus(Main.fight.getTeam().get_ninjas().get(1).getLevel());
		Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();
		lblGen2Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getLevel())));
	}

	@FXML
	public void PlusGen3() {
		Main.fight.getTeam().get_ninjas().get(2).setLevelPlus(Main.fight.getTeam().get_ninjas().get(2).getLevel());
		Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();
		lblGen3Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getLevel())));
	}

	@FXML
	public void PlusJounin1() {
		Main.fight.getTeam().get_ninjas().get(3).setLevelPlus(Main.fight.getTeam().get_ninjas().get(3).getLevel());
		Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();
		lblJounin1Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getLevel())));
	}

	@FXML
	public void PlusJounin2() {
		Main.fight.getTeam().get_ninjas().get(4).setLevelPlus(Main.fight.getTeam().get_ninjas().get(4).getLevel());
		Main.fight.getTeam().get_ninjas().get(4).dugmeCalculate();
		lblJounin2Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getLevel())));
	}

	@FXML
	public void PlusKage() {
		Main.fight.getTeam().get_ninjas().get(5).setLevelPlus(Main.fight.getTeam().get_ninjas().get(5).getLevel());
		Main.fight.getTeam().get_ninjas().get(5).dugmeCalculate();
		lblKageLvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getLevel())));
	}

	@FXML
	public void MinusGen1() {
		Main.fight.getTeam().get_ninjas().get(0).setLevelMinus(Main.fight.getTeam().get_ninjas().get(0).getLevel());
		Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();
		lblGen1Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getLevel())));
	}

	@FXML
	public void MinusGen2() {
		Main.fight.getTeam().get_ninjas().get(1).setLevelMinus(Main.fight.getTeam().get_ninjas().get(1).getLevel());
		Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();
		lblGen2Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getLevel())));
	}

	@FXML
	public void MinusGen3() {
		Main.fight.getTeam().get_ninjas().get(2).setLevelMinus(Main.fight.getTeam().get_ninjas().get(2).getLevel());
		Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();
		lblGen3Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getLevel())));
	}

	@FXML
	public void MinusJounin1() {
		Main.fight.getTeam().get_ninjas().get(3).setLevelMinus(Main.fight.getTeam().get_ninjas().get(3).getLevel());
		Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();
		lblJounin1Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getLevel())));
	}

	@FXML
	public void MinusJounin2() {
		Main.fight.getTeam().get_ninjas().get(4).setLevelMinus(Main.fight.getTeam().get_ninjas().get(4).getLevel());
		Main.fight.getTeam().get_ninjas().get(4).dugmeCalculate();
		lblJounin2Lvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getLevel())));
	}

	@FXML
	public void MinusKage() {
		Main.fight.getTeam().get_ninjas().get(5).setLevelMinus(Main.fight.getTeam().get_ninjas().get(5).getLevel());
		Main.fight.getTeam().get_ninjas().get(5).dugmeCalculate();
		lblKageLvl.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getLevel())));
	}
	
	public void ListenerTezina() {
		KSCBDiff.setCellFactory(lv -> {
		ListCell<String> cell = new ListCell<String>() {
			@Override
			protected void updateItem(String item, boolean empty) {
				super.updateItem(item, empty);
				setText(empty ? null : item);
			}
		};
		cell.setOnMousePressed(e -> {
			if (! cell.isEmpty()) {
				String tezina = String.format("%s",KSCBDiff.getValue());
				if (tezina.equals("Begginer")) {
					Main.fight.getKaguya().setBegginerStanje();
				} else if (tezina.equals("Easy")) {
					Main.fight.getKaguya().setEasyStanje();
				} else if (tezina.equals("Medium")) {
					Main.fight.getKaguya().setMediumStanje();
				} else if (tezina.equals("Hard")) {
					Main.fight.getKaguya().setHardStanje();
				} else if (tezina.equals("Extreme")) {
					Main.fight.getKaguya().setExtremeStanje();
				} else if (tezina.equals("Impossible")) {
					Main.fight.getKaguya().setImpossibleStanje();
				} else if (tezina.equals("Forbidden")) {
					Main.fight.getKaguya().setForbiddenStanje();
				} else if (tezina.isEmpty() && ! tezina.equals("")) {
					Main.fight.getKaguya().setBegginerStanje();
				}
				//System.out.println("Click on "+cell.getItem()); Test ispis selektovanog itema
			}
		});
		return cell ;
		});
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		KaguyaDBL.getListaTezina().clear();
		KaguyaDBL.insertNamesIntoArray();
		ObservableList<String> Difficulty = FXCollections.observableArrayList(KaguyaDBL.getListaTezina());
		KSCBDiff.setItems(Difficulty);
		
		ListenerTezina();
	}

}
