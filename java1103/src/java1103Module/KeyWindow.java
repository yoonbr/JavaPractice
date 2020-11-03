package java1103Module;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class KeyWindow extends Frame {
	
	// 화면에 필요한 인스턴스들의 변수 선언 
	Label lbl;
	// 생성자 
	public KeyWindow() {
		setLayout(null);
		
		lbl = new Label("@");
		lbl.setBounds(100, 100, 100, 100);
		add(lbl);
		
		setTitle("Keyboard Event");
		setBounds(300,300,400,400);
		setVisible(true);
		
		this.addMouseMotionListener(new MouseMotionListener() {
			@Override // 글자를 드래그 할 때 마다 글자가 따라서 움직임 
			public void mouseDragged(MouseEvent e) {
				lbl.setBounds(e.getX(), e.getY(), 20, 20);
			}
			@Override // 마우스 커서가 움직일 때 마다 글자가 따라서 움직임 
			public void mouseMoved(MouseEvent e) {
				//lbl.setBounds(e.getX(), e.getY(), 20, 20);
			}	
		});
		
	} 
}
