package java_0718;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CanvasTest_1_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("CanvasTest");
		ff.setSize(300, 300);
//		ff.setLayout(null);
		ff.setLayout(new FlowLayout());
		
		Canvas cc = new Canvas();
		Canvas cc2 = new Canvas();
		
		cc.setBackground(new Color(150,30,20));
		cc.setBounds(100, 100, 150, 100);
//		cc.setSize(150, 100);	// setLayout(null) 해주면 위치가 알아서 들어감
//		cc2.setSize(150, 100);
		cc2.setBackground(new Color(30,150,20));
		cc2.setBounds(100, 250, 150, 100);
		
		ff.add(cc);
		ff.add(cc2);
		
		ff.setVisible(true);
		
	}

}