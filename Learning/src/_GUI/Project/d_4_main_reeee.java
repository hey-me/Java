package _GUI.Project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class d_4_main_reeee extends JPanel {
	private JLabel[] dayLa = new JLabel[31];
	private String[] dayStr = new String[31];
	private int ddd;

	Calendar now = Calendar.getInstance();
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH) + 1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK);
	
	
	public d_4_main_reeee() {

		
		
		
		int month = monthNum();
//		setLayout(new FlowLayout());
		setLayout(null);

		dayStr = new String[month];
		for (int i = 0; i < dayStr.length; i++) {
			dayStr[i] = i + 1 + "";
		}

		createToolBar();
		createWeekLabel();

		JPanel panel = new JPanel();
		panel.setBounds(12, 100, 460, 300);

		for (int i = 0; i < week; i++) {
			JLabel labe = new JLabel("");
//			labe.setBorder(new LineBorder(Color.lightGray));
			panel.add(labe);
		}

		for (int i = 0; i < dayStr.length; i++) {
			dayLa[i] = new JLabel(" " + dayStr[i]);
			if (i >= 0 && i < 8) {
				dayLa[i].setBounds(50 * i, 0, 30, 50);
			}
			if (i >= 8 && i < 16) {
				dayLa[i].setBounds(50 * i, 50, 30, 50);
			}
			if (i >= 16 && i < 24) {
				dayLa[i].setBounds(50 * i, 100, 30, 50);
			}
			if (i >= 24) {
				dayLa[i].setBounds(50 * i, 150, 30, 50);
			}
			dayLa[i].setBorder(new LineBorder(Color.lightGray));
			panel.add(dayLa[i]);
//			8977AD 
			if (i + 1 == day) {
				dayLa[i].setBackground(new Color(173, 154, 177));
				dayLa[i].setOpaque(true);
			}
			;
		}
		for (int i = 0; i < 35 - dayStr.length - week; i++) {
			JLabel labe = new JLabel("");
			panel.add(labe);
		}

		panel.setLayout(new GridLayout(5, 7));
		panel.setVisible(true);
//		panel.setMaximumSize(new Dimension(300, 50));
//		add(panel, BorderLayout.SOUTH);
		add(panel);

		setSize(new Dimension(500, 500));
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = getSize();
		int xpos = (int)(dimen.getWidth() /2  - dimen1.getWidth()/2);
		int ypos = (int)(dimen.getHeight() /2 - dimen1.getHeight()/2);
		setLocation(xpos, ypos);
		
		
		setVisible(true);

	}

	private void createWeekLabel()  {
		JPanel weekPa = new JPanel();
		JLabel sun = new JLabel("일");
		sun.setForeground(Color.red);
		JLabel mon = new JLabel("월");
		sun.setForeground(Color.red);
		JLabel tue = new JLabel("화");
		sun.setForeground(Color.red);
		JLabel wed = new JLabel("수");
		sun.setForeground(Color.red);
		JLabel thr = new JLabel("목");
		sun.setForeground(Color.red);
		JLabel fri = new JLabel("금");
		sun.setForeground(Color.red);
		JLabel sat = new JLabel("토");
		weekPa.setLayout(new GridLayout(1, 7, 0, 0));
		sun.setForeground(Color.red);
		
		weekPa.add(sun);
		weekPa.add(mon);
		weekPa.add(tue);
		weekPa.add(wed);
		weekPa.add(thr);
		weekPa.add(fri);
		weekPa.add(sat);
		weekPa.setBounds(0, 50, 300, 50);
//		add(weekPa, BorderLayout.CENTER);
		add(weekPa);
		
	}

	private void createToolBar() {

		JToolBar toolBar = new JToolBar("Menu");
	
		// 날짜콤보박스
		YearComboBox combo = new YearComboBox();
		combo.setBounds(0, 22, 206, 35);


		JButton todayBtn = new JButton("오늘");
		todayBtn.setBounds(210, 30, 63, 23);

		todayBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				combo.index();
			}
		});
		JButton exit = new JButton("종료");
		exit.setBounds(391, 30, 71, 23);
		
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		toolBar.add(combo);
		toolBar.addSeparator();
		toolBar.add(todayBtn);
		
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		toolBar.addSeparator();
		
		toolBar.add(exit);
		toolBar.setBounds(0,0, 300, 50);
		add(toolBar);
//		add(toolBar, BorderLayout.NORTH);

	}

	int monthNum() {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12: {
			return 31;
		}
		case 2: {
			return 29;
		}
		case 4, 6, 9, 11: {
			return 30;
		}
		}
		return 0;
	}

	class YearComboBox extends JPanel {
		JComboBox<String> yearComboBox = new JComboBox<String>();
		JComboBox<String> monthComboBox = new JComboBox<String>();
		JComboBox<String> dayComboBox = new JComboBox<String>();
		String[] yeardd = new String[100];
		String[] monthdd = new String[12];
		String[] daydd = new String[31];

		public YearComboBox() {
//			List<String> list = new ArrayList<>();

			for (int i = 0; i < yeardd.length; i++) {
				yeardd[i] = "" + (2000 + i);
				yearComboBox.addItem(yeardd[i]);
			}
			for (int i = 0; i < monthdd.length; i++) {
				monthdd[i] = i + 1 + "";
				monthComboBox.addItem(monthdd[i]);
				if (monthdd[i] == "2" || monthdd[i] == "4" || monthdd[i] == "6" || monthdd[i] == "9"
						|| monthdd[i] == "11") {
					daydd = new String[30];
				}
			}
			monthComboBox.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					JComboBox<String> cb = (JComboBox<String>) e.getSource();
					dayComboBox.removeAllItems();
					int item = cb.getSelectedIndex() + 1;
					daydd = new String[monthNum(item)];
					for (int j = 0; j < daydd.length; j++) {
						daydd[j] = j + 1 + "";
						dayComboBox.addItem(daydd[j]);
					}
				}
			});

//			for (int j = 0; j < daydd.length; j++) {
//				daydd[j] = j + 1 + "";
//				dayComboBox.addItem(daydd[j]);
//			}
			yearComboBox.setBounds(12, 20, 50, 23);
			monthComboBox.setBounds(74, 20, 50, 23);
			dayComboBox.setBounds(132, 20, 50, 23);
			index();

			add(yearComboBox);
			add(monthComboBox);
			add(dayComboBox);
		}

		void index() {
			yearComboBox.setSelectedIndex(year - 2000);
			monthComboBox.setSelectedIndex(month - 1);
			dayComboBox.setSelectedIndex(day - 1);
		}
	}

	protected int monthNum(int item) {

		switch (item) {
		case 1, 3, 5, 7, 8, 10, 12: {
			return 31;
		}
		case 2: {
			return 29;
		}
		case 4, 6, 9, 11: {
			return 30;
		}
		}
		return 0;
	}

}