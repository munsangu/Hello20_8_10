package a20_7_13;
// �� ���� ���޹޾� ��ü�ϴ� swap()�޼���
public class aTest1 
{   
	public static void swap(int x, int y) 
	{
		int z;
		System.out.println("���� �� = "+x+","+y);
		z=x;
		x=y;
		y=z;
		System.out.println("������ �� = "+x+","+y);
	}
	public static void main(String[] args) 
	{
		swap(10,20);
	}
}
