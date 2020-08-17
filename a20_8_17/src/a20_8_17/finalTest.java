package a20_8_17;

final class parentTest{}   // 상속 불가
public class finalTest  
{
	final int X=1;  // x=1로 정해졌으니 바꿀 수 없음
	final double PI = 3.141592; // final 변수는 일반적으로 대문자 사용
	
	public final void show()  // 재정의(overriding)안됨
	{
		System.out.println(X);
	}
	public static void main(String[] args) 
	{
		//X=X+10; X=100;    // 에러
	}
}
