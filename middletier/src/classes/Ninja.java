package classes;
import enums.Stanja;
import interfaces.IBasicOperations;

import java.sql.*;
import java.util.Random;

public class Ninja implements IBasicOperations { //Problem sa koriscenjem metode iz druge klase, trazi da klasa Ninja bude abstraktna zajedno sa klasom iz koje se poziva metoda

	protected String name, tip;
	protected double taijutsu, ninjutsu, bukijutsu, element, genjutsu, stamina, //Base stats
						taijutsuGrowth, ninjutsuGrowth, bukijutsuGrowth, elementGrowth, genjutsuGrowth, staminaGrowth; //Base stats growth
	protected double attack, genjutsuActivation, genjutsuMastery, genjutsuRecharge, genjutsuAbsorb, genjutsuLearn, genjutsuCopy, //Rest of the stats
						bukijutsuRecovery, bukijutsuBoost, critChance, critStrike, reroll, focus, focusBurst, focusRange, 
						endurance, fatigue, offPositioning, taijutsuImmunity, ninjutsuImmunity, bukijutsuImmunity, attackImmunity,
						genjutsuImmunity, poisonImmunity, poison, guard, absorb, lvl5Death, bloodlineNullify, morph, chakra, level, seal,
						restBuki;

	protected Stanja stanje;

	Random rand;
	Kaguya Kaguya;
	
