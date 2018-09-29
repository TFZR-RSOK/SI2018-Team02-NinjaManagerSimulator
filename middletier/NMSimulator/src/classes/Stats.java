package classes;

import java.io.Serializable;

public class Stats implements Serializable {
	
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
	 * @return the r
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}

	/**
	 * @return the t
	 */
	public double getT() {
		return t;
	}

	/**
	 * @param t the t to set
	 */
	public void setT(double t) {
		this.t = t;
	}

	/**
	 * @return the n
	 */
	public double getN() {
		return n;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(double n) {
		this.n = n;
	}

	/**
	 * @return the b
	 */
	public double getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(double b) {
		this.b = b;
	}

	/**
	 * @return the e
	 */
	public double getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(double e) {
		this.e = e;
	}

	/**
	 * @return the s
	 */
	public double getS() {
		return s;
	}

	/**
	 * @param s the s to set
	 */
	public void setS(double s) {
		this.s = s;
	}

	/**
	 * @return the g
	 */
	public double getG() {
		return g;
	}

	/**
	 * @param g the g to set
	 */
	public void setG(double g) {
		this.g = g;
	}

	/**
	 * @return the cs
	 */
	public double getCs() {
		return cs;
	}

	/**
	 * @param cs the cs to set
	 */
	public void setCs(double cs) {
		this.cs = cs;
	}

	/**
	 * @return the br
	 */
	public double getBr() {
		return br;
	}

	/**
	 * @param br the br to set
	 */
	public void setBr(double br) {
		this.br = br;
	}

	
	
}
