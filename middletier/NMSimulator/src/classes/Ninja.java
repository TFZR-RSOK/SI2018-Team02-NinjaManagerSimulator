package classes;
import enums.Stanja;
import interfaces.IBasicOperations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class Ninja implements IBasicOperations, Serializable { 

	protected ArrayList <Ability> abilities;
	protected int idNinje;
	protected String name, picPath;
	protected double taijutsu, ninjutsu, bukijutsu, element, genjutsu, stamina, //variables for storing stats
						baseTai, baseNin, baseBuki, baseEle, baseGen, baseStam, //Base stats
						taijutsuGrowth, ninjutsuGrowth, bukijutsuGrowth, elementGrowth, genjutsuGrowth, staminaGrowth; //Base stats growth
	protected double attack, genjutsuActivation, genjutsuMastery, genjutsuRecharge, genjutsuAbsorb, genjutsuLearn, genjutsuCopy, //Rest of the stats
						bukijutsuRecovery, bukijutsuBoost, critChance, critStrike, reroll, focus, focusBurst, focusRange, 
						endurance, fatigue, offPositioning, taijutsuImmunity, ninjutsuImmunity, bukijutsuImmunity, attackImmunity,
						genjutsuImmunity, poisonImmunity, poison, guard, absorb, lvl5Death, bloodlineNullify, morph, chakra, level, seal,
						restBuki, tip;

	protected Stanja stanje;

	Random rand; 
	Kaguya Kaguya;
	Stats stats;
	
	/**
	 * Constructor for Ninja class
	 */
	public Ninja () {
		this.rand = new Random();
		this.Kaguya = new Kaguya();
		
		abilities = new ArrayList<Ability>();
		Ability abil = new Ability();
		this.abilities.add(abil = new Ability());
		this.abilities.add(abil = new Ability());
		this.abilities.add(abil = new Ability());
		
		this.stats = new Stats();
		
		this.idNinje = 1;
		this.name="";
		this.picPath="";
		this.tip=1; //Na osnovu ovog podatka prepoznaje se da li je ninja genin/jounin/kage
		this.taijutsu=0;
		this.ninjutsu=0;
		this.bukijutsu=0;
		this.element=0;
		this.genjutsu=0;
		this.stamina=0;
		this.baseTai=0;
		this.baseNin=0;
		this.baseBuki=0;
		this.baseEle=0;
		this.baseGen=0;
		this.baseStam=0;
		this.taijutsuGrowth=0;
		this.ninjutsuGrowth=0;
		this.bukijutsuGrowth=0;
		this.elementGrowth=0;
		this.genjutsuGrowth=0;
		this.staminaGrowth=0;
		this.attack=0;
		this.genjutsuActivation=0;
		this.genjutsuMastery=0;
		this.genjutsuRecharge=0;
		this.genjutsuAbsorb=0;
		this.genjutsuLearn=0;
		this.genjutsuCopy=0;
		this.bukijutsuRecovery=20;
		this.bukijutsuBoost=30;
		this.critChance=0;
		this.critStrike=25;
		this.reroll=0;
		this.focus=0;
		this.focusBurst=0;
		this.focusRange=0;
		this.endurance=0;
		this.fatigue=0;
		this.offPositioning=0;
		this.taijutsuImmunity=0;
		this.ninjutsuImmunity=0;
		this.bukijutsuImmunity=0;
		this.attackImmunity=0;
		this.genjutsuImmunity=0;
		this.poisonImmunity=0;
		this.poison=0;
		this.guard=0;
		this.absorb=0;
		this.lvl5Death=0;
		this.bloodlineNullify=0;
		this.morph=0;
		this.chakra=0;
		this.level=0;
		this.seal=0;
		this.restBuki=0;
		this.stanje=Stanja.clearNinja;
	}

	
	
	/**
	 * @return Ninja idNinje vrednost
	 */
	public int getIdNinje() {
		return idNinje;
	}



	/**
	 * @param set idNinje
	 */
	public void setIdNinje(int idNinje) {
		this.idNinje = idNinje;
	}



	/**
	 * @return Ninja abilities
	 */
	public ArrayList<Ability> getAbilities() {
		return abilities;
	}



	/**
	 * @param abilities the abilities to set
	 */
	public void setAbilities(ArrayList<Ability> abilities) {
		this.abilities = abilities;
	}

	/**
	 * @return Ninja stats klasa
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * @param stats the stats to set
	 */
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * @return Ninja PicPath string
	 */
	public String getPicPath() {
		return picPath;
	}

	/**
	 * @param picPath the picPath to set
	 */
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}

	/**
	 * @return Ninja ime string
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
	 * @return Ninja tip vrednost
	 */
	public double getTip() {
		return tip;
	}

	/**
	 * @param tip the tip to set
	 */
	public void setTip(double tip) {
		this.tip = tip;
	}

	/**
	 * @return Ninja taijutsu vrednost
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
	 * @return Ninja ninjutsu vrednost
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
	 * @return Ninja bukijutsu vrednost
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
	 * @return Ninja element vrednost
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
	 * @return Ninja genjutsu vrednost
	 */
	public double getGenjutsu() {
		return genjutsu;
	}

	/**
	 * @param genjutsu the genjutsu to set
	 */
	public void setGenjutsu(double genjutsu) {
		this.genjutsu = genjutsu;
	}

	/**
	 * @return Ninja stamina vrednost
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
	 * @return Ninja baseTai vrednost
	 */
	public double getBaseTai() {
		return baseTai;
	}



	/**
	 * @param baseTai the baseTai to set
	 */
	public void setBaseTai(double baseTai) {
		this.baseTai = baseTai;
	}



	/**
	 * @return Ninja baseNin vrednost
	 */
	public double getBaseNin() {
		return baseNin;
	}



	/**
	 * @param baseNin the baseNin to set
	 */
	public void setBaseNin(double baseNin) {
		this.baseNin = baseNin;
	}



	/**
	 * @return Ninja baseBuki vrednost
	 */
	public double getBaseBuki() {
		return baseBuki;
	}



	/**
	 * @param baseBuki the baseBuki to set
	 */
	public void setBaseBuki(double baseBuki) {
		this.baseBuki = baseBuki;
	}



	/**
	 * @return Ninja baseEle vrednost
	 */
	public double getBaseEle() {
		return baseEle;
	}



	/**
	 * @param baseEle the baseEle to set
	 */
	public void setBaseEle(double baseEle) {
		this.baseEle = baseEle;
	}



	/**
	 * @return Ninja baseGen vrednost
	 */
	public double getBaseGen() {
		return baseGen;
	}



	/**
	 * @param baseGen the baseGen to set
	 */
	public void setBaseGen(double baseGen) {
		this.baseGen = baseGen;
	}



	/**
	 * @return Ninja baseStam vrednost
	 */
	public double getBaseStam() {
		return baseStam;
	}



	/**
	 * @param baseStam the baseStam to set
	 */
	public void setBaseStam(double baseStam) {
		this.baseStam = baseStam;
	}



	/**
	 * @return Ninja taijutsuGrowth vrednost
	 */
	public double getTaijutsuGrowth() {
		return taijutsuGrowth;
	}

	/**
	 * @param taijutsuGrowth the taijutsuGrowth to set
	 */
	public void setTaijutsuGrowth(double taijutsuGrowth) {
		this.taijutsuGrowth = taijutsuGrowth;
	}

	/**
	 * @return Ninja ninjutsuGrowth vrednost
	 */
	public double getNinjutsuGrowth() {
		return ninjutsuGrowth;
	}

	/**
	 * @param ninjutsuGrowth the ninjutsuGrowth to set
	 */
	public void setNinjutsuGrowth(double ninjutsuGrowth) {
		this.ninjutsuGrowth = ninjutsuGrowth;
	}

	/**
	 * @return Ninja bukijutsuGrowth vrednost
	 */
	public double getBukijutsuGrowth() {
		return bukijutsuGrowth;
	}

	/**
	 * @param bukijutsuGrowth the bukijutsuGrowth to set
	 */
	public void setBukijutsuGrowth(double bukijutsuGrowth) {
		this.bukijutsuGrowth = bukijutsuGrowth;
	}

	/**
	 * @return Ninja elementGrowth vrednost
	 */
	public double getElementGrowth() {
		return elementGrowth;
	}

	/**
	 * @param elementGrowth the elementGrowth to set
	 */
	public void setElementGrowth(double elementGrowth) {
		this.elementGrowth = elementGrowth;
	}

	/**
	 * @return Ninja genjutsuGrowth vrednost
	 */
	public double getGenjutsuGrowth() {
		return genjutsuGrowth;
	}

	/**
	 * @param genjutsuGrowth the genjutsuGrowth to set
	 */
	public void setGenjutsuGrowth(double genjutsuGrowth) {
		this.genjutsuGrowth = genjutsuGrowth;
	}

	/**
	 * @return Ninja staminaGrowth vrednost
	 */
	public double getStaminaGrowth() {
		return staminaGrowth;
	}

	/**
	 * @param staminaGrowth the staminaGrowth to set
	 */
	public void setStaminaGrowth(double staminaGrowth) {
		this.staminaGrowth = staminaGrowth;
	}

	/**
	 * @return Ninja attack vrednost
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
	 * @return Ninja genjutsuActivation vrednost
	 */
	public double getGenjutsuActivation() {
		return genjutsuActivation;
	}

	/**
	 * @param genjutsuActivation the genjutsuActivation to set
	 */
	public void setGenjutsuActivation(double genjutsuActivation) {
		this.genjutsuActivation = genjutsuActivation;
	}

	/**
	 * @return Ninja genjutsuMastery vrednost
	 */
	public double getGenjutsuMastery() {
		return genjutsuMastery;
	}

	/**
	 * @param genjutsuMastery the genjutsuMastery to set
	 */
	public void setGenjutsuMastery(double genjutsuMastery) {
		this.genjutsuMastery = genjutsuMastery;
	}

	/**
	 * @return Ninja genjutsuRecharge vrednost
	 */
	public double getGenjutsuRecharge() {
		return genjutsuRecharge;
	}

	/**
	 * @param genjutsuRecharge the genjutsuRecharge to set
	 */
	public void setGenjutsuRecharge(double genjutsuRecharge) {
		this.genjutsuRecharge = genjutsuRecharge;
	}

	/**
	 * @return Ninja genjutsuAbsorb vrednost
	 */
	public double getGenjutsuAbsorb() {
		return genjutsuAbsorb;
	}

	/**
	 * @param genjutsuAbsorb the genjutsuAbsorb to set
	 */
	public void setGenjutsuAbsorb(double genjutsuAbsorb) {
		this.genjutsuAbsorb = genjutsuAbsorb;
	}

	/**
	 * @return Ninja genjutsuLearn vrednost
	 */
	public double getGenjutsuLearn() {
		return genjutsuLearn;
	}

	/**
	 * @param genjutsuLearn the genjutsuLearn to set
	 */
	public void setGenjutsuLearn(double genjutsuLearn) {
		this.genjutsuLearn = genjutsuLearn;
	}

	/**
	 * @return Ninja genjutsuCopy vrednost
	 */
	public double getGenjutsuCopy() {
		return genjutsuCopy;
	}

	/**
	 * @param genjutsuCopy the genjutsuCopy to set
	 */
	public void setGenjutsuCopy(double genjutsuCopy) {
		this.genjutsuCopy = genjutsuCopy;
	}

	/**
	 * @return Ninja bukijutsuRecovery vrednost
	 */
	public double getBukijutsuRecovery() {
		return bukijutsuRecovery;
	}

	/**
	 * @param bukijutsuRecovery the bukijutsuRecovery to set
	 */
	public void setBukijutsuRecovery(double bukijutsuRecovery) {
		this.bukijutsuRecovery = bukijutsuRecovery;
	}

	/**
	 * @return Ninja bukijutsuBoost vrednost
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
	 * @return Ninja critChance vrednost
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
	 * @return Ninja critStrike vrednost
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
	 * @return Ninja reroll vrednost
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
	 * @return Ninja focus vrednost
	 */
	public double getFocus() {
		return focus;
	}

	/**
	 * @param focus the focus to set
	 */
	public void setFocus(double focus) {
		this.focus = focus;
	}

	/**
	 * @return Ninja focusBurst vrednost
	 */
	public double getFocusBurst() {
		return focusBurst;
	}

	/**
	 * @param focusBurst the focusBurst to set
	 */
	public void setFocusBurst(double focusBurst) {
		this.focusBurst = focusBurst;
	}

	/**
	 * @return Ninja focusRange vrednost
	 */
	public double getFocusRange() {
		return focusRange;
	}

	/**
	 * @param focusRange the focusRange to set
	 */
	public void setFocusRange(double focusRange) {
		this.focusRange = focusRange;
	}

	/**
	 * @return Ninja endurance vrednost
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
	 * @return Ninja fatigue vrednost
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
	 * @return Ninja offPositioning vrednost
	 */
	public double getOffPositioning() {
		return offPositioning;
	}

	/**
	 * @param offPositioning the offPositioning to set
	 */
	public void setOffPositioning(double offPositioning) {
		this.offPositioning = offPositioning;
	}

	/**
	 * @return Ninja taijutsuImmunity vrednost
	 */
	public double getTaijutsuImmunity() {
		return taijutsuImmunity;
	}

	/**
	 * @param taijutsuImmunity the taijutsuImmunity to set
	 */
	public void setTaijutsuImmunity(double taijutsuImmunity) {
		this.taijutsuImmunity = taijutsuImmunity;
	}

	/**
	 * @return Ninja ninjutsuImmunity vrednost
	 */
	public double getNinjutsuImmunity() {
		return ninjutsuImmunity;
	}

	/**
	 * @param ninjutsuImmunity the ninjutsuImmunity to set
	 */
	public void setNinjutsuImmunity(double ninjutsuImmunity) {
		this.ninjutsuImmunity = ninjutsuImmunity;
	}

	/**
	 * @return Ninja bukijutsuImmunity vrednost
	 */
	public double getBukijutsuImmunity() {
		return bukijutsuImmunity;
	}

	/**
	 * @param bukijutsuImmunity the bukijutsuImmunity to set
	 */
	public void setBukijutsuImmunity(double bukijutsuImmunity) {
		this.bukijutsuImmunity = bukijutsuImmunity;
	}

	/**
	 * @return Ninja attackImmunity vrednost
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
	 * @return Ninja genjutsuImmunity vrednost
	 */
	public double getGenjutsuImmunity() {
		return genjutsuImmunity;
	}

	/**
	 * @param genjutsuImmunity the genjutsuImmunity to set
	 */
	public void setGenjutsuImmunity(double genjutsuImmunity) {
		this.genjutsuImmunity = genjutsuImmunity;
	}

	/**
	 * @return Ninja poisonImmunity vrednost
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
	 * @return Ninja poison vrednost
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
	 * @return Ninja guard vrednost
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
	 * @return Ninja absorb vrednost
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
	 * @return Ninja lvl5Death vrednost
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
	 * @return Ninja bloodlineNullify vrednost
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
	 * @return Ninja morph vrednost
	 */
	public double getMorph() {
		return morph;
	}

	/**
	 * @param morph the morph to set
	 */
	public void setMorph(double morph) {
		this.morph = morph;
	}

	/**
	 * @return Ninja chakra vrednost
	 */
	public double getChakra() {
		return chakra;
	}

	/**
	 * @param chakra the chakra to set
	 */
	public void setChakra(double chakra) {
		this.chakra = chakra;
	}
	
	/**
	 * @return Ninja level vrednost
	 */
	public double getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(double level) {
		this.level = level;
	}
	
	/**
	 * @param set current Ninja level -1
	 */
	public void setLevelMinus(double level) {
		if (this.level > 1) {
			this.level = level-1;
		} else this.level = 1;
		calculateLevelStats();
	}
	
	/**
	 * @param set current Ninja level +1
	 */
	public void setLevelPlus(double level) {
		this.level = level+1;
		calculateLevelStats();
	}
	
	/**
	 * @return Ninja seal vrednost
	 */
	public double getSeal() {
		return seal;
	}

	/**
	 * @param seal the seal to set
	 */
	public void setSeal(double seal) {
		this.seal = seal;
	}
	
	/**
	 * @return Ninja seal vrednost +1 if (seal < topLimit)
	 */
	public void setSealPlus (double seal) {
		if (this.seal < 10) {
			this.seal = seal+1;
		} else this.seal = seal;
	}

	/**
	 * @param Ninja seal vrednost -1 if (seal > bottomLimit)
	 */
	public void setSealMinus(double seal) {
		if (this.seal > -10) {
			this.seal = seal-1;
		} else this.seal = seal;
	}
	
	/**
	 * @return Ninja restBuki vrednost
	 */
	public double getRestBuki() {
		return restBuki;
	}

	/**
	 * @param restBuki the restBuki to set
	 */
	public void setRestBuki(double restBuki) {
		this.restBuki = restBuki;
	}

	/**
	 * @return Ninja stanje
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
	
	/**
	 * @param Ninja brisanje svih naknadno dodatih vrednosti
	 */
	public void ClearNinjaStats () {
		setStanje(Stanja.clearNinja);
		setTaijutsu(0);
		setNinjutsu(0);
		setBukijutsu(0);
		setElement(0);
		setGenjutsu(0);
		setStamina(0);
		setAttack(0);
		setGenjutsuActivation(0);
		setGenjutsuMastery(0);
		setGenjutsuRecharge(0);
		setGenjutsuAbsorb(0);
		setGenjutsuLearn(0);
		setGenjutsuCopy(0);
		setBukijutsuRecovery(20);
		setBukijutsuBoost(30);
		setCritChance(0);
		setCritStrike(25);
		setReroll(0);
		setFocus(0);
		setFocusBurst(0);
		setFocusRange(0);
		setEndurance(0);
		setFatigue(0);
		setOffPositioning(0);
		setTaijutsuImmunity(0);
		setNinjutsuImmunity(0);
		setBukijutsuImmunity(0);
		setAttackImmunity(0);
		setGenjutsuImmunity(0);
		setPoisonImmunity(0);
		setPoison(0);
		setGuard(0);
		setAbsorb(0);
		setLvl5Death(0);
		setBloodlineNullify(0);
		setMorph(0);
	}
	/**
	 * @return Ninja single dmg
	 */
	public double calculateDMG () {
		double dmg;
		dmg = taijutsuDMG() + ninjutsuDMG() + bukijutsuDMG() + this.attack;	
		return dmg;
	}
	
	/**
	 * @return Ninja taijutsu dmg
	 */
	public double taijutsuDMG () {
		double taiDmg = ((this.taijutsu+ifCrit())/2);
		return taiDmg;
	}
	
	/**
	 * @return Ninja taijutsu vrednost ukoliko se desi crit
	 */
	public double ifCrit () {
		int  n = rand.nextInt(100) + 1;
		if(n<=this.critChance) {
			return this.taijutsu*this.critStrike/100;
		} else return 0;
	}
	
	/**
	 * @return Ninja ninjutsu dmg
	 */
	public double ninjutsuDMG () {
		double seal = this.seal;
		int n1;
		
		int downLimit = (int) (((10+seal)*2.5)*this.ninjutsu/100);
		int upLimit = (int) ((100-((10+seal)*2.5))*this.ninjutsu/100);
		
		if (upLimit == downLimit) {
			n1=0;
		} else {
			n1 = rand.nextInt(upLimit-downLimit) + downLimit;
		}
		
		int roll = rand.nextInt(100) + 0;
		if(roll<=this.reroll) {
			int n2;
			if (upLimit == downLimit) {
				n2=0;
			} else {
				n2 = rand.nextInt(upLimit-downLimit) + downLimit;
			}
				if(n2>n1) {
					return n2;
				} else return n1;
		} else return n1;
	}
	
	/**
	 * @return Ninja bukijutsu dmg
	 */
	public double bukijutsuDMG () {
		double x = 0;
		double bukiDMG = this.bukijutsu*this.bukijutsuBoost/100;
		if (this.restBuki>bukiDMG) {
			x = this.restBuki - bukiDMG;
		} else if (this.restBuki<=bukiDMG) {
			bukiDMG = this.restBuki;
			x = bukiDMG - this.restBuki;
		} 
		double r = this.bukijutsuRecovery*bukiDMG/100;
		this.restBuki = x + r;
		if (this.restBuki>this.bukijutsu) {
			this.restBuki = this.bukijutsu;
		} 
		return bukiDMG;
	}
	
	/**
	 * @return Ninja total dmg vs Kaguya
	 */
	public double DMGvsKaguya () {
		this.restBuki = this.bukijutsu;
		double KaguyaDMG = Kaguya.KaguyaAttack();
		
		double pen; // promenljiva za racunanje vrednosti penalty-a napada
		double total = 0; // promenljiva za total dmg iz borbe
		double stamEff = 0; // promenljiva za racunjanje stamina efficiency-a
		double penBoost = 0; // promenljiva za skladistenje endurance boost-a za smanjivanje penalty-a
		double penBoost2 = 0; // promenljiva za racunanje endurance boost-a za smanjivanje penalty-a 
		int runda = 0; // promenljiva za racunanja broja runde
		double neededStamina = 0; // promeljiva za racunaje koliko stamina je potrebno za 100% efficiency
		
		neededStamina = this.level*2.5+60;
		stamEff = this.stamina*100/neededStamina;
		
		runda++; // 1
		double tempDMG = calculateDMG ();
		total += tempDMG;
		
		if (tempDMG>KaguyaDMG) {
			runda++; // 2
			
		} else return total;
		
		if (runda==2) {
			pen = (35+this.fatigue)*stamEff/100;
			pen += 60;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 4
			} else return total;
		} else return total;
		
		if (runda==3) {
			pen = (50+this.fatigue)*stamEff/100;
			pen += 30;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 4
			} else return total;
		} else return total;
		
		if (runda==4) {
			pen = (55+this.fatigue)*stamEff/100;
			pen += 10;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			if (tempDMG>KaguyaDMG) {
				runda++; // 5
			} else return total;
		} else return total;
		
		if (runda==5) {
			pen = (50+this.fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 6
			} else return total;
		} else return total;
		
		if (runda==6) {
			pen = (35+this.fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 7
			} else return total;
		} else return total;
		
		if (runda==7) {
			pen = (20+this.fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 7
			} else return total;
		} else return total;
		
		if (runda>7) {
			pen = (5+this.fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+this.endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			}
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 8
			} else return total;
		} else return total;
		
		return total;
	}
	/*
	 * racunanje dodatnih vrednosti u Ninja 
	 */
	public void dugmeCalculate () {
		
		ClearNinjaStats();
			
		this.taijutsu += stats.getT();
		this.ninjutsu += stats.getN();
		this.bukijutsu += stats.getB();
		this.stamina += stats.getS();
		this.element += stats.getE();
		this.genjutsu += stats.getG();
		this.reroll += stats.getR();
		this.critStrike += stats.getCs();
		this.bukijutsuRecovery += stats.getBr();
		
		for (Ability abil : this.abilities) {
			this.taijutsu += abil.getTaijutsu();	
			this.ninjutsu += abil.getNinjutsu();
			this.bukijutsu += abil.getBukijutsu();
			this.element += abil.getElement();
			this.stamina += abil.getStamina();
			this.genjutsu += abil.getGen();
			this.attack += abil.getAttack();
			this.bukijutsuRecovery += abil.getBukiRec();
			this.bukijutsuBoost += abil.getBukiBoost();
			this.critChance += abil.getCritChance();
			this.critStrike += abil.getCritStrike();
			this.reroll += abil.getReroll();
			this.endurance += abil.getEndurance();
			this.fatigue += abil.getFatigue();
			this.taijutsuImmunity += abil.getTaiImmunity();
			this.ninjutsuImmunity += abil.getNinImmunity();
			this.bukijutsuImmunity += abil.getBukiImmunity();
			this.attackImmunity += abil.getAttackImmunity();
			this.genjutsuImmunity += abil.getGenImmunity();
			this.poisonImmunity += abil.getPoisonImmunity();
			this.poison += abil.getPoison();
			this.guard += abil.getGuard();
			this.absorb += abil.getAbsorb();
			this.lvl5Death += abil.getLvl5Death();
			this.bloodlineNullify += abil.getBloodlineNullify();
			this.genjutsuActivation += abil.getGenAct();
			this.genjutsuMastery += abil.getGenMast();
			this.genjutsuRecharge += abil.getGenRec();
			this.genjutsuAbsorb += abil.getGenAbs();
			this.genjutsuLearn += abil.getGenLearn();
			this.genjutsuCopy += abil.getGenCopy();
		}	
		
		calculateLevelStats();
		calculateBaseStats();
		
	}
	
	/*
	 * racunanje dodatnih vrednosti na osnovu lvl od Ninja
	 */
	public void calculateLevelStats() {
		this.taijutsu += this.taijutsuGrowth * (this.level-1);
		this.ninjutsu += this.ninjutsuGrowth * (this.level-1);
		this.bukijutsu += this.bukijutsuGrowth * (this.level-1);
		this.element += this.elementGrowth * (this.level-1);
		this.genjutsu += this.genjutsuGrowth * (this.level-1);
		this.stamina += this.staminaGrowth * (this.level-1);
	}
	/*
	 * racunanje dodatnih vrednosti na osnovu baseStats od Ninja
	 */
	public void calculateBaseStats() {
		this.taijutsu += this.baseTai;
		this.ninjutsu += this.baseNin;
		this.bukijutsu += this.baseBuki;
		this.element += this.baseEle;
		this.genjutsu += this.baseGen;
		this.stamina += this.baseStam;
	}
	
}
