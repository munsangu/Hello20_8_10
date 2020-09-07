package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Select 
{
	public static void main(String[] args) throws Exception 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "select * from member where id = ? and pwd = ? ";
		Scanner sc = new Scanner(System.in);
		try
		{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		System.out.println("��ȸ�Ͻ� ID�� �Է�");
		pstmt.setString(1, sc.next());
		System.out.println("��ȸ�Ͻ� ��й�ȣ�� �Է�");
		pstmt.setString(2, sc.next());
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
