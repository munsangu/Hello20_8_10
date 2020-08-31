package a20_7_14;
class aTest2 
{
	public static void main(String[] args) 
	{
		Point p = new Point();
		p.setX(10);
		p.setY(20);   // p.x, p.y로는 사용 불가 -> private 변수 때문 -> setX,Y(int ...)를 활용해서 값을 넣고 사용
		p.show();
		System.out.println("=====================================");
		p.set(100,200);
		p.show();
		System.out.println("=====================================");
		System.out.println(p.getX()+p.getY());
	}
}
