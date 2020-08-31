package a20_7_06;
public class basic9 
{
	public static void main(String[] args) 
	{
		int A=1, B=1, Y=2, N=2,C;
		do 
		{
			C=A+B;
			Y=Y+C;
			N++;
		    A=B;
			B=C;
		}while(N<10);System.out.println(Y);
	}
}
