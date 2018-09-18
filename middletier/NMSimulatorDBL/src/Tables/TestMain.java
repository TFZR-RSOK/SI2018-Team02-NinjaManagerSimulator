package Tables;

import classes.*;

public class TestMain {
	
	static Fight fight;
	
	public static void main(String[] args) {
		
		fight = new Fight();
		NinjaDBL.pullNinja();
		NapadiDBL.pullNapadi();
		System.out.println(TestMain.fight.getTeam().get_ninjas().get(0).getTaijutsu());
		System.out.println(TestMain.fight.getTeam().get_ninjas().get(0).getTaijutsu());
		System.out.println(TestMain.fight.getTeam().get_ninjas().get(2).getNinjutsu());
		System.out.println(TestMain.fight.getTeam().get_ninjas().size());
		
		/*try
				{
					// create our mysql database connection
					String myDriver = "org.gjt.mm.mysql.Driver";
					String myUrl = "jdbc:mysql://localhost:3307/nmsimulatortest";
					Class.forName(myDriver);
					Connection conn = DriverManager.getConnection(myUrl, "root", "");
		      
					// our SQL SELECT query. 
					// if you only need a few columns, specify them by name instead of using "*"
					String query = "SELECT * FROM nindza";
					String query2 = "SELECT * FROM napadi";
					
					// create the java statement
					Statement st = conn.createStatement();
					Statement st2 = conn.createStatement();
					
					// execute the query, and get a java resultset
					ResultSet rs = st.executeQuery(query);
					ResultSet rs2 = st2.executeQuery(query2);
					
					// iterate through the java resultset
					while (rs.next())
					{
						//String name = rs.getString("ImeNinje");
						if (rs.getString("ImeNinje").matches("Menma") && (rs.getInt(3) == 18)) {
						//String name = rs.getString("ImeNinje");
							int indeks = NinjaDBL.nestoNovo;
							System.out.println(indeks);
							System.out.println(rs.getString("ImeNinje"));
							while (rs2.next())
							{
								if (indeks == rs2.getInt(34)) {
									System.out.println(rs2.getString("ImeNapada"));
								}
							}
							st2.close();
						}
					}
					st.close();
				}
				catch (Exception e)
				{
					System.err.println("Got an exception! ");
					System.err.println(e.getMessage());
		    	}
		*/

	}

}
