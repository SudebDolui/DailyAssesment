package com.jdbc_Demo;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Loading JDBC Driver into memory
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Creating Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/samplejdbc", "root",
					"SudebLaltu6@");
			// here sampledb is database name, root is username and password
			Statement stmt = con.createStatement();
			DatabaseMetaData dm = con.getMetaData();
			System.out.println(dm);
			// SQL statement execution
			boolean status = stmt.execute("create database samplejdbc;");
			String str = "SELECT * FROM Authors";
		    ResultSet rs = stmt.executeQuery(str);
			ResultSet resultset = stmt.executeQuery("select * from person;");
			while (resultset.next()) {
				System.out.println(resultset.getString("pname"));
			}

			System.out.println("Query has been executes Successfully");
			stmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erroe: " + e);
		}
	}

}
