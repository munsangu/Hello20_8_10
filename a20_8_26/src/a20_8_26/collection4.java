package a20_8_26;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
// ���� ������ ���� Iterator(���ͷ�����)
// ���� ������ ���� Enumeration(�̴��ӷ��̼�) 
// Vector�� ArrayList, LinkedList���� ���

public class collection4 
{
	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>(10,10);
		v.addElement("TOM");
		v.addElement("CURRY");
		v.addElement("JERRY");
		v.addElement("FAKER");
		
		Iterator<String> it = v.iterator();		// it��� �̸��� �������� ����
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
