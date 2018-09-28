package views;


import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import Tables.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import main.*;

public class TeamBuilderController implements Initializable {
	
	
		@FXML
		private ComboBox<String> TBCBGen1, TBCBGen2, TBCBGen3, TBCBJounin1, TBCBJounin2, TBCBKage,
									TBCBGen1A1, TBCBGen1A2, TBCBGen1A3, TBCBGen2A1, TBCBGen2A2, TBCBGen2A3,
									TBCBGen3A1, TBCBGen3A2, TBCBGen3A3, TBCBJounin1A1, TBCBJounin1A2, TBCBJounin1A3,
									TBCBJounin2A1, TBCBJounin2A2, TBCBJounin2A3, TBCBKageA1, TBCBKageA2, TBCBKageA3;
		
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
	    	TSBukiBKageId, TSBukiRKageId, TSCritCKageId, TSCritDKageId, TSRerollKageId, TSAttackKageId, TSEndKageId,
	    	lblGen1S, lblGen2S, lblGen3S, lblJounin1S, lblJounin2S, lblKageS;

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
	    public void calculateStatsGen1() throws SQLException {
	    	//onSelectedItem(ImeNinje) {
	    	ConnectionDBL.Connect();
	    	NinjaDBL.pullNinjaV2(0, String.format("%s",TBCBGen1.getValue())); // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
	    	ConnectionDBL.Disconnect();
	    	
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.insertAbilityNamesIntoArray(0);
	    	ObservableList<String> geninsAbilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
	    	TBCBGen1A1.setItems(geninsAbilities);
	    	TBCBGen1A2.setItems(geninsAbilities);
	    	TBCBGen1A3.setItems(geninsAbilities);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen1A1.getValue()), 0, 0);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen1A2.getValue()), 0, 1);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen1A3.getValue()), 0, 2);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	baseTaiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getTaijutsu())));
	    	baseNinGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getNinjutsu())));
	    	baseBukiGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getBukijutsu())));
	    	baseStaGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getStamina())));
	    	baseEleGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getElement())));
	    	baseGenGen1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getGenjutsu())));
	    	
	    	lblGen1S.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(0).getSeal())));
	    
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
	    public void calculateStatsGen2() throws SQLException {
	    	//onSelectedItem(ImeNinje) {
	    	ConnectionDBL.Connect();
	    	NinjaDBL.pullNinjaV2(1, String.format("%s",TBCBGen2.getValue())); // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
	    	ConnectionDBL.Disconnect();
	    	
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.insertAbilityNamesIntoArray(1);
	    	ObservableList<String> geninsAbilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
	    	TBCBGen2A1.setItems(geninsAbilities);
	    	TBCBGen2A2.setItems(geninsAbilities);
	    	TBCBGen2A3.setItems(geninsAbilities);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen2A1.getValue()), 1, 0);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen2A2.getValue()), 1, 1);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen2A3.getValue()), 1, 2);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	baseTaiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getTaijutsu())));
	    	baseNinGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getNinjutsu())));
	    	baseBukiGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getBukijutsu())));
	    	baseStaGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getStamina())));
	    	baseEleGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getElement())));
	    	baseGenGen2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getGenjutsu())));
	    	
	    	lblGen2S.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(1).getSeal())));
	    
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
	    public void calculateStatsGen3() throws SQLException {
	    	//onSelectedItem(ImeNinje) {
	    	ConnectionDBL.Connect();
	    	NinjaDBL.pullNinjaV2(2, String.format("%s",TBCBGen3.getValue())); // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
	    	ConnectionDBL.Disconnect();
	    	
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.insertAbilityNamesIntoArray(2);
	    	ObservableList<String> geninsAbilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
	    	TBCBGen3A1.setItems(geninsAbilities);
	    	TBCBGen3A2.setItems(geninsAbilities);
	    	TBCBGen3A3.setItems(geninsAbilities);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen3A1.getValue()), 2, 0);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen3A2.getValue()), 2, 1);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBGen3A3.getValue()), 2, 2);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	baseTaiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getTaijutsu())));
	    	baseNinGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getNinjutsu())));
	    	baseBukiGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getBukijutsu())));
	    	baseStaGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getStamina())));
	    	baseEleGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getElement())));
	    	baseGenGen3Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getGenjutsu())));
	    	
	    	lblGen3S.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(2).getSeal())));

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
	    public void calculateStatsJounin1() throws SQLException {
	    	//onSelectedItem(ImeNinje) {
	    	ConnectionDBL.Connect();
	    	NinjaDBL.pullNinjaV2(3, String.format("%s",TBCBJounin1.getValue())); // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
	    	ConnectionDBL.Disconnect();
	    	
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.insertAbilityNamesIntoArray(3);
	    	ObservableList<String> geninsAbilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
	    	TBCBJounin1A1.setItems(geninsAbilities);
	    	TBCBJounin1A2.setItems(geninsAbilities);
	    	TBCBJounin1A3.setItems(geninsAbilities);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBJounin1A1.getValue()), 3, 0);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBJounin1A2.getValue()), 3, 1);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBJounin1A3.getValue()), 3, 2);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	baseTaiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getTaijutsu())));
	    	baseNinJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getNinjutsu())));
	    	baseBukiJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getBukijutsu())));
	    	baseStaJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getStamina())));
	    	baseEleJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getElement())));
	    	baseGenJounin1Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getGenjutsu())));
	    	
	    	lblJounin1S.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(3).getSeal())));

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
	    public void calculateStatsJounin2() throws SQLException {
	    	//onSelectedItem(ImeNinje) {
	    	ConnectionDBL.Connect();
	    	NinjaDBL.pullNinjaV2(4, String.format("%s",TBCBJounin2.getValue())); // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
	    	ConnectionDBL.Disconnect();
	    	
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.insertAbilityNamesIntoArray(4);
	    	ObservableList<String> geninsAbilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
	    	TBCBJounin2A1.setItems(geninsAbilities);
	    	TBCBJounin2A2.setItems(geninsAbilities);
	    	TBCBJounin2A3.setItems(geninsAbilities);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBJounin1A1.getValue()), 4, 0);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBJounin1A2.getValue()), 4, 1);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBJounin1A3.getValue()), 4, 2);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	baseTaiJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getTaijutsu())));
	    	baseNinJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getNinjutsu())));
	    	baseBukiJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getBukijutsu())));
	    	baseStaJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getStamina())));
	    	baseEleJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getElement())));
	    	baseGenJounin2Id.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getGenjutsu())));
	    	
	    	lblJounin2S.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(4).getSeal())));

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
	    public void calculateStatsKage() throws SQLException {
	    	//onSelectedItem(ImeNinje) {
	    	ConnectionDBL.Connect();
	    	NinjaDBL.pullNinjaV2(5, String.format("%s",TBCBKage.getValue())); // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
	    	ConnectionDBL.Disconnect();
	    	
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.insertAbilityNamesIntoArray(5);
	    	ObservableList<String> geninsAbilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
	    	TBCBKageA1.setItems(geninsAbilities);
	    	TBCBKageA2.setItems(geninsAbilities);
	    	TBCBKageA3.setItems(geninsAbilities);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBKageA1.getValue()), 5, 0);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBKageA2.getValue()), 5, 1);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	//onSelectedItem(ImeNapada) {
	    	ConnectionDBL.ConnectNapadi();
	    	NapadiDBL.pullNapadiV2(String.format("%s",TBCBKageA3.getValue()), 5, 2);
	    	ConnectionDBL.Disconnect();
	    	// }
	    	baseTaiKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getTaijutsu())));
	    	baseNinKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getNinjutsu())));
	    	baseBukiKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getBukijutsu())));
	    	baseStaKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getStamina())));
	    	baseEleKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getElement())));
	    	baseGenKageId.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getGenjutsu())));
	    	
	    	lblKageS.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(5).getSeal())));

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

		@FXML
		public void PlusGen1() {
			Main.fight.getTeam().get_ninjas().get(0).setSealPlus(Main.fight.getTeam().get_ninjas().get(0).getSeal());
			lblGen1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getSeal())));
		}

		@FXML
		public void PlusGen2() {
			Main.fight.getTeam().get_ninjas().get(1).setSealPlus(Main.fight.getTeam().get_ninjas().get(1).getSeal());
			lblGen2S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getSeal())));
		}

		@FXML
		public void PlusGen3() {
			Main.fight.getTeam().get_ninjas().get(2).setSealPlus(Main.fight.getTeam().get_ninjas().get(2).getSeal());
			lblGen3S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getSeal())));
		}

		@FXML
		public void PlusJounin1() {
			Main.fight.getTeam().get_ninjas().get(3).setSealPlus(Main.fight.getTeam().get_ninjas().get(3).getSeal());
			lblJounin1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getSeal())));
		}

		@FXML
		public void PlusJounin2() {
			Main.fight.getTeam().get_ninjas().get(4).setSealPlus(Main.fight.getTeam().get_ninjas().get(4).getSeal());
			lblJounin2S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getSeal())));
		}

		@FXML
		public void PlusKage() {
			Main.fight.getTeam().get_ninjas().get(5).setSealPlus(Main.fight.getTeam().get_ninjas().get(5).getSeal());
			lblKageS.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getSeal())));
		}

		@FXML
		public void MinusGen1() {
			Main.fight.getTeam().get_ninjas().get(0).setSealMinus(Main.fight.getTeam().get_ninjas().get(0).getSeal());
			lblGen1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getSeal())));
		}

		@FXML
		public void MinusGen2() {
			Main.fight.getTeam().get_ninjas().get(1).setSealMinus(Main.fight.getTeam().get_ninjas().get(1).getSeal());
			lblGen2S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getSeal())));
		}

		@FXML
		public void MinusGen3() {
			Main.fight.getTeam().get_ninjas().get(2).setSealMinus(Main.fight.getTeam().get_ninjas().get(2).getSeal());
			lblGen3S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getSeal())));
		}

		@FXML
		public void MinusJounin1() {
			Main.fight.getTeam().get_ninjas().get(3).setSealMinus(Main.fight.getTeam().get_ninjas().get(3).getSeal());
			lblJounin1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getSeal())));
		}

		@FXML
		public void MinusJounin2() {
			Main.fight.getTeam().get_ninjas().get(4).setSealMinus(Main.fight.getTeam().get_ninjas().get(4).getSeal());
			lblJounin2S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(4).getSeal())));
		}

		@FXML
		public void MinusKage() {
			Main.fight.getTeam().get_ninjas().get(5).setSealMinus(Main.fight.getTeam().get_ninjas().get(5).getSeal());
			lblKageS.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(5).getSeal())));
		}
		
		@Override
		public void initialize(URL location, ResourceBundle resources) {
			ObservableList<String> genins = FXCollections.observableArrayList(NinjaDBL.getListaImena());
			ObservableList<String> jounins = FXCollections.observableArrayList(NinjaDBL.getListaImena()); //Ovde napraviti ono sa procedurama
			ObservableList<String> kages = FXCollections.observableArrayList(NinjaDBL.getListaImena());
			TBCBGen1.setItems(genins);
			TBCBGen2.setItems(genins);
			TBCBGen3.setItems(genins);
			TBCBJounin1.setItems(jounins);
			TBCBJounin2.setItems(jounins);
			TBCBKage.setItems(kages);
		}
		
		/*	OVO TREBA NA DUGMETU SAVE!
		 *  ConnectionDBL.Disconnect();
		 */
		
}
