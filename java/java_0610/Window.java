package java_0610;

import java.awt.Color;
import java.awt.Frame;

public class Window extends Frame {
    public Window(String var1) {
        super(var1);
        this.setBounds(300, 300, 200, 200);
        this.setBackground(new Color(255, 255, 0));
        this.setVisible(true);
    }

    public static void main(String[] var0) {
        new Window("처음하는 윈도우 프로그램 ~~~");
    }
}
