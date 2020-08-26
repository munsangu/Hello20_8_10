package a20_8_26;
import java.util.Hashtable;
import java.util.Set;
// Map : key, value를 한 쌍으로 구성된 것  --> 순차구조 아닌 집합
// Hashtable 클래스 활용
public class collection5 
{
	public static void main(String[] args) 
	{
		Hashtable<String, String> h = new Hashtable<String, String>();
		h.put("TOM", "DAEGU, 123-456-7890, 19");
		h.put("FAKER", "DAEGU, 123-456-7890, 19");
		h.put("CURRY", "DAEGU, 123-456-7890, 19");
		h.put("JOHN", "DAEGU, 123-456-7890, 19");
		
		Set<String> n = h.keySet();
		for(String item : n) 
		{
			System.out.println(item+": "+h.get(item));
		}
		System.out.println("===============");
		System.out.println(h.get("FAKER")); //FAKER의 값
	}
}
