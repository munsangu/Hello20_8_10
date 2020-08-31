package a20_7_23;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class keyboardTest2 
{
	public static void main(String[] args) throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		System.out.println("글씨를 입력하면 따라합니다.");
		String str = in.readLine();	
		System.out.println(str);
		System.out.println("=============================");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(name);
	}
}