package a20_8_05;

class Car
{
	protected String model;
	protected String color;
	public Car() {}
	public Car(String model, String color) 
	{
		this.model = model;
		this.color = color;
	}
	public void show() 
	{
		System.out.println("�𵨸� = "+model+" , Į�� ="+color);
	}
		
}

class taxi extends Car
{
	private Boolean TaxiMeter;
	private int TaxiFare = 3300;
	public taxi() {super();}
	public taxi(Boolean taxiMeter, int taxiFare) 
	{
		super();
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	public taxi(String model, String color) 
	{
		super(model, color);
	}
	public taxi(String model, String color, Boolean taxiMeter, int taxiFare) 
	{
		super(model, color);
		TaxiMeter = taxiMeter;
		TaxiFare = taxiFare;
	}
	public void show() 
	{
		super.show();
		System.out.println("�ý� ��Ÿ�� = "+TaxiMeter+" , �ý� ��� = "+TaxiFare);
	}
}

public class taxiTest 
{
	public static void main(String[] args) 
	{
		taxi t = new taxi();
		t.show();
		
		taxi t2 = new taxi();
		t2.show();
		
		Car c2 = new Car("���","���");
		c2.show();
		
		Car c4 = new taxi("���׽ý�","������",true,3300);
		c4.show();
	}
}
