package a20_9_08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class exJDBC_Select 
{
	public static void main(String[] args) 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "select * from member";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
		Class.forName(driver);
		con = DriverManager.getConnection(url, user, password);
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = stmt.executeQuery(sql);
//		rs.last();					// last() 마지막으로 이동 -> 확장된 명령 추가 필요(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)
		rs.absolute(2);
		while(rs.previous())		// previous() 이전으로 이동 -> 확장된 명령 추가 필요
			{
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.print(rs.getString(4)+"\t");
			System.out.println(rs.getInt(5));
			}
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
