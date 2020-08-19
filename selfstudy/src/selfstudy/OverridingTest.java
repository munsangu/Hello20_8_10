package selfstudy;
public class OverridingTest 
{
	public static void main(String[] args) 
	{
		Dog yourDog = new Dog("벤지",4);
		
		yourDog.bark();
		yourDog.bite("우체부");
		
		Snoopy myDog = new Snoopy();
		
		myDog.bark();
		myDog.bite("낸시",9);
	}
}
