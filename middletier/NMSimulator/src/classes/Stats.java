package classes;

import java.io.Serializable;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class Stats implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double t, n, b, e, s, g, r, cs, br;
	
	public Stats () {
		this.t = 0;
		this.n = 0;
		this.b = 0;
		this.e = 0;
		this.s = 0;
		this.g = 0;
		this.r = 0;
		this.cs = 0;
		this.br = 0;
	}

	/**
	 * @return Stats reroll vrednost
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param set reroll vrednost u Stats
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * @return Stats taijutsu vrednost
	 */
	public double getT() {
		return t;
	}

	/**
	 * @param set taijutsu vrednost u Stats
	 */
	public void setT(double t) {
		this.t = t;
	}

	/**
	 * @return Stats ninjutsu vrednost
	 */
	public double getN() {
		return n;
	}

	/**
	 * @param set ninjutsu vrednost u Stats
	 */
	public void setN(double n) {
		this.n = n;
	}

	/**
	 * @return Stats bukijutsu vrednost
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param set bukijutsu vrednost u Stats
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * @return Stats element vrednost
	 */
	public double getE() {
		return e;
	}

	/**
	 * @param set element vrednost u Stats
	 */
	public void setE(double e) {
		this.e = e;
	}

	/**
	 * @return Stats stamina vrednost
	 */
	public double getS() {
		return s;
	}

	/**
	 * @param set stamina vrednost u Stats
	 */
	public void setS(double s) {
		this.s = s;
	}

	/**
	 * @return Stats genjutsu vrednost
	 */
	public double getG() {
		return g;
	}

	/**
	 * @param set genjutsu vrednost u Stats
	 */
	public void setG(double g) {
		this.g = g;
	}

	/**
	 * @return Stats critical strike vrednost
	 */
	public double getCs() {
		return cs;
	}

	/**
	 * @param set critical strike vrednost u Stats
	 */
	public void setCs(double cs) {
		this.cs = cs;
	}

	/**
	 * @return Stats bukijutsu recovery vrednost
	 */
	public double getBr() {
		return br;
	}

	/**
	 * @param set bukijutsu recovery vrednost u Stats
	 */
	public void setBr(double br) {
		this.br = br;
	}

	
	
}
