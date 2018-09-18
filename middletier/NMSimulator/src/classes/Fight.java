package classes;

public class Fight {
	
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

	public int fightSimulation () {
		int countProcentage = 0;
		
		for (int i = 0; i<100; i++) {
			double DMG = Team.fightSimNinja();
			if (DMG>Kaguya.getHealth()) {
				countProcentage++;
			}
		}
		
		return countProcentage;
	}
	
	
}
