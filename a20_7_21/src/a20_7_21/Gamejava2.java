package a20_7_21;
import java.util.Arrays;
import java.util.Random;
public class Gamejava2 
{
	public static void main(String[] args) 
	{
	 Random r = new Random();
	 int a[]= new int[6];
	 int cnt = 0;
	 while( cnt!= 6 ) 
	 {
		 a[cnt]=(int)(Math.random()*45)+1;
//		 System.out.println(a[cnt]);
		 for(int i = 0; i<cnt;i++) 
		 {
			 if(a[i]==a[cnt]) 
			 {
				 cnt--;
				 break;
			 }
		 }
		 cnt++;
	 }
	 System.out.println("번호 6개 :");
	 Arrays.sort(a);
	  for(int i=0;i<a.length;i++) 
	  {
		  System.out.println(a[i]);
	  }
		
//		int ran = Math.abs(r.nextInt()%45)+1;
//		System.out.println(ran); 랜덤 번호 생성
	}
}
