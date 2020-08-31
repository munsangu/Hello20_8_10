package a20_7_09;
public class ch06ex03 
{
	public static int sum(int a) 
	{
		int tot=0;
		for(int i=1;i<a+1;i++) 
		{
			tot=tot+i;
		}
		return tot;
	}
	public static void main(String[] args) 
	{
		System.out.println("ÃÑ ÇÕ = "+sum(100));
		System.out.println("ÃÑ ÇÕ = "+sum(30));
	}
/*	public static void sum(int a) 
	{
		int tot=0;
		for(int i=1;i<a+1;i++) 
		{
			tot=tot+i;
		}system.out.println(tot);
		
	}
	public static void main(String[] args) 
	{
		
		sum(100);
		sum(30);
	}*/
}
