package a20_7_15;
public class mainTest2 
{
	public static void main(String[] args)
	{
		Animal kim = new Animal();
		kim.setName("�̾�Ĺ");
		kim.setAge(2);
		kim.show();
		System.out.println("=============================");
		Animal park = new Animal("�ʱ���");
		park.setAge(2);
		park.show();
		System.out.println("=============================");
		Animal lee = new Animal("�⸰",1);
		lee.show();
	}
}
