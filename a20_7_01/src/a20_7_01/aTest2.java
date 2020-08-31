package a20_7_01;
import java.util.Scanner;

public class aTest2 {
	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextInt();
			switch(a) {
				case 1: 		
					System.out.println("1¿ù"); 
					break;
				case 2:
					System.out.println("2¿ù");
					break;
				default:
					System.out.println("Error");
		}
	}
}
