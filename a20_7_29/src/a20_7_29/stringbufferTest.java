package a20_7_29;
import java.util.Scanner;

public class stringbufferTest 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		Scanner sc = new Scanner(System.in);
		String name;
		for(int i=0;i<3;i++)
		{		
			name  = sc.next();      // next()	-> 다음 것 읽기
			sb.append(name);		// append() -> 추가
		}
		System.out.println(sb);
		sb.append('r');
		sb.append(10.5);
		sb.append("KOREA");
		sb.append(90);
		System.out.println(sb);
		sb.insert(9, ",ccc");
		System.out.println(sb);
		sb.reverse();               // 거꾸로 문자열 저장
		System.out.println(sb);
	}
}
