package a20_7_21;
import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) 
	{
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3;
		str3 = str1+str2;
		System.out.println(str3.length());
		System.out.println(str3.replace('H','h'));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3);
		System.out.println(str3.charAt(0));
		System.out.println(str3.charAt(2));
		str3 = str3.concat("   ");
		System.out.println(str3.length()); //13
		str3 = str3.trim(); // trim() - 공백제거
		System.out.println(str3.length());
		System.out.println(str3.substring(2)); //str3.substring(n) n번째부터 끝까지 출력
		System.out.println(str3.substring(2, 3)); //str3.substring(n,m) n번째부터 m번째까지 출력
		System.out.println("========================================");
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호등록:");
		jumin=sc.next();
		System.out.println(jumin.substring(7,8));
		System.out.println(jumin.charAt(7));
		char man = jumin.charAt(7);
		switch(man) 
		{
		case '1':
		case '3':System.out.println("Man");
		break;
		case '2':
		case '4':System.out.println("Woman");
		break;
		}
	}
}
