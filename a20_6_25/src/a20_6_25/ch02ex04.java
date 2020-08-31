package a20_6_25;

public class ch02ex04 {
	public static void main(String[] args) {
		char a,b,c,d;
		a = 'A';  // 아스키코드(미국표준코드) A(65), B(66), ...
		b = 'a';  // 아스키코드 a(97)
		c = '1';  // 아스키코드 1(45)
		d = '가';
		System.out.println(a+""+b+""+c);
		System.out.println(d);
		System.out.println((int) d);
		System.out.println((int) 'a');
		System.out.println((int) 'A');
		System.out.println((int) 'あ');
	}

}
