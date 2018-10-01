package views;

import org.apache.commons.io.IOUtils;
import org.mapdb.elsa.ElsaMaker;
import org.mapdb.elsa.ElsaSerializer;

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

import Tables.*;
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

public class TeamBuilderController implements Initializable {
		/*
		 * Elsa serijalizacija iz preuzetog repozitorijuma
		 */
		// Construct Elsa Serializer
		// Elsa uses Maker Pattern to configure extra features
		ElsaSerializer serializer = new ElsaMaker().make();
		
		/*
		 * ImageView svih polja iz fxml fajlova
		 */
		@FXML
		private ImageView picGen1, picGen2, picGen3, picJounin1, picJounin2, picKage;
		
		/*
		 * ComboBox svih polja iz fxml fajlova
		 */
		@FXML
		private ComboBox<String> TBCBGen1, TBCBGen2, TBCBGen3, TBCBJounin1, TBCBJounin2, TBCBKage,
									TBCBGen1A1, TBCBGen1A2, TBCBGen1A3, TBCBGen2A1, TBCBGen2A2, TBCBGen2A3,
									TBCBGen3A1, TBCBGen3A2, TBCBGen3A3, TBCBJounin1A1, TBCBJounin1A2, TBCBJounin1A3,
									TBCBJounin2A1, TBCBJounin2A2, TBCBJounin2A3, TBCBKageA1, TBCBKageA2, TBCBKageA3;
		
		/*
		 * Label svih polja iz fxml fajlova
		 */
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
	    /*
	     * TextField svih polja iz fxml fajlova
	     */
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
	    
	    /*
	     * metoda za izracunavanje stats vrednosti izabranog ninje 
	     */
	    @FXML
	    public void calculateStatsGen1() throws SQLException {
	
	       	Main.fight.getTeam().get_ninjas().get(0).setLevel(Double.parseDouble(lvlGen1.getText()));
	    	
	    	getAddStats(0, AddTaiGen1Id, AddNinGen1Id, AddBukiGen1Id, AddStaGen1Id, AddEleGen1Id, AddGenGen1Id, 
	    	    	AddRerollGen1Id, AddCritDGen1Id, AddBukiRGen1Id);

	    	Main.fight.getTeam().get_ninjas().get(0).dugmeCalculate();

	    	setTotalStats(0, TSTaiGen1Id, TSNinGen1Id, TSBukiGen1Id, TSFatGen1Id, TSStaGen1Id, TSGenGen1Id, TSGenAGen1Id, TSGenMGen1Id, 
	    	    	TSBukiBGen1Id, TSBukiRGen1Id, TSCritCGen1Id, TSCritDGen1Id, TSRerollGen1Id, TSAttackGen1Id, TSEndGen1Id);
	    }
	    
	    /*
	     * metoda za izracunavanje stats vrednosti izabranog ninje 
	     */
	    @FXML
	    public void calculateStatsGen2() throws SQLException {
	    
	    	Main.fight.getTeam().get_ninjas().get(1).setLevel(Double.parseDouble(lvlGen2.getText()));

	    	getAddStats(1, AddTaiGen2Id, AddNinGen2Id, AddBukiGen2Id, AddStaGen2Id, AddEleGen2Id, AddGenGen2Id, 
	    			AddRerollGen2Id, AddCritDGen2Id, AddBukiRGen2Id);

	    	Main.fight.getTeam().get_ninjas().get(1).dugmeCalculate();

	    	setTotalStats(1, TSTaiGen2Id, TSNinGen2Id, TSBukiGen2Id, TSFatGen2Id, TSStaGen2Id, TSGenGen2Id, TSGenAGen2Id, TSGenMGen2Id, 
	    	    	TSBukiBGen2Id, TSBukiRGen2Id, TSCritCGen2Id, TSCritDGen2Id, TSRerollGen2Id, TSAttackGen2Id, TSEndGen2Id);
	    }
	    
