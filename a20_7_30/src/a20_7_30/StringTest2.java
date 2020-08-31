package a20_7_30;
import java.util.StringTokenizer;

public class StringTest2 
{
	public static void main(String[] args) 
	{
		String str = "»ç°ú, ¹è, ±Ö, ¿À·»Áö, Å°À§, º¹¼þ¾Æ, Âü¿Ü";
		StringTokenizer st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken());
		}
	}
}
