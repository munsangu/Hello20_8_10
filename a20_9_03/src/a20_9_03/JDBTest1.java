package a20_9_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBTest1 
{
	public static void main(String[] args) throws Exception
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "select * from member";
		Class.forName(driver);													//	1 �ܰ�: DB ����̹� ������ �ε�
		Connection con = DriverManager.getConnection(url,user,password);		//  2 �ܰ�: Oracle ����
		Statement stmt = con.createStatement();									//  3 �ܰ�: �� ����ڽ� ����
		ResultSet rs = stmt.executeQuery(sql);								    //  4 �ܰ�: �� ����ڽ� �ӿ� SQL�� �ְ� ����	
		while(rs.next())
		{
		System.out.print(rs.getString(1)+"\t");
		System.out.print(rs.getString(2)+"\t");
		System.out.print(rs.getString(3)+"\t");
		System.out.print(rs.getString(4)+"\t");
		System.out.println(rs.getInt(5));
		}
	}
}
