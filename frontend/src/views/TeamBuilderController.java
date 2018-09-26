package views;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.*;

public class TeamBuilderController {

	    @FXML
	    private Label baseTaiGen1Id, baseNinGen1Id, baseBukiGen1Id, baseStaGen1Id, baseEleGen1Id, baseGenGen1Id, 
	    	TSTaiGen1Id, TSNinGen1Id, TSBukiGen1Id, TSFatGen1Id, TSStaGen1Id, TSGenGen1Id, TSGenAGen1Id, TSGenMGen1Id, 
	    	TSBukiBGen1Id, TSBukiRGen1Id, TSCritCGen1Id, TSCritDGen1Id, TSRerollGen1Id, TSAttackGen1Id, TSEndGen1Id,
	    	baseTaiGen2Id, baseNinGen2Id, baseBukiGen2Id, baseStaGen2Id, baseEleGen2Id, baseGenGen2Id, 
	    	TSTaiGen2Id, TSNinGen2Id, TSBukiGen2Id, TSFatGen2Id, TSStaGen2Id, TSGenGen2Id, TSGenAGen2Id, TSGenMGen2Id, 
	    	TSBukiBGen2Id, TSBukiRGen2Id, TSCritCGen2Id, TSCritDGen2Id, TSRerollGen2Id, TSAttackGen2Id, TSEndGen2Id,
	    	baseTaiGen3Id, baseNinGen3Id, baseBukiGen3Id, baseStaGen3Id, baseEleGen3Id, baseGenGen3Id, 
	    	TSTaiGen3Id, TSNinGen3Id, TSBukiGen3Id, TSFatGen3Id, TSStaGen3Id, TSGenGen3Id, TSGenAGen3Id, TSGenMGen3Id, 
	    	TSBukiBGen3Id, TSBukiRGen3Id, TSCritCGen3Id, TSCritDGen3Id, TSRerollGen3Id, TSAttackGen3Id, TSEndGen3Id,
	    	baseTaiJounin1Id, baseNinJounin1Id, baseBukiJounin1Id, baseStaJounin1Id, baseEleJounin1Id, baseGenJounin1Id, 
	    	TSTaiJounin1Id, TSNinJounin1Id, TSBukiJounin1Id, TSFatJounin1Id, TSStaJounin1Id, TSGenJounin1Id, TSGenAJounin1Id, TSGenMJounin1Id, 
	    	TSBukiBJounin1Id, TSBukiRJounin1Id, TSCritCJounin1Id, TSCritDJounin1Id, TSRerollJounin1Id, TSAttackJounin1Id, TSEndJounin1Id,
	    	baseTaiJounin2Id, baseNinJounin2Id, baseBukiJounin2Id, baseStaJounin2Id, baseEleJounin2Id, baseGenJounin2Id, 
	    	TSTaiJounin2Id, TSNinJounin2Id, TSBukiJounin2Id, TSFatJounin2Id, TSStaJounin2Id, TSGenJounin2Id, TSGenAJounin2Id, TSGenMJounin2Id, 
	    	TSBukiBJounin2Id, TSBukiRJounin2Id, TSCritCJounin2Id, TSCritDJounin2Id, TSRerollJounin2Id, TSAttackJounin2Id, TSEndJounin2Id,
	    	baseTaiKageId, baseNinKageId, baseBukiKageId, baseStaKageId, baseEleKageId, baseGenKageId, 
	    	TSTaiKageId, TSNinKageId, TSBukiKageId, TSFatKageId, TSStaKageId, TSGenKageId, TSGenAKageId, TSGenMKageId, 
	    	TSBukiBKageId, TSBukiRKageId, TSCritCKageId, TSCritDKageId, TSRerollKageId, TSAttackKageId, TSEndKageId;

