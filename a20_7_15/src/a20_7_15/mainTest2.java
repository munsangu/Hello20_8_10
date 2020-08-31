package a20_7_15;
public class mainTest2 
{
	public static void main(String[] args)
	{
		Animal kim = new Animal();
		kim.setName("미어캣");
		kim.setAge(2);
		kim.show();
		System.out.println("=============================");
		Animal park = new Animal("너구리");
		park.setAge(2);
		park.show();
		System.out.println("=============================");
		Animal lee = new Animal("기린",1);
		lee.show();
	}
}
