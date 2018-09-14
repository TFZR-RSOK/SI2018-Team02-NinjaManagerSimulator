package classes;
import java.util.ArrayList;

import enums.Stanja;

public class Team extends Ninja{
	
	protected ArrayList <Ninja> _ninjas;
	
	protected Stanja stanje;
	
	public Team () {
		Ninja nin = new Ninja();
		this._ninjas.add(nin);
		this.stanje = Stanja.clearTeam;
	}

	/**
	 * @return the _ninjas
	 */
	public ArrayList<Ninja> get_ninjas() {
		return _ninjas;
	}

	/**
	 * @param _ninjas the _ninjas to set
	 */
	public void set_ninjas(ArrayList<Ninja> _ninjas) {
		this._ninjas = _ninjas;
	}

	/**
	 * @return the stanje
	 */
	public Stanja getStanje() {
		return stanje;
	}

	/**
	 * @param stanje the stanje to set
	 */
	public void setStanje(Stanja stanje) {
		this.stanje = stanje;
	}
	
	public double fightSimNinja () {
		double TotalNesto = 0;
		for (Ninja nin1 : this._ninjas) // Hocu korak po korak objasnjenje ovoga!!!
			TotalNesto += nin1.DMGvsKaguya();
		
		return TotalNesto;
	
	}
	
}