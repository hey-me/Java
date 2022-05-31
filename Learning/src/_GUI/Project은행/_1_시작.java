package _GUI.Project은행;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class _1_시작 extends JFrame {

	private JLabel first = new JLabel("자바 은행");
	private JLabel idLa = new JLabel("ID");
	private JTextField idTf = new JTextField(15);
	private JLabel passLa = new JLabel("PASSWORD");
	private JTextField passTf = new JTextField(10);
	private JButton login = new JButton("로그인");
	private JButton signUp = new JButton("회원 가입");
	private _2_회원가입다이얼로그 signUpdialog = new _2_회원가입다이얼로그(this, "회원가입");
	private _3_로그인다이얼로그 logindialog = new _3_로그인다이얼로그(this, "로그인");
	String str = "";
	String restr = "";

	public _1_시작() {

		// 자바 은행
		setTitle("자바 은행");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		Container c = getContentPane();
		getContentPane().setLayout(null);

		first.setFont(new Font("굴림체", Font.BOLD, 20));
		first.setBounds(180, 30, 100, 50);
		getContentPane().add(first);

		// 아이디
		idLa.setFont(new Font("굴림", Font.PLAIN, 15));
		idLa.setBounds(100, 100, 100, 30);
		getContentPane().add(idLa);

		idTf.setBounds(200, 100, 150, 30);
		getContentPane().add(idTf);

		// 패스워드
		passLa.setFont(new Font("굴림", Font.PLAIN, 15));
		passLa.setBounds(100, 150, 100, 30);
		getContentPane().add(passLa);

		passTf.setBounds(200, 150, 150, 30);
		getContentPane().add(passTf);

		// 로그인 버튼
		login.setBounds(190, 250, 100, 30);
		login.setFont(new Font("굴림", Font.PLAIN, 15));

//		logindialog = new _3_로그인다이얼로그(this, "로그인");
		logindialog.setVisible(false);
		logindialog.setLocation(150, 150); // 프레임 크기에 맞춰 바꾸는 것 추가하기**
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (logindialog.login(idTf.getText(), passTf.getText()) == "No") {
					logindialog.setVisible(true);
				} else {
					str = logindialog.login(idTf.getText(), passTf.getText());
					restr = logindialog.getStr();
					// 새로운 패널
					MainPanel mPanel = new MainPanel();
					visible();
					mPanel.setVisible(true);

				}

			}
		});
		getContentPane().add(login);

		// 회원가입 버튼
		signUp.setSize(120, 30);
		signUp.setFont(new Font("굴림", Font.PLAIN, 15));
		signUp.setLocation(180, 300);

//		signUpdialog = new _2_회원가입다이얼로그(this, "회원가입");
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

		_3_로그인다이얼로그 ldld = new _3_로그인다이얼로그();
//		String is = "";
		String account;

		public MainPanel() {
			Container mp = getContentPane();
			setLayout(null);
			JLabel m = new JLabel(restr);
			m.setFont(new Font("굴림", Font.BOLD, 20));
			m.setBounds(0, 10, 100, 100);
			JLabel label = new JLabel("고객 정보");
			label.setFont(new Font("굴림", Font.BOLD, 15));
			label.setBounds(0, 50, 100, 100);
			JTextField tf = new JTextField(str);
			tf.setBounds(0, 200, 250, 250);

			JButton accountOpenBtn = new JButton("계좌 개설");
			accountOpenBtn.setBounds(350, 200, 100, 30);
			accountOpenBtn.setVisible(true);
			accountOpenBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					File file = new File(
							"C:/JavaSF/workspace/JavaSF/은행/" + ldld.getId() + "," + ldld.getPassword() + "/계좌.txt");
					if (!file.exists()) {
						file.mkdirs();
					}
					OutputStream os;
					try {
						os = new FileOutputStream(
								"C:/JavaSF/workspace/JavaSF/은행/" + ldld.getId() + "," + ldld.getPassword() + "/계좌번호.txt");
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
		new _1_시작();
	}

}
