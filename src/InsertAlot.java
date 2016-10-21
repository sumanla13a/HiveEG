import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertAlot {
	public static void insertLogs() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
	}
}
