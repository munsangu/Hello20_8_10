package selfstudy;
public class WhileTest 
{
	public static void main(String[] args) 
	{
		int i,j;
		
		i = 10;
		while(i>0) 
		{
			j = 0;
			while(j<i) 
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
