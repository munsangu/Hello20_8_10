package selfstudy;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ButtonTest extends Applet implements ActionListener
{
	Label myLabel;
	Button myButton1,  myButton2, myButton3;
	
	public void init() 
	{
		myButton1 = new Button();
		myButton1.setLabel("C");
		myButton1.addActionListener(this);
		add(myButton1);
		
		myButton2 = new Button("C++");
		myButton2.addActionListener(this);
		add(myButton2);
		
		myButton3 = new Button("Java");
		myButton3.addActionListener(this);
		add(myButton3);
		
		myLabel = new Label();
		myLabel.setText("Push the Button");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.yellow);
		add(myLabel);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == myButton1) {myLabel.setText("CHOICE: C");}
		else if(e.getSource() == myButton2){myLabel.setText("CHOICE: C++");}
		else {myLabel.setText("CHOICE: Java");}
	}
}
