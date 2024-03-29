package java_0724;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxEventTest_1_1 extends Frame {
	
	Label q1,q2,q3;
	Label score;
	
	Checkbox q1cb1, q1cb2, q1cb3,q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	Checkbox q3cb1, q3cb2, q3cb3, q3cb4;
	
	CheckboxGroup group,group1;
	Button end;
	
	public CheckboxEventTest_1_1(String title) {
		super(title);
		setSize(500, 400);
		setLayout(new GridLayout(20,1));  // 20의 줄 수가 모자르면 옆으로 넘어가게 된다.
		
		q1 = new Label("1. 다음 중 ActionEvent 의 " + "actionPerformed() 메소드가 호출되는 경우는?");
		
		q1cb1 = new Checkbox("Button 을 눌렀을 때");
		q1cb2 = new Checkbox("TextField 에서 Enter 키를 눌렀을 때");
		q1cb3 = new Checkbox("MenuItem 을 클릭했을 때");
		q1cb4 = new Checkbox("List 에서 더블 클릭으로 Item 을 선택했을 때");
		
		q2 = new Label("2. Frame 의 기본 LayoutManager 는 (하나만 고르시오)");
		
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout", group, false);
		q2cb2 = new Checkbox("GridLayout", group, false);
		q2cb3 = new Checkbox("BorderLayout", group, false);
		q2cb4 = new Checkbox("CardLayout", group, false);
		
		q3 = new Label("3. import 를 호출하기 위해 눌러야 하는 키보드 단축키는?");
		
		group1 = new CheckboxGroup();
		q3cb1 = new Checkbox("Ctrl+Shift+O", group1, false);
		q3cb2 = new Checkbox("Alt+Shift+Tab", group1, false);
		q3cb3 = new Checkbox("Ctrl+Shift+P", group1, false);
		q3cb4 = new Checkbox("Alt+U", group1, false);
		
		score = new Label("*** 결과 : ");
		end = new Button("이 버튼을 누르면 결과를 알 수 있습니다.");
		end.setBackground(new Color(207,144,255));
		
		end.addActionListener(new ActionListener() {   // Anonymous 방식

			@Override
			public void actionPerformed(ActionEvent e) {
				
				float totalScore = 0.0f;
				
				if(q1cb1.getState())		totalScore += 12.5f;
				//  q1cb1 값이 true 라면
				if(q1cb2.getState())		totalScore += 12.5f;
				if(q1cb3.getState())		totalScore += 12.5f;
				if(q1cb4.getState())		totalScore += 12.5f;
				
				if(q2cb3.getState())		totalScore += 25.0f;
				// q2cb3 값이 true 라면
				
				if(q3cb1.getState())		totalScore += 25.0f;
				
				score.setText("당신의 점수는" + totalScore + " 점 입니다.");
			}
		});
		
		add(q1);
		add(q1cb1);add(q1cb2);add(q1cb3);add(q1cb4);
		add(new Label(""));
		add(q2);
		add(q2cb1);add(q2cb2);add(q2cb3);add(q2cb4);
		add(new Label(""));
		add(q3);
		add(q3cb1);add(q3cb2);add(q3cb3);add(q3cb4);
		add(end);
		add(score);
		
		// 총 19줄
		
		setVisible(true);
		}
	
	public static void main(String[] args) {
		new CheckboxEventTest_1_1("Score Test");
	}
		
	}