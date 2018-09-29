package views;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
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
import main.*;

public class CompareNinjasController implements Initializable {
	
	// Construct Elsa Serializer
	// Elsa uses Maker Pattern to configure extra features
	ElsaSerializer serializer = new ElsaMaker().make();
	
	@FXML
	private ComboBox<String> CNCBGen1, CNCBGen2, CNCBGen3, CNCBJounin1,
								CNCBGen1A1, CNCBGen1A2, CNCBGen1A3, CNCBGen2A1, CNCBGen2A2, CNCBGen2A3,
								CNCBGen3A1, CNCBGen3A2, CNCBGen3A3, CNCBJounin1A1, CNCBJounin1A2, CNCBJounin1A3;
	
	@FXML
	private Label CNbaseTaiGen1Id, CNbaseNinGen1Id, CNbaseBukiGen1Id, CNbaseStaGen1Id, CNbaseEleGen1Id, CNbaseGenGen1Id,
		CNgrowthTaiGen1, CNgrowthNinGen1, CNgrowthBukiGen1, CNgrowthStaGen1, CNgrowthEleGen1, CNgrowthGenGen1,
		CNgrowthTaiGen2, CNgrowthNinGen2, CNgrowthBukiGen2, CNgrowthStaGen2, CNgrowthEleGen2, CNgrowthGenGen2,
		CNgrowthTaiGen3, CNgrowthNinGen3, CNgrowthBukiGen3, CNgrowthStaGen3, CNgrowthEleGen3, CNgrowthGenGen3,
		CNgrowthTaiJounin1, CNgrowthNinJounin1, CNgrowthBukiJounin1, CNgrowthStaJounin1, CNgrowthEleJounin1, CNgrowthGenJounin1,
		CNTSTaiGen1Id, CNTSNinGen1Id, CNTSBukiGen1Id, CNTSEleGen1Id, CNTSStaGen1Id, CNTSGenGen1Id, CNTSGenAGen1Id, CNTSGenMGen1Id, 
		CNTSBukiBGen1Id, CNTSBukiRGen1Id, CNTSCritCGen1Id, CNTSCritDGen1Id, CNTSRerollGen1Id, CNTSAttackGen1Id, CNTSEndGen1Id,
		CNbaseTaiGen2Id, CNbaseNinGen2Id, CNbaseBukiGen2Id, CNbaseStaGen2Id, CNbaseEleGen2Id, CNbaseGenGen2Id, 
		CNTSTaiGen2Id, CNTSNinGen2Id, CNTSBukiGen2Id, CNTSEleGen2Id, CNTSStaGen2Id, CNTSGenGen2Id, CNTSGenAGen2Id, CNTSGenMGen2Id, 
		CNTSBukiBGen2Id, CNTSBukiRGen2Id, CNTSCritCGen2Id, CNTSCritDGen2Id, CNTSRerollGen2Id, CNTSAttackGen2Id, CNTSEndGen2Id,
		CNbaseTaiGen3Id, CNbaseNinGen3Id, CNbaseBukiGen3Id, CNbaseStaGen3Id, CNbaseEleGen3Id, CNbaseGenGen3Id, 
		CNTSTaiGen3Id, CNTSNinGen3Id, CNTSBukiGen3Id, CNTSEleGen3Id, CNTSStaGen3Id, CNTSGenGen3Id, CNTSGenAGen3Id, CNTSGenMGen3Id, 
		CNTSBukiBGen3Id, CNTSBukiRGen3Id, CNTSCritCGen3Id, CNTSCritDGen3Id, CNTSRerollGen3Id, CNTSAttackGen3Id, CNTSEndGen3Id,
		CNbaseTaiJounin1Id, CNbaseNinJounin1Id, CNbaseBukiJounin1Id, CNbaseStaJounin1Id, CNbaseEleJounin1Id, CNbaseGenJounin1Id, 
		CNTSTaiJounin1Id, CNTSNinJounin1Id, CNTSBukiJounin1Id, CNTSEleJounin1Id, CNTSStaJounin1Id, CNTSGenJounin1Id, CNTSGenAJounin1Id, CNTSGenMJounin1Id, 
		CNTSBukiBJounin1Id, CNTSBukiRJounin1Id, CNTSCritCJounin1Id, CNTSCritDJounin1Id, CNTSRerollJounin1Id, CNTSAttackJounin1Id, CNTSEndJounin1Id,
		lblGen1S, lblGen2S, lblGen3S, lblJounin1S;

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
    public void calculateStatsGen1() throws SQLException {

		Main.fight.getTeam().get_ninjas().get(0).ClearNinjaStats();
    	ConnectionDBL.Connect();
    	NinjaDBL.pullNinjaV2(0, String.format("%s",CNCBGen1.getValue()));
    	ConnectionDBL.Disconnect();
    
    	Main.fight.getTeam().get_ninjas().get(0).setLevel(Double.parseDouble(lvlGen1.getText()));

    	getAddStats(0, CNAddTaiGen1Id, CNAddNinGen1Id, CNAddBukiGen1Id, CNAddStaGen1Id, CNAddEleGen1Id, CNAddGenGen1Id, 
    			CNAddRerollGen1Id, CNAddCritDGen1Id, CNAddBukiRGen1Id);

    	Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();

    	setTotalStats(0, CNTSTaiGen1Id, CNTSNinGen1Id, CNTSBukiGen1Id, CNTSEleGen1Id, CNTSStaGen1Id, CNTSGenGen1Id, CNTSGenAGen1Id, CNTSGenMGen1Id, 
    			CNTSBukiBGen1Id, CNTSBukiRGen1Id, CNTSCritCGen1Id, CNTSCritDGen1Id, CNTSRerollGen1Id, CNTSAttackGen1Id, CNTSEndGen1Id);
    }

