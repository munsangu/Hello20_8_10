package test3;
public class MaxTest 
{
	public static void main(String[] args) 
	{
		// run configuration 입력 -> 100 50 
		String num1 = args[0];
		String num2 = args[1];
		Integer n1 = Integer.valueOf(num1);
		Integer n2 = Integer.valueOf(num2);
		System.out.println(n1+","+n2);
		System.out.println("==============================");
		int res = sample.max(n1, n2);
		System.out.println("최댓값은 = "+res);
	}
}
