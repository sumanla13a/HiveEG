package com.suman.bd.main;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.suman.bd.db.DBConnection;

public class ReadAll {
	// Reads all changes in the software system where
	public static void readAll() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		String query = "Select * from hivedemotable where entryDate like 'Aug 10%'";
		ResultSet set = stmt.executeQuery(query);
		while(set.next()) {
			System.out.println(set.getString(1));
			System.out.println(set.getString(2));
			System.out.println("\t");
		}
		con.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ReadAll.readAll();
	}
}
