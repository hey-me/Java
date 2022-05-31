package _GUI._05_고급컴포넌트;

import java.awt.*;

import javax.swing.*;

public class D1108_04_툴팁ex extends JFrame{
	
	private Container contentpane;
	
	public D1108_04_툴팁ex() {
		setTitle("툴팁 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentpane = getContentPane();
		createToolBar();
		setSize(400, 150);
		setVisible(true);
	
	}
	
	
	
	private void createToolBar() {
		JToolBar bar = new JToolBar("Kitae Menu");
		contentpane.setBackground(Color.LIGHT_GRAY);
		
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일을 생성합니다.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("images/open.jpg"));
		openBtn.setToolTipText("파일을 엽니다");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn =  new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다");
		bar.add(saveBtn);
		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요");
		bar.add(tf);
		contentpane.add(bar, BorderLayout.NORTH);
		
//		ToolTipManager m = ToolTipManager.sharedInstance(); 객체생성
//		m.setEnabled(true); 활성화 비활성화
//		m.setInitialDelay(2000); 툴팁이 나타나는 최초 지연시간 제어
//		m.setDismissDelay(2000); 툴팁이 켜져있는 지연시간제어
		
	}



	public static void main(String[] args) {
		new D1108_04_툴팁ex();
	}

}
