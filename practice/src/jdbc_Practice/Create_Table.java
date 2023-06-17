package jdbc_Practice;
import java.sql.*;
public class Create_Table {
	public static void main(String[] args) {
		try {
		Driver d=new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Rajmca");
			String A="Create Table Student(Sid int ,Sname varchar(20),Sage int)";
			String B="Insert into Student values(10,'Rajesh',23)";
			Statement st=con.createStatement();
			int n1=st.executeUpdate(A);
			int n2=st.executeUpdate(B);
			if(n1!=-1 && n2!=-1) {
				System.out.println("Excuted Successfully");
			}
			else {
				System.out.println("Somthing Went wrong");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
