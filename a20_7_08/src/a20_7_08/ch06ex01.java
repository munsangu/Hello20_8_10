package a20_7_08;
public class ch06ex01 
{
	public static void main(String[] args) 
	{
		String a[]=new String[5];
		int len=a.length;
		String b[]=new String[len];
		a[0]="���ѹα�";
		a[1]="�Ϻ�";
		a[2]="�̱�";
		a[3]="�Ϻ�";
		int x=0;
		for(int i=0;i<4;i++) 
		{
			if(a[i]!="�Ϻ�") 
			{
				b[x]=a[i];
				x++;
			}
		}
		for(int i=0;i<x;i++) 
		{
			System.out.println((i+1)+"��° b["+i+"]�� ��: "+b[i]);
		}
	}
}
