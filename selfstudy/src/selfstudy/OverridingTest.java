package selfstudy;
public class OverridingTest 
{
	public static void main(String[] args) 
	{
		Dog yourDog = new Dog("����",4);
		
		yourDog.bark();
		yourDog.bite("��ü��");
		
		Snoopy myDog = new Snoopy();
		
		myDog.bark();
		myDog.bite("����",9);
	}
}
