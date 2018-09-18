package Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NapadiDBL {

	public static void pullNapadi () {
		try
			{
				// create our mysql database connection
				String myDriver = "org.gjt.mm.mysql.Driver";
				String myUrl = "jdbc:mysql://localhost:3307/nmsimulatortest";
				Class.forName(myDriver);
				Connection conn = DriverManager.getConnection(myUrl, "root", "");
	      
				// our SQL SELECT query. 
				// if you only need a few columns, specify them by name instead of using "*"
				String query = "SELECT * FROM napadi";
				
				// create the java statement
				Statement st = conn.createStatement();
				
				// execute the query, and get a java resultset
				ResultSet rs = st.executeQuery(query);
				
				// iterate through the java resultset
				while (rs.next())
				{
					if (NinjaDBL.indeksNinje == rs.getInt(34)) {
						System.out.println(rs.getString("ImeNapada"));
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
