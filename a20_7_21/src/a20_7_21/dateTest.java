package a20_7_21;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class dateTest 
{
	public static void main(String[] args) 
	{
		Date kim = new Date();
		System.out.println(kim);
		System.out.println("=================================");
		SimpleDateFormat f = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		System.out.println(f.format(kim));
		System.out.println("=================================");
		Calendar now = Calendar.getInstance();
		int year, month, day, hour, minute, second;
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day = now.get(Calendar.DATE);
		hour = now.get(Calendar.HOUR);
		minute = now.get(Calendar.MINUTE);
		second = now.get(Calendar.SECOND);
		System.out.println(year+"�� /"+month+"�� /"+day+"�� /"+hour+"�� "+minute+"�� "+second+"��");
		System.out.println("=================================");
		Random r = new Random();
		int randomNum = r.nextInt()%10;          // ���� �� -> ����r
		int aNum = Math.abs(randomNum);			 // ����%���� + �ʱ�ġ
		System.out.println(randomNum+","+aNum);  
	}
}
