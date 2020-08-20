package selfstudy;

import java.io.IOException;

public class Gamejava2_07 
{
	public static void main(String[] args) throws IOException 
	{
		Hangman2 hangman = new Hangman2();
		
		int result = hangman.playGame();
		
		System.out.println();
		if(result<=2) 
		{
			System.out.println("참 잘했어요!");
		}
		else if(result<=3) 
		{
			System.out.println("잘 했어요!");
		}
		else if(result<=4) 
		{
			System.out.println("보통이네요!");
		}
		else 
		{
			System.out.println("분발하세요!");
		}
	}
}
