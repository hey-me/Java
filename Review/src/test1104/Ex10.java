package test1104;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.annotation.Repeatable;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex10 {

	public static void main(String[] args) {
		new ClickLabel();
	}

}
class ClickLabel extends JFrame{
	int x=0;
	ClickLabel(){
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		JLabel[]label=new JLabel[10];
		setSize(300, 300);
		
		setLayout(null);
		for (int i = 0; i < label.length; i++) {
			label[i]=new JLabel(String.valueOf(i));
			label[i].setForeground(Color.pink);
			label[i].setSize(30, 30);
			int t=(int)(Math.random()*(getWidth()-label[i].getWidth()-20));
			int y=(int)(Math.random()*(getHeight()-label[i].getHeight()-30));
			label[i].setLocation(t, y);
			c.add(label[i]);
		}
		
		for(int i=0; i<label.length; i++) {
			label[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					JLabel la=(JLabel)e.getSource();
					if(x==Integer.parseInt(la.getText())) {
						la.setVisible(false);
						x++;
						if(x==10) {
							for(int j=0; j<label.length; j++) {
							int t=(int)(Math.random()*(getWidth()-label[j].getWidth()-20));
							int y=(int)(Math.random()*(getHeight()-label[j].getHeight()-30));
							label[j].setLocation(t, y);
							label[j].setVisible(true);
							x=0;
							}
						}
					}
								
				}
			});
		}
//			if(x==10) {
//				System.out.println(x);
//				for (int j = 0; j < label.length; j++) {
//					
//					label[j].setVisible(true);
//				int t=(int)(Math.random()*(this.getWidth()-label[j].getWidth()-20));
//				int y=(int)(Math.random()*(this.getHeight()-label[j].getHeight()-30));
//				label[j].setLocation(t,y);
//				}
//			}
		setVisible(true);
	}
}

class Repeat implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		new ClickLabel();
	}
	
}