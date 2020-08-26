package a20_8_26;
import java.util.Vector;

// Vector 배열
public class collection2 
{
	
	public static void show(Vector<String> v) 
	{
		for(String name: v) 
		{
			System.out.println(name);
		}
	}
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>(2,2); //기본 2개 할당받고, 가득차면 2씩 증가
		v.add("TOM");
		System.out.println(v.size()+", "+v.capacity());
		v.add("JOHN");
		System.out.println(v.size()+", "+v.capacity());
		v.add("ROBOT");
		System.out.println(v.size()+", "+v.capacity());
		
		v.addElement("SWAN");
		v.remove(0);
		v.removeElement("SWAN");
		show(v);
	}
}
