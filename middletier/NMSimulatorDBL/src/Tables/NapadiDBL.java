package Tables;

import java.sql.SQLException;
import java.util.ArrayList;

import main.Main;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class NapadiDBL {
	
	static int duzinaListeImenaNapada = 5; //Broj napada ne prelazi 5
	static ArrayList<String> ListaImenaNapada = new ArrayList<String>(duzinaListeImenaNapada);
	

	public static void pullNapadiV2 (String izabranoImeNapada, int izabraniRedniBrojNinje, int izabraniAbility) throws SQLException {
		
		String imeNapada = izabranoImeNapada;
		int redniBroj = izabraniRedniBrojNinje;
		int idNinje = Main.fight.getTeam().get_ninjas().get(redniBroj).getIdNinje();
		int redniBrojAbility = izabraniAbility;
			
		while (ConnectionDBL.rs.next()) {
			if (ConnectionDBL.rs.getInt(34) == (idNinje)) {
				if (ConnectionDBL.rs.getString(2).equals(imeNapada)) {
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setName(ConnectionDBL.rs.getString(2));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setTaijutsu(ConnectionDBL.rs.getDouble(3));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setNinjutsu(ConnectionDBL.rs.getDouble(4));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setBukijutsu(ConnectionDBL.rs.getDouble(5));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setElement(ConnectionDBL.rs.getDouble(6));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGen(ConnectionDBL.rs.getDouble(7));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setStamina(ConnectionDBL.rs.getDouble(8));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setAttack(ConnectionDBL.rs.getDouble(9));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setBukiRec(ConnectionDBL.rs.getDouble(10));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setBukiBoost(ConnectionDBL.rs.getDouble(11));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setCritChance(ConnectionDBL.rs.getDouble(12));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setCritStrike(ConnectionDBL.rs.getDouble(13));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setReroll(ConnectionDBL.rs.getDouble(14));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setEndurance(ConnectionDBL.rs.getDouble(15));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setFatigue(ConnectionDBL.rs.getDouble(16));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setTaiImmunity(ConnectionDBL.rs.getDouble(17));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setNinImmunity(ConnectionDBL.rs.getDouble(18));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setBukiImmunity(ConnectionDBL.rs.getDouble(19));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setAttackImmunity(ConnectionDBL.rs.getDouble(20));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenImmunity(ConnectionDBL.rs.getDouble(21));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setPoisonImmunity(ConnectionDBL.rs.getDouble(22));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setPoison(ConnectionDBL.rs.getDouble(23));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGuard(ConnectionDBL.rs.getDouble(24));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setAbsorb(ConnectionDBL.rs.getDouble(25));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setLvl5Death(ConnectionDBL.rs.getDouble(26));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenAct(ConnectionDBL.rs.getDouble(28));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenMast(ConnectionDBL.rs.getDouble(29));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenRec(ConnectionDBL.rs.getDouble(30));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenAbs(ConnectionDBL.rs.getDouble(31));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenLearn(ConnectionDBL.rs.getDouble(32));
					Main.fight.getTeam().get_ninjas().get(redniBroj).getAbilities().get(redniBrojAbility).setGenCopy(ConnectionDBL.rs.getDouble(33));
				}
			}
		}
	}

	public static void insertAbilityNamesIntoArray (int izabraniNinja) throws SQLException {
		
		int izabranNinja = izabraniNinja;
		int idNinje2 = Main.fight.getTeam().get_ninjas().get(izabranNinja).getIdNinje();
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			if (ConnectionDBL.rs.getInt(34) == (idNinje2)) {
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