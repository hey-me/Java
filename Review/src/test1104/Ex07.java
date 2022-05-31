package test1104;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex07 {

	public static void main(String[] args) {
		new SliderCom();
	}

}
class SliderCom extends JFrame{
	public SliderCom() {
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		JSlider slider=new JSlider(JSlider.HORIZONTAL,1,100,50);
		JLabel label=new JLabel("I Love Java",SwingConstants.CENTER);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				int size=slider.getValue();
				label.setFont(new Font("±¼¸²Ã¼", Font.BOLD, size));
				
			}
		});
		
		
		
		c.add(slider, BorderLayout.NORTH);
		c.add(label, BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
	}
}