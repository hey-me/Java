package _GUI.Project����;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class _3_�α��δ��̾�α� extends JDialog {

	String name;
	String id;
	String password;
	String tel;
	String str= "";
	JLabel la = new JLabel("id�� password�� Ȯ���ϼ���.");
	JLabel bel = new JLabel("��ϵ� ���� ����");
	JButton okBn = new JButton("Ȯ��");
	Container c = getContentPane();
	
	public _3_�α��δ��̾�α�() {
		// TODO Auto-generated constructor stub
	}
	
	public _3_�α��δ��̾�α�(JFrame frame, String title) {
		super(frame, title);
		setTitle("�α���");
		c.setLayout(null);
		okBn.setBounds(50, 100, 80, 30);
		c.add(okBn);

		okBn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		setSize(200, 200);
		setVisible(true);
	}

	String login(String id, String password) {
		this.id = id;
		this.password = password;
		String retStr = "";
		if (id == null || password == null) {
			la.setBounds(50, 10, 100,30);
			la.setHorizontalAlignment(JLabel.CENTER);
			c.add(la);
			return "No";
			
		} else {
			File file = new File("C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
			if (!file.exists()) {
				str = "����";
				bel.setBounds(40, 30, 100,30);
				bel.setHorizontalAlignment(JLabel.CENTER);
				c.add(bel);
				return "No";
				
			} else {
				try {
					InputStream is = new FileInputStream(
							"C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
					Reader reader = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(reader);
					String line = null;
					line = br.readLine();
					name = line;
					str = line;
					
					is = new FileInputStream(
							"C:/JavaSF/workspace/JavaSF/����/" + id + "," + password + "/������.txt");
					reader = new InputStreamReader(is);
					br = new BufferedReader(reader);
					while ((line = br.readLine()) != null) {
						System.out.println(line);
						retStr += line + "\r\n\n";
					}
					
				} catch (Exception e1) {
					e1.printStackTrace();
				}
//				str = str.substring(3);
				setTitle(str);
			}
			return retStr;
		}
	}

	public String getStr() {
		return str;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	
}
