package a20_8_26;
import java.util.ArrayList;
import java.util.Collections;

//ArrayList
public class collection1 
{
	public static void show(ArrayList<Integer> a) 
	{
		for(int num: a) 
		{
			System.out.println(num);
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add(20);
		a.remove(0); 		       // a[0]�� �� ����
		a.remove(new Integer(20)); // ���� �����̿� �ִ� 20�̶�� ���� ����
		show(a);
		System.out.println();
		Collections.sort(a);	   // Collections Ŭ�������� �����Ǵ� sort�޼ҵ�
		show(a);
		a.set(0, 10);
		a.set(1, 200);
		Collections.sort(a);
		System.out.println();
		show(a);
	}
}
