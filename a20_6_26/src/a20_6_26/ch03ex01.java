package a20_6_26;

public class ch03ex01 {
	public static void main(String[] args) {
		int a=5, b=3;
		System.out.println(a/(double)b); // 두 변수 중 한 곳에만 적어도 됨(double); 정수의 실수화 ; 정확도 증가
		System.out.println(a%b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a>b && b==3);
		System.out.println(a<b && b==3);
		System.out.println(a>b || b==3);
		System.out.println(a<b || b==3); // '&&' = and '||' = or '!' = not
		System.out.println(!(5>3));
		
	}

}
