package selfstudy;

import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxGroupTest extends Applet implements ItemListener 
{
	Label myLabel;
	Checkbox myCheckbox1, myCheckbox2,myCheckbox3;
	CheckboxGroup group;
	
	public void init() 
	{
		myCheckbox1 = new Checkbox("C",false,group);
		myCheckbox1.addItemListener(this);
		add(myCheckbox1);
		myCheckbox2 = new Checkbox("C++",group,false);
		myCheckbox2.addItemListener(this);
		add(myCheckbox2);
		myCheckbox3 = new Checkbox("Java",group,true);
		myCheckbox3.addItemListener(this);
		add(myCheckbox3);
		
		myLabel = new Label();
		myLabel.setText("Choice the Checkbox");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.yellow);
		add(myLabel);
		
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==myCheckbox1) {myLabel.setText("CHOICE: C");}	
		else if(e.getSource()==myCheckbox2) {myLabel.setText("CHOICE: C++");}
		else{myLabel.setText("CHOICE: Java");}
	}
}
