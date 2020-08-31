package a20_7_03;
public class basic7 
{
	public static void main(String[] args) 
	{
		long n=1,h=1;
		do
		{
			n++;
			h=h*n;
		}
		while(n<20);
		System.out.println(h); // 결과값이 너무 크기 때문에 0으로 나옴
	}
}
