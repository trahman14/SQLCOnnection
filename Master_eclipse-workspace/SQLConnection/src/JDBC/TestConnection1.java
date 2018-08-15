package JDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestConnection1 {


String ServerName = "jdbc.sqlserver://DESKTOPMSEDGEWIN10/SQLEXPRESS"; 	
String Login      = "sa";
String Password   = "1234"; 
String DataBase   = "SuperTech"; 
String ConnectionUrl = ServerName+Login+Password; 



@BeforeTest
public void ServerConncetion() throws ClassNotFoundException {
	
	
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Driver connection with SQL server 
	
	
	JOptionPane.showMessageDialog(null, "Connected To SQL Server");
	
}

@Test
public void dataRetieveFromEmplyeeDable() throws SQLException {
	
	String mssqlstmt  = "select EMPLOYEE_ID, FIRST_NAME, LAST_NAME from Employee";
	
	Connection con = DriverManager.getConnection(ConnectionUrl); 
	
	Statement stm =con.createStatement(); 
	
	ResultSet rs =stm.executeQuery(mssqlstmt); 
	
}
	
}
