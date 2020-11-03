package java1103Module;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEventProcessing extends Frame {
	// 바깥쪽에 변수 생성 후 import 
	Button btn1, btn2;
	Label lbl;
	
	public ButtonEventProcessing() {
		Panel panel = new Panel();
		
		btn1 = new Button("button");
		panel.add(btn1);
		
		btn2 = new Button("exit");
		panel.add(btn2);
		
		lbl = new Label("			");
		panel.add(lbl);
		
		add(panel);
		
		ActionListener routing = 
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == btn1) {
							lbl.setText("btn1 click");
						} else if (e.getSource() == btn2) {
							System.exit(0);
						}	
					}
			
		};
		// 뒤에 routing 만 작성 
		btn1.addActionListener(routing);
		btn2.addActionListener(routing);
		
		// 기본 설정 
		setTitle("DISP AND EXIT");
		setBounds(100,100,300,300);
		setVisible(true);
	}
}
