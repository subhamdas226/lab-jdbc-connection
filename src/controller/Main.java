package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, IOException, SQLException {
		
	// Fill your code
		Connection con = null;
		ConnectionManager cm = new ConnectionManager();
		con = cm.getConnection();
		
		if(con != null) {
			System.out.println("Connection is established");
		}
		else {
			System.out.println("Check your connection");
		}
	}
}
