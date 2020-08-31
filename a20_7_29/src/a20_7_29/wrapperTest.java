package a20_7_29;
public class wrapperTest 
{
	public static void main(String[] args) 
	{
		int myint = 567;
		Integer wi = new Integer(myint);
		Integer wi2 = Integer.valueOf(myint);
		
		String si = wi.toString();
		
		System.out.println(si+10);
		
	}
}
