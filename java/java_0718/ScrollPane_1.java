package java_0718;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame{
	
	public ScrollPane_1(String title) {
		super(title);
		
//		Button btn1, btn2;
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200);
		
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
//		panel.setLayout(new FlowLayout());
		
//		btn1 = new Button("버튼");
//		btn2 = new Button("확인");
//		panel.add("North", btn1);
//		panel.add("South", btn2);
		
		panel.add("North", new Button("버튼"));
		panel.add("Center", new TextArea());
		panel.add("South", new Button("확인"));
		
		srp.add(panel);
		
		add("Center", srp);
		
		setLocation(900, 200);
		setSize(200, 200);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new ScrollPane_1("ScrollPane Test");
	}

}
