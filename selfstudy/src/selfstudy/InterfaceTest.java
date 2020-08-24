package selfstudy;
public class InterfaceTest implements Height
{
	private double cm = 0;
	public InterfaceTest(double cm) 
	{
		this.cm = cm;
		
	}
	public double getInch() 
	{
		return cm/INCH;
	}
	public double getCM() 
	{
		return cm;
	}
	public double getMeter() 
	{
		return cm/100;
	}
	public static void main(String[] args) 
	{
		InterfaceTest myHeight = new InterfaceTest(183);
		
		System.out.println(myHeight.getCM()+"cm");
		System.out.println(myHeight.getInch()+"inch");
		System.out.println(myHeight.getMeter()+"m");
	}

}
