package _GUI.Project����;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

import _GUI.Project.d_1_start;

public class _1111___ extends JFrame {

	JLabel first = new JLabel("�ڹ� ����");
	JLabel idLa = new JLabel("ID");
	JTextField idTf = new JTextField(15);
	JLabel passLa = new JLabel("PASSWORD");
	JTextField passTf = new JTextField(10);
	JButton login = new JButton("�α���");
	JButton signUp = new JButton("ȸ�� ����");
	private _2_ȸ�����Դ��̾�α� signUpdialog;
	private LoginDialog logindialog;

	public _1111___() {

		setTitle("�ڹ� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		Container c = getContentPane();
		getContentPane().setLayout(null);

		first.setFont(new Font("����ü", Font.BOLD, 20));
		first.setBounds(180, 30, 100, 50);
		getContentPane().add(first);

		idLa.setFont(new Font("����", Font.PLAIN, 15));
		idLa.setBounds(100, 100, 100, 30);
		getContentPane().add(idLa);

		idTf.setBounds(200, 100, 150, 30);
		getContentPane().add(idTf);

		passLa.setFont(new Font("����", Font.PLAIN, 15));
		passLa.setBounds(100, 150, 100, 30);
		getContentPane().add(passLa);

		passTf.setBounds(200, 150, 150, 30);
		getContentPane().add(passTf);

		login.setFont(new Font("����", Font.PLAIN, 15));
		login.setBounds(190, 250, 100, 30);
//		logindialog.id=idTf.getText();
		logindialog = new LoginDialog(this, "�α���" );
		logindialog.setVisible(false);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				JFrame frame = (JFrame)e.getSource();
				
				logindialog.setId(idTf.getText());
				logindialog.setPassword(passTf.getText());
				logindialog.setVisible(true);
//				new LoginDialog(idTf.getText(), passTf.getText());
			}
		});
		getContentPane().add(login);

		signUp.setSize(120, 30);
		signUp.setFont(new Font("����", Font.PLAIN, 15));
		signUp.setLocation(180, 300);

		signUpdialog = new _2_ȸ�����Դ��̾�α�(this, "ȸ������");
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

	class LoginDialog extends JDialog {
		String name;
		String tel;
		String id;
		String password;
		JLabel la = new JLabel("id�� password�� Ȯ���ϼ���.");
		JLabel bel = new JLabel("��ϵ��� �ʾҽ��ϴ�.");
		JButton okBn = new JButton("Ȯ��");
		Container lp = getContentPane();

		public LoginDialog(JFrame frame, String title) {
			super(frame, title);
			setLayout(new FlowLayout());
			setSize(200, 130);
			la.setSize(100, 80);
			la.setVisible(true);
//			id = idTf.getText();
//			password = passTf.getText();
			if (id == null || password == null) {
//				System.out.println(id+password);
				la.setBounds(150, 150, 100, 30);
				lp.add(la);
			} else {
				String str = idread(id, password);
				if (str == "����") {
					bel.setBounds(150, 150, 100, 30);
					lp.add(bel);
				} else {
					str = str.substring(3);
					setTitle(str);
				}
			}
			lp.add(okBn);
			okBn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			setVisible(true);
		}

//		public LoginDialog(String id, String password) {
//			la.setSize(500, 500);
//			la.setVisible(true);
//			if (id == "" || password == "") {
//				la.setBounds(150, 150, 100, 30);
//				lp.add(la);
//			} else {
//				String str = idread(id, password);
//				if (str == "����") {
//					bel.setBounds(150, 150, 100, 30);
//					lp.add(bel);
//				} else {
//					str = str.substring(3);
//					setTitle(str);
//				}
//				}
//			}

		
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		String idread(String id, String password) {
			File file = new File("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
			if (!file.exists()) {
				return "����";
			} else {
				InputStream is = null;

				try {
					is = new FileInputStream("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				Reader reader = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(reader);
				String retStr = "";
				String line = null;

				try {
					line = br.readLine();
				} catch (IOException e) {
				}
				return line;

//				try {
//					while ((line = br.readLine()) != null) {
//						System.out.println(line);
//						retStr += line + "\n";
//					}
//				} catch (IOException e) {
//				}
//				return retStr;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new d_1_start();
	}

}