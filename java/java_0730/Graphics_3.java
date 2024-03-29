package java_0730;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_3 extends Frame {
	
	public Graphics_3(String title) {
		super(title);
		XCanvas grr = new XCanvas();
		
		grr.setSize(300, 300);
		add("Center", grr);
		
		setSize(350, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Graphics_3("Graphics Test");	
	}

}

class XCanvas extends Canvas {
	int[] point_x1 = {10,20,50,10,100};
	int[] point_y1 = {20,70,100,150,100};
	
	int[] point_x2 = {100,10,190};
	int[] point_y2 = {110,200,200};
		
	public void paint(Graphics g) {
		g.drawPolygon(point_x1, point_y1, 5);
		g.fillPolygon(point_x2, point_y2, 3);
		
		g.setColor(new Color(0,51,153));
		g.fillArc(250, 200, 100, 100, 45, 270);
	}
	
}
