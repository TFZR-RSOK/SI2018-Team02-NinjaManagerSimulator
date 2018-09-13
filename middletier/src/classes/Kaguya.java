package classes;

import enums.StanjaKaguya;
import interfaces.IBasicOperations;

public class Kaguya {
	
	protected double taijutsu, ninjutsu, bukijutsu, bukijutsuBoost;
	protected StanjaKaguya tezina;
	
	public Kaguya () {
		this.taijutsu = 80;
		this.ninjutsu = 60;
		this.bukijutsu = 36;
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
		this.ninjutsu = 60;
		this.bukijutsu = 36;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.begginer;
	}
	
	public void setEasyStanje () {
		this.taijutsu = 90;
		this.ninjutsu = 70;
		this.bukijutsu = 42;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.easy;
	}
	
	public void setMediumStanje () {
		this.taijutsu = 100;
		this.ninjutsu = 70;
		this.bukijutsu = 50;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.medium;
	}
	
	public void setHardStanje () {
		this.taijutsu = 115;
		this.ninjutsu = 75;
		this.bukijutsu = 55;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.hard;
	}
	
	public void setExtremeStanje () {
		this.taijutsu = 130;
		this.ninjutsu = 85;
		this.bukijutsu = 60;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.extreme;
	}
	
	public void setImpossibleStanje () {
		this.taijutsu = 150;
		this.ninjutsu = 100;
		this.bukijutsu = 75;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.impossible;
	}
	
	public void setForbiddenStanje () {
		this.taijutsu = 180;
		this.ninjutsu = 120;
		this.bukijutsu = 100;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.forbidden;
	}

	public double KaguyaAttack () {
		double attack = this.taijutsu/2+this.ninjutsu+this.bukijutsu*this.bukijutsuBoost/100;
		return attack;
	} 

}
