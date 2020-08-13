public class call 
{
public call() {}
public call(Shape temp) 
{
	if(temp instanceof Circle) 
	{
		Circle ct = (Circle) temp;
		ct.setR(10);
		ct.area();
		ct.show();
	}
	else if(temp instanceof Rectangle) 
	{
		Rectangle rt = (Rectangle)temp;
		rt.setW(5);
		rt.setH(6);
		rt.area();
		rt.show();
	}
	else if(temp instanceof Triangle) 
	{
		Triangle tt = (Triangle)temp;
		tt.setH(5);
		tt.setW(6);
		tt.area();
		tt.show();
	}
 }
}
