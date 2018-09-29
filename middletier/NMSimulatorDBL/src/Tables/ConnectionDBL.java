package Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class ConnectionDBL {
	
	public static String query;
	public static Statement st;
	public static Connection conn;
	public static ResultSet rs;
	static int indeks = 0;
	
	static ArrayList<String> ListaPathsImages = new ArrayList<String>(263);

	public static void Connect () {
		try
		{
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3307/nmsimulatortest";
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");
	  
			// our SQL SELECT query. 
			// if you only need a few columns, specify them by name instead of using "*"
			query = "SELECT * FROM nindza";
			
			// create the java statement
			st = conn.createStatement();
			
			// execute the query, and get a java resultset
			rs = st.executeQuery(query);
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
	
	public static void ConnectNapadi () {
		try
		{
			// create our mysql database connection
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3307/nmsimulatortest";
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");
	  
			// our SQL SELECT query. 
			// if you only need a few columns, specify them by name instead of using "*"
			query = "SELECT * FROM napadi";
			
			// create the java statement
			st = conn.createStatement();
			
			// execute the query, and get a java resultset
			rs = st.executeQuery(query);
			
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
	
	public static void Disconnect () throws SQLException {
		st.close();
	}
}
