package selfstudy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangman 
{
	String hiddenString;
	StringBuffer outputString;
	StringBuffer inputString;
	int remainder;
	int failed;
	
	public Hangman() throws IOException
	{
		hiddenString = "Hello";
	}
	public int playGame() throws IOException
	{
		outputString = new StringBuffer();
		for(int i=0;i<hiddenString.length();i++) 
		{
			outputString.append('-');
		}
		inputString = new StringBuffer();
		remainder = hiddenString.length();
		failed = 0;
		
		System.out.println("\n단어("+hiddenString.length()+"글자"+"):   "+outputString);
		drawMan();
		
		do 
		{
			checkChar(readChar());
			System.out.println("\n단어("+hiddenString.length()+"글자"+"):   "+outputString);
			drawMan();
		}while((remainder>0)&&(failed<6));
		return failed;
	}
	public void checkChar(char guess) 
	{
		boolean already = false;
		for(int i =0; i<inputString.length();i++) 
		{
			if(inputString.charAt(i)==guess) 
			{
				System.out.println("\n이미 입력한 문자입니다! 다시 입력해주세요.");
				already = true;
			}
		}
		if(!already) 
		{
			inputString.append(guess);
			
			boolean success = false;
			for(int i=0; i<hiddenString.length();i++) 
			{
				if(outputString.charAt(i)==guess) 
				{
					outputString.setCharAt(i, guess);
					remainder--;
					success = true;
				}
			}
			if(!success)failed++;
		}
	}
	public void drawMan() 
	{
		System.out.println("┌─────┐");
		System.out.println("｜           ｜");
		
		switch(failed) 
		{
		case 0:
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
		case 1:
			System.out.println("  ◑       ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
		case 2:
			System.out.println("  ◑       ｜");
			System.out.println(" ┌┿   ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
		case 3:
			System.out.println("  ◑       ｜");
			System.out.println(" ┌┿   ｜");
			System.out.println("  │   ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
		case 4:
			System.out.println("  ◑       ｜");
			System.out.println(" ┌┿┐  ｜");
			System.out.println("  │   ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
			System.out.println("      ｜");
		case 5:
			System.out.println("  ◑       ｜");
			System.out.println(" ┌┿┐  ｜");
			System.out.println("  │   ｜");
			System.out.println(" ┌┴   ｜");
			System.out.println(" │    ｜");
			System.out.println("      ｜");
		case 6:
			System.out.println("  ◑       ｜");
			System.out.println(" ┌┿┐  ｜");
			System.out.println("  │   ｜");
			System.out.println(" ┌┴┐  ｜");
			System.out.println(" │ │  ｜");
			System.out.println("      ｜");
			break;
		}
	}
		public char readChar() throws IOException
		{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String user;
			
			System.out.println("1 문자를 입력하세요: ");
			user = in.readLine();
			return user.charAt(0);
		}
	
	}

