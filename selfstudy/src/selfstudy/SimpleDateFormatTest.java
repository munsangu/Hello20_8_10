package selfstudy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest 
{
	public static void main(String[] args) 
	{
		Date today = new Date();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy�� MM�� dd��  hh�� mm�� ss��");
		
		System.out.println(dateForm.format(today));
		
	}
}
