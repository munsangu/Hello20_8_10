package a20_7_14;

public class Point 			// Ŭ����: ��������� ����޼ҵ�� ������ ����
{						    // �Ϲ������� ��������� private�̶�� ���������ڸ� ����. ����޼ҵ�� public�̶�� ���������ڸ� ����
	private int x,y;        // <����������>: ���� ���� ���θ� ���ϴ� �� private, public, protected, ������
	public void show()      // protected -> ���谡 �ִ� �Ϳ��� ����(�θ�-�ڽ� ����)
	{	
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public void setY(int y) 
	{
		this.y = y;
	}
	public int getX() 
	{
		return x;
	}
	public int getY() 
	{
		return y;
	}
	public void set(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
}

