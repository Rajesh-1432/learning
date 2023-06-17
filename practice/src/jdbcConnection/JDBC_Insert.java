package jdbcConnection;
import java.sql.*;
public class JDBC_Insert {

	public static void main(String[] args) {
		try {
			Driver d=new oracle.jdbc.driver.OracleDriver();
			DriverManager.registerDriver(d);
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Rajmca");
//			String vsql="Insert into emp values(101,'rajesh',100000)";
			//String vsql="update  emp set ename='Satya',esal=200000 where eid=101";
			String vsql="delete from emp where eid=102 ";
			Statement st=con.createStatement();
			int n1=st.executeUpdate(vsql);
			if (n1!=-1) {
				System.out.println("command excuted Succesfully::"+n1);
			} else {
				System.out.println("Somthing Went wrong");
			}
		} catch (Exception e) {
			
		}

	}

}
