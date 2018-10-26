package Tables;

import java.sql.SQLException;
import java.util.ArrayList;

import classes.Ability;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class NapadiDBL {
	
	static int duzinaListeImenaNapada = 5; //Broj napada ne prelazi 5
	static ArrayList<String> ListaImenaNapada = new ArrayList<String>(duzinaListeImenaNapada);
	

	public static Ability pullNapadiV2 (String izabranoImeNapada, int idNinje) throws SQLException {
		
		String imeNapada = izabranoImeNapada;
		// int redniBroj = izabraniRedniBrojNinje; kad vratis objekat prilepi
		//int idNinje = Main.fight.getTeam().get_ninjas().get(redniBroj).getIdNinje();
		//int redniBrojAbility = izabraniAbility;
		
		Ability abil = new Ability();
			
		while (ConnectionDBL.rs.next()) {
			if (ConnectionDBL.rs.getInt(34) == (idNinje)) {
				if (ConnectionDBL.rs.getString(2).equals(imeNapada)) {
					abil.setName(ConnectionDBL.rs.getString(2));
					abil.setTaijutsu(ConnectionDBL.rs.getDouble(3));
					abil.setNinjutsu(ConnectionDBL.rs.getDouble(4));
					abil.setBukijutsu(ConnectionDBL.rs.getDouble(5));
					abil.setElement(ConnectionDBL.rs.getDouble(6));
					abil.setGen(ConnectionDBL.rs.getDouble(7));
					abil.setStamina(ConnectionDBL.rs.getDouble(8));
					abil.setAttack(ConnectionDBL.rs.getDouble(9));
					abil.setBukiRec(ConnectionDBL.rs.getDouble(10));
					abil.setBukiBoost(ConnectionDBL.rs.getDouble(11));
					abil.setCritChance(ConnectionDBL.rs.getDouble(12));
					abil.setCritStrike(ConnectionDBL.rs.getDouble(13));
					abil.setReroll(ConnectionDBL.rs.getDouble(14));
					abil.setEndurance(ConnectionDBL.rs.getDouble(15));
					abil.setFatigue(ConnectionDBL.rs.getDouble(16));
					abil.setTaiImmunity(ConnectionDBL.rs.getDouble(17));
					abil.setNinImmunity(ConnectionDBL.rs.getDouble(18));
					abil.setBukiImmunity(ConnectionDBL.rs.getDouble(19));
					abil.setAttackImmunity(ConnectionDBL.rs.getDouble(20));
					abil.setGenImmunity(ConnectionDBL.rs.getDouble(21));
					abil.setPoisonImmunity(ConnectionDBL.rs.getDouble(22));
					abil.setPoison(ConnectionDBL.rs.getDouble(23));
					abil.setGuard(ConnectionDBL.rs.getDouble(24));
					abil.setAbsorb(ConnectionDBL.rs.getDouble(25));
					abil.setLvl5Death(ConnectionDBL.rs.getDouble(26));
					abil.setGenAct(ConnectionDBL.rs.getDouble(28));
					abil.setGenMast(ConnectionDBL.rs.getDouble(29));
					abil.setGenRec(ConnectionDBL.rs.getDouble(30));
					abil.setGenAbs(ConnectionDBL.rs.getDouble(31));
					abil.setGenLearn(ConnectionDBL.rs.getDouble(32));
					abil.setGenCopy(ConnectionDBL.rs.getDouble(33));
				}
			}
		}
		
		return abil;
	}

	public static void insertAbilityNamesIntoArray (int izabraniNinja) throws SQLException {
		
		//int izabranNinja = izabraniNinja;
		//int idNinje2 = Main.fight.getTeam().get_ninjas().get(izabranNinja).getIdNinje();
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			if (ConnectionDBL.rs.getInt(34) == (izabraniNinja)) {
						ListaImenaNapada.add(indeks,ConnectionDBL.rs.getString(2));
						indeks++;
			}
		}	
	}

	/**
	 * @return listaImenaNapada
	 */
	public static ArrayList<String> getListaImenaNapada() {
		return ListaImenaNapada;
	}

	/**
	 * @param listaImenaNapada set
	 */
	public static void setListaImenaNapada(ArrayList<String> listaImenaNapada) {
		ListaImenaNapada = listaImenaNapada;
	}
	
	
}