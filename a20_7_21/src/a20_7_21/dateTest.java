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
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
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
		System.out.println(year+"년 /"+month+"월 /"+day+"일 /"+hour+"시 "+minute+"분 "+second+"초");
		System.out.println("=================================");
		Random r = new Random();
		int randomNum = r.nextInt()%10;          // 랜덤 수 -> 난수r
		int aNum = Math.abs(randomNum);			 // 난수%객수 + 초기치
		System.out.println(randomNum+","+aNum);  
	}
}
