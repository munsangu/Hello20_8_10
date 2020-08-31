package a20_7_02;

public class ch05ex02 
{
	public static void main(String[] args) 
	{
		int i;
		i=1;
		while(true) 							// while() 조건에 만족할때까지 무한 반복
		{
			System.out.println(i);
			if(i>=10) break;
			i++;
		}
	}
}