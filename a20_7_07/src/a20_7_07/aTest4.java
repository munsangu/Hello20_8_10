package a20_7_07;
public class aTest4 
{
	public static void main(String[] args) 
	{
		int jumsu[]= {100,90,80,78,56,-34,-90};
		int len=jumsu.length;
		int minus[] = new int[len];
		int i, hap=0, cnt=0;
		double avg;
		for(i=0;i<len;i++) 
		{
			if(jumsu[i]<0)
			{
				minus[cnt]=jumsu[i];
				hap=hap+minus[cnt];
				cnt++;
			}
		}
		for(i=0;i<cnt;i++) 
		{
			System.out.println((i+1)+"¹øÂ°ÀÇ °ª: "+"b["+i+"] = "+minus[i]);
		}
		avg=(double) hap/cnt;
		System.out.println("ÃÑ ÇÕ = "+hap);
		System.out.println("Æò ±Õ = "+avg);
	}
}
