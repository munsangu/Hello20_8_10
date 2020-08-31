package a20_6_30;

public class ch04ex04 {
	public static void main(String[] args) {
		int a=10, b=5,c=0 ;
		char op='+';							//문자는 정수로 기억되기 때문에<아스키코드> switch - case에서 사용가능
		switch(op) {
			case'+': System.out.println(c=a+b); break;
			case'-': System.out.println(c=a-b); break;
			case'*': System.out.println(c=a*b); break;
			case'/': System.out.println(c=a/b); break;
			default: 
				System.out.println("잘못된 기호");
			 break;
		}
	}

}
