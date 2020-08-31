package a20_7_17;
class Taxi 
{		private String color, model;
		private int meta, price;
				public void show() 
				{
					System.out.println(color+","+model+","+meta+","+price);
				}
				public Taxi() { }
				public Taxi(int price) 
				{
					this.price=price;
				}
			    public void setColor(String color) 
				{
					this.color = color;
				}
				public void setModel(String model) 
				{
					this.model = model;
				}
				public void setMeta(int meta) 
				{
					this.meta = meta;
				}
				public void setPrice(int price) 
				{
					this.price = price;
				}
				public void set(String color, String model, int meta, int price) 
				{
					this.color = color;
					this.model = model;
					this.meta = meta;
					this.price = price;
				}
	public static void main(String[] args) 
	{
		Taxi kim = new Taxi();
		kim.set("È¸»ö","Sonata",1200,3500);
		kim.show();
		System.out.println("=========================================");
		Taxi lee = new Taxi(3500);
		lee.setModel("Grandeur");
		lee.show();
	}
}
