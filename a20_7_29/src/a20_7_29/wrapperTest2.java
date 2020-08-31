package a20_7_29;
public class wrapperTest2 
{
	public static void main(String[] args) 
	{
		String jumsu = "80";
		Integer wi = Integer.valueOf(jumsu);
		
		int ia = wi.intValue();
	
		System.out.println(ia+2);
		System.out.println(jumsu+2);
		
		String kor = "90";
		int ikor = Integer.valueOf(kor);  // auto unboxing
	}
}
