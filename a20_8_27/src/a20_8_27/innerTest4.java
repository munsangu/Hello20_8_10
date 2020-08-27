package a20_8_27;
class Outer1									// 바깥 클래스
{
	int outdata = 100;							// 바깥 클래스 > 변수
	Object method() 							// 바깥 클래스 > 메소드
	{
		final int data = 200;					// 바깥클래스 > 메소드 > 변수
		class Inner								// 바깥클래스 > 메스드 > 클래스
		{
			public String toString() 
			{									// 바깥클래스 > 메소드 > 클래스 > 메소드
				return "결과 = "+(outdata+data);
			}
		}
		return new Inner();
	}
}
public class innerTest4 
{
	public static void main(String[] args) 
	{
		Outer1 out = new Outer1();
		Object obj = out.method();
		System.out.println(obj.toString());
	}
}
