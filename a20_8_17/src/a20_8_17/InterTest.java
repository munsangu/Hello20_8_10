package a20_8_17;
public interface InterTest   
{
	public static final int r=1, g=2, b=3;     // 멤버변수 public static final 성격을 가짐
	public abstract void draw();    // 멤버메소드는 public abstract (추상메소드)  성질을 가짐	
}
// 인터페이스란, 클래스와 동일하게 멤버변수와 멤버메소드로 구성된 구조
// 자바는 단일상속만 가능, 이런 단점을 보완하기 위해 인터페이스가 있음
// 인터페이스 자식클래스에게 상속해주는 역할만 함.
// 스스로는 new로 생성 되지 않음
// 인터페이스 멤버변수 public static final 성격
// 인터페이스 멤버메소드 public abstract 성격 (선언만 가능, 자식이 오버라이딩하여 사용해야 함)
// Class A{} 
// Class B{}
// Class C extends A,B{} (x) extends 뒤에는 친부모(클래스) 1개만 
// Class D extends B{}	(o)
// interface X{}
// interface P{}
// Class Y extends X{}	(x) 문법 에러
// Class Y implements X{}	(o)
// Class Z extends A implements X {} (o)
// Class Z extends A,B implements X {} (X)
// Class Z extends A implements X,P{}	(O)