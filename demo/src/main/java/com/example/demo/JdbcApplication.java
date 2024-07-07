package com.example.demo;
import java.sql.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class JdbcApplication {

	public static void main(String[] args) throws ClassNotFoundException {

/* Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "username", "password");
		String url = "jdbc:mysql://localhost:3306/Students";
		String username = "root";
		String password = "manish.@9";
		String query = "DELETE FROM stud where id=4;";

//		String query = "INSERT INTO stud(id,name,course,salary)VALUES(4,'ram','bba',2500.0);";

		// to retrive"select * from stud;";
		try {
			// Load MySQL JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded successfully");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());

		}
		try {

			// Establish connection to the database
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			Statement smt = connection.createStatement();


int rowsaffected=smt.executeUpdate(query);

if (rowsaffected>0){
	System.out.println("successful"+ rowsaffected +"rows affected");
}else {
	System.out.println("failed");
}
 to retrive data
ResultSet rs= smt.executeQuery(query);
while (rs.next()){
	int id=rs.getInt("id");
	String name=rs.getString("name");
	String course=rs.getString("course");
	double salary=rs.getDouble("salary");
	System.out.println();
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("course:"+course);
	System.out.println("salary:"+salary);



			smt.close();
			connection.close();


} catch (SQLException e){
	System.out.println(e.getMessage());
}

	}
	*/
String url="jdbc:mysql://localhost:3306/speed";
String username="root";
String password="manish.@9";

		String query="update youtube\n"+
				"SET salary=70000\n"+
				"where id =2;";
	try {
Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("loaded successfully");
	}catch (ClassNotFoundException e){
		System.out.println(e.getMessage());
	}
	try {
		Connection conn=DriverManager.getConnection(url,username,password);
		System.out.println("database connected success");
		Statement st=conn.createStatement();
int rowsaffected=st.executeUpdate(query);
if (rowsaffected<0){
	System.out.println("not affected");
}else {
	System.out.println(" affected");
}



	}catch (SQLException e){
		System.out.println(e.getMessage());
	}












	}
}
