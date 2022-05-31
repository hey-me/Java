package test1104;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ex06 {

	public static void main(String[] args) {
		new Slider();
	}

}
class Slider extends JFrame{
	Slider(){
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,200,100);
		
		JLabel label=new JLabel(String.valueOf(slider.getValue()));
		label.setOpaque(true);
		label.setBackground(Color.green);
		label.setLocation(250, 20);
		
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				
				label.setText(String.valueOf(slider.getValue()));
			}
		});
		
		
		c.add(slider);
		c.add(label);
		
		setSize(300, 200);
		setVisible(true);
	}
}