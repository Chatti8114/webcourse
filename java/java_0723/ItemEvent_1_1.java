package java_0723;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_1_1 extends Frame implements ItemListener{  // 라디오 체크박스
	
	Checkbox ckb1, ckb2, ckb3, ckb4;
	CheckboxGroup cbg;
	TextArea txt_info;
	
	public ItemEvent_1_1(String title) {
		super(title);
		
		Label lbl = new Label(" 당신이 좋아하는 계절은? ");
		
		txt_info = new TextArea();
		Panel panel = new Panel();
		
		cbg = new CheckboxGroup();
		
		ckb1 = new Checkbox("봄", cbg, false);
		ckb2 = new Checkbox("여름", cbg, false);
		ckb3 = new Checkbox("가을", cbg, false);
		ckb4 = new Checkbox("겨울", cbg, true);
		
		 ckb1.addItemListener(this);
		 ckb2.addItemListener(this);
		 ckb3.addItemListener(this);  // 이벤트 달아주기
		 ckb4.addItemListener(this);
		 
		 panel.add(ckb1);
		 panel.add(ckb2);
		 panel.add(ckb3);
		 panel.add(ckb4);
		 
		 add("North", lbl);
		 add("Center", txt_info);
		 add("South", panel);
		 
		 setSize(300, 300);
		 setVisible(true);
	}
	
	public static void main(String[] args) {
		new ItemEvent_1_1("Item Event Test");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		txt_info.setText("");  // 새롭게 쓴다는 뜻이므로, "~을 좋아하시는군요. " 를 계속 누적해서 기록하고 싶으면 이걸 없애기
		
		if (ckb1.getState()) {
			
			txt_info.append(" 봄을 좋아하시는군요. \n");
			
		} if (ckb2.getState()) {
			
			txt_info.append(" 여름을 좋아하시는군요. \n");
			
		} if (ckb3.getState()) {
			
			txt_info.append(" 가을을 좋아하시는군요. \n");
			
		} if (ckb4.getState()) {
			
			txt_info.append(" 겨울을 좋아하시는군요. \n");
			
		}
		
	}
	

}