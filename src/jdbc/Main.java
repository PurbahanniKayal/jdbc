package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
	
	System.out.println("Connection created");
	Statement mystate=(Statement)mycon.createStatement();
	ResultSet rs=mystate.executeQuery("Select*from employee");
	while(rs.next())
	{
		Sytem.out.println=(rs.getArray(null)t)
	}
}
	}
catch(Exception e)
{
e.printStackTrace();	
}

}
