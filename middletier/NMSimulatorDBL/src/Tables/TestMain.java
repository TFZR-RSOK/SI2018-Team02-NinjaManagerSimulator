package Tables;

import java.sql.SQLException;

import classes.*;

public class TestMain {
	
	static Fight fight;
	
	public static void main(String[] args) throws SQLException {
		fight = new Fight();
		ConnectionDBL.Connect();
		NinjaDBL.pullNinjaV2(0, "Naruto");
		System.out.println("-----------------");
		System.out.println(fight.getTeam().get_ninjas().get(0).getName());
		System.out.println(fight.getTeam().get_ninjas().get(0).getTaijutsu());
		System.out.println(fight.getTeam().get_ninjas().get(0).getTaijutsuGrowth());
		ConnectionDBL.Disconnect();
		System.out.println(NinjaDBL.duzinaListeImena);
	}

}
