package a20_7_02;
public class basic5 
{
	public static void main(String[] args) 
	{
		int k=0, n=1, h=1;
		do 
		{
			k=k+1;
			n=n+k;
			h=h+n;
		}while(k<9);System.out.println(h);
	}

}
