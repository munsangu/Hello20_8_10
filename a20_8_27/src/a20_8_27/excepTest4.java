package a20_8_27;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class excepTest4 
{
	public static void main(String[] args) throws IOException
	{
		// 콘솔로 문자열을 입력받는 방법(버퍼)
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String name = br.readLine();
		System.out.println("당신의 이름은 "+name);
		
		// 콘솔로 문자열을 입력받는 방법2(스캐너)
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(str);
		
	}
}
