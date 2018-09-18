package views;

import java.awt.TextField;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import main.*;

public class CompareNinjasController {
	@FXML
	private Label CNbaseTaiGen1Id, CNbaseNinGen1Id, CNbaseBukiGen1Id, CNbaseStaGen1Id, CNbaseEleGen1Id, CNbaseGenGen1Id, 
		CNTSTaiGen1Id, CNTSNinGen1Id, CNTSBukiGen1Id, CNTSFatGen1Id, CNTSStaGen1Id, CNTSGenGen1Id, CNTSGenAGen1Id, CNTSGenMGen1Id, 
		CNTSBukiBGen1Id, CNTSBukiRGen1Id, CNTSCritCGen1Id, CNTSCritDGen1Id, CNTSRerollGen1Id, CNTSAttackGen1Id, CNTSEndGen1Id,
		CNbaseTaiGen2Id, CNbaseNinGen2Id, CNbaseBukiGen2Id, CNbaseStaGen2Id, CNbaseEleGen2Id, CNbaseGenGen2Id, 
		CNTSTaiGen2Id, CNTSNinGen2Id, CNTSBukiGen2Id, CNTSFatGen2Id, CNTSStaGen2Id, CNTSGenGen2Id, CNTSGenAGen2Id, CNTSGenMGen2Id, 
		CNTSBukiBGen2Id, CNTSBukiRGen2Id, CNTSCritCGen2Id, CNTSCritDGen2Id, CNTSRerollGen2Id, CNTSAttackGen2Id, CNTSEndGen2Id,
		CNbaseTaiGen3Id, CNbaseNinGen3Id, CNbaseBukiGen3Id, CNbaseStaGen3Id, CNbaseEleGen3Id, CNbaseGenGen3Id, 
		CNTSTaiGen3Id, CNTSNinGen3Id, CNTSBukiGen3Id, CNTSFatGen3Id, CNTSStaGen3Id, CNTSGenGen3Id, CNTSGenAGen3Id, CNTSGenMGen3Id, 
		CNTSBukiBGen3Id, CNTSBukiRGen3Id, CNTSCritCGen3Id, CNTSCritDGen3Id, CNTSRerollGen3Id, CNTSAttackGen3Id, CNTSEndGen3Id,
		CNbaseTaiJounin1Id, CNbaseNinJounin1Id, CNbaseBukiJounin1Id, CNbaseStaJounin1Id, CNbaseEleJounin1Id, CNbaseGenJounin1Id, 
		CNTSTaiJounin1Id, CNTSNinJounin1Id, CNTSBukiJounin1Id, CNTSFatJounin1Id, CNTSStaJounin1Id, CNTSGenJounin1Id, CNTSGenAJounin1Id, CNTSGenMJounin1Id, 
		CNTSBukiBJounin1Id, CNTSBukiRJounin1Id, CNTSCritCJounin1Id, CNTSCritDJounin1Id, CNTSRerollJounin1Id, CNTSAttackJounin1Id, CNTSEndJounin1Id;

	@FXML
	private TextField CNAddTaiGen1Id, CNAddNinGen1Id, CNAddBukiGen1Id, CNAddStaGen1Id, CNAddEleGen1Id, CNAddGenGen1Id, 
		CNAddRerollGen1Id, CNAddCritDGen1Id, CNAddBukiRGen1Id,
		CNAddTaiGen2Id, CNAddNinGen2Id, CNAddBukiGen2Id, CNAddStaGen2Id, CNAddEleGen2Id, CNAddGenGen2Id, 
		CNAddRerollGen2Id, CNAddCritDGen2Id, CNAddBukiRGen2Id,
		CNAddTaiGen3Id, CNAddNinGen3Id, CNAddBukiGen3Id, CNAddStaGen3Id, CNAddEleGen3Id, CNAddGenGen3Id, 
		CNAddRerollGen3Id, CNAddCritDGen3Id, CNAddBukiRGen3Id,
		CNAddTaiJounin1Id, CNAddNinJounin1Id, CNAddBukiJounin1Id, CNAddStaJounin1Id, CNAddEleJounin1Id, CNAddGenJounin1Id, 
		CNAddRerollJounin1Id, CNAddCritDJounin1Id, CNAddBukiRJounin1Id,
		lvlGen1, lvlGen2, lvlGen3, lvlJounin1, lvlJounin2, lvlKage;

