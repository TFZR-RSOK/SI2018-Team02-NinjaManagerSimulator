package Tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * @author Nikola Corkovic - cnik996@gmail.com
 * @version beta 1.0 
 */

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
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/nmsimulatortest";
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");
			query = "SELECT * FROM nindza";
			st = conn.createStatement();
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
			String myDriver = "org.gjt.mm.mysql.Driver";
			String myUrl = "jdbc:mysql://localhost:3306/nmsimulatortest";
			Class.forName(myDriver);
			conn = DriverManager.getConnection(myUrl, "root", "");
			query = "SELECT * FROM napadi";
			st = conn.createStatement();
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
