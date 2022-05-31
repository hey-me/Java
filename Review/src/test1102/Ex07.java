package test1102;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex07 {

	public static void main(String[] args) {
		new ClickEx();
	}

}

class ClickEx extends JFrame{
	ClickEx(){
		setTitle("Ŭ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		setLayout(null);
		JLabel label=new JLabel("�ڹ�");
		label.setSize(40,20);
		label.setLocation(100, 100);
		c.add(label);
		label.addMouseListener(new MouseAdapter() {//add�����ʸ� �󺧿��ٰ� �޸� if�� ���ǹ��ȴ޾Ƶ� ����
			@Override
			public void mouseClicked(MouseEvent e) {
				int x=(int)(Math.random()*(c.getWidth()-label.getWidth()));
				int y=(int)(Math.random()*(c.getHeight()-label.getHeight()));
				
//				if(e.getPoint()==label.getLocation()) {
					label.setLocation(x, y);
//				}
			}
		});
	
		
		setSize(400, 500);
		setVisible(true);
		
	}
}