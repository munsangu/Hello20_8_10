package a20_7_02;
// 1,2,3, ... , 100(a)���� �հ�(hap)
public class ch05ex03 
{
	public static void main(String[] args) 
	{
		int a, hap;
		a=1;
		hap=0;
		do 		// do while vs while -> �ѹ��� �� �Ѵ�(1ȸ �̻�)  vs �ѹ��� ���� ���� �ִ�.(0ȸ �̻�)
		{
			System.out.println(a);
			hap=hap+a;
			a++;
		}
		while(a<=100);System.out.println("�հ� = "+hap);
	}
}
