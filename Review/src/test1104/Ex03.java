package test1104;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ex03 {

	public static void main(String[] args) {
		new MoneyC();
	}

}
class MoneyC extends JFrame{
	MoneyC(){
		setTitle("Money Changer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthP(), BorderLayout.NORTH);
		c.add(new WestP(), BorderLayout.WEST);
		c.add(new CenterP(), BorderLayout.CENTER);
		c.add(new EastP(), BorderLayout.EAST);
		setSize(300, 500);
		setVisible(true);
	}
	class NorthP extends JPanel{
		NorthP(){
		setLayout(new FlowLayout());
		add(new JLabel("금액"));
		JTextField tf=new JTextField(10);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int total=Integer.parseInt(tf.getText());
			}
		});
		add(tf);
		JButton button=new JButton("계산");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		add(button);
		}
	}
	class WestP extends JPanel{
		JLabel []label=new JLabel[8];
		String []won={"오만원", "만원","천원","500원","100원","10원","5원","1원"};
		WestP(){
			setLayout(new GridLayout(8, 1));
			for (int i = 0; i < label.length; i++) {
				label[i]=new JLabel(won[i],SwingConstants.RIGHT);
				label[i].setLocation(30,100+i*200);
				add(label[i]);
			}
		}
	}
	class CenterP extends JPanel{
		JTextField[]tfr=new JTextField[8];
		int[]won= {50000,10000,1000,500,100,10,5,1};
			CenterP(){
				setLayout(new GridLayout(8, 1));
				
				for (int i = 0; i < tfr.length; i++) {
					tfr[i]=new JTextField();
					tfr[i].setPreferredSize(new Dimension(50, 10));
					tfr[i].setSize(10, 20);
					add(tfr[i]);
					
				}
				
			}
	}
	class EastP extends JPanel{
		EastP() {
			JButton button2=new JButton("시작");
			button2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			add(button2);
		
		}
	}
}