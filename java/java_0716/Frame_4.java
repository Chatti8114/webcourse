package java_0716;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_4 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("중앙 배열");
		
		ff.setSize(400, 300);
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		// 구현된 Toolkit 객체를 얻는다.
		
		Dimension screenSize = tk.getScreenSize();
		// 화면의 크기를 구한다
		
		ff.setLocation(screenSize.width/2 - 200, screenSize.height/2 - 150);
		ff.setVisible(true);
	}

}
