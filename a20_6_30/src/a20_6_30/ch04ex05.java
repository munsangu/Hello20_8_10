package a20_6_30;

import java.util.Scanner;

// 1과 3을 입력하면 "대한민국 남성"
// 2와 4를 입력하면 "대한민국 여성"
public class ch04ex05 {
	public static void main(String[] args) {
	int num;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	switch (num) {
		case 1:
		case 3:
			System.out.println("대한민국 남성");
			break;
		case 2:
		case 4:
			System.out.println("대한민국 여성");
			break;
		default:
			System.out.println("유효한 숫자가 아닙니다.");
			break;
		}
	}

}
