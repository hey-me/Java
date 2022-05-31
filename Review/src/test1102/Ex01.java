package test1102;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex01 {

	public static void main(String[] args) {
//1. 마우스 올리기 내리기 연습(Love Java -> 자바 좋아)
//마우스를 갖다대면(entered) love java, 마우스가 비키면 자바좋아로(exist)
		new LoveJava();
	}

}
class LoveJava extends JFrame{
	LoveJava(){
		setTitle("자바좋아?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label=new JLabel("Love Java");
		c.add(label);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				JLabel la=(JLabel)e.getSource();
				la.setText("Love Java");
				//c.add(la)를 한것도 아닌데 변수이름이 다른데 어떻게 바뀌는거지
//				label.setText("Love Java");
			}
		});
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e){
				label.setText("자바 좋아");
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	}
}