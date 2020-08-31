package a20_6_30;
import java.util.Scanner;

// 임의의 수를 입력받아서 그 수가 3의 배수이면 "3의 배수" 출력 아니면 "끝"
public class atest01 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int na = num-(num/3)*3;
		if(na==0)System.out.println("3의 배수");
		else
			System.out.println("끝");
		
		
		// 나머지 구하기
		// na=10%3             ->  1
		// na=10-int(10/3)*3   ->  1 JAVE에서는 int없어도 결과값에는 지장없음(초기에 정수 선언이 됬으므로)
		// na=10-10/3*3 	   ->  1
		
		// 100/6의 나머지
		// na = 100-int(100/6)*6
	}

}
