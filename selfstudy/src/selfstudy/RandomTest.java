package selfstudy;
import java.util.Random;

public class RandomTest 
{
	public static void main(String[] args) 
	{
		Random r = new Random();
		System.out.println("0 ~ 99 ������ ����: "+Math.abs(r.nextInt()%100));
	}
}
