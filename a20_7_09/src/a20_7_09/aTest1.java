package a20_7_09;
public class aTest1 
{
	public static void main(String[] args) // void; return �Ǵ� ���� ����.
	{
		int a[][] = new int[3][];	// ���� ���� 3��, ���� ���� ����
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		System.out.println("a�迭�� ���� ���� = "+a.length);      
		System.out.println("a�迭�� 0���� ��<ĭ>�� ���� = "+a[0].length);   
		System.out.println("a�迭�� 1���� ��<ĭ>�� ���� = "+a[1].length);   
		System.out.println("a�迭�� 2���� ��<ĭ>�� ���� = "+a[2].length);   
	}
}
