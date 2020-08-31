package test;
public class circle extends shape 
{
	private int r;
	public void area()   // 오버라이딩
	{
		res=r*r*Math.PI;
	}
	public circle() {}   // 생성자메소드의 오버로딩
	public circle(int r) // 생성자메소드의 오버로딩
	{
		this.r=r;
	}
}
// 오버라이딩(재정의): 상속된 메소드와 자식 메소드가 동일할 때 자식의 메소드로 재정의 되는 것
//* 오버로딩: 동일한 메소드가 여러 개 정의가능한 것
          //단, 전달 인수가 달라야 함(전달파라메타)*//