package a20_8_26;
import java.util.Stack;

// ���� Stack: LIFO(Last In First Out)
public class collection3 
{
	public static void show(Stack<String> s) 
	{
		while(!s.isEmpty()) 
		{
			System.out.println(s.pop());
		}
	}
	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		s.add("TOM");		// ����õ
		s.push("TOMAS");	// ��õ
		s.push("ELLM");
		show(s);
	}
}
