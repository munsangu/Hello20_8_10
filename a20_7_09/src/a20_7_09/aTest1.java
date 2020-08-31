package a20_7_09;
public class aTest1 
{
	public static void main(String[] args) // void; return 되는 값이 없다.
	{
		int a[][] = new int[3][];	// 행의 갯수 3개, 열의 갯수 없음
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		System.out.println("a배열의 행의 갯수 = "+a.length);      
		System.out.println("a배열의 0행의 열<칸>의 갯수 = "+a[0].length);   
		System.out.println("a배열의 1행의 열<칸>의 갯수 = "+a[1].length);   
		System.out.println("a배열의 2행의 열<칸>의 갯수 = "+a[2].length);   
	}
}
