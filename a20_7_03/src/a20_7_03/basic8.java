package a20_7_03;

public class basic8 
{
	public static void main(String[]args) 
	{
		double i=0, h=0;
		do 
		{
			i++;
			h=h+(i/(i+1));
		}while(i<49);System.out.println(h); 
	}
}