	    @FXML
	    private TextField AddTaiGen1Id, AddNinGen1Id, AddBukiGen1Id, AddStaGen1Id, AddEleGen1Id, AddGenGen1Id, 
	    	AddRerollGen1Id, AddCritDGen1Id, AddBukiRGen1Id,
	    	AddTaiGen2Id, AddNinGen2Id, AddBukiGen2Id, AddStaGen2Id, AddEleGen2Id, AddGenGen2Id, 
	    	AddRerollGen2Id, AddCritDGen2Id, AddBukiRGen2Id,
	    	AddTaiGen3Id, AddNinGen3Id, AddBukiGen3Id, AddStaGen3Id, AddEleGen3Id, AddGenGen3Id, 
	    	AddRerollGen3Id, AddCritDGen3Id, AddBukiRGen3Id,
	    	AddTaiJounin1Id, AddNinJounin1Id, AddBukiJounin1Id, AddStaJounin1Id, AddEleJounin1Id, AddGenJounin1Id, 
	    	AddRerollJounin1Id, AddCritDJounin1Id, AddBukiRJounin1Id,
	    	AddTaiJounin2Id, AddNinJounin2Id, AddBukiJounin2Id, AddStaJounin2Id, AddEleJounin2Id, AddGenJounin2Id, 
	    	AddRerollJounin2Id, AddCritDJounin2Id, AddBukiRJounin2Id,
	    	AddTaiKageId, AddNinKageId, AddBukiKageId, AddStaKageId, AddEleKageId, AddGenKageId, 
	    	AddRerollKageId, AddCritDKageId, AddBukiRKageId,
	    	lvlGen1, lvlGen2, lvlGen3, lvlJounin1, lvlJounin2, lvlKage;

