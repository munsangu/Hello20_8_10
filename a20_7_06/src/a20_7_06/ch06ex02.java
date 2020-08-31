package a20_7_06;
import java.util.Scanner;
// a 배열에 스캐너를 이용하여, 5개의 데이터를 입력받아서 배열에 저장된 값을 모두 출력하고 합계구하기
public class ch06ex02 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int sum=0;
		int i;
		Scanner sc= new Scanner(System.in);
		for(i=0;i<5;i++) 
		{
		a[i]=sc.nextInt();
		System.out.println("a["+i+"]"+"="+a[i]);
		sum=sum+a[i];
		}System.out.println("배열에 저장된 수들의 합 = "+sum);
	}
}
