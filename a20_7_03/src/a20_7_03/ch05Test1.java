package a20_7_03;

/**
* 
**
***
****
*****
******
******
******
**/

public class ch05Test1 
{
	public static void main(String[] args) 
	{
		int a,b;
		for(a=1;a<=8;a++) 
		{
			for(b=1;b<=a;b++) 
			{
				System.out.print("*");
				if(b>=6)break;
			}
			System.out.println();
		}
	}
}
