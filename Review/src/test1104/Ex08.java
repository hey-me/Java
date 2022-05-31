package test1104;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;


public class Ex08 {

	public static void main(String[] args) {
		new Area();
	}

}
class Area extends JFrame{
	Area(){
		setTitle("JTextArea Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.setLayout(new BorderLayout());
		JTextArea area=new JTextArea(7,20);
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,100,0);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				slider.setValue(area.getText().length());
			}
		});
		slider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				String a=area.getText();
				if(area.getText().length()<slider.getValue()) {
					slider.setValue(area.getText().length());
				}
				if(area.getText().length()>slider.getValue()) {
					String b=a.substring(0, slider.getValue());
						area.setText(b);
				}
				
			}
		});
		c.add(new JScrollPane(area),BorderLayout.NORTH);
		c.add(slider);
		setSize(300, 300);
		setVisible(true);
	}
}