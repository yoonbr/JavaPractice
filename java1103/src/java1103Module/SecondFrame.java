package java1103Module;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;

public class SecondFrame extends Frame {

	// 생성자 
	public SecondFrame() {
		
			// 패널 생성 
			Panel p = new Panel();
			
			final Label lbl = new Label("ORDER HERE");
			Thread th = new Thread() { 
				boolean flag = true;
				public void run() {
					while(true) {
						if(flag == false) {
							lbl.setBackground(Color.yellow);
						} else {
							lbl.setBackground(Color.orange);
						}
						flag = !flag;
						try {
							Thread.sleep(500);
						} catch (Exception e) {}
					}
					
				}
			};
			th.start();
			
			p.add(lbl);
			
			// 선택 목록을 삽입 
			Choice choice = new Choice();
			choice.add("Americano");
			choice.add("Cafe Latte");
			choice.add("Ice Choco");
			choice.add("Greentea Latte");
			// 패널에 추가 
			p.add(choice);
			
			// List(4, true); -> 보여지는 개수, 다중선택 유무(t/f) 
			List list = new List();
			list.add("tall");
			list.add("grande");
			list.add("venti");
			list.add("trenta");
			p.add(list);
			
			// 읽기 대화상자 생성 
			FileDialog fd = 
					new FileDialog(this, "file",
							FileDialog.LOAD);
			fd.setVisible(true);
			System.out.printf("%s\n", fd.getFile());
			
			// 패널을 프래임에 추가 
			add(p);
			
			Checkbox cb1 = 
					new Checkbox("Takeout");
			Checkbox cb2 = 
					new Checkbox("Into");
			p.add(cb1);
			p.add(cb2);
			
			Button btn = new Button("ORDER");
			p.add(btn);
		
			// 기본 옵션 설정 
			setTitle("COFFEE ORDER");
			setBounds(200,200,400,400);
			setVisible(true);
			
	}
}