	    @FXML
	    public void calculateStatsGen1() {
	    	//OVO IDE KADA SE NINJA IZABERE!!!
	    	baseTaiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getTaijutsu())));
	    	baseNinGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getNinjutsu())));
	    	baseBukiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsu())));
	    	baseStaGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getStamina())));
	    	baseEleGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getElement())));
	    	baseGenGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsu())));

	    	Main.fight.getTeam().get_ninjas().get(0).setLevel(Double.parseDouble(lvlGen1.getText()));

	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setT(Double.parseDouble(AddTaiGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setN(Double.parseDouble(AddNinGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setB(Double.parseDouble(AddBukiGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setS(Double.parseDouble(AddStaGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setE(Double.parseDouble(AddEleGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setG(Double.parseDouble(AddGenGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setR(Double.parseDouble(AddRerollGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setCs(Double.parseDouble(AddCritDGen1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(0).getStats().setBr(Double.parseDouble(AddBukiRGen1Id.getText()));

	    	Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();

	    	TSTaiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getTaijutsu())));
	    	TSNinGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getNinjutsu())));
	    	TSBukiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsu())));
	    	TSFatGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getFatigue())));
	    	TSStaGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getStamina())));
	    	TSGenGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsu())));
	    	TSGenAGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsuActivation())));
	    	TSGenMGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsuMastery())));
	    	TSBukiBGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsuBoost())));
	    	TSBukiRGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsuRecovery())));
	    	TSCritCGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getCritChance())));
	    	TSCritDGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getCritStrike())));
	    	TSRerollGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getReroll())));
	    	TSAttackGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getAttack())));
	    	TSEndGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getEndurance())));
	    }

	    @FXML
	    public void calculateStatsGen2() {
	    	//OVO IDE KADA SE NINJA IZABERE!!!
	    	baseTaiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getTaijutsu())));
	    	baseNinGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getNinjutsu())));
	    	baseBukiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsu())));
	    	baseStaGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getStamina())));
	    	baseEleGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getElement())));
	    	baseGenGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsu())));

	    	Main.fight.getTeam().get_ninjas().get(1).setLevel(Double.parseDouble(lvlGen2.getText()));

	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setT(Double.parseDouble(AddTaiGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setN(Double.parseDouble(AddNinGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setB(Double.parseDouble(AddBukiGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setS(Double.parseDouble(AddStaGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setE(Double.parseDouble(AddEleGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setG(Double.parseDouble(AddGenGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setR(Double.parseDouble(AddRerollGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setCs(Double.parseDouble(AddCritDGen2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(1).getStats().setBr(Double.parseDouble(AddBukiRGen2Id.getText()));

	    	Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();

	    	TSTaiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getTaijutsu())));
	    	TSNinGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getNinjutsu())));
	    	TSBukiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsu())));
	    	TSFatGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getFatigue())));
	    	TSStaGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getStamina())));
	    	TSGenGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsu())));
	    	TSGenAGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsuActivation())));
	    	TSGenMGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsuMastery())));
	    	TSBukiBGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsuBoost())));
	    	TSBukiRGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsuRecovery())));
	    	TSCritCGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getCritChance())));
	    	TSCritDGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getCritStrike())));
	    	TSRerollGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getReroll())));
	    	TSAttackGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getAttack())));
	    	TSEndGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getEndurance())));
	    }

	    @FXML
	    public void calculateStatsGen3() {
	    	//OVO IDE KADA SE NINJA IZABERE!!!
	    	baseTaiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getTaijutsu())));
	    	baseNinGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getNinjutsu())));
	    	baseBukiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsu())));
	    	baseStaGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getStamina())));
	    	baseEleGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getElement())));
	    	baseGenGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsu())));

	    	Main.fight.getTeam().get_ninjas().get(2).setLevel(Double.parseDouble(lvlGen3.getText()));

	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setT(Double.parseDouble(AddTaiGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setN(Double.parseDouble(AddNinGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setB(Double.parseDouble(AddBukiGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setS(Double.parseDouble(AddStaGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setE(Double.parseDouble(AddEleGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setG(Double.parseDouble(AddGenGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setR(Double.parseDouble(AddRerollGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setCs(Double.parseDouble(AddCritDGen3Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(2).getStats().setBr(Double.parseDouble(AddBukiRGen3Id.getText()));

	    	Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();

	    	TSTaiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getTaijutsu())));
	    	TSNinGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getNinjutsu())));
	    	TSBukiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsu())));
	    	TSFatGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getFatigue())));
	    	TSStaGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getStamina())));
	    	TSGenGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsu())));
	    	TSGenAGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsuActivation())));
	    	TSGenMGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsuMastery())));
	    	TSBukiBGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsuBoost())));
	    	TSBukiRGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsuRecovery())));
	    	TSCritCGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getCritChance())));
	    	TSCritDGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getCritStrike())));
	    	TSRerollGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getReroll())));
	    	TSAttackGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getAttack())));
	    	TSEndGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getEndurance())));
	    }

	    @FXML
	    public void calculateStatsJounin1() {
	    	//OVO IDE KADA SE NINJA IZABERE!!!
	    	baseTaiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getTaijutsu())));
	    	baseNinJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getNinjutsu())));
	    	baseBukiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsu())));
	    	baseStaJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getStamina())));
	    	baseEleJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getElement())));
	    	baseGenJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsu())));

	    	Main.fight.getTeam().get_ninjas().get(3).setLevel(Double.parseDouble(lvlJounin1.getText()));

	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setT(Double.parseDouble(AddTaiJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setN(Double.parseDouble(AddNinJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setB(Double.parseDouble(AddBukiJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setS(Double.parseDouble(AddStaJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setE(Double.parseDouble(AddEleJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setG(Double.parseDouble(AddGenJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setR(Double.parseDouble(AddRerollJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setCs(Double.parseDouble(AddCritDJounin1Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(3).getStats().setBr(Double.parseDouble(AddBukiRJounin1Id.getText()));

	    	Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();

	    	TSTaiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getTaijutsu())));
	    	TSNinJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getNinjutsu())));
	    	TSBukiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsu())));
	    	TSFatJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getFatigue())));
	    	TSStaJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getStamina())));
	    	TSGenJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsu())));
	    	TSGenAJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsuActivation())));
	    	TSGenMJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsuMastery())));
	    	TSBukiBJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsuBoost())));
	    	TSBukiRJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsuRecovery())));
	    	TSCritCJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getCritChance())));
	    	TSCritDJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getCritStrike())));
	    	TSRerollJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getReroll())));
	    	TSAttackJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getAttack())));
	    	TSEndJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getEndurance())));
	    }

	    @FXML
	    public void calculateStatsJounin2() {
	    	//OVO IDE KADA SE NINJA IZABERE!!!
	    	baseTaiJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getTaijutsu())));
	    	baseNinJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getNinjutsu())));
	    	baseBukiJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getBukijutsu())));
	    	baseStaJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getStamina())));
	    	baseEleJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getElement())));
	    	baseGenJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getGenjutsu())));

	    	Main.fight.getTeam().get_ninjas().get(4).setLevel(Double.parseDouble(lvlJounin2.getText()));

	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setT(Double.parseDouble(AddTaiJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setN(Double.parseDouble(AddNinJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setB(Double.parseDouble(AddBukiJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setS(Double.parseDouble(AddStaJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setE(Double.parseDouble(AddEleJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setG(Double.parseDouble(AddGenJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setR(Double.parseDouble(AddRerollJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setCs(Double.parseDouble(AddCritDJounin2Id.getText()));
	    	Main.fight.getTeam().get_ninjas().get(4).getStats().setBr(Double.parseDouble(AddBukiRJounin2Id.getText()));

	    	Main.fight.getTeam().get_ninjas().get(4).dugmeCalculate();

	    	TSTaiJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getTaijutsu())));
	    	TSNinJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getNinjutsu())));
	    	TSBukiJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getBukijutsu())));
	    	TSFatJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getFatigue())));
	    	TSStaJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getStamina())));
	    	TSGenJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getGenjutsu())));
	    	TSGenAJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getGenjutsuActivation())));
	    	TSGenMJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getGenjutsuMastery())));
	    	TSBukiBJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getBukijutsuBoost())));
	    	TSBukiRJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getBukijutsuRecovery())));
	    	TSCritCJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getCritChance())));
	    	TSCritDJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getCritStrike())));
	    	TSRerollJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getReroll())));
	    	TSAttackJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getAttack())));
	    	TSEndJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getEndurance())));
	    }

	    @FXML
	    public void calculateStatsKage() {
	    	//OVO IDE KADA SE NINJA IZABERE!!!
	    	baseTaiKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getTaijutsu())));
	    	baseNinKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getNinjutsu())));
	    	baseBukiKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getBukijutsu())));
	    	baseStaKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getStamina())));
	    	baseEleKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getElement())));
	    	baseGenKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getGenjutsu())));

	    	Main.fight.getTeam().get_ninjas().get(5).setLevel(Double.parseDouble(lvlKage.getText()));

	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setT(Double.parseDouble(AddTaiKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setN(Double.parseDouble(AddNinKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setB(Double.parseDouble(AddBukiKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setS(Double.parseDouble(AddStaKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setE(Double.parseDouble(AddEleKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setG(Double.parseDouble(AddGenKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setR(Double.parseDouble(AddRerollKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setCs(Double.parseDouble(AddCritDKageId.getText()));
	    	Main.fight.getTeam().get_ninjas().get(5).getStats().setBr(Double.parseDouble(AddBukiRKageId.getText()));

	    	Main.fight.getTeam().get_ninjas().get(5).dugmeCalculate();

	    	TSTaiKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getTaijutsu())));
	    	TSNinKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getNinjutsu())));
	    	TSBukiKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getBukijutsu())));
	    	TSFatKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getFatigue())));
	    	TSStaKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getStamina())));
	    	TSGenKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getGenjutsu())));
	    	TSGenAKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getGenjutsuActivation())));
	    	TSGenMKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getGenjutsuMastery())));
	    	TSBukiBKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getBukijutsuBoost())));
	    	TSBukiRKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getBukijutsuRecovery())));
	    	TSCritCKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getCritChance())));
	    	TSCritDKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getCritStrike())));
	    	TSRerollKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getReroll())));
	    	TSAttackKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getAttack())));
	    	TSEndKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getEndurance())));
	    }
	    
	    public void listaImenaGen1 () {
	    	//NinjaDBL.pullListaImena();
	    }
	    
}
