package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Select2 
{

	public static void main(String[] args) 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		// String sql = "select * from member where name like '%ȫ%';
		String sql = "select * from member where name like '%";
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� �̸��� �ܾ �Է��Ͻÿ�.");
		String temp = sc.next();
		sql = sql+temp+"%'";
		try
		{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
			{
			System.out.print(rs.getString(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.println(rs.getInt(5)+" ");
			}		
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
