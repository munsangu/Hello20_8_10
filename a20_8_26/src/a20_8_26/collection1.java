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
		a.remove(0); 		       // a[0]의 값 삭제
		a.remove(new Integer(20)); // 가장 가까이에 있는 20이라는 정수 제거
		show(a);
		System.out.println();
		Collections.sort(a);	   // Collections 클래스에서 지원되는 sort메소드
		show(a);
		a.set(0, 10);
		a.set(1, 200);
		Collections.sort(a);
		System.out.println();
		show(a);
	}
}
