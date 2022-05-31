package _GUI._05_���������Ʈ;

import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;

public class D1108_02_�޴������ۿ�_�׼��̺�Ʈ�ޱ�ex extends JFrame {

	private JLabel imgLabel = new JLabel();

	public D1108_02_�޴������ۿ�_�׼��̺�Ʈ�ޱ�ex() {
		setTitle("Menu�� Action������ ����� ����");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250, 220);
		setVisible(true);
	}

	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = { "Load", "Hide", "ReShow", "Exit" };
		JMenu screenMenu = new JMenu("Screen");

		MenuActionListener listener = new MenuActionListener();

		for (int i = 0; i < itemTitle.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);

	}

	class MenuActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "Load":
				if (imgLabel.getIcon() != null)
					return;
				imgLabel.setIcon(new ImageIcon("images/image0.jpg"));
				break;

			case "Hide":
				imgLabel.setVisible(false);
				break;

			case "ReShow":
				imgLabel.setVisible(true);
				break;

			case "Exit":
				System.exit(0);
				break;
			}
		}

	}

	public static void main(String[] args) {
		new D1108_02_�޴������ۿ�_�׼��̺�Ʈ�ޱ�ex();
	}

}