	@FXML
    public void calculateStatsGen2() throws SQLException {
		
		Main.fight.getTeam().get_ninjas().get(1).ClearNinjaStats();
    	ConnectionDBL.Connect();
    	NinjaDBL.pullNinjaV2(1, String.format("%s",CNCBGen2.getValue()));
    	ConnectionDBL.Disconnect();
    
    	Main.fight.getTeam().get_ninjas().get(1).setLevel(Double.parseDouble(lvlGen2.getText()));

    	getAddStats(1, CNAddTaiGen2Id, CNAddNinGen2Id, CNAddBukiGen2Id, CNAddStaGen2Id, CNAddEleGen2Id, CNAddGenGen2Id, 
    			CNAddRerollGen2Id, CNAddCritDGen2Id, CNAddBukiRGen2Id);

    	Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();

    	setTotalStats(1, CNTSTaiGen2Id, CNTSNinGen2Id, CNTSBukiGen2Id, CNTSEleGen2Id, CNTSStaGen2Id, CNTSGenGen2Id, CNTSGenAGen2Id, CNTSGenMGen2Id, 
    			CNTSBukiBGen2Id, CNTSBukiRGen2Id, CNTSCritCGen2Id, CNTSCritDGen2Id, CNTSRerollGen2Id, CNTSAttackGen2Id, CNTSEndGen2Id);
    }

	@FXML
    public void calculateStatsGen3() throws SQLException {
    	
		Main.fight.getTeam().get_ninjas().get(2).ClearNinjaStats();
    	ConnectionDBL.Connect();
    	NinjaDBL.pullNinjaV2(2, String.format("%s",CNCBGen3.getValue()));
    	ConnectionDBL.Disconnect();
    
    	Main.fight.getTeam().get_ninjas().get(2).setLevel(Double.parseDouble(lvlGen3.getText()));
    	
    	getAddStats(2, CNAddTaiGen3Id, CNAddNinGen3Id, CNAddBukiGen3Id, CNAddStaGen3Id, CNAddEleGen3Id, CNAddGenGen3Id, 
    			CNAddRerollGen3Id, CNAddCritDGen3Id, CNAddBukiRGen3Id);
    	
    	Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();
    	
    	setTotalStats(2, CNTSTaiGen3Id, CNTSNinGen3Id, CNTSBukiGen3Id, CNTSEleGen3Id, CNTSStaGen3Id, CNTSGenGen3Id, CNTSGenAGen3Id, CNTSGenMGen3Id, 
    			CNTSBukiBGen3Id, CNTSBukiRGen3Id, CNTSCritCGen3Id, CNTSCritDGen3Id, CNTSRerollGen3Id, CNTSAttackGen3Id, CNTSEndGen3Id);
    }
	
