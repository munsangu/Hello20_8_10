package selfstudy;
import java.applet.Applet;
import java.awt.Choice;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class ChoiceTest extends Applet implements ItemListener
{
	Label myLabel;
	Choice myChoice;
	
	public void init() 
	{
		myChoice=new Choice();
		myChoice.addItem("C");
		myChoice.addItem("C++");
		myChoice.addItem("Java");
		myChoice.addItemListener(this);
		add(myChoice);
	}
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==myChoice) {myLabel.setText("CHOICE: "+myChoice.getSelectedItem());}
	}
}
