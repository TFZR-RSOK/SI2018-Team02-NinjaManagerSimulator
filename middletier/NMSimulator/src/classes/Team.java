package classes;
import java.io.Serializable;
import java.util.ArrayList;

import enums.Stanja;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class Team extends Ninja implements Serializable{

	protected ArrayList <Ninja> _ninjas;
	
	protected Stanja stanje;
	
	public Team () {
		_ninjas = new ArrayList<Ninja>();
		Ninja nin = new Ninja();
		this._ninjas.add(nin = new Ninja());
		this._ninjas.add(nin = new Ninja());
		this._ninjas.add(nin = new Ninja());
		this._ninjas.add(nin = new Ninja());
		this._ninjas.add(nin = new Ninja());
		this._ninjas.add(nin = new Ninja());
		this.stanje = Stanja.clearTeam;
		// dodaj mi ovog ninju sa ovim id-om (14 svaki put odnosno 5 puta)
	}

	/**
	 * @return _ninjas
	 */
	public ArrayList<Ninja> get_ninjas() {
		return _ninjas;
	}

	/**
	 * @param set _ninjas
	 */
	public void set_ninjas(ArrayList<Ninja> _ninjas) {
		this._ninjas = _ninjas;
	}

	/**
	 * @return stanje _ninjas
	 */
	public Stanja getStanje() {
		return stanje;
	}

	/**
	 * @param set stanje _ninjas
	 */
	public void setStanje(Stanja stanje) {
		this.stanje = stanje;
	}
	/**
	 * 
	 * @return Team Total DMG vs Kaguya
	 */
	public double fightSimNinja () {
		double TotalNesto = 0;
		for (Ninja nin1 : this._ninjas)
			if (!nin1.getName().isEmpty()) {
				TotalNesto += nin1.DMGvsKaguya();
			}
		
		return TotalNesto;
	
	}
	
}