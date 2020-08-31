package a20_6_26;

public class ch03ex06 {
	public static void main(String[] args) {
		int a=10,b=3;
		
//		System.out.println(a&&b);      // error (논리연산자 -> t/f만 가능)
// 		System.out.println(a||b);      // error (논리연산자 -> t/f만 가능) 
		System.out.println(a&b);       // (비트연산자 and->&) <2진법으로 1=t, 0=f> 둘 다 참이면 참 
		System.out.println(a|b);       // (비트연산자 or ->|)  <2진법으로 1=t, 0=f> 둘 중 하나만 참이여도 참
		System.out.println(a>b&&b==3);
	}

}
