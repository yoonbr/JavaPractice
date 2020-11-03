package java1103Module;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FirstFrame extends Frame {

	public FirstFrame() {
		this.setTitle("첫번째 윈도우"); 
		this.setBounds(100,100,300,300);
		
		// 패널을 생성 
		Panel p = new Panel();
		// 버튼을 생성 
		Button btn = new Button("button");
		// 버튼을 패널에 추가 
		p.add(btn);
		//패널을 프레임에 추가 
		this.add(p);
		
		Checkbox cb1 = 
				new Checkbox("Java");
		Checkbox cb2 = 
				new Checkbox("Kotlin");
		p.add(cb1);
		p.add(cb2);
		
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox woman = 
				new Checkbox("Woman", group, true);
		
		Checkbox man = 
				new Checkbox("man", group, false);
		
		p.add(woman);
		p.add(man);
		
		this.setVisible(true);
		this.setBackground(Color.DARK_GRAY);
		
	
	}
}