	/**
	 * Constructor for Ninja class
	 */
	public Ninja () {
		this.rand = new Random();
		this.Kaguya = new Kaguya();
		this.name="";
		this.tip="";
		this.taijutsu=0;
		this.ninjutsu=0;
		this.bukijutsu=0;
		this.element=0;
		this.genjutsu=0;
		this.stamina=0;
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
	 * @return the tip
	 */
	public String getTip() {
		return tip;
	}

	/**
	 * @param tip the tip to set
	 */
	public void setTip(String tip) {
		this.tip = tip;
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
	 * @return the genjutsu
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
	 * @return the taijutsuGrowth
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
	 * @return the ninjutsuGrowth
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
	 * @return the bukijutsuGrowth
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
	 * @return the elementGrowth
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
	 * @return the genjutsuGrowth
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
	 * @return the staminaGrowth
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
	 * @return the genjutsuActivation
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
	 * @return the genjutsuMastery
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
	 * @return the genjutsuRecharge
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
	 * @return the genjutsuAbsorb
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
	 * @return the genjutsuLearn
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
	 * @return the genjutsuCopy
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
	 * @return the bukijutsuRecovery
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
	 * @return the focus
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
	 * @return the focusBurst
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
	 * @return the focusRange
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
	 * @return the offPositioning
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
	 * @return the taijutsuImmunity
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
	 * @return the ninjutsuImmunity
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
	 * @return the bukijutsuImmunity
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
	 * @return the genjutsuImmunity
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
	 * @return the morph
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
	 * @return the chakra
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
	 * @return the level
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
	 * @return the seal
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
	 * @return the restBuki
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
	
	public void ClearNinjaStats () {
		setStanje(Stanja.clearNinja);
		setName("");
		setTip("");
		setTaijutsu(0);
		setNinjutsu(0);
		setBukijutsu(0);
		setElement(0);
		setGenjutsu(0);
		setStamina(0);
		setTaijutsuGrowth(0);
		setNinjutsuGrowth(0);
		setBukijutsuGrowth(0);
		setElementGrowth(0);
		setGenjutsuGrowth(0);
		setStaminaGrowth(0);
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
		setChakra(0);
		setLevel(0);
		setSeal(0);
		setRestBuki(0);
	}
	
	public double calculateDMG () {
		int runda = 0;
		double dmg;
		dmg = taijutsuDMG() + ninjutsuDMG() + bukijutsuDMG() + this.attack;	
		return dmg;
	}
	
	public double taijutsuDMG () {
		double taiDmg = ((this.taijutsu+ifCrit())/2);
		return taiDmg;
	}
	
	public double ifCrit () {
		int  n = rand.nextInt(100) + 1;
		if(n<=this.critChance) {
			return this.taijutsu*this.critStrike/100;
		} else return 0;
	}
	
	public double ninjutsuDMG () {
		double seal = this.seal;
		double upLimit = 0;
		double downLimit = 0;
		
		downLimit = ((10+seal)*2.5)*this.ninjutsu; //pitati Peceva da li je ovo ok ili ne treba da se koriste int up/down primenljive!?!?!?
		upLimit = (100-(10+seal)*2.5)*this.ninjutsu;
		
		int down = (int) downLimit;
		int up = (int) upLimit;
		
		int n1 = rand.nextInt(up) + down;
		int roll = rand.nextInt(100) + 1;
		if(roll<=this.reroll) {
			int n2 = rand.nextInt(up) + down;
				if(n2>n1) {
					return n2;
				} else return n1;
		} else return n1;
	}
	
	public double bukijutsuDMG () { //Potrebno je testirati ovo ponovo ! Cisto da budem siguran :D
		double x = 0;
		double bukiDMG = this.bukijutsu*this.bukijutsuBoost/100;
		if (this.restBuki>bukiDMG) {
			x = this.restBuki - bukiDMG;
		} else if (this.restBuki<=bukiDMG) {
			bukiDMG = this.restBuki;
			x = bukiDMG - this.restBuki;
		} 
		double r = this.bukijutsuRecovery*this.bukijutsu/100;
		this.restBuki = x + r;
		if (this.restBuki>this.bukijutsu) {
			this.restBuki = this.bukijutsu;
		} 
		return bukiDMG;
	}
	
	public double DMGvsKaguya () {
		this.restBuki = this.bukijutsu;
		double KaguyaDMG = Kaguya.KaguyaAttack();;
		double fatigue = this.fatigue;
		double stamina = this.stamina;
		double endurance = this.endurance;
		double level = this.level;
		
		double pen; // promenljiva za racunanje vrednosti penalty-a napada
		double total = 0; // promenljiva za total dmg iz borbe
		double stamEff = 0; // promenljiva za racunjanje stamina efficiency-a
		double penBoost = 0; // promenljiva za skladistenje endurance boost-a za smanjivanje penalty-a
		double penBoost2 = 0; // promenljiva za racunanje endurance boost-a za smanjivanje penalty-a 
		int runda = 0; // promenljiva za racunanja broja runde
		double neededStamina = 0; // promeljiva za racunaje koliko stamina je potrebno za 100% efficiency
		
		neededStamina = level*2.5+60;
		stamEff = stamina*100/neededStamina;
		
		runda++; // 1
		double tempDMG = calculateDMG ();
		total += tempDMG;
		
		if (tempDMG>KaguyaDMG) {
			runda++; // 2
			
		} else return total;
		
		if (runda==2) {
			pen = (35+fatigue)*stamEff/100;
			pen += 60;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
			penBoost = penBoost - penBoost2;
			pen += penBoost;
			if (pen>=100) {
				pen = 100;
			} 
			tempDMG = calculateDMG();
			tempDMG=tempDMG*pen/100;
			total+=tempDMG;
			
			if (tempDMG>KaguyaDMG) {
				runda++; // 3
			} else return total;
		} else return total;
		
		if (runda==3) {
			pen = (50+fatigue)*stamEff/100;
			pen += 30;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
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
			pen = (55+fatigue)*stamEff/100;
			pen += 10;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
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
			pen = (50+fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
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
			pen = (35+fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
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
			pen = (20+fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
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
			pen = (5+fatigue)*stamEff/100;
			penBoost = 100 - pen;
			penBoost2 = penBoost*200/(200+endurance);
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
	
	
	// FUNKCIJA ZA POVLACENJE IZ BAZE!!! 
	// Potencijalno bespotrebno :3
	public void pullPodataka () {
		try
		{
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost/test";
			Class.forName(myDriver);
			Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
			// our SQL SELECT query. 
			// if you only need a few columns, specify them by name instead of using "*"
			String query = "SELECT * FROM genin";
			
			// create the java statement
			Statement st = conn.createStatement();
			
			// execute the query, and get a java resultset
			ResultSet rs = st.executeQuery(query);
			
			// iterate through the java resultset
			while (rs.next())
			{
				int id = rs.getInt("id"); //OVO TI NI NE TREBA U SUSTINI
				this.name = rs.getString("ImeNinje");
				this.tip = rs.getString(""); //STEFAN NEMA U BAZI OZNAKU ILI JA NE ZNA KAKO DA POVUCEM!
				this.taijutsu = rs.getDouble("Taijutsu");
				this.ninjutsu = rs.getDouble("Ninjutsu");
				this.bukijutsu = rs.getDouble("Bukijutsu");
				this.element = rs.getDouble("Element");
				this.genjutsu = rs.getDouble("Genjutsu");
				this.stamina = rs.getDouble("Stamina");
				this.taijutsuGrowth = rs.getDouble("TaijutsuGrow");
				this.ninjutsuGrowth = rs.getDouble("NinjutsuGrow");
				this.bukijutsuGrowth = rs.getDouble("BukijutsuGrow");
				this.elementGrowth = rs.getDouble("ElementGrow");
				this.genjutsuGrowth = rs.getDouble("GenjutsuGrow");
				this.staminaGrowth = rs.getDouble("StaminaGrow");
				
			}
			st.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
    	}
	}
}
