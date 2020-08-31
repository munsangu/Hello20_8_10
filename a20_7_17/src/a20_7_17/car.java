package a20_7_17;
public class car 
{
	private String color;
	private String model;
		public void show() 
		{
			System.out.println("¸ðµ¨¸í = "+ model +" , "+"»ö»ó = "+color);
		}
		public void setColor(String color) 
		{
			this.color = color;
		}
		public void setModel(String model) 
		{
			this.model = model;
		}
		public String getColor() 
		{
			return color;
		}
		public String getModel() 
		{
			return model;
		}
		public car() {}
		public car(String model) 
		{
			super();
			this.model=model;
		}
		public car(String color, String model) 
		{
			super();
			this.color=color;
			this.model=model;
		}
}	
