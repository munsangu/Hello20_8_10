package selfstudy;
public class DoWhileTest 
{
	public static void main(String[] args) 
	{
		int i,j;
		i = 10;
		do 
		{
			j=0;
			do 
			{
				System.out.print("*");
				j++;
			}
			while(j<i); 
			{
				System.out.println();
				i--;
			}
		}while(i>0);
	}
}
