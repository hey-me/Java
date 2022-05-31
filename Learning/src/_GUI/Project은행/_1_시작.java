package _GUI.Project����;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class _1_���� extends JFrame {

	private JLabel first = new JLabel("�ڹ� ����");
	private JLabel idLa = new JLabel("ID");
	private JTextField idTf = new JTextField(15);
	private JLabel passLa = new JLabel("PASSWORD");
	private JTextField passTf = new JTextField(10);
	private JButton login = new JButton("�α���");
	private JButton signUp = new JButton("ȸ�� ����");
	private _2_ȸ�����Դ��̾�α� signUpdialog = new _2_ȸ�����Դ��̾�α�(this, "ȸ������");
	private _3_�α��δ��̾�α� logindialog = new _3_�α��δ��̾�α�(this, "�α���");
	String str = "";
	String restr = "";

	public _1_����() {

		// �ڹ� ����
		setTitle("�ڹ� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		Container c = getContentPane();
		getContentPane().setLayout(null);

		first.setFont(new Font("����ü", Font.BOLD, 20));
		first.setBounds(180, 30, 100, 50);
		getContentPane().add(first);

		// ���̵�
		idLa.setFont(new Font("����", Font.PLAIN, 15));
		idLa.setBounds(100, 100, 100, 30);
		getContentPane().add(idLa);

		idTf.setBounds(200, 100, 150, 30);
		getContentPane().add(idTf);

		// �н�����
		passLa.setFont(new Font("����", Font.PLAIN, 15));
		passLa.setBounds(100, 150, 100, 30);
		getContentPane().add(passLa);

		passTf.setBounds(200, 150, 150, 30);
		getContentPane().add(passTf);

		// �α��� ��ư
		login.setBounds(190, 250, 100, 30);
		login.setFont(new Font("����", Font.PLAIN, 15));

//		logindialog = new _3_�α��δ��̾�α�(this, "�α���");
		logindialog.setVisible(false);
		logindialog.setLocation(150, 150); // ������ ũ�⿡ ���� �ٲٴ� �� �߰��ϱ�**
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (logindialog.login(idTf.getText(), passTf.getText()) == "No") {
					logindialog.setVisible(true);
				} else {
					str = logindialog.login(idTf.getText(), passTf.getText());
					restr = logindialog.getStr();
					// ���ο� �г�
					MainPanel mPanel = new MainPanel();
					visible();
					mPanel.setVisible(true);

				}

			}
		});
		getContentPane().add(login);

		// ȸ������ ��ư
		signUp.setSize(120, 30);
		signUp.setFont(new Font("����", Font.PLAIN, 15));
		signUp.setLocation(180, 300);

//		signUpdialog = new _2_ȸ�����Դ��̾�α�(this, "ȸ������");
		signUpdialog.setVisible(false);
		signUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				signUpdialog.setVisible(true);
			}
		});

		getContentPane().add(signUp);
		setSize(500, 500);
		setVisible(true);
	}

	class MainPanel extends JPanel {

		_3_�α��δ��̾�α� ldld = new _3_�α��δ��̾�α�();
//		String is = "";
		String account;

		public MainPanel() {
			Container mp = getContentPane();
			setLayout(null);
			JLabel m = new JLabel(restr);
			m.setFont(new Font("����", Font.BOLD, 20));
			m.setBounds(0, 10, 100, 100);
			JLabel label = new JLabel("�� ����");
			label.setFont(new Font("����", Font.BOLD, 15));
			label.setBounds(0, 50, 100, 100);
			JTextField tf = new JTextField(str);
			tf.setBounds(0, 200, 250, 250);

			JButton accountOpenBtn = new JButton("���� ����");
			accountOpenBtn.setBounds(350, 200, 100, 30);
			accountOpenBtn.setVisible(true);
			accountOpenBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(
							"C:/JavaSF/workspace/JavaSF/����/" + ldld.getId() + "," + ldld.getPassword() + "/����.txt");
					if (!file.exists()) {
						file.mkdirs();
					}
					OutputStream os;
					try {
						os = new FileOutputStream(
								"C:/JavaSF/workspace/JavaSF/����/" + ldld.getId() + "," + ldld.getPassword() + "/���¹�ȣ.txt");
						Writer writer = new OutputStreamWriter(os);
						account = (int) (Math.random() * 9999 + 1) + "";
						writer.write(account);
					} catch (Exception e1) {
					}
					tf.setText(account);
				}
			});

			mp.add(accountOpenBtn);

			mp.add(label);
			mp.add(tf);

			setSize(500, 500);
			setVisible(true);

		}
	}

	void visible() {
		first.setVisible(false);
		idLa.setVisible(false);
		idTf.setVisible(false);
		passLa.setVisible(false);
		passTf.setVisible(false);
		login.setVisible(false);
		signUp.setVisible(false);

	}

	public static void main(String[] args) throws Exception {
		new _1_����();
	}

}
