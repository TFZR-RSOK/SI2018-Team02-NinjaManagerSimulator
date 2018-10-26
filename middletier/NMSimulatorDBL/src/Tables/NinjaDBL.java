package Tables;

import java.sql.SQLException;
import java.util.ArrayList;

import classes.Ninja;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class NinjaDBL {

	static int duzinaListeImena = 500; 
	static ArrayList<String> ListaImena = new ArrayList<String>(duzinaListeImena);
	static ArrayList<String> ListaImenaGenina = new ArrayList<String>(duzinaListeImena);
	static ArrayList<String> ListaImenaJounina = new ArrayList<String>(duzinaListeImena);
	static ArrayList<String> ListaImenaKagea = new ArrayList<String>(duzinaListeImena);
	
	public static Ninja pullNinjaV2 (String izabranoImeNinje) throws SQLException {
			
	
		Ninja nin = new Ninja();
			
		while (ConnectionDBL.rs.next()) {
			if (ConnectionDBL.rs.getString(2).equals(izabranoImeNinje)) {
				
				System.out.println(ConnectionDBL.rs.getString(2));
								
				nin.setIdNinje(ConnectionDBL.rs.getInt(1));
				nin.setName(ConnectionDBL.rs.getString(2));
				nin.setChakra(ConnectionDBL.rs.getDouble(3));
				nin.setSeal(ConnectionDBL.rs.getDouble(4));
				nin.setBaseTai(ConnectionDBL.rs.getDouble(5));
				nin.setTaijutsuGrowth(ConnectionDBL.rs.getDouble(6));
				nin.setBaseNin(ConnectionDBL.rs.getDouble(7));
				nin.setNinjutsuGrowth(ConnectionDBL.rs.getDouble(8));
				nin.setBaseBuki(ConnectionDBL.rs.getDouble(9));
				nin.setBukijutsuGrowth(ConnectionDBL.rs.getDouble(10));
				nin.setBaseEle(ConnectionDBL.rs.getDouble(11));
				nin.setElementGrowth(ConnectionDBL.rs.getDouble(12));
				nin.setBaseGen(ConnectionDBL.rs.getDouble(13));
				nin.setGenjutsuGrowth(ConnectionDBL.rs.getDouble(14));
				nin.setBaseStam(ConnectionDBL.rs.getDouble(15));
				nin.setStaminaGrowth(ConnectionDBL.rs.getDouble(16));
				nin.setPicPath(ConnectionDBL.rs.getString(17));
				nin.setTip(ConnectionDBL.rs.getDouble(18));
			}
		}
		
		return nin;
	}
	
	public static void insertNamesIntoArray () throws SQLException {
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			ListaImena.add(indeks,ConnectionDBL.rs.getString(2));
			indeks++;
		}
	}
	
	public static void insertGeninNamesIntoArray () throws SQLException {
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			if (ConnectionDBL.rs.getInt(18) == 1) {
				ListaImenaGenina.add(indeks,ConnectionDBL.rs.getString(2));
				indeks++;
			}
		}
	}
	
	public static void insertJouninNamesIntoArray () throws SQLException {
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			if (ConnectionDBL.rs.getInt(18) == 2) {
				ListaImenaJounina.add(indeks,ConnectionDBL.rs.getString(2));
				indeks++;
			}
		}
	}
	
	/**
	 * @return the listaImenaGenina
	 */
	public static ArrayList<String> getListaImenaGenina() {
		return ListaImenaGenina;
	}


	/**
	 * @param listaImenaGenina the listaImenaGenina to set
	 */
	public static void setListaImenaGenina(ArrayList<String> listaImenaGenina) {
		ListaImenaGenina = listaImenaGenina;
	}


	/**
	 * @return the listaImenaJounina
	 */
	public static ArrayList<String> getListaImenaJounina() {
		return ListaImenaJounina;
	}


	/**
	 * @param listaImenaJounina the listaImenaJounina to set
	 */
	public static void setListaImenaJounina(ArrayList<String> listaImenaJounina) {
		ListaImenaJounina = listaImenaJounina;
	}


	/**
	 * @return the listaImenaKagea
	 */
	public static ArrayList<String> getListaImenaKagea() {
		return ListaImenaKagea;
	}


	/**
	 * @param listaImenaKagea the listaImenaKagea to set
	 */
	public static void setListaImenaKagea(ArrayList<String> listaImenaKagea) {
		ListaImenaKagea = listaImenaKagea;
	}


	public static void insertKageNamesIntoArray () throws SQLException {
		int indeks = 0;
		while (ConnectionDBL.rs.next())
		{
			if (ConnectionDBL.rs.getInt(18) == 3) {
				ListaImenaKagea.add(indeks,ConnectionDBL.rs.getString(2));
				indeks++;
			}
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
