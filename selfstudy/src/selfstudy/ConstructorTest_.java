package selfstudy;
public class ConstructorTest_ 
{
	public static void main(String[] args) 
	{
		Animal aAnimal = new Animal();
		aAnimal.print();
		
		Human aHuman = new Human();
		aHuman.print();
		
		Boy aBoy = new Boy();
		aBoy.print();
		
		System.out.println();
		
		Animal tiger = new Animal("�ź���",8);
		tiger.print();
		
		Human mary = new Human("������",20);
		mary.print();
		
		Boy smin = new Boy("��¹�",14);
		smin.print();
	}
}
