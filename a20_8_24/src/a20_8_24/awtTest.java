package a20_8_24;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class awtTest extends Applet implements TextListener, ActionListener, ItemListener,AdjustmentListener
{
	Label lbl;
	Button btn1, btn2;
	TextField txt1, txt2;
	TextArea ta;
	Checkbox chk1, chk2, chk3, chk4;
	CheckboxGroup cg;     // 한개로 묶을 용도
	Choice ch;
	List list;
	Scrollbar sc;
	
	public void init() 
	{
		this.setLayout(null);
		lbl = new Label("NAME");
		lbl.setBounds(10, 10, 50, 20);
		this.add(lbl);
		btn1 = new Button("SAVE");
		btn2 = new Button("CANCEL");
		btn1.setBounds(70, 100, 50, 20);
		this.add(btn1);
		btn2.setBounds(130,100,50,20);
		this.add(btn2);
		txt1 = new TextField(10);
		txt1.setBounds(70, 10, 100, 20);
		this.add(txt1);
		chk1 = new Checkbox("C++");
		chk1.setBounds(10, 50, 50, 20);
		this.add(chk1);
		chk2 = new Checkbox("Java");
		chk2.setBounds(70, 50, 50, 20);
		this.add(chk2);
		cg = new CheckboxGroup();
		chk3 = new Checkbox("Male",cg,true);
		chk4 = new Checkbox("Female",cg,false);
		chk3.setBounds(130, 50, 50, 20);
		chk4.setBounds(190, 50, 50, 20);
		this.add(chk3);
		this.add(chk4);
		ch = new Choice();
		ch.addItem("JOB");
		ch.addItem("Cleaner");
		ch.addItem("Doctor");
		ch.addItem("Student");
		ch.setBounds(10, 75, 60, 20);
		this.add(ch);
		list = new List();
		list.add("Sleep");
		list.add("Read the book");
		list.add("Hiking");
		list.setBounds(180,70, 100, 50);
		this.add(list);
		sc = new Scrollbar(Scrollbar.VERTICAL,50,0,1,101);
		sc.setBounds(300, 75, 20, 200);
		this.add(sc);
		
		ta = new TextArea(50,100);
		ta.setBounds(10, 120, 200, 100);
		this.add(ta);
		
		//txt1.addTextListener(this);
		txt1.addActionListener(this);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		chk4.addItemListener(this);
		ch.addItemListener(this);
		list.addItemListener(this);
		sc.addAdjustmentListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public void textValueChanged(TextEvent e) 
	{
		if(e.getSource()==txt1) {ta.append(txt1.getText()+"\n");}
	}
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==txt1) {ta.append(txt1.getText()+"\n");}
		if(e.getSource()==btn1) {ta.append(txt1.getText()+"\n");}
		else if(e.getSource()==btn2) {txt1.setText(" ");}
	}
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource()==chk1 ) {ta.append(chk1.getLabel()+"\n");}
		else if(e.getSource()==chk2 && chk2.getState()==true) {ta.append(chk2.getLabel()+"\n");}
		if(e.getSource()==chk3) {ta.append("남자\n");}
		else if(e.getSource()==chk4 ) {ta.append("여자\n");}
		if(e.getSource()==ch) {ta.append(ch.getSelectedItem()+"\n");}
		if(e.getSource()==list) {ta.append(list.getSelectedItem()+"\n");}
	}
	public void adjustmentValueChanged(AdjustmentEvent e) 
	{
		if(e.getSource()==sc){ta.append(sc.getValue()+"\n");}
		
	}
}
