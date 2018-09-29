package Tables;

import java.sql.SQLException;
import java.util.ArrayList;

import main.Main;


public class NinjaDBL {

	static int duzinaListeImena = 263; //Ovo treba promeniti jer ako se slucajno doda ninja u bazu ovo nece raditi kako treba.
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
				Main.fight.getTeam().get_ninjas().get(redniBroj).setTaijutsu(ConnectionDBL.rs.getDouble(5));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setTaijutsuGrowth(ConnectionDBL.rs.getDouble(6));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setNinjutsu(ConnectionDBL.rs.getDouble(7));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setNinjutsuGrowth(ConnectionDBL.rs.getDouble(8));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBukijutsu(ConnectionDBL.rs.getDouble(9));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setBukijutsuGrowth(ConnectionDBL.rs.getDouble(10));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setElement(ConnectionDBL.rs.getDouble(11));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setElementGrowth(ConnectionDBL.rs.getDouble(12));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setGenjutsu(ConnectionDBL.rs.getDouble(13));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setGenjutsuGrowth(ConnectionDBL.rs.getDouble(14));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setStamina(ConnectionDBL.rs.getDouble(15));
				Main.fight.getTeam().get_ninjas().get(redniBroj).setStaminaGrowth(ConnectionDBL.rs.getDouble(16));
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
	 * @return the duzinaListeImena
	 */
	public static int getDuzinaListeImena() {
		return duzinaListeImena;
	}


	/**
	 * @param duzinaListeImena the duzinaListeImena to set
	 */
	public static void setDuzinaListeImena(int duzinaListeImena) {
		NinjaDBL.duzinaListeImena = duzinaListeImena;
	}


	/**
	 * @return the listaImena
	 */
	public static ArrayList<String> getListaImena() {
		return ListaImena;
	}


	/**
	 * @param listaImena the listaImena to set
	 */
	public static void setListaImena(ArrayList<String> listaImena) {
		ListaImena = listaImena;
	}
	
}
