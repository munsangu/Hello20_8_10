package a20_7_31;
public class July_FinalTest7 
{
	public static void main(String[] args) 
	{
		int s=0, sa=0, sw=0, i=1;
		do 
		{	
			sa=sa+i;
			if(sw==0) 
				{	
				s=s-sa;
				sw=1;
				}
			else
				{
				s=s+sa;
				sw=0;
				}
			i++;
		}while(i<=10);
		System.out.println(s);
	}
}
