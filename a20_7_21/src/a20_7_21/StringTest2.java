package a20_7_21;
public class StringTest2 
{
	public static void main(String[] args) 
	{
		String name = "홍길동";
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		System.out.println(name == name1);
		System.out.println(name == name2);
		System.out.println(name.equals(name2)); // 같은 것인지 비교하는 것 .equals()
		System.out.println(name.equals(name1));
		int a=10, b=10;
		System.out.println(a==b);
		String test="HelloHo";
		System.out.println(test.indexOf('H'));      // 위치
	}
}