	@FXML
	public void calculateStatsGen1() {
		//OVO IDE KADA SE NINJA IZABERE!!!
		CNbaseTaiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getTaijutsu())));
		CNbaseNinGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getNinjutsu())));
		CNbaseBukiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsu())));
		CNbaseStaGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getStamina())));
		CNbaseEleGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getElement())));
		CNbaseGenGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsu())));

		Main.fight.getTeam().get_ninjas().get(0).setLevel(Double.parseDouble(lvlGen1.getText()));

		Main.fight.getTeam().get_ninjas().get(0).getStats().setT(Double.parseDouble(CNAddTaiGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setN(Double.parseDouble(CNAddNinGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setB(Double.parseDouble(CNAddBukiGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setS(Double.parseDouble(CNAddStaGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setE(Double.parseDouble(CNAddEleGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setG(Double.parseDouble(CNAddGenGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setR(Double.parseDouble(CNAddRerollGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setCs(Double.parseDouble(CNAddCritDGen1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(0).getStats().setBr(Double.parseDouble(CNAddBukiRGen1Id.getText()));

		Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();

		CNTSTaiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getTaijutsu())));
		CNTSNinGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getNinjutsu())));
		CNTSBukiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsu())));
		CNTSFatGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getFatigue())));
		CNTSStaGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getStamina())));
		CNTSGenGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsu())));
		CNTSGenAGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsuActivation())));
		CNTSGenMGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsuMastery())));
		CNTSBukiBGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsuBoost())));
		CNTSBukiRGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsuRecovery())));
		CNTSCritCGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getCritChance())));
		CNTSCritDGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getCritStrike())));
		CNTSRerollGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getReroll())));
		CNTSAttackGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getAttack())));
		CNTSEndGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getEndurance())));
	}

	@FXML
	public void calculateStatsGen2() {
		//OVO IDE KADA SE NINJA IZABERE!!!
		CNbaseTaiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getTaijutsu())));
		CNbaseNinGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getNinjutsu())));
		CNbaseBukiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsu())));
		CNbaseStaGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getStamina())));
		CNbaseEleGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getElement())));
		CNbaseGenGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsu())));

		Main.fight.getTeam().get_ninjas().get(1).setLevel(Double.parseDouble(lvlGen2.getText()));

		Main.fight.getTeam().get_ninjas().get(1).getStats().setT(Double.parseDouble(CNAddTaiGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setN(Double.parseDouble(CNAddNinGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setB(Double.parseDouble(CNAddBukiGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setS(Double.parseDouble(CNAddStaGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setE(Double.parseDouble(CNAddEleGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setG(Double.parseDouble(CNAddGenGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setR(Double.parseDouble(CNAddRerollGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setCs(Double.parseDouble(CNAddCritDGen2Id.getText()));
		Main.fight.getTeam().get_ninjas().get(1).getStats().setBr(Double.parseDouble(CNAddBukiRGen2Id.getText()));

		Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();

		CNTSTaiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getTaijutsu())));
		CNTSNinGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getNinjutsu())));
		CNTSBukiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsu())));
		CNTSFatGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getFatigue())));
		CNTSStaGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getStamina())));
		CNTSGenGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsu())));
		CNTSGenAGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsuActivation())));
		CNTSGenMGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsuMastery())));
		CNTSBukiBGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsuBoost())));
		CNTSBukiRGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsuRecovery())));
		CNTSCritCGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getCritChance())));
		CNTSCritDGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getCritStrike())));
		CNTSRerollGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getReroll())));
		CNTSAttackGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getAttack())));
		CNTSEndGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getEndurance())));
	}

	@FXML
	public void calculateStatsGen3() {
		//OVO IDE KADA SE NINJA IZABERE!!!
		CNbaseTaiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getTaijutsu())));
		CNbaseNinGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getNinjutsu())));
		CNbaseBukiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsu())));
		CNbaseStaGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getStamina())));
		CNbaseEleGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getElement())));
		CNbaseGenGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsu())));

		Main.fight.getTeam().get_ninjas().get(2).setLevel(Double.parseDouble(lvlGen3.getText()));

		Main.fight.getTeam().get_ninjas().get(2).getStats().setT(Double.parseDouble(CNAddTaiGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setN(Double.parseDouble(CNAddNinGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setB(Double.parseDouble(CNAddBukiGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setS(Double.parseDouble(CNAddStaGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setE(Double.parseDouble(CNAddEleGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setG(Double.parseDouble(CNAddGenGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setR(Double.parseDouble(CNAddRerollGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setCs(Double.parseDouble(CNAddCritDGen3Id.getText()));
		Main.fight.getTeam().get_ninjas().get(2).getStats().setBr(Double.parseDouble(CNAddBukiRGen3Id.getText()));

		Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();

		CNTSTaiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getTaijutsu())));
		CNTSNinGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getNinjutsu())));
		CNTSBukiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsu())));
		CNTSFatGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getFatigue())));
		CNTSStaGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getStamina())));
		CNTSGenGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsu())));
		CNTSGenAGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsuActivation())));
		CNTSGenMGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsuMastery())));
		CNTSBukiBGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsuBoost())));
		CNTSBukiRGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsuRecovery())));
		CNTSCritCGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getCritChance())));
		CNTSCritDGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getCritStrike())));
		CNTSRerollGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getReroll())));
		CNTSAttackGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getAttack())));
		CNTSEndGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getEndurance())));
	}

	@FXML
	public void calculateStatsJounin1() {
		//OVO IDE KADA SE NINJA IZABERE!!!
		CNbaseTaiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getTaijutsu())));
		CNbaseNinJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getNinjutsu())));
		CNbaseBukiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsu())));
		CNbaseStaJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getStamina())));
		CNbaseEleJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getElement())));
		CNbaseGenJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsu())));

		Main.fight.getTeam().get_ninjas().get(3).setLevel(Double.parseDouble(lvlJounin1.getText()));

		Main.fight.getTeam().get_ninjas().get(3).getStats().setT(Double.parseDouble(CNAddTaiJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setN(Double.parseDouble(CNAddNinJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setB(Double.parseDouble(CNAddBukiJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setS(Double.parseDouble(CNAddStaJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setE(Double.parseDouble(CNAddEleJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setG(Double.parseDouble(CNAddGenJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setR(Double.parseDouble(CNAddRerollJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setCs(Double.parseDouble(CNAddCritDJounin1Id.getText()));
		Main.fight.getTeam().get_ninjas().get(3).getStats().setBr(Double.parseDouble(CNAddBukiRJounin1Id.getText()));

		Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();

		CNTSTaiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getTaijutsu())));
		CNTSNinJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getNinjutsu())));
		CNTSBukiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsu())));
		CNTSFatJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getFatigue())));
		CNTSStaJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getStamina())));
		CNTSGenJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsu())));
		CNTSGenAJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsuActivation())));
		CNTSGenMJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsuMastery())));
		CNTSBukiBJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsuBoost())));
		CNTSBukiRJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsuRecovery())));
		CNTSCritCJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getCritChance())));
		CNTSCritDJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getCritStrike())));
		CNTSRerollJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getReroll())));
		CNTSAttackJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getAttack())));
		CNTSEndJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getEndurance())));
	}
}
