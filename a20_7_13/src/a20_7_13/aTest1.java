package a20_7_13;
// 두 수를 전달받아 교체하는 swap()메서드
public class aTest1 
{   
	public static void swap(int x, int y) 
	{
		int z;
		System.out.println("들어온 값 = "+x+","+y);
		z=x;
		x=y;
		y=z;
		System.out.println("나가는 값 = "+x+","+y);
	}
	public static void main(String[] args) 
	{
		swap(10,20);
	}
}
