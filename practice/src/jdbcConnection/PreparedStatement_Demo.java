package jdbcConnection;
import java.sql.*;

import oracle.jdbc.pool.OracleDataSource;
public class PreparedStatement_Demo{
//insert
	public static void main(String[] args) {
	try {
		OracleDataSource ods=new OracleDataSource();
		ods.setDriverType("oracle.jdbc.driver.oracleDriver");
		ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		ods.setUser("System");
		ods.setPassword("Rajmca");
		Connection con=ods.getConnection();
//		String vsql="Insert into emp values(?,?,?)";
//		PreparedStatement pst=con.prepareStatement(vsql);
//		pst.setInt(1,115);
//		pst.setString(2,"Rajesh");
//		pst.setDouble(3, 180000);
//		String usql="update emp set ename=?, esal=? where eid=?";
//				PreparedStatement pst=con.prepareStatement(usql);
//				pst.setString(1,"Satya");
//				pst.setDouble(2,200000);
//				pst.setInt(3,101);
//		
		String dsql="Delete from emp where eid=?";
		PreparedStatement pst=con.prepareStatement(dsql);
		pst.setInt(1,115);
		int n1=pst.executeUpdate();
		if(n1!=-1) {
			System.out.println("Excuted Succesfully");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}	

	}

}
