package _GUI.Project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class d_3_�α��δ��̾�α� extends JDialog {

	String name;
	String id;
	String password;
	String tel;
	String str= "";
	JLabel la = new JLabel("id�� password�� Ȯ���ϼ���.");
	JLabel bel = new JLabel("��ϵ� ���� ����");
	JButton okBn = new JButton("Ȯ��");
	Container c = getContentPane();
	
	public d_3_�α��δ��̾�α�() {
	}
	
	public d_3_�α��δ��̾�α�(JFrame frame, String title) {
		super(frame, title);
		setTitle("�α���");
		c.setLayout(null);
		okBn.setBounds(50, 100, 80, 30);
		okBn.setFont(new Font("���", Font.PLAIN, 15));
		c.add(okBn);

		okBn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});

		setSize(new Dimension(200, 200));
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = getSize();
		int xpos = (int)(dimen.getWidth() /2  - dimen1.getWidth()/2);
		int ypos = (int)(dimen.getHeight() /2 - dimen1.getHeight()/2);

		setLocation(xpos, ypos);
		setVisible(true);
	}

	String login(String id, String password) {
		this.id = id;
		this.password = password;
		String retStr = "";
		if (id == null || password == null) {
			la.setBounds(50, 10, 100,30);
			la.setFont(new Font("���", Font.PLAIN, 13));
			la.setHorizontalAlignment(JLabel.CENTER);
			c.add(la);
			return "No";
			
		} else {
			File file = new File("C:/JavaSF/workspace/Project/���̾/" + id + "," + password + "/���������.txt");
			if (!file.exists()) {
				str = "����";
				bel.setBounds(40, 30, 100,30);
				bel.setFont(new Font("���", Font.PLAIN, 13));
				bel.setHorizontalAlignment(JLabel.CENTER);
				c.add(bel);
				return "No";
				
			} else {
				try {
					InputStream is = new FileInputStream(
							"C:/JavaSF/workspace/Project/���̾/" + id + "," + password + "/���������.txt");
					Reader reader = new InputStreamReader(is);
					BufferedReader br = new BufferedReader(reader);
					String line = null;
					line = br.readLine();
					name = line;
					str = line;
					
					is = new FileInputStream(
							"C:/JavaSF/workspace/Project/���̾/" + id + "," + password + "/���������.txt");
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
