package test1104;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01 {

	public static void main(String[] args) {
//1. 그림과 같이 2개의 체크박스와 버튼을 만든다. "버튼 비활성화" 체크박스를 선택하면 버튼이 작동하지 못하게 하고,
//	해제하면 다시 작동하게 한다. "버튼 감추기" 체크박스를 선택하면 버튼이 보이지 않도록 하고 해제하면 버튼이 보이도록 한다.
		new Check1();
	}

}
class Check1 extends JFrame{
	Check1(){
		setLocation(800, 400);
		setTitle("체크박스2개");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		JCheckBox check1=new JCheckBox("버튼 비활성화");
		JCheckBox check2=new JCheckBox("버튼 감추기");
		JButton button=new JButton("test button");
		
		check1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(e.getStateChange()==ItemEvent.SELECTED) {
				button.setEnabled(false);
				}else {
					button.setEnabled(true);
				}
			}
		});
		check2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED) {
				button.setVisible(false);
				}else {
					button.setVisible(true);
				}
			}
		});
		
		panel.add(check1);
		panel.add(check2);
		JPanel panel2=new JPanel();
		button.setSize(100, 50);
		panel2.add(button);
		
		c.add(panel, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.CENTER);
		
		
		setSize(300, 150);
		setVisible(true);
	}
}
