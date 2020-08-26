package selfstudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Hangman2 extends Hangman 
{
	String[] words = {"influenza","fever","cancer","poison","victom","physician","clinic","symptom","medicine","drug","hygiene"};
	String[] meaning = {"����","��","��","��","ȯ��","�����ǻ�","�����","¡��","����","��","������"};
	
	public Hangman2() throws IOException
	{
		Random r = new Random();
		int randomNum = Math.abs(r.nextInt()% words.length);
		
		hiddenString = words[randomNum];
		System.out.println("\n�ǹ�: "+meaning[randomNum]);
	}
	public char readChar() throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user;
		
		do 
		{
			System.out.println("1 ���ڸ� �Է��ϼ���(��Ʈ�� ���ϸ� ? �Է�): ");
			user=in.readLine();
			if(user.charAt(0)=='?') 
			{
				boolean givehint = false;
				int i = 0;
				while(!givehint) 
				{
					if(outputString.charAt(i)=='-') 
					{
						System.out.println();
						System.out.println("��Ʈ: "+hiddenString.charAt(i));
						System.out.println();
						failed++;
						givehint = true;
					}
				}
			}
		}while(user.charAt(0)=='?');
		return user.charAt(0);
	}
}