package a20_7_21;
public class StringTest2 
{
	public static void main(String[] args) 
	{
		String name = "ȫ�浿";
		String name1 = "ȫ�浿";
		String name2 = new String("ȫ�浿");
		System.out.println(name == name1);
		System.out.println(name == name2);
		System.out.println(name.equals(name2)); // ���� ������ ���ϴ� �� .equals()
		System.out.println(name.equals(name1));
		int a=10, b=10;
		System.out.println(a==b);
		String test="HelloHo";
		System.out.println(test.indexOf('H'));      // ��ġ
	}
}
