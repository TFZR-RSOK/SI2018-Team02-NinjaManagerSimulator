package classes;
import enums.Stanja;

public class Team extends Ninja{
	
	Ninja ninja1, ninja2, ninja3, ninja4, ninja5, ninja6;
	
	protected Stanja stanje;
	
	public Team () {
	this.ninja1 = new Ninja();
	this.ninja2 = new Ninja();
	this.ninja3 = new Ninja();
	this.ninja4 = new Ninja();
	this.ninja5 = new Ninja();
	this.ninja6 = new Ninja();
	this.stanje = Stanja.clearTeam;
	}

	/**
	 * @return the ninja1
	 */
	public Ninja getNinja1() {
		return ninja1;
	}



	/**
	 * @param ninja1 the ninja1 to set
	 */
	public void setNinja1(Ninja ninja1) {
		this.ninja1 = ninja1;
	}



	/**
	 * @return the ninja2
	 */
	public Ninja getNinja2() {
		return ninja2;
	}



	/**
	 * @param ninja2 the ninja2 to set
	 */
	public void setNinja2(Ninja ninja2) {
		this.ninja2 = ninja2;
	}



	/**
	 * @return the ninja3
	 */
	public Ninja getNinja3() {
		return ninja3;
	}



	/**
	 * @param ninja3 the ninja3 to set
	 */
	public void setNinja3(Ninja ninja3) {
		this.ninja3 = ninja3;
	}



	/**
	 * @return the ninja4
	 */
	public Ninja getNinja4() {
		return ninja4;
	}



	/**
	 * @param ninja4 the ninja4 to set
	 */
	public void setNinja4(Ninja ninja4) {
		this.ninja4 = ninja4;
	}



	/**
	 * @return the ninja5
	 */
	public Ninja getNinja5() {
		return ninja5;
	}



	/**
	 * @param ninja5 the ninja5 to set
	 */
	public void setNinja5(Ninja ninja5) {
		this.ninja5 = ninja5;
	}



	/**
	 * @return the ninja6
	 */
	public Ninja getNinja6() {
		return ninja6;
	}



	/**
	 * @param ninja6 the ninja6 to set
	 */
	public void setNinja6(Ninja ninja6) {
		this.ninja6 = ninja6;
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
	
}
