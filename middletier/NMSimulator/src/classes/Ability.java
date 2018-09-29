package classes;

import java.io.Serializable;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class Ability implements Serializable {

	protected String name;
	protected double id, taijutsu, ninjutsu, bukijutsu, element, stamina, attack, bukiRec, bukiBoost, critChance, critStrike, reroll, endurance, fatigue,
		taiImmunity, ninImmunity, bukiImmunity, attackImmunity, genImmunity, poisonImmunity, poison, guard, absorb, lvl5Death, bloodlineNullify, 
		genAct, genMast, genRec, genAbs, genLearn, genCopy, gen;
	
	public Ability() {
		this.name = "";
		this.id = 0;
		this.taijutsu = 0;
		this.ninjutsu = 0;
		this.bukijutsu = 0;
		this.element = 0;
		this.stamina = 0;
		this.attack = 0;
		this.bukiRec = 0;
		this.bukiBoost = 0;
		this.critChance = 0;
		this.critStrike = 0;
		this.reroll = 0;
		this.endurance = 0;
		this.fatigue = 0;
		this.taiImmunity = 0;
		this.ninImmunity = 0;
		this.bukiImmunity = 0;
		this.attackImmunity = 0;
		this.genImmunity = 0;
		this.poisonImmunity = 0;
		this.poison = 0;
		this.guard = 0;
		this.absorb = 0;
		this.lvl5Death = 0;
		this.bloodlineNullify = 0;
		this.genAct = 0;
		this.genMast = 0;
		this.genRec = 0;
		this.genAbs = 0;
		this.genLearn = 0;
		this.genCopy = 0;
		this.gen = 0;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public double getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(double id) {
		this.id = id;
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
	 * @return the element
	 */
	public double getElement() {
		return element;
	}

	/**
	 * @param element the element to set
	 */
	public void setElement(double element) {
		this.element = element;
	}

	/**
	 * @return the stamina
	 */
	public double getStamina() {
		return stamina;
	}

	/**
	 * @param stamina the stamina to set
	 */
	public void setStamina(double stamina) {
		this.stamina = stamina;
	}

	/**
	 * @return the attack
	 */
	public double getAttack() {
		return attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(double attack) {
		this.attack = attack;
	}

	/**
	 * @return the bukiRec
	 */
	public double getBukiRec() {
		return bukiRec;
	}

	/**
	 * @param bukiRec the bukiRec to set
	 */
	public void setBukiRec(double bukiRec) {
		this.bukiRec = bukiRec;
	}

	/**
	 * @return the bukiBoost
	 */
	public double getBukiBoost() {
		return bukiBoost;
	}

	/**
	 * @param bukiBoost the bukiBoost to set
	 */
	public void setBukiBoost(double bukiBoost) {
		this.bukiBoost = bukiBoost;
	}

	/**
	 * @return the critChance
	 */
	public double getCritChance() {
		return critChance;
	}

	/**
	 * @param critChance the critChance to set
	 */
	public void setCritChance(double critChance) {
		this.critChance = critChance;
	}

	/**
	 * @return the critStrike
	 */
	public double getCritStrike() {
		return critStrike;
	}

	/**
	 * @param critStrike the critStrike to set
	 */
	public void setCritStrike(double critStrike) {
		this.critStrike = critStrike;
	}

	/**
	 * @return the reroll
	 */
	public double getReroll() {
		return reroll;
	}

	/**
	 * @param reroll the reroll to set
	 */
	public void setReroll(double reroll) {
		this.reroll = reroll;
	}

	/**
	 * @return the endurance
	 */
	public double getEndurance() {
		return endurance;
	}

	/**
	 * @param endurance the endurance to set
	 */
	public void setEndurance(double endurance) {
		this.endurance = endurance;
	}

	/**
	 * @return the fatigue
	 */
	public double getFatigue() {
		return fatigue;
	}

	/**
	 * @param fatigue the fatigue to set
	 */
	public void setFatigue(double fatigue) {
		this.fatigue = fatigue;
	}

	/**
	 * @return the taiImmunity
	 */
	public double getTaiImmunity() {
		return taiImmunity;
	}

	/**
	 * @param taiImmunity the taiImmunity to set
	 */
	public void setTaiImmunity(double taiImmunity) {
		this.taiImmunity = taiImmunity;
	}

	/**
	 * @return the ninImmunity
	 */
	public double getNinImmunity() {
		return ninImmunity;
	}

	/**
	 * @param ninImmunity the ninImmunity to set
	 */
	public void setNinImmunity(double ninImmunity) {
		this.ninImmunity = ninImmunity;
	}

	/**
	 * @return the bukiImmunity
	 */
	public double getBukiImmunity() {
		return bukiImmunity;
	}

	/**
	 * @param bukiImmunity the bukiImmunity to set
	 */
	public void setBukiImmunity(double bukiImmunity) {
		this.bukiImmunity = bukiImmunity;
	}

	/**
	 * @return the attackImmunity
	 */
	public double getAttackImmunity() {
		return attackImmunity;
	}

	/**
	 * @param attackImmunity the attackImmunity to set
	 */
	public void setAttackImmunity(double attackImmunity) {
		this.attackImmunity = attackImmunity;
	}

	/**
	 * @return the genImmunity
	 */
	public double getGenImmunity() {
		return genImmunity;
	}

	/**
	 * @param genImmunity the genImmunity to set
	 */
	public void setGenImmunity(double genImmunity) {
		this.genImmunity = genImmunity;
	}

	/**
	 * @return the poisonImmunity
	 */
	public double getPoisonImmunity() {
		return poisonImmunity;
	}

	/**
	 * @param poisonImmunity the poisonImmunity to set
	 */
	public void setPoisonImmunity(double poisonImmunity) {
		this.poisonImmunity = poisonImmunity;
	}

	/**
	 * @return the poison
	 */
	public double getPoison() {
		return poison;
	}

	/**
	 * @param poison the poison to set
	 */
	public void setPoison(double poison) {
		this.poison = poison;
	}

	/**
	 * @return the guard
	 */
	public double getGuard() {
		return guard;
	}

	/**
	 * @param guard the guard to set
	 */
	public void setGuard(double guard) {
		this.guard = guard;
	}

	/**
	 * @return the absorb
	 */
	public double getAbsorb() {
		return absorb;
	}

	/**
	 * @param absorb the absorb to set
	 */
	public void setAbsorb(double absorb) {
		this.absorb = absorb;
	}

	/**
	 * @return the lvl5Death
	 */
	public double getLvl5Death() {
		return lvl5Death;
	}

	/**
	 * @param lvl5Death the lvl5Death to set
	 */
	public void setLvl5Death(double lvl5Death) {
		this.lvl5Death = lvl5Death;
	}

	/**
	 * @return the bloodlineNullify
	 */
	public double getBloodlineNullify() {
		return bloodlineNullify;
	}

	/**
	 * @param bloodlineNullify the bloodlineNullify to set
	 */
	public void setBloodlineNullify(double bloodlineNullify) {
		this.bloodlineNullify = bloodlineNullify;
	}

	/**
	 * @return the genAct
	 */
	public double getGenAct() {
		return genAct;
	}

	/**
	 * @param genAct the genAct to set
	 */
	public void setGenAct(double genAct) {
		this.genAct = genAct;
	}

	/**
	 * @return the genMast
	 */
	public double getGenMast() {
		return genMast;
	}

	/**
	 * @param genMast the genMast to set
	 */
	public void setGenMast(double genMast) {
		this.genMast = genMast;
	}

	/**
	 * @return the genRec
	 */
	public double getGenRec() {
		return genRec;
	}

	/**
	 * @param genRec the genRec to set
	 */
	public void setGenRec(double genRec) {
		this.genRec = genRec;
	}

	/**
	 * @return the genAbs
	 */
	public double getGenAbs() {
		return genAbs;
	}

	/**
	 * @param genAbs the genAbs to set
	 */
	public void setGenAbs(double genAbs) {
		this.genAbs = genAbs;
	}

	/**
	 * @return the genLearn
	 */
	public double getGenLearn() {
		return genLearn;
	}

	/**
	 * @param genLearn the genLearn to set
	 */
	public void setGenLearn(double genLearn) {
		this.genLearn = genLearn;
	}

	/**
	 * @return the genCopy
	 */
	public double getGenCopy() {
		return genCopy;
	}

	/**
	 * @param genCopy the genCopy to set
	 */
	public void setGenCopy(double genCopy) {
		this.genCopy = genCopy;
	}

	/**
	 * @return the gen
	 */
	public double getGen() {
		return gen;
	}

	/**
	 * @param gen the gen to set
	 */
	public void setGen(double gen) {
		this.gen = gen;
	}
	
	
	
}
