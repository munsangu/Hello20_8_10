package selfstudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Gamejava2_04 
{
	public static void main(String[] args) throws IOException
	{
		int x, y;
		Random  r = new Random();
		if(args.length==1) 
		{
			x = Integer.valueOf(args[0]).intValue();			
		}
		else 
		{
			x=Math.abs(r.nextInt()%9)+1;
		}
		y=Math.abs(r.nextInt()%9)+1;
		int num = x*y;
		System.out.println();
		System.out.println(" * ������ "+x+"�ܿ� ���� �����Դϴ�.");
		System.out.println();
		
		System.out.println(x+" * "+y+" = ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user = in.readLine();
		int inputNum = new Integer(user).intValue();
		
		if(num==inputNum) 
		{
			System.out.println("�¾ҽ��ϴ�!");
		}
		else 
		{
			System.out.println("Ʋ�Ƚ��ϴ�. ������ "+num+"�Դϴ�.");
		}
	}
}
