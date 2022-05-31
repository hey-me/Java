package test1104;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex09 {

	public static void main(String[] args) {
		new HandGame();
	}

}
class HandGame extends JFrame{
	public HandGame() {
		setTitle("가위 바위 보 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.GRAY);
		JPanel panel2=new JPanel();
		panel2.setBackground(Color.yellow);
		JLabel imgLabel=new JLabel();
		ButtonGroup g=new ButtonGroup();
		JRadioButton[] button=new JRadioButton[3];
		button[0]=new JRadioButton(new ImageIcon("images/gawi.jpg"));
		button[1]=new JRadioButton(new ImageIcon("images/bawi.jpg"));
		button[2]=new JRadioButton(new ImageIcon("images/bo.jpg"));
		JLabel comLabel=new JLabel();
		JLabel result=new JLabel("Winner");
		for (int i = 0; i < button.length; i++) {
			button[i].setBorderPainted(true);
			g.add(button[i]);
			panel.add(button[i]);
			button[i].addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					int random=(int)(Math.random()*3);
					comLabel.setIcon(button[random].getIcon());
					if(e.getStateChange()==ItemEvent.DESELECTED) {
						return;
					}
					if(button[0].isSelected()) {
						imgLabel.setIcon(button[0].getIcon());
					}else if(button[1].isSelected()) {
						imgLabel.setIcon(button[1].getIcon());
					}else {
						imgLabel.setIcon(button[2].getIcon());
					}
					if(imgLabel.getIcon()==comLabel.getIcon()) {
						result.setText("same!!!");
					}else if((imgLabel.getIcon()==button[0].getIcon())&&(comLabel.getIcon()==button[1].getIcon())) {
						result.setText("You Lose!!!");
					}else if((imgLabel.getIcon()==button[1].getIcon())&&(comLabel.getIcon()==button[2].getIcon())) {
						result.setText("You Lose!!!");
					}else if((imgLabel.getIcon()==button[2].getIcon())&&(comLabel.getIcon()==button[0].getIcon())) {
						result.setText("You Lose!!!");
					}else if((imgLabel.getIcon()==button[0].getIcon())&&(comLabel.getIcon()==button[2].getIcon())) {
						result.setText("You Win!!!");
					}else if((imgLabel.getIcon()==button[1].getIcon())&&(comLabel.getIcon()==button[0].getIcon())) {
						result.setText("You Win!!!");
					}else if((imgLabel.getIcon()==button[2].getIcon())&&(comLabel.getIcon()==button[1].getIcon())) {
						result.setText("You Win!!!");
					}
				}
			});
		}
		
		panel2.add(imgLabel);
		panel2.add(new JLabel("me"));
		panel2.add(comLabel);
		panel2.add(new JLabel("com"));
		result.setForeground(Color.red);
		panel2.add(result);
		
		
		c.add(panel, BorderLayout.NORTH);
		c.add(panel2);
		setSize(400, 300);
		setVisible(true);
	}
}