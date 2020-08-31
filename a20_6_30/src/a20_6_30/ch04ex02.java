package a20_6_30;

import java.util.Scanner;

// 1 - 일요일 2 - 월요일 ..... 6 - 금요일  7 - 토요일
// 1~7까지의 숫자 외에 입력 시 오류 출력
public class ch04ex02 {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		switch (num) {						// switch()-> 괄호 내에 반드시 정수 변수 또는 정수식
			case 1:							// case 뒤에도 반드시 정수 값
				System.out.println("일요일");
				break;
			case 2:
				System.out.println("월요일");
				break;
			case 3:
				System.out.println("화요일");
				break;
			case 4:
				System.out.println("수요일");
				break;
			case 5:
				System.out.println("목요일");
				break;
			case 6:
				System.out.println("금요일");
				break;
			case 7:
				System.out.println("토요일");
				break;
			default:
				System.out.println("입력 오류");
				break;
		}
	}

}
