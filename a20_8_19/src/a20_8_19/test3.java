package a20_8_19;
import java.applet.Applet;
import java.awt.Label;
import java.awt.TextField;
public class test3 extends Applet 
{
	Label lbl1, lbl2;
	TextField txt1,txt2;
	public void init() 
	{
		lbl1 = new Label("NAME");
		lbl2 = new Label("ID");
		txt1 = new TextField(10);
		txt2 = new TextField(10);
		this.add(lbl1);   // ∑π¿Ã∫Ì
		this.add(txt1);	  // ≈ÿΩ∫∆Æ« µÂ
		this.add(lbl2);
		this.add(txt2);
		txt1.setText("Ï˝’Ù");
		txt2.setText("Ï˝’Ù");
	}
	public void start() 
	{
		txt1.setText(" ");
		txt2.setText(" ");
	}
}