	@FXML
    public void calculateStatsJounin1() throws SQLException {
		
		Main.fight.getTeam().get_ninjas().get(3).ClearNinjaStats();
		ConnectionDBL.Connect();
   		NinjaDBL.pullNinjaV2(3, String.format("%s",CNCBJounin1.getValue()));
   		ConnectionDBL.Disconnect();
    
    	Main.fight.getTeam().get_ninjas().get(3).setLevel(Double.parseDouble(lvlJounin1.getText()));
    	
    	getAddStats(3, CNAddTaiJounin1Id, CNAddNinJounin1Id, CNAddBukiJounin1Id, CNAddStaJounin1Id, CNAddEleJounin1Id, CNAddGenJounin1Id, 
    			CNAddRerollJounin1Id, CNAddCritDJounin1Id, CNAddBukiRJounin1Id);

    	Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();
    	
    	setTotalStats(3, CNTSTaiJounin1Id, CNTSNinJounin1Id, CNTSBukiJounin1Id, CNTSEleJounin1Id, CNTSStaJounin1Id, CNTSGenJounin1Id, CNTSGenAJounin1Id, CNTSGenMJounin1Id, 
    			CNTSBukiBJounin1Id, CNTSBukiRJounin1Id, CNTSCritCJounin1Id, CNTSCritDJounin1Id, CNTSRerollJounin1Id, CNTSAttackJounin1Id, CNTSEndJounin1Id);		
    }
	
