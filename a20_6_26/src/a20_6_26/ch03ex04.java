package a20_6_26;

public class ch03ex04 {
	public static void main(String[] args) {
		int a,b,temp;
		a=10; b=20;
		System.out.println(a+","+b);
		
		temp=a;
	    a=b;
	    b=temp;
	    System.out.println(a+","+b); // 교체법 (순서 중요)
	}

}
