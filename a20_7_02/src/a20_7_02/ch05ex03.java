package a20_7_02;
// 1,2,3, ... , 100(a)까지 합계(hap)
public class ch05ex03 
{
	public static void main(String[] args) 
	{
		int a, hap;
		a=1;
		hap=0;
		do 		// do while vs while -> 한번은 꼭 한다(1회 이상)  vs 한번도 못할 수도 있다.(0회 이상)
		{
			System.out.println(a);
			hap=hap+a;
			a++;
		}
		while(a<=100);System.out.println("합계 = "+hap);
	}
}
