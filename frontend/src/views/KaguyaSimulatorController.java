package views;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main.*;

public class KaguyaSimulatorController {
	
	private Label lblGen1Lvl, lblGen2Lvl, lblGen3Lvl, lblJounin1Lvl, lblJounin2Lvl, lblKageLvl,
	lblNameGen1, lblNameGen2, lblNameGen3, lblNameJounin1, lblNameJounin2, lblNameKage,
	lblChanceId;

	@FXML
	public void SaveButton() {
		Main.fight.getTeam().get_ninjas().get(0).setLevel(Double.parseDouble(lblGen1Lvl.getText()));
		Main.fight.getTeam().get_ninjas().get(1).setLevel(Double.parseDouble(lblGen2Lvl.getText()));
		Main.fight.getTeam().get_ninjas().get(2).setLevel(Double.parseDouble(lblGen3Lvl.getText()));
		Main.fight.getTeam().get_ninjas().get(3).setLevel(Double.parseDouble(lblJounin1Lvl.getText()));
		Main.fight.getTeam().get_ninjas().get(4).setLevel(Double.parseDouble(lblJounin2Lvl.getText()));
		Main.fight.getTeam().get_ninjas().get(5).setLevel(Double.parseDouble(lblKageLvl.getText()));

		//Main.fight.getTeam().dugmeSave();
	}

	@FXML
	public void LoadButton() {

		//Main.fight.getTeam().dugmeLoad();

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
	public void FightButton() {
		int sansa = Main.fight.fightSimulation();
		lblChanceId.setText(String.valueOf(sansa));
	}

	@FXML
	public void PlusGen1() {
		Main.fight.getTeam().get_ninjas().get(0).setLevelPlus(Double.parseDouble(lblGen1Lvl.getText()));
		lblGen1Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(0).getLevel())));
	}

	@FXML
	public void PlusGen2() {
		Main.fight.getTeam().get_ninjas().get(1).setLevelPlus(Double.parseDouble(lblGen2Lvl.getText()));
		lblGen2Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(1).getLevel())));
	}

	@FXML
	public void PlusGen3() {
		Main.fight.getTeam().get_ninjas().get(2).setLevelPlus(Double.parseDouble(lblGen3Lvl.getText()));
		lblGen3Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(2).getLevel())));
	}

	@FXML
	public void PlusJounin1() {
		Main.fight.getTeam().get_ninjas().get(3).setLevelPlus(Double.parseDouble(lblJounin1Lvl.getText()));
		lblJounin1Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(3).getLevel())));
	}

	@FXML
	public void PlusJounin2() {
		Main.fight.getTeam().get_ninjas().get(4).setLevelPlus(Double.parseDouble(lblJounin2Lvl.getText()));
		lblJounin2Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(4).getLevel())));
	}

	@FXML
	public void PlusKage() {
		Main.fight.getTeam().get_ninjas().get(5).setLevelPlus(Double.parseDouble(lblKageLvl.getText()));
		lblKageLvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(5).getLevel())));
	}

	@FXML
	public void MinusGen1() {
		Main.fight.getTeam().get_ninjas().get(0).setLevelMinus(Double.parseDouble(lblGen1Lvl.getText()));
		lblGen1Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(0).getLevel())));
	}

	@FXML
	public void MinusGen2() {
		Main.fight.getTeam().get_ninjas().get(1).setLevelMinus(Double.parseDouble(lblGen2Lvl.getText()));
		lblGen2Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(1).getLevel())));
	}

	@FXML
	public void MinusGen3() {
		Main.fight.getTeam().get_ninjas().get(2).setLevelMinus(Double.parseDouble(lblGen3Lvl.getText()));
		lblGen3Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(2).getLevel())));
	}

	@FXML
	public void MinusJounin1() {
		Main.fight.getTeam().get_ninjas().get(3).setLevelMinus(Double.parseDouble(lblJounin1Lvl.getText()));
		lblJounin1Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(3).getLevel())));
	}

	@FXML
	public void MinusJounin2() {
		Main.fight.getTeam().get_ninjas().get(4).setLevelMinus(Double.parseDouble(lblJounin2Lvl.getText()));
		lblJounin2Lvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(4).getLevel())));
	}

	@FXML
	public void MinusKage() {
		Main.fight.getTeam().get_ninjas().get(5).setLevelMinus(Double.parseDouble(lblKageLvl.getText()));
		lblKageLvl.setText(String.format("%.0",(Main.fight.getTeam().get_ninjas().get(5).getLevel())));
	}

}
