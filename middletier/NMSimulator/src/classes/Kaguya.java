package classes;

import java.io.Serializable;

import enums.StanjaKaguya;
import interfaces.IBasicOperations;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class Kaguya implements Serializable {
	
	protected double health, taijutsu, ninjutsu, bukijutsu, bukijutsuBoost;
	protected StanjaKaguya tezina;
	
	public Kaguya () {
		this.health = 2200;
		this.taijutsu = 80;
		this.ninjutsu = 60;
		this.bukijutsu = 36;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.begginer;
	}

	/**
	 * @return Kaguya health
	 */
	public double getHealth() {
		return health;
	}

	/**
	 * @param set health Kaguya
	 */
	public void setHealth(double health) {
		this.health = health;
	}

	/**
	 * @return Kaguya taijutsu
	 */
	public double getTaijutsu() {
		return taijutsu;
	}

	/**
	 * @param set taijutsu Kaguya
	 */
	public void setTaijutsu(double taijutsu) {
		this.taijutsu = taijutsu;
	}

	/**
	 * @return Kaguya ninjutsu
	 */
	public double getNinjutsu() {
		return ninjutsu;
	}

	/**
	 * @param set Kaguya ninjutsu
	 */
	public void setNinjutsu(double ninjutsu) {
		this.ninjutsu = ninjutsu;
	}

	/**
	 * @return Kaguya bukijutsu
	 */
	public double getBukijutsu() {
		return bukijutsu;
	}

	/**
	 * @param set Kaguya bukijutsu
	 */
	public void setBukijutsu(double bukijutsu) {
		this.bukijutsu = bukijutsu;
	}

	/**
	 * @return Kaguya bukijutsuBoost
	 */
	public double getBukijutsuBoost() {
		return bukijutsuBoost;
	}

	/**
	 * @param set Kaguya bukijutsuBoost
	 */
	public void setBukijutsuBoost(double bukijutsuBoost) {
		this.bukijutsuBoost = bukijutsuBoost;
	}
	
	/**
	 * @return Kaguya tezina
	 */
	public StanjaKaguya getTezina() {
		return tezina;
	}

	/**
	 * @param set Kaguya tezina
	 */
	public void setTezina(StanjaKaguya tezina) {
		this.tezina = tezina;
	}
	
	/**
	 * @param set Kaguya tezina to begginer 
	 */
	public void setBegginerStanje () {
		this.health = 2200;
		this.taijutsu = 80;
		this.ninjutsu = 60;
		this.bukijutsu = 36;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.begginer;
	}
	
	/**
	 * @param set Kaguya tezina to easy 
	 */
	public void setEasyStanje () {
		this.health = 4300;
		this.taijutsu = 90;
		this.ninjutsu = 70;
		this.bukijutsu = 42;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.easy;
	}
	
	/**
	 * @param set Kaguya tezina to medium 
	 */
	public void setMediumStanje () {
		this.health = 6400;
		this.taijutsu = 100;
		this.ninjutsu = 70;
		this.bukijutsu = 50;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.medium;
	}
	
	/**
	 * @param set Kaguya tezina to hard 
	 */
	public void setHardStanje () {
		this.health = 8500;
		this.taijutsu = 115;
		this.ninjutsu = 75;
		this.bukijutsu = 55;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.hard;
	}
	
	/**
	 * @param set Kaguya tezina to extreme 
	 */
	public void setExtremeStanje () {
		this.health = 10600;
		this.taijutsu = 130;
		this.ninjutsu = 85;
		this.bukijutsu = 60;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.extreme;
	}
	
	/**
	 * @param set Kaguya tezina to impossible 
	 */
	public void setImpossibleStanje () {
		this.health = 12700;
		this.taijutsu = 150;
		this.ninjutsu = 100;
		this.bukijutsu = 75;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.impossible;
	}
	
	/**
	 * @param set Kaguya tezina to forbidden 
	 */
	public void setForbiddenStanje () {
		this.health = 15800;
		this.taijutsu = 180;
		this.ninjutsu = 120;
		this.bukijutsu = 100;
		this.bukijutsuBoost = 30;
		this.tezina = StanjaKaguya.forbidden;
	}

	/**
	 * @return Kaguya singe attack vrednost
	 */
	public double KaguyaAttack () {
		double attack = this.taijutsu/2+this.ninjutsu+this.bukijutsu*this.bukijutsuBoost/100;
		return attack;
	} 
	
}
