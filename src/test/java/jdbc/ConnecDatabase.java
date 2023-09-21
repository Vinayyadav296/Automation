package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnecDatabase {
	
	public static void main(String[] args) throws SQLException {
		
		//Connecting to mysql database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/qafox","root", "Vinay@7678");
		
		//checking wheather we are connected to the database or not
		if(!connection.isClosed()) {
			System.out.println("We have successfully connected to database");
		}
		
		//Getting the data from employee table of the qafox database
		
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from employee where name=\"Tharun\";");
		
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("id"));
			System.out.println(resultSet.getString("name"));
			System.out.println(resultSet.getString("location"));
			System.out.println(resultSet.getInt("experience"));
			
		}
	}

}
