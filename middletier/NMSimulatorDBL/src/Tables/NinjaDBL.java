package Tables;

import java.sql.SQLException;
import java.util.ArrayList;

import main.Main;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class NinjaDBL {

	static int duzinaListeImena = 263; 
	static ArrayList<String> ListaImena = new ArrayList<String>(duzinaListeImena);
	
	public static void pullNinjaV2 (int izabraniRedniBrojNinje, String izabranoImeNinje) throws SQLException {
			
		int redniBroj = izabraniRedniBrojNinje;
		String imeNinje = izabranoImeNinje;
			
		while (ConnectionDBL.rs.next()) {
			if (ConnectionDBL.rs.getString(2).equals(imeNinje)) {
				Main.fight.getTeam().get_ninjas().get(redniBroj).setIdNinje(ConnectionDBL.rs.getInt(1));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setName(ConnectionDBL.rs.getString(2));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setChakra(ConnectionDBL.rs.getDouble(3));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setSeal(ConnectionDBL.rs.getDouble(4));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseTai(ConnectionDBL.rs.getDouble(5));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setTaijutsuGrowth(ConnectionDBL.rs.getDouble(6));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseNin(ConnectionDBL.rs.getDouble(7));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setNinjutsuGrowth(ConnectionDBL.rs.getDouble(8));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseBuki(ConnectionDBL.rs.getDouble(9));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBukijutsuGrowth(ConnectionDBL.rs.getDouble(10));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseEle(ConnectionDBL.rs.getDouble(11));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setElementGrowth(ConnectionDBL.rs.getDouble(12));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseGen(ConnectionDBL.rs.getDouble(13));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setGenjutsuGrowth(ConnectionDBL.rs.getDouble(14));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBaseStam(ConnectionDBL.rs.getDouble(15));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setStaminaGrowth(ConnectionDBL.rs.getDouble(16));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setPicPath(ConnectionDBL.rs.getString(17));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setTip(ConnectionDBL.rs.getDouble(18));
			}
		}
	}
	
	
	public static void pullDuzinaListeImena () throws SQLException {
		while (ConnectionDBL.rs.next())
				{
					duzinaListeImena ++;
				}
	}
	
	public static void insertNamesIntoArray () throws SQLException {
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			ListaImena.add(indeks,ConnectionDBL.rs.getString(2));
			indeks++;
		}
	}

	/**
	 * @return int vrednost duzine Liste Imena
	 */
	public static int getDuzinaListeImena() {
		return duzinaListeImena;
	}


	/**
	 * @param duzinaListeImena set
	 */
	public static void setDuzinaListeImena(int duzinaListeImena) {
		NinjaDBL.duzinaListeImena = duzinaListeImena;
	}


	/**
	 * @return listaImena
	 */
	public static ArrayList<String> getListaImena() {
		return ListaImena;
	}


	/**
	 * @param listaImena set
	 */
	public static void setListaImena(ArrayList<String> listaImena) {
		ListaImena = listaImena;
	}
	
}
