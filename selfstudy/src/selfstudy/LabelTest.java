package selfstudy;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;

public class LabelTest extends Applet 
{
	Label myLabel1, myLabel2, myLabel3;
	
	public void init() 
	{
		myLabel1= new Label();
		myLabel1.setText("C");
		myLabel1.setAlignment(Label.LEFT);
		myLabel1.setBackground(Color.cyan);
		add(myLabel1);
		
		myLabel2= new Label("C++");
		myLabel2.setAlignment(Label.CENTER);
		myLabel2.setBackground(Color.green);
		add(myLabel2);
		
		myLabel3= new Label("Java",Label.RIGHT);
		myLabel3.setBackground(Color.yellow);
		add(myLabel3);
		
	}
}