	    /*
	     * metoda za izracunavanje stats vrednosti izabranog ninje 
	     */
	    @FXML
	    public void calculateStatsGen3() throws SQLException {

	    	Main.fight.getTeam().get_ninjas().get(2).setLevel(Double.parseDouble(lvlGen3.getText()));

	    	getAddStats(2, AddTaiGen3Id, AddNinGen3Id, AddBukiGen3Id, AddStaGen3Id, AddEleGen3Id, AddGenGen3Id, 
	    			AddRerollGen3Id, AddCritDGen3Id, AddBukiRGen3Id);

	    	Main.fight.getTeam().get_ninjas().get(2).dugmeCalculate();
	    	
	    	setTotalStats(2, TSTaiGen3Id, TSNinGen3Id, TSBukiGen3Id, TSFatGen3Id, TSStaGen3Id, TSGenGen3Id, TSGenAGen3Id, TSGenMGen3Id, 
	    	    	TSBukiBGen3Id, TSBukiRGen3Id, TSCritCGen3Id, TSCritDGen3Id, TSRerollGen3Id, TSAttackGen3Id, TSEndGen3Id);
	    }
	    
	    /*
	     * metoda za izracunavanje stats vrednosti izabranog ninje 
	     */
	    @FXML
	    public void calculateStatsJounin1() throws SQLException {

	    	Main.fight.getTeam().get_ninjas().get(3).setLevel(Double.parseDouble(lvlJounin1.getText()));

	    	getAddStats(3, AddTaiJounin1Id, AddNinJounin1Id, AddBukiJounin1Id, AddStaJounin1Id, AddEleJounin1Id, AddGenJounin1Id, 
	    			AddRerollJounin1Id, AddCritDJounin1Id, AddBukiRJounin1Id);
	    	
	    	Main.fight.getTeam().get_ninjas().get(3).dugmeCalculate();

	    	setTotalStats(3, TSTaiJounin1Id, TSNinJounin1Id, TSBukiJounin1Id, TSFatJounin1Id, TSStaJounin1Id, TSGenJounin1Id, TSGenAJounin1Id, TSGenMJounin1Id, 
	    	    	TSBukiBJounin1Id, TSBukiRJounin1Id, TSCritCJounin1Id, TSCritDJounin1Id, TSRerollJounin1Id, TSAttackJounin1Id, TSEndJounin1Id);
	    }
	    
	    /*
	     * metoda za izracunavanje stats vrednosti izabranog ninje 
	     */
	    @FXML
	    public void calculateStatsJounin2() throws SQLException {

	    	Main.fight.getTeam().get_ninjas().get(4).setLevel(Double.parseDouble(lvlJounin2.getText()));

	    	getAddStats(4, AddTaiJounin2Id, AddNinJounin2Id, AddBukiJounin2Id, AddStaJounin2Id, AddEleJounin2Id, AddGenJounin2Id, 
	    			AddRerollJounin2Id, AddCritDJounin2Id, AddBukiRJounin2Id);

	    	Main.fight.getTeam().get_ninjas().get(4).dugmeCalculate();
	    	
	    	setTotalStats(4, TSTaiJounin2Id, TSNinJounin2Id, TSBukiJounin2Id, TSFatJounin2Id, TSStaJounin2Id, TSGenJounin2Id, TSGenAJounin2Id, TSGenMJounin2Id, 
	    	    	TSBukiBJounin2Id, TSBukiRJounin2Id, TSCritCJounin2Id, TSCritDJounin2Id, TSRerollJounin2Id, TSAttackJounin2Id, TSEndJounin2Id);

	    }
	    
