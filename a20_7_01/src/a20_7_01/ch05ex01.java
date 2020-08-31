package a20_7_01;
// a가 1부터 100까지 1씩 증가하되
//3의 배수 합계(sum)과 갯수(cn)구하기
public class ch05ex01 
{
	public static void main(String[] args) 
	{
		int a, na, cn=0, sum=0;
			for(a=1;a<=100;a++) 
				{
					na = a-(a/3)*3; //na=a%2
					if(na==0) 
					{
						sum=sum+a;
						cn=cn+1;
					}
				}
			System.out.println("합 = "+sum);
			System.out.println("갯수 = "+cn+"개");
			System.out.println("평균 = "+(double)sum/cn);
	}
}
