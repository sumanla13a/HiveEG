package com.suman.bd.main;

import java.sql.*;

import com.suman.bd.db.DBConnection;

public class DropTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		Statement stmt = con.createStatement();
		String query = "Drop table hivedemotable";
		stmt.execute(query);
		con.close();
	}
}
