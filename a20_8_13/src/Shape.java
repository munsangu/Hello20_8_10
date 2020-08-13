public abstract class Shape 
{
	protected double res;
	public void show() 
	{
		System.out.println(res);
	}
	public abstract void area(); // 추상메소드는 선언만 함('{}'사용 불가) 자식이 상속받아 정의함
	public abstract void draw();
}
