package views;


import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.mapdb.elsa.ElsaMaker;
import org.mapdb.elsa.ElsaSerializer;

import Tables.ConnectionDBL;
import Tables.NapadiDBL;
import Tables.NinjaDBL;
import classes.Ability;
import classes.Ninja;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import main.*;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class CompareNinjasController implements Initializable {
	
	// Construct Elsa Serializer
	// Elsa uses Maker Pattern to configure extra features
	ElsaSerializer serializer = new ElsaMaker().make();
	
	@FXML
	private ImageView CNPicGen1, CNPicGen2, CNPicGen3, CNPicJounin1;
	
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
    
    	Main.fight.getTeam().get_ninjas().get(0).setLevel(Double.parseDouble(lvlGen1.getText()));

    	TeamBuilderController.getAddStats(0, CNAddTaiGen1Id, CNAddNinGen1Id, CNAddBukiGen1Id, CNAddStaGen1Id, CNAddEleGen1Id, CNAddGenGen1Id, 
    			CNAddRerollGen1Id, CNAddCritDGen1Id, CNAddBukiRGen1Id);

    	Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();

    	TeamBuilderController.setTotalStats(0, CNTSTaiGen1Id, CNTSNinGen1Id, CNTSBukiGen1Id, CNTSEleGen1Id, CNTSStaGen1Id, CNTSGenGen1Id, CNTSGenAGen1Id, CNTSGenMGen1Id, 
    			CNTSBukiBGen1Id, CNTSBukiRGen1Id, CNTSCritCGen1Id, CNTSCritDGen1Id, CNTSRerollGen1Id, CNTSAttackGen1Id, CNTSEndGen1Id);
    }

	@FXML
    public void calculateStatsGen2() throws SQLException {
    
    	Main.fight.getTeam().get_ninjas().get(1).setLevel(Double.parseDouble(lvlGen2.getText()));

    	TeamBuilderController.getAddStats(1, CNAddTaiGen2Id, CNAddNinGen2Id, CNAddBukiGen2Id, CNAddStaGen2Id, CNAddEleGen2Id, CNAddGenGen2Id, 
    			CNAddRerollGen2Id, CNAddCritDGen2Id, CNAddBukiRGen2Id);

    	Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();

    	TeamBuilderController.setTotalStats(1, CNTSTaiGen2Id, CNTSNinGen2Id, CNTSBukiGen2Id, CNTSEleGen2Id, CNTSStaGen2Id, CNTSGenGen2Id, CNTSGenAGen2Id, CNTSGenMGen2Id, 
    			CNTSBukiBGen2Id, CNTSBukiRGen2Id, CNTSCritCGen2Id, CNTSCritDGen2Id, CNTSRerollGen2Id, CNTSAttackGen2Id, CNTSEndGen2Id);
    }

	@FXML
    public void calculateStatsGen3() throws SQLException {
    
    	Main.fight.getTeam().get_ninjas().get(2).setLevel(Double.parseDouble(lvlGen3.getText()));
    	
    	TeamBuilderController.getAddStats(2, CNAddTaiGen3Id, CNAddNinGen3Id, CNAddBukiGen3Id, CNAddStaGen3Id, CNAddEleGen3Id, CNAddGenGen3Id, 
    			CNAddRerollGen3Id, CNAddCritDGen3Id, CNAddBukiRGen3Id);
    	
    	Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();
    	
    	TeamBuilderController.setTotalStats(2, CNTSTaiGen3Id, CNTSNinGen3Id, CNTSBukiGen3Id, CNTSEleGen3Id, CNTSStaGen3Id, CNTSGenGen3Id, CNTSGenAGen3Id, CNTSGenMGen3Id, 
    			CNTSBukiBGen3Id, CNTSBukiRGen3Id, CNTSCritCGen3Id, CNTSCritDGen3Id, CNTSRerollGen3Id, CNTSAttackGen3Id, CNTSEndGen3Id);
    }
	
	@FXML
    public void calculateStatsJounin1() throws SQLException {
		
    	Main.fight.getTeam().get_ninjas().get(3).setLevel(Double.parseDouble(lvlJounin1.getText()));
    	
    	TeamBuilderController.getAddStats(3, CNAddTaiJounin1Id, CNAddNinJounin1Id, CNAddBukiJounin1Id, CNAddStaJounin1Id, CNAddEleJounin1Id, CNAddGenJounin1Id, 
    			CNAddRerollJounin1Id, CNAddCritDJounin1Id, CNAddBukiRJounin1Id);

    	Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();
    	
    	TeamBuilderController.setTotalStats(3, CNTSTaiJounin1Id, CNTSNinJounin1Id, CNTSBukiJounin1Id, CNTSEleJounin1Id, CNTSStaJounin1Id, CNTSGenJounin1Id, CNTSGenAJounin1Id, CNTSGenMJounin1Id, 
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
	
	 public void setBaseStats(int redniBroj, Label Tai, Label Nin, Label Buki, Label Sta, Label Ele, Label Gen, Label Seal,
			 Label TaiG, Label NinG, Label BukiG, Label StaG, Label EleG, Label GenG) {
		 Tai.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseTai())));
		 Nin.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseNin())));
		 Buki.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseBuki())));
		 Sta.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseStam())));
		 Ele.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseEle())));
		 Gen.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseGen())));
		 
		 TaiG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getTaijutsuGrowth())));
		 NinG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getNinjutsuGrowth())));
		 BukiG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBukijutsuGrowth())));
		 StaG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStaminaGrowth())));
		 EleG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getElementGrowth())));
		 GenG.setText(String.format("%.1f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getGenjutsuGrowth())));
	    	
		 Seal.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(redniBroj).getSeal())));
	    }
	
	public void ListenerName(ComboBox<String> combobox, ComboBox<String> comboboxA1, ComboBox<String> comboboxA2, ComboBox<String> comboboxA3,
								int redniBroj, Label Tai, Label Nin, Label Buki, Label Sta, Label Ele, Label Gen, Label Seal,
								Label TaiG, Label NinG, Label BukiG, Label StaG, Label EleG, Label GenG, ImageView okvirSlike) {
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
    	    			
    	    			Ninja nin = NinjaDBL.pullNinjaV2(String.format("%s",combobox.getValue()));
    	    			
    	    			
    	    			Main.fight.getTeam().get_ninjas().get(redniBroj).setIdNinje(nin.getIdNinje());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setName(nin.getName());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setChakra(nin.getChakra());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setSeal(nin.getSeal());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseTai(nin.getBaseTai());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setTaijutsuGrowth(nin.getTaijutsuGrowth());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseNin(nin.getBaseNin());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setNinjutsuGrowth(nin.getNinjutsuGrowth());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseBuki(nin.getBaseBuki());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBukijutsuGrowth(nin.getBukijutsuGrowth());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseEle(nin.getBaseEle());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setElementGrowth(nin.getElementGrowth());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseGen(nin.getBaseGen());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setGenjutsuGrowth(nin.getGenjutsuGrowth());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseStam(nin.getBaseStam());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setStaminaGrowth(nin.getStaminaGrowth());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setPicPath(nin.getPicPath());
    					Main.fight.getTeam().get_ninjas().get(redniBroj).setTip(nin.getTip());
    	    			
    	    			
						//NinjaDBL.pullNinjaV2(redniBroj, String.format("%s",combobox.getValue()));
						TeamBuilderController.loadSlika(okvirSlike, redniBroj);
						setBaseStats(redniBroj, Tai, Nin, Buki, Sta, Ele, Gen, Seal, TaiG, NinG, BukiG, StaG, EleG, GenG);
						
						TeamBuilderController.setAbilities(comboboxA1, comboboxA2, comboboxA3, redniBroj);
						
        	    		ListenerAbility(comboboxA1, redniBroj, 0);
        	    		ListenerAbility(comboboxA2, redniBroj, 1);
        	    		ListenerAbility(comboboxA3, redniBroj, 2);
					} catch (SQLException | FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
    	    		//System.out.println("Click on "+cell.getItem()); Test ispis selektovanog itema
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
    	    	    	//NapadiDBL.pullNapadiV2(String.format("%s",combobox.getValue()), redniBrojNinje, redniBrojAbility);
    	    	    	
    	    	    	int tempIDNinja = Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getIdNinje();
    	    			
    	    	    	Ability ability = NapadiDBL.pullNapadiV2(String.format("%s",combobox.getValue()), tempIDNinja);
    	    	    	
    	    	    	Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setName(ability.getName());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setTaijutsu(ability.getTaijutsu());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setNinjutsu(ability.getNinjutsu());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setBukijutsu(ability.getBukijutsu());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setElement(ability.getElement());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGen(ability.getGen());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setStamina(ability.getStamina());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setAttack(ability.getAttack());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setBukiRec(ability.getBukiRec());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setBukiBoost(ability.getBukiBoost());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setCritChance(ability.getCritChance());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setCritStrike(ability.getCritStrike());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setReroll(ability.getReroll());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setEndurance(ability.getEndurance());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setFatigue(ability.getFatigue());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setTaiImmunity(ability.getTaiImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setNinImmunity(ability.getNinImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setBukiImmunity(ability.getBukiImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setAttackImmunity(ability.getAttackImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenImmunity(ability.getGenImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setPoisonImmunity(ability.getPoisonImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setPoison(ability.getPoisonImmunity());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGuard(ability.getGuard());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setAbsorb(ability.getAbsorb());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setLvl5Death(ability.getLvl5Death());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenAct(ability.getGenAct());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenMast(ability.getGenMast());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenRec(ability.getGenRec());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenAbs(ability.getGenAbs());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenLearn(ability.getGenLearn());
    					Main.fight.getTeam().get_ninjas().get(redniBrojNinje).getAbilities().get(redniBrojAbility).setGenCopy(ability.getGenCopy());
    	    	    	
    	    	    	ConnectionDBL.Disconnect();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
    	    		//System.out.println("Click on "+cell.getItem()); Test ispis selektovanog itema
            	}
        		});
        	return cell ;
    	});
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ObservableList<String> genins = FXCollections.observableArrayList(NinjaDBL.getListaImena());
		
		CNCBGen1.setItems(genins);
		CNCBGen2.setItems(genins);
		CNCBGen3.setItems(genins);
		CNCBJounin1.setItems(genins);
	
		ListenerName(CNCBGen1, CNCBGen1A1, CNCBGen1A2, CNCBGen1A3, 0, CNbaseTaiGen1Id, CNbaseNinGen1Id, CNbaseBukiGen1Id, CNbaseStaGen1Id, 
				CNbaseEleGen1Id, CNbaseGenGen1Id, lblGen1S, CNgrowthTaiGen1, CNgrowthNinGen1, CNgrowthBukiGen1, CNgrowthStaGen1, CNgrowthEleGen1,
				CNgrowthGenGen1, CNPicGen1);
		ListenerName(CNCBGen2, CNCBGen2A1, CNCBGen2A2, CNCBGen2A3, 1, CNbaseTaiGen2Id, CNbaseNinGen2Id, CNbaseBukiGen2Id, CNbaseStaGen2Id,
				CNbaseEleGen2Id, CNbaseGenGen2Id, lblGen2S, CNgrowthTaiGen2, CNgrowthNinGen2, CNgrowthBukiGen2, CNgrowthStaGen2, CNgrowthEleGen2,
				CNgrowthGenGen2, CNPicGen2);
		ListenerName(CNCBGen3, CNCBGen3A1, CNCBGen3A2, CNCBGen3A3, 2, CNbaseTaiGen3Id, CNbaseNinGen3Id, CNbaseBukiGen3Id, CNbaseStaGen3Id, 
				CNbaseEleGen3Id, CNbaseGenGen3Id, lblGen3S, CNgrowthTaiGen3, CNgrowthNinGen3, CNgrowthBukiGen3, CNgrowthStaGen3, CNgrowthEleGen3,
				CNgrowthGenGen3, CNPicGen3);
		ListenerName(CNCBJounin1, CNCBJounin1A1, CNCBJounin1A2, CNCBJounin1A3, 3, CNbaseTaiJounin1Id, CNbaseNinJounin1Id, CNbaseBukiJounin1Id, 
				CNbaseStaJounin1Id, CNbaseEleJounin1Id, CNbaseGenJounin1Id, lblJounin1S, CNgrowthTaiJounin1, CNgrowthNinJounin1, CNgrowthBukiJounin1, 
				CNgrowthStaJounin1, CNgrowthEleJounin1, CNgrowthGenJounin1, CNPicJounin1);
		
	}
    
}
