
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateDBAndTables {
	public static void createDB() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS HiveDemo");
		DBConnection.closeConnection(con);
		System.out.println("Database userdb created successfully.");
	}
	
	public static void createTable() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		stmt.executeQuery("CREATE TABLE IF NOT EXISTS HiveDemoTable (id int, Date entryDate, Varchar logInfo) "
					+ " comment 'Hive Demo'"
					+ "ROW FORMAT DELIMITED"
					+ "FIELDS TERMINATED BY '\t'"
					+ "LINES TERMINATED BY '\n'"
					+ "STORED AS TEXTFILE;");
		DBConnection.closeConnection(con);
		System.out.println("Table userdb created successfully.");
	}
	
}
