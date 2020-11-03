package java1103Module;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutTest extends Frame {
	
	// 생성자 
	Label lbl;
	public LayoutTest() { 
		
		// 패널을 생성 
		Panel panel = new Panel(); // FlowLayout으로 설정 
		
		Button btn1 = new Button("Button");
		panel.add(btn1);
		
		lbl = new Label("Print Area");
		panel.add(lbl);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lbl.setText("Button Click"); 
				// 지역변수이기 때문에 위로 올리고 final 을 붙여줌 
				// anonymous 클래스 안에서는 지역변수 사용을 못함!
				
			}
			
		});

		// 패널을 프레임에 추가 
		add(panel);
		
		setTitle("Layout Practice");
		setBounds(100,200,300,300);
		setVisible(true); // 보여주게 하는 코드  
	}
}
