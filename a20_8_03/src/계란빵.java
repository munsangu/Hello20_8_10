public class 계란빵 extends 붕어빵 
{
	private int 계란틀;  // 붕어틀, 반죽, 팥, show(), 만들기() 등 전부 상속
	private int 계란;
	public void show() // if(상속된 메소드 = 자신의 메소드) -> 자신의 메소드가 실행됨(재정의;overriding)
	{
		System.out.println(계란틀);
	}
	public void 만들기2() 
	{
		계란틀 = 반죽 + 계란 + 반죽;
	}
	public 계란빵() 
	{
		System.out.println("안녕 계란빵(자식)");
	}
	public 계란빵(int 계란, int 반죽) 
	{
		this.계란 = 계란;
		this.반죽 = 반죽;
	}
}
