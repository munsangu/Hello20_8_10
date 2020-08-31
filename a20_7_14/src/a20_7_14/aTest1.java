package a20_7_14;
class ºØ¾î»§
{
	int  Æ², ÆÏ, ¹ÝÁ×;
	void ¸¸µé±â() 
	{
		Æ² = ¹ÝÁ×+ÆÏ+¹ÝÁ×;
	}
	void ²¨³»±â() 
	{
		System.out.println(Æ²);
	}
}
public class aTest1 
{
	public static void main(String[] args) 
	{
		ºØ¾î»§ kim = new ºØ¾î»§();
		kim.¹ÝÁ×=10;
		kim.ÆÏ=5;
		kim.¸¸µé±â();
		kim.²¨³»±â();
	}
}
