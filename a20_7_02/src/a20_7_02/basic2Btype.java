package a20_7_02;
public class basic2Btype 
{
	public static void main(String[] args) 
	{
		int i, sum;
		i=0;
		sum=0;
		do 
		{
			i=i+1;
			if(i%2==0) sum=sum+i;
		}while(i<100);
		System.out.println(sum);	
	}
}
