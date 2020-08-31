package a20_7_30;

import java.sql.Date;

class point3
{
	public static int x;         // static 정적메모리; 공유 메모리
	public int y;
	public void cal() 
	{
		x = x+10;
		y = y+10;
		System.out.println("x = "+x+", "+"y = "+y);
	}
	public static void test()    // static 변수만 사용 가능 
	{
		//	   x=x+y;
		System.out.println(x);
		//		System.out.println(y);
	}
}

public class StaticTest 
{
	public static void main(String[] args) 
	{
		point3.x=5; //		point3.y=5;
		point3 p = new point3();
		p.cal();
		point3 kim = new point3();
		kim.cal();
		point3 lee = new point3();
		lee.cal();	
		System.out.println(point3.x);
		point3.test(); // 클래스명을 통해 바로 접근 가능
	}
}
