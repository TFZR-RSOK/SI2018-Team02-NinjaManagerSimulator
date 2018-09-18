package Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import classes.Ninja;

public class NinjaDBL {

	static int indeksNinje = 1;
	
	static String imeNinje = "Menma";
	static int chakraNinje = 18;
	
	public static void pullNinja () {
		try
			{
				// create our mysql database connection
				String myDriver = "org.gjt.mm.mysql.Driver";
				String myUrl = "jdbc:mysql://localhost:3307/nmsimulatortest";
				Class.forName(myDriver);
				Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      
				// our SQL SELECT query. 
				// if you only need a few columns, specify them by name instead of using "*"
				String query = "SELECT * FROM nindza";
				
				// create the java statement
				Statement st = conn.createStatement();
				
				// execute the query, and get a java resultset
				ResultSet rs = st.executeQuery(query);
				
				// iterate through the java resultset
				while (rs.next())
				{
					if (rs.getString("ImeNinje").matches(imeNinje) && (rs.getInt(3) == chakraNinje)) {
						indeksNinje = rs.getInt(1);
						TestMain.fight.getTeam().get_ninjas().get(0).setTaijutsu(rs.getDouble(5));
						TestMain.fight.getTeam().get_ninjas().get(1).setTaijutsu(20);
					}
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