	    /*
	     * metoda za izracunavanje stats vrednosti izabranog ninje 
	     */
	    @FXML
	    public void calculateStatsKage() throws SQLException {

	    	Main.fight.getTeam().get_ninjas().get(5).setLevel(Double.parseDouble(lvlKage.getText()));

	    	getAddStats(5, AddTaiKageId, AddNinKageId, AddBukiKageId, AddStaKageId, AddEleKageId, AddGenKageId, 
	    			AddRerollKageId, AddCritDKageId, AddBukiRKageId);

	    	Main.fight.getTeam().get_ninjas().get(5).dugmeCalculate();
	    	
	    	setTotalStats(5, TSTaiKageId, TSNinKageId, TSBukiKageId, TSFatKageId, TSStaKageId, TSGenKageId, TSGenAKageId, TSGenMKageId, 
	    	    	TSBukiBKageId, TSBukiRKageId, TSCritCKageId, TSCritDKageId, TSRerollKageId, TSAttackKageId, TSEndKageId);
	    }
	    /*
	     * metode za inkrement/dekrement varijable seal iz objekta Ninja
	     */
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
		/*
		 * metoda za iscitavanje podatka lvl iz TextField polja i skladistenja istog u objekat
		 */
		public void saveLVL(int redniBroj, TextField lvltxt) {
			Main.fight.getTeam().get_ninjas().get(redniBroj).setLevel(Double.parseDouble(lvltxt.getText()));
		}
		
