package a20_8_26;
import java.util.Hashtable;
import java.util.Set;
// Map : key, value�� �� ������ ������ ��  --> �������� �ƴ� ����
// Hashtable Ŭ���� Ȱ��
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
		System.out.println(h.get("FAKER")); //FAKER�� ��
	}
}
