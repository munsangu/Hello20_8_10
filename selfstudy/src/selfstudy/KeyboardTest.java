package selfstudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardTest 
{
	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		String str;
		System.out.println("�۾��� �Է��ϸ� �����մϴ�.");
		str = in.readLine();
		System.out.println(str);
	}
}
