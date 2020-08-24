package selfstudy;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListTest extends Applet implements ActionListener, ItemListener
{
	Label myLabel;
	List myList;
	
	public void init() 
	{
		myList = new List(3, false);
		myList.add("C");
		myList.add("C++");
		myList.add("Java");
		myList.add("Python");
		myList.addActionListener(this);
		myList.addItemListener(this);
		add(myList);
		
		myLabel = new Label();
		myLabel.setText("Choice the Component in list");
		myLabel.setAlignment(Label.CENTER);
		myLabel.setBackground(Color.yellow);
		add(myLabel);
	}
	
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==myList) {myLabel.setText("DoubleClick: "+myList.getSelectedItem());}
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==myList) {myLabel.setText("Click: "+myList.getSelectedItem());}		
	}
}
