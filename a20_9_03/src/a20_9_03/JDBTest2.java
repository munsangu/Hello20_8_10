package a20_9_03;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBTest2 
{
	public static void main(String[] args) throws Exception
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "insert into member(code, name, id, pwd) values('1005','±è±è±è','choi','choi')";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);
		int re = stmt.executeUpdate(sql);	// insert, update, delete
		if(re==1) 
		{
			System.out.println("¼º°ø");
		}
		else
		{
			System.out.println("½ÇÆÐ");
		}				
	}
}
