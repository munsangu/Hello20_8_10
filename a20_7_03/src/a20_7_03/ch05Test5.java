package a20_7_03;
// ¼Ò¼ö(1~50)
public class ch05Test5 
{
	public static void main(String[] args) 
	{
		int a,b,cnt;
		for(a=2;a<=50;a++) 
		{   cnt=0;
			for(b=1;b<=a;b++) 
			{
				if(a%b==0) cnt++;
			}
			if(cnt==2) System.out.println(a);
		}
	}

}