	@FXML
	public void Gen1P() {
		Main.fight.getTeam().get_ninjas().get(0).setSealPlus(Main.fight.getTeam().get_ninjas().get(0).getSeal());
		lblGen1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getSeal())));
	}

	@FXML
	public void Gen2P() {
		Main.fight.getTeam().get_ninjas().get(1).setSealPlus(Main.fight.getTeam().get_ninjas().get(1).getSeal());
		lblGen2S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getSeal())));
	}

	@FXML
	public void Gen3P() {
		Main.fight.getTeam().get_ninjas().get(2).setSealPlus(Main.fight.getTeam().get_ninjas().get(2).getSeal());
		lblGen3S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getSeal())));
	}

	@FXML
	public void Jounin1P() {
		Main.fight.getTeam().get_ninjas().get(3).setSealPlus(Main.fight.getTeam().get_ninjas().get(3).getSeal());
		lblJounin1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getSeal())));
	}

	@FXML
	public void Gen1M() {
		Main.fight.getTeam().get_ninjas().get(0).setSealMinus(Main.fight.getTeam().get_ninjas().get(0).getSeal());
		lblGen1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(0).getSeal())));
	}

	@FXML
	public void Gen2M() {
		Main.fight.getTeam().get_ninjas().get(1).setSealMinus(Main.fight.getTeam().get_ninjas().get(1).getSeal());
		lblGen2S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(1).getSeal())));
	}

	@FXML
	public void Gen3M() {
		Main.fight.getTeam().get_ninjas().get(2).setSealMinus(Main.fight.getTeam().get_ninjas().get(2).getSeal());
		lblGen3S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(2).getSeal())));
	}

	@FXML
	public void Jounin1M() {
		Main.fight.getTeam().get_ninjas().get(3).setSealMinus(Main.fight.getTeam().get_ninjas().get(3).getSeal());
		lblJounin1S.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(3).getSeal())));
	}
	
	@FXML
	public void Save() throws IOException {
		
		Team data = Main.fight.getTeam();

		// serijalizacija

		// Elsa Serializer takes DataOutput and DataInput.
		// Use streams to create it.
		
		FileOutputStream fos = new FileOutputStream("Team.ser");
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DataOutputStream out2 = new DataOutputStream(fos);

		// write data into OutputStream
		serializer.serialize(out2, data);
		
	}
	
	@FXML
	public void Load() throws IOException {
		// deserijalizacija
		
		InputStream is = new FileInputStream("Team.ser");
		byte[] bytes = IOUtils.toByteArray(is);

		// Construct DataInput
		DataInputStream in = new DataInputStream(
		        new ByteArrayInputStream(bytes));

		// now deserialize data using DataInput
		Team data2 = (Team)serializer.deserialize(in);
		
		Main.fight.setTeam(data2);
	}
	
	 public void setBaseStats(int redniBroj, Label Tai, Label Nin, Label Buki, Label Sta, Label Ele, Label Gen, Label Seal,
			 Label TaiG, Label NinG, Label BukiG, Label StaG, Label EleG, Label GenG) {
		 Tai.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getTaijutsu())));
		 Nin.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getNinjutsu())));
		 Buki.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBukijutsu())));
		 Sta.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStamina())));
		 Ele.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getElement())));
		 Gen.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getGenjutsu())));
		 
		 TaiG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getTaijutsuGrowth())));
		 NinG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getNinjutsuGrowth())));
		 BukiG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBukijutsuGrowth())));
		 StaG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStaminaGrowth())));
		 EleG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getElementGrowth())));
		 GenG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getGenjutsuGrowth())));
	    	
		 Seal.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(redniBroj).getSeal())));
	    }
	 
	 public void getAddStats(int redniBroj, TextField Tai, TextField Nin, TextField Buki, TextField Sta, TextField Ele, 
			 	TextField Gen, TextField Reroll, TextField Crit, TextField BukiR) {
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setT(Double.parseDouble(Tai.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setN(Double.parseDouble(Nin.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setB(Double.parseDouble(Buki.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setS(Double.parseDouble(Sta.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setE(Double.parseDouble(Ele.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setG(Double.parseDouble(Gen.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setR(Double.parseDouble(Reroll.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setCs(Double.parseDouble(Crit.getText()));
		 Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().setBr(Double.parseDouble(BukiR.getText()));
		 
	 }
	 
	 public void setTotalStats(int redniBroj, Label Tai, Label Nin, Label Buki, Label Fat, Label Sta, Label Gen, Label GenA, 
			 Label GenM, Label BukiB, Label BukiR, Label CritC, Label CritD, Label Reroll,Label Attack, Label End) {
		Tai.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getTaijutsu())));
		Nin.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getNinjutsu())));
	   	Buki.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBukijutsu())));
	   	Fat.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getFatigue())));
	   	Sta.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStamina())));
	   	Gen.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getGenjutsu())));
	   	GenA.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getGenjutsuActivation())));
	   	GenM.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getGenjutsuMastery())));
	   	BukiB.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBukijutsuBoost())));
	   	BukiR.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBukijutsuRecovery())));
	   	CritC.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getCritChance())));
	   	CritD.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getCritStrike())));
	   	Reroll.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getReroll())));
	   	Attack.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getAttack())));
	   	End.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getEndurance())));
	 }
	
	public void ListenerName(ComboBox<String> combobox, ComboBox<String> comboboxA1, ComboBox<String> comboboxA2, ComboBox<String> comboboxA3,
								int redniBroj, Label Tai, Label Nin, Label Buki, Label Sta, Label Ele, Label Gen, Label Seal,
								Label TaiG, Label NinG, Label BukiG, Label StaG, Label EleG, Label GenG) {
    	combobox.setCellFactory(lv -> {
        	ListCell<String> cell = new ListCell<String>() {
            	@Override
            	protected void updateItem(String item, boolean empty) {
                	super.updateItem(item, empty);
                	setText(empty ? null : item);
            	}
        	};
        	cell.setOnMousePressed(e -> {
            	if (! cell.isEmpty()) {
            		ConnectionDBL.Connect();
    	    		try {
						NinjaDBL.pullNinjaV2(redniBroj, String.format("%s",combobox.getValue()));
						setBaseStats(redniBroj, Tai, Nin, Buki, Sta, Ele, Gen, Seal, TaiG, NinG, BukiG, StaG, EleG, GenG);
						ConnectionDBL.ConnectNapadi();
        	    		NapadiDBL.insertAbilityNamesIntoArray(redniBroj);
        	    		ObservableList<String> Abilities = FXCollections.observableArrayList(NapadiDBL.getListaImenaNapada());
        	    		comboboxA1.setItems(Abilities);
        	    		comboboxA2.setItems(Abilities);
        	    		comboboxA3.setItems(Abilities);
        	    		NapadiDBL.getListaImenaNapada().clear();
        	    		ConnectionDBL.Disconnect();
        	    		ListenerAbility(comboboxA1, redniBroj, 0);
        	    		ListenerAbility(comboboxA2, redniBroj, 1);
        	    		ListenerAbility(comboboxA3, redniBroj, 2);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} // Ovo buni seal, moram da namestim ovo na onSelectedItem() da radi!
    	    		System.out.println("Click on "+cell.getItem());
            	}
        		});
        	return cell ;
    	});
	}
    
    public void ListenerAbility(ComboBox<String> combobox, int redniBrojNinje, int redniBrojAbility) {
		combobox.setCellFactory(lv -> {
        	ListCell<String> cell = new ListCell<String>() {
            	@Override
            	protected void updateItem(String item, boolean empty) {
                	super.updateItem(item, empty);
                	setText(empty ? null : item);
            	}
        	};
        	cell.setOnMousePressed(e -> {
            	if (! cell.isEmpty()) {
            		ConnectionDBL.ConnectNapadi();
    	    		try {
    	    	    	NapadiDBL.pullNapadiV2(String.format("%s",combobox.getValue()), redniBrojNinje, redniBrojAbility);
    	    	    	
    	    	    	ConnectionDBL.Disconnect();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
    	    		
    	    		System.out.println("Click on "+cell.getItem());
            	}
        		});
        	return cell ;
    	});
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> genins = FXCollections.observableArrayList(NinjaDBL.getListaImena());
		ObservableList<String> jounins = FXCollections.observableArrayList(NinjaDBL.getListaImena()); //Ovde napraviti ono sa procedurama
		ObservableList<String> kages = FXCollections.observableArrayList(NinjaDBL.getListaImena());
		CNCBGen1.setItems(genins);
		CNCBGen2.setItems(genins);
		CNCBGen3.setItems(genins);
		CNCBJounin1.setItems(jounins);
	
		ListenerName(CNCBGen1, CNCBGen1A1, CNCBGen1A2, CNCBGen1A3, 0, CNbaseTaiGen1Id, CNbaseNinGen1Id, CNbaseBukiGen1Id, CNbaseStaGen1Id, 
				CNbaseEleGen1Id, CNbaseGenGen1Id, lblGen1S, CNgrowthTaiGen1, CNgrowthNinGen1, CNgrowthBukiGen1, CNgrowthStaGen1, CNgrowthEleGen1,
				CNgrowthGenGen1);
		ListenerName(CNCBGen2, CNCBGen2A1, CNCBGen2A2, CNCBGen2A3, 1, CNbaseTaiGen2Id, CNbaseNinGen2Id, CNbaseBukiGen2Id, CNbaseStaGen2Id,
				CNbaseEleGen2Id, CNbaseGenGen2Id, lblGen2S, CNgrowthTaiGen2, CNgrowthNinGen2, CNgrowthBukiGen2, CNgrowthStaGen2, CNgrowthEleGen2,
				CNgrowthGenGen2);
		ListenerName(CNCBGen3, CNCBGen3A1, CNCBGen3A2, CNCBGen3A3, 2, CNbaseTaiGen3Id, CNbaseNinGen3Id, CNbaseBukiGen3Id, CNbaseStaGen3Id, 
				CNbaseEleGen3Id, CNbaseGenGen3Id, lblGen3S, CNgrowthTaiGen3, CNgrowthNinGen3, CNgrowthBukiGen3, CNgrowthStaGen3, CNgrowthEleGen3,
				CNgrowthGenGen3);
		ListenerName(CNCBJounin1, CNCBJounin1A1, CNCBJounin1A2, CNCBJounin1A3, 4, CNbaseTaiJounin1Id, CNbaseNinJounin1Id, CNbaseBukiJounin1Id, 
				CNbaseStaJounin1Id, CNbaseEleJounin1Id, CNbaseGenJounin1Id, lblJounin1S, CNgrowthTaiJounin1, CNgrowthNinJounin1, CNgrowthBukiJounin1, 
				CNgrowthStaJounin1, CNgrowthEleJounin1, CNgrowthGenJounin1);
		
	}
    
}
