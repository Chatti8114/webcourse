package java_0716;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button_1_1 {
	public static void main(String[] args) {

		Frame ff = new Frame("프레임");

		Button btn1, btn2, btn3;

		ff.setLayout(new FlowLayout());
		btn1 = new Button(" 가위 ");
		btn2 = new Button(" 바위 ");
		btn3 = new Button("  보 ");

		ff.setBackground(
				new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256))); // 배경화면
																													// 랜덤으로
																													// 색입히기

		btn1.setBackground(new Color(255, 205, 18));
		btn1.setForeground(new Color(255, 255, 255));

		btn2.setBackground(new Color(16, 98, 10));
		btn2.setForeground(new Color(255, 255, 255));

		btn3.setBackground(new Color(0, 51, 153));
		btn3.setForeground(new Color(255, 255, 255));

		ff.add(btn1);
		ff.add(btn2);
		ff.add(btn3);

		ff.setLocation(1300, 200);
		ff.setSize(300, 300);
		ff.setVisible(true);
	}

}
