package a20_8_26;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
// 순차 접근을 위한 Iterator(이터레이터)
// 순차 접근을 위한 Enumeration(이뉴머레이션) 
// Vector나 ArrayList, LinkedList에서 사용

public class collection4 
{
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>(10,10);
		v.addElement("TOM");
		v.addElement("CURRY");
		v.addElement("JERRY");
		v.addElement("FAKER");
		
		Iterator<String> it = v.iterator();		// it라는 이름의 집합으로 관리
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println();
		Enumeration<String> it2 = v.elements();
		while(it2.hasMoreElements()) 
		{
			System.out.println(it2.nextElement());
		}
	}
}