		/*
		 * metoda za serijalizaciju objekta u fajl
		 */
		@FXML
		public void Save() throws IOException {
			
			saveLVL(0, lvlGen1);
			saveLVL(1, lvlGen2);
			saveLVL(2, lvlGen3);
			saveLVL(3, lvlJounin1);
			saveLVL(4, lvlJounin2);
			saveLVL(5, lvlKage);
			
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
		
		/*
		 * metoda za povlacenje podataka iz objekta i ispis istih u odgovarajuca polja
		 */
		public static void loadAll (int redniBroj, ImageView picFrame , ComboBox<String> comboboxName , ComboBox<String> comboboxA1, 
				ComboBox<String> comboboxA2, ComboBox<String> comboboxA3, TextField AddTai, TextField AddNin, TextField AddBuki, 
				TextField AddSta, TextField AddEle, TextField AddGen, TextField AddReroll, TextField AddCritD, TextField AddBukiR) throws FileNotFoundException {
			loadSlika(picFrame, redniBroj);
			comboboxName.setValue(Main.fight.getTeam().get_ninjas().get(redniBroj).getName());
			comboboxA1.setValue(Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(0).getName());
			comboboxA2.setValue(Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(1).getName());
			comboboxA3.setValue(Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(2).getName());
			AddTai.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getT())));
			AddNin.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getN())));
			AddBuki.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getB())));
			AddSta.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getS())));
			AddEle.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getE())));
			AddGen.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getG())));
			AddReroll.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getR())));
			AddCritD.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getCs())));
			AddBukiR.setPromptText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getStats().getBr())));
		}
		
		/*
		 * metoda za deserijalizaciju fajla i ubacivanje u objekat, i nakon toga ispis istih u odgovarajuca polja
		 */
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
			
			loadAll(0, picGen1, TBCBGen1, TBCBGen1A1, TBCBGen1A2, TBCBGen1A3, AddTaiGen1Id, AddNinGen1Id, AddBukiGen1Id, AddStaGen1Id, AddEleGen1Id, AddGenGen1Id, 
			    	AddRerollGen1Id, AddCritDGen1Id, AddBukiRGen1Id);
			setBaseStats(0, baseTaiGen1Id, baseNinGen1Id, baseBukiGen1Id, baseStaGen1Id, baseEleGen1Id, baseGenGen1Id, lblGen1S);
			
			loadAll(1, picGen2, TBCBGen2, TBCBGen2A1, TBCBGen2A2, TBCBGen2A3, AddTaiGen2Id, AddNinGen2Id, AddBukiGen2Id, AddStaGen1Id, AddEleGen2Id, AddGenGen2Id, 
			    	AddRerollGen2Id, AddCritDGen2Id, AddBukiRGen2Id );
			setBaseStats(1, baseTaiGen2Id, baseNinGen2Id, baseBukiGen2Id, baseStaGen2Id, baseEleGen2Id, baseGenGen2Id, lblGen2S);
			
			loadAll(2, picGen3, TBCBGen3, TBCBGen3A1, TBCBGen3A2, TBCBGen3A3, AddTaiGen3Id, AddNinGen3Id, AddBukiGen3Id, AddStaGen3Id, AddEleGen3Id, AddGenGen3Id, 
			    	AddRerollGen3Id, AddCritDGen3Id, AddBukiRGen3Id );
			setBaseStats(2, baseTaiGen3Id, baseNinGen3Id, baseBukiGen3Id, baseStaGen3Id, baseEleGen3Id, baseGenGen3Id, lblGen3S);
			
			loadAll(3, picJounin1, TBCBJounin1, TBCBJounin1A1, TBCBJounin1A2, TBCBJounin1A3, AddTaiJounin1Id, AddNinJounin1Id, AddBukiJounin1Id, AddStaJounin1Id, AddEleJounin1Id, AddGenJounin1Id, 
			    	AddRerollJounin1Id, AddCritDJounin1Id, AddBukiRJounin1Id );
			setBaseStats(3, baseTaiJounin1Id, baseNinJounin1Id, baseBukiJounin1Id, baseStaJounin1Id, baseEleJounin1Id, baseGenJounin1Id, lblJounin1S);
			
			loadAll(4, picJounin2, TBCBJounin2, TBCBJounin2A1, TBCBJounin2A2, TBCBJounin2A3, AddTaiJounin2Id, AddNinJounin2Id, AddBukiJounin2Id, AddStaJounin2Id, AddEleJounin2Id, AddGenJounin2Id, 
			    	AddRerollJounin2Id, AddCritDJounin2Id, AddBukiRJounin2Id );
			setBaseStats(4, baseTaiJounin2Id, baseNinJounin2Id, baseBukiJounin2Id, baseStaJounin2Id, baseEleJounin2Id, baseGenJounin2Id, lblJounin2S);
			
			loadAll(5, picKage, TBCBKage, TBCBKageA1, TBCBKageA2, TBCBKageA3, AddTaiKageId, AddNinKageId, AddBukiKageId, AddStaKageId, AddEleKageId, AddGenKageId, 
			    	AddRerollKageId, AddCritDKageId, AddBukiRKageId );
			setBaseStats(5, baseTaiKageId, baseNinKageId, baseBukiKageId, baseStaKageId, baseEleKageId, baseGenKageId, lblKageS);
		}
		/*
		 * metoda za povlacenje i ispis podataka iz objekta u prosledjenim labelama
		 */
		 public void setBaseStats(int redniBroj, Label Tai, Label Nin, Label Buki, Label Sta, Label Ele, Label Gen, Label Seal) {
			 Tai.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseTai())));
			 Nin.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseNin())));
			 Buki.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseBuki())));
			 Sta.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseStam())));
			 Ele.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseEle())));
			 Gen.setText(String.format("%.0f",(Main.fight.getTeam().get_ninjas().get(redniBroj).getBaseGen())));
		    	
			 Seal.setText(String.format("%.0f", (Main.fight.getTeam().get_ninjas().get(redniBroj).getSeal())));
		    }
		 /*
		  * metoda za povlacenje iz TextField polja i upis podataka u pozvani objekat
		  */
		 public static void getAddStats(int redniBroj, TextField Tai, TextField Nin, TextField Buki, TextField Sta, TextField Ele, 
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
		 /*
		  * metoda za povlacenje i ispis podataka iz objekta u prosledjenim TextField poljima
		  */
		 public static void setTotalStats(int redniBroj, Label Tai, Label Nin, Label Buki, Label Fat, Label Sta, Label Gen, Label GenA, 
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
		 /*
		  * metoda timski sklopljena: Nikola Corkovic - cnik996@gmail.com
		  * 							Milica Knezevic - milicaknezevic13@gmail.com
		  * 							Stefan Tomic - stefantomic017@gmail.com
		  * 
		  * metoda za povlacenje slike iz lokalnog foldera
		  */
		 public static void loadSlika(ImageView okvirSlike, int rednibroj) throws FileNotFoundException {
			String pathSufix = Main.fight.getTeam().get_ninjas().get(rednibroj).getPicPath();
			if (!pathSufix.isEmpty()) {
				String path = "C:\\xampp\\mysql\\data\\nmsimulatortest"+pathSufix;
				FileInputStream input = new FileInputStream(path);
				Image image = new Image(input);
				okvirSlike.setImage(image);
			}
		 }
		 
		 /*
		  * metoda za selekciju, povlacenje izabranog iz baze i iscitavanje odabranog nindze
		  * takodje iscitavanje abilities koje taj nindza ima
		  */
		 public void ListenerName(ComboBox<String> combobox, ComboBox<String> comboboxA1, ComboBox<String> comboboxA2, ComboBox<String> comboboxA3,
									int redniBroj, Label Tai, Label Nin, Label Buki, Label Sta, Label Ele, Label Gen, Label Seal, ImageView okvirSlike) {
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
							loadSlika(okvirSlike, redniBroj);
							ConnectionDBL.Disconnect();
							setBaseStats(redniBroj, Tai, Nin, Buki, Sta, Ele, Gen, Seal);
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
	    /*
	     * metoda za selekciju, povlacenje izabrane iz baze i iscitavanje ability
	     */
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
        	    		//System.out.println("Click on "+cell.getItem()); Test ispis selektovanog itema
                	}
            		});
            	return cell ;
        	});
		}
		/*
		 * metoda za inicijalizaciju potrebnih listi nindzi i podesavanje istih na ComboBox
		 */
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
			
			ListenerName(TBCBGen1, TBCBGen1A1, TBCBGen1A2, TBCBGen1A3, 0, baseTaiGen1Id, baseNinGen1Id, baseBukiGen1Id, baseStaGen1Id, baseEleGen1Id, baseGenGen1Id, lblGen1S, picGen1);
			ListenerName(TBCBGen2, TBCBGen2A1, TBCBGen2A2, TBCBGen2A3, 1, baseTaiGen2Id, baseNinGen2Id, baseBukiGen2Id, baseStaGen2Id, baseEleGen2Id, baseGenGen2Id, lblGen2S, picGen2);
			ListenerName(TBCBGen3, TBCBGen3A1, TBCBGen3A2, TBCBGen3A3, 2, baseTaiGen3Id, baseNinGen3Id, baseBukiGen3Id, baseStaGen3Id, baseEleGen3Id, baseGenGen3Id, lblGen3S, picGen3);
			ListenerName(TBCBJounin1, TBCBJounin1A1, TBCBJounin1A2, TBCBJounin1A3, 3, baseTaiJounin1Id, baseNinJounin1Id, baseBukiJounin1Id, baseStaJounin1Id, baseEleJounin1Id, baseGenJounin1Id, lblJounin1S, picJounin1);
			ListenerName(TBCBJounin2, TBCBJounin2A1, TBCBJounin2A2, TBCBJounin2A3, 4, baseTaiJounin2Id, baseNinJounin2Id, baseBukiJounin2Id, baseStaJounin2Id, baseEleJounin2Id, baseGenJounin2Id, lblJounin2S, picJounin2);
			ListenerName(TBCBKage, TBCBKageA1, TBCBKageA2, TBCBKageA3, 5, baseTaiKageId, baseNinKageId, baseBukiKageId, baseStaKageId, baseEleKageId, baseGenKageId, lblKageS, picKage);
		}
		
}
