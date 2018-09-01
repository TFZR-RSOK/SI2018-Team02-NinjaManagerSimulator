package classes;

import enums.StanjaKaguya;
import interfaces.IBasicOperations;

public class Kaguya implements IBasicOperations {
	
	protected double taijutsu, ninjutsu, bukijutsu, bukijutsuBoost;
	protected StanjaKaguya tezina;
	
	public Kaguya () {
		this.taijutsu = 80;
		this.ninjutsu = 80;
		this.bukijutsu = 90;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.begginer;
	}

	/**
	 * @return the taijutsu
	 */
	public double getTaijutsu() {
		return taijutsu;
	}

	/**
	 * @param taijutsu the taijutsu to set
	 */
	public void setTaijutsu(double taijutsu) {
		this.taijutsu = taijutsu;
	}

	/**
	 * @return the ninjutsu
	 */
	public double getNinjutsu() {
		return ninjutsu;
	}

	/**
	 * @param ninjutsu the ninjutsu to set
	 */
	public void setNinjutsu(double ninjutsu) {
		this.ninjutsu = ninjutsu;
	}

	/**
	 * @return the bukijutsu
	 */
	public double getBukijutsu() {
		return bukijutsu;
	}

	/**
	 * @param bukijutsu the bukijutsu to set
	 */
	public void setBukijutsu(double bukijutsu) {
		this.bukijutsu = bukijutsu;
	}

	/**
	 * @return the bukijutsuBoost
	 */
	public double getBukijutsuBoost() {
		return bukijutsuBoost;
	}

	/**
	 * @param bukijutsuBoost the bukijutsuBoost to set
	 */
	public void setBukijutsuBoost(double bukijutsuBoost) {
		this.bukijutsuBoost = bukijutsuBoost;
	}
	
	/**
	 * @return the tezina
	 */
	public StanjaKaguya getTezina() {
		return tezina;
	}

	/**
	 * @param tezina the tezina to set
	 */
	public void setTezina(StanjaKaguya tezina) {
		this.tezina = tezina;
	}
	
	public void setBegginerStanje () {
		this.taijutsu = 80;
		this.ninjutsu = 40;
		this.bukijutsu = 90;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.begginer;
	}
	
	public void setEasyStanje () {
		this.taijutsu = 100;
		this.ninjutsu = 45;
		this.bukijutsu = 100;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.easy;
	}
	
	public void setMediumStanje () {
		this.taijutsu = 100;
		this.ninjutsu = 50;
		this.bukijutsu = 105;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.medium;
	}
	
	public void setHardStanje () {
		this.taijutsu = 125;
		this.ninjutsu = 60;
		this.bukijutsu = 110;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.hard;
	}
	
	public void setExtremeStanje () {
		this.taijutsu = 140;
		this.ninjutsu = 70;
		this.bukijutsu = 120;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.extreme;
	}
	
	public void setImpossibleStanje () {
		this.taijutsu = 160;
		this.ninjutsu = 80;
		this.bukijutsu = 120;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.impossible;
	}
	
	public void setForbiddenStanje () {
		this.taijutsu = 160;
		this.ninjutsu = 90;
		this.bukijutsu = 130;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.forbidden;
	}

	public double KaguyaAttack () {
		double attack = this.taijutsu/2+this.ninjutsu+this.bukijutsu*this.bukijutsuBoost/100;
		return attack;
	} 

}
