package a20_7_23;
import java.io.IOException;

public class keyboardTest 
{
	public static void main(String[] args) throws IOException 
	{
		char ch;
		ch =(char) System.in.read(); //자바는 입출력에 관련되는 외부적인 접근에 있어서 에러가 생길 수 있는 것을 대비하여 에러처리 할 수 있도록 
		System.out.println(ch);// 하고 있음 -> 예외처리(Exception)
	}
}
