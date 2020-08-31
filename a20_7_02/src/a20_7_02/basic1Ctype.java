package a20_7_02;
public class basic1Ctype 
{
	public static void main(String[] args) 
	{
		int i, sum;
		i = 1;
		sum = 0;
		do 
		{
			sum=sum+i;
			i=i+1;
		}
			while(i<=100);
		System.out.println(sum);
	}
}
