package a20_7_17;
public class maintest 
{
	public static void main(String[] args) 
	{
		car kim = new car();
		kim.setColor("Black");
		kim.setModel("LEXUS");
		kim.show();
		System.out.println("===============================");
		car lee = new car("BMW");
		lee.setColor("Gray");
		lee.show();
		System.out.println("===============================");
		car park = new car("White","Audi");
		park.setColor("Blue");
		park.show();
	}
}
