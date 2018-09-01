package classes;

public class Fight {
	
	protected Object Team, Kaguya;
	
	public Fight () {
		this.Team = new Team();
		this.Kaguya = new Kaguya();
	}

	/**
	 * @return the team
	 */
	public Object getTeam() {
		return Team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(Object team) {
		Team = team;
	}

	/**
	 * @return the kaguya
	 */
	public Object getKaguya() {
		return Kaguya;
	}

	/**
	 * @param kaguya the kaguya to set
	 */
	public void setKaguya(Object kaguya) {
		Kaguya = kaguya;
	}
	/*
	public double calcTotalDmg() {

	}
	*/
}
