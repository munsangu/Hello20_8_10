package a20_7_06;
//1 ~ 100���� ¦���� �հ�
public class aTest1 
{
	public static void main(String[] args) 
	{
		int a,hap=0;
		for(a=1;a<=100;a++) 
		{
			if(a%2==0)hap=hap+a;
		}System.out.println("1���� 100���� ¦������ �� = "+hap);
	}
}