package a20_7_23;
import java.io.IOException;

public class keyboardTest 
{
	public static void main(String[] args) throws IOException 
	{
		char ch;
		ch =(char) System.in.read(); //�ڹٴ� ����¿� ���õǴ� �ܺ����� ���ٿ� �־ ������ ���� �� �ִ� ���� ����Ͽ� ����ó�� �� �� �ֵ��� 
		System.out.println(ch);// �ϰ� ���� -> ����ó��(Exception)
	}
}
