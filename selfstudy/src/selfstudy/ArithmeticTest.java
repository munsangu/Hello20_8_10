package selfstudy;
public class ArithmeticTest 
{
	public static void main(String[] args) 
	{
		int num = 256;
		
		System.out.println(" �־��� ��  : "+num);
		System.out.println("  1�� �ڸ� : "+num%10);
		num=num/10;
		System.out.println(" 10�� �ڸ� : "+num%10);
		num = num/10;
		System.out.println("100�� �ڸ� : "+num%10);
	}
}
