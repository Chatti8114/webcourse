package java_0805;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ImageLabelTest_2 extends JFrame implements ActionListener {
	private JPanel panel1, panel2, panel3, panel4;
	private JLabel label;
	private JButton button1, button2, button3;
	
	public ImageLabelTest_2() {
		setTitle("�̹��� ���̺�");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		label = new JLabel("�̹����� ������ �Ʒ� ��ư�� �����ÿ�.");
		
		button1 = new JButton("�̹��� ���̺�");
		ImageIcon icon1 = new ImageIcon("bttrfly1.png");
		button1.setIcon(icon1);
		
		button2 = new JButton("�̹��� ���̺�1");
		ImageIcon icon2 = new ImageIcon("bttrfly2.png");
		button2.setIcon(icon2);
		
		button3 = new JButton("�̹��� ���̺�2");
		ImageIcon icon3 = new ImageIcon("bttrfly3.png");
		button3.setIcon(icon3);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		panel1.add(label);  // panel �� ���� �ְ�
//		panel2.add(label);
		
		panel2.add(button1);  // panel1 �� ��ư �� ���� �ְ�
		panel2.add(button2);
		panel2.add(button3);
		
		panel3 = new JPanel(new GridLayout(1,3));
		
		panel3.add(panel1);  // panel2 �� panel �� panel1 �� ���� ����
		panel3.add(panel2);
		
		add(panel3);
//		add(panel2, BorderLayout.CENTER);
//		add(panel, BorderLayout.CENTER);
//		add(panel1, BorderLayout.SOUTH);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		ImageLabelTest_2 t = new ImageLabelTest_2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton obj = (JButton) e.getSource(); 
		
		if(obj == button1) {
			ImageIcon bites = new ImageIcon("src\\images\\snack_bites.jpg");
			label.setIcon(bites);
			label.setText(null);
		}
		
		else if(obj == button2) {
			ImageIcon machi = new ImageIcon("src\\images\\snack_machi.jpg");
			label.setIcon(machi);
			label.setText(null);
		}
		
		else {
			ImageIcon gogumat = new ImageIcon("src\\images\\snack_gogumat.jpg");
			label.setIcon(gogumat);
			label.setText(null);
		}
		
		
		
	}


}