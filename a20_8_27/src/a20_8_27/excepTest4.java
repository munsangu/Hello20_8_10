package a20_8_27;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class excepTest4 
{
	public static void main(String[] args) throws IOException
	{
		// �ַܼ� ���ڿ��� �Է¹޴� ���(����)
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String name = br.readLine();
		System.out.println("����� �̸��� "+name);
		
		// �ַܼ� ���ڿ��� �Է¹޴� ���2(��ĳ��)
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);
		
	}
}
