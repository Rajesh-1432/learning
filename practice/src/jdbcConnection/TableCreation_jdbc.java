package jdbcConnection;
import java.sql.*;
public class TableCreation_jdbc {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Rajmca");
			String vasl="create table emp(eid number, ename varchar2(30),esal number)";
			Statement st=con.createStatement();
			
			int n1=st.executeUpdate(vasl);
			if(n1!=-1) {
				System.out.println("Table is Created");
			}
			else {
				System.out.println("Something went Wrong");
			}
			
		} catch (Exception e) {
		
		}

	}

}
