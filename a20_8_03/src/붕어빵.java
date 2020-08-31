public class ºØ¾î»§ 
{
	protected int ºØ¾îÆ²; // »ó¼ÓÀ» À§ÇØ¼­ proteced, ÁøÂ¥ º¸È£¸¦ À§ÇØ¼­´Â private
	protected int ¹ÝÁ×;
	protected int ÆÏ;
	public void show() 
	{
		System.out.println(ºØ¾îÆ²);
	}
	public void ¸¸µé±â() 
	{
		ºØ¾îÆ² = ¹ÝÁ× + ÆÏ+¹ÝÁ×;
	}
	public ºØ¾î»§() 
	{
		System.out.println("¾È³ç ºØ¾î»§(ºÎ¸ð)");
	}
	public ºØ¾î»§(int ¹ÝÁ×, int ÆÏ) 
	{
		this.¹ÝÁ×=¹ÝÁ×;
		this.ÆÏ=ÆÏ;
	}
}
