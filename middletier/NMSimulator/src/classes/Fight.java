package classes;

import java.io.Serializable;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

public class Fight implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Team Team;
	Kaguya Kaguya;
	
	public Fight () {
		this.Team = new Team();
		this.Kaguya = new Kaguya();
	}

	/**
	 * @return the team
	 */
	public Team getTeam() {
		return Team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Team team) {
		Team = team;
	}

	/**
	 * @return the kaguya
	 */
	public Kaguya getKaguya() {
		return Kaguya;
	}

	/**
	 * @param kaguya the kaguya to set
	 */
	public void setKaguya(Kaguya kaguya) {
		Kaguya = kaguya;
	}

	public double fightSimulation () {
		double countProcentage = 0;
		
		for (int i = 0; i<100000; i++) {
			double DMG = Team.fightSimNinja();
			if (DMG>Kaguya.getHealth()) {
				countProcentage++;
			}
		}
		
		return countProcentage/1000;
	}
	
	
}
