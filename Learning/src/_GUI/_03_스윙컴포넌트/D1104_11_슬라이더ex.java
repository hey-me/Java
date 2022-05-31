package _GUI._03_스윙컴포넌트;

import java.awt.*;
import javax.swing.*;

public class D1104_11_슬라이더ex extends JFrame {

	public D1104_11_슬라이더ex() {
		setTitle("슬라이더 만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100); // 마지막 숫자가 초기값. 슬라이더를 어디에 둘지
		slider.setPaintLabels(true);  //50간격 숫자가 보이게
		slider.setPaintTrack(true);  //?
		slider.setPaintTicks(true);  // 눈금선 보이게
		slider.setMajorTickSpacing(50);  //50간격 숫자, 눈금 
		slider.setMinorTickSpacing(10);  //10크기 작은 눈금선
		
		c.add(slider);
		setSize(300, 100);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new D1104_11_슬라이더ex();
	}

}
