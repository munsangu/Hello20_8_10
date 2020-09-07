package a20_9_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC_Update
{
	public static void main(String[] args) 
	{
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "system";
		String password = "123456";
		String sql = "update member set pwd = ? where id =?";
		Scanner sc = new Scanner(System.in);
		try 
		{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user,password);
			PreparedStatement pstmt = con.prepareStatement(sql);
			System.out.println("�ٲٰ����� ��й�ȣ�� ID �Է�");
			pstmt.setString(2, sc.next());
			System.out.println("�ٲ� ��й�ȣ �Է�");
			pstmt.setString(1, sc.next());
			int res = pstmt.executeUpdate();
			if(res==1)System.out.println("����");
			else System.out.println("����");
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
}
