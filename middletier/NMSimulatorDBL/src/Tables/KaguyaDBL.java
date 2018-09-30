package Tables;

import java.util.ArrayList;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class KaguyaDBL {
	
	static int duzinaListeTezina = 7;
	static ArrayList<String> ListaTezina = new ArrayList<String>(duzinaListeTezina);
	
	public static void insertNamesIntoArray () {
			ListaTezina.add("Beginner");
			ListaTezina.add("Easy");
			ListaTezina.add("Medium");
			ListaTezina.add("Hard");
			ListaTezina.add("Extreme");
			ListaTezina.add("Impossible");
			ListaTezina.add("Forbidden");
	}

	/**
	 * @return listaTezina
	 */
	public static ArrayList<String> getListaTezina() {
		return ListaTezina;
	}

	/**
	 * @param listaTezina set
	 */
	public static void setListaTezina(ArrayList<String> listaTezina) {
		ListaTezina = listaTezina;
	}

}
