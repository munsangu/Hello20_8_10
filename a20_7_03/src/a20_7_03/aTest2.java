package a20_7_03;
// 1,2,3,4,5 (a) 까지 출력
// while()
// do while()
public class aTest2 
{
	public static void main(String[] args) 
	{
		int a=1;
		while(a<=10) 
		{
			System.out.println(a);
			a++;
		}
		
		System.out.println("==================================================");
		
		int b=1;
		do 
		{
			System.out.println(b);
			b++;
		}while(b<=10);
	}
}