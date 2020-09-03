package a20_9_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBTest3 
{
	public static void main(String[] args) throws Exception 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "update member set pwd='999' where code = '1001'";
		Connection con = null;
		Statement stmt = null;;
		try 
		{
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,password);
		stmt = con.createStatement();
		stmt.executeUpdate(sql);
		int re = stmt.executeUpdate(sql);
		if(re==1) {System.out.println("성공");}
		else if(re==0){System.out.println("없음");}
		else {System.out.println("실패");}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			con.close();
		}		
	}
}
