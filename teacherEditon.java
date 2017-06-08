package stuManager;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class teacherEditon implements ActionListener {
	private JFrame frame;
	private JTextField nameField;
	private JTextField numberField;
	private JLabel sex = new JLabel();
	private JLabel birthdate = new JLabel();
	private JLabel academy = new JLabel();
	private JLabel major = new JLabel();

	private JLabel showGrade_1;
	private JLabel showGrade_2;
	private JLabel showGrade_3;
	private JLabel showGrade_4;
	private JLabel showGrade_5;
	private JLabel showGrade_6;
	private JLabel showGrade_7;
	private JLabel showGrade_8;
	private JLabel showGrade_9;
	private JLabel showGrade_10;
	private JLabel showGrade_11;
	private JLabel showGrade_12;
	private JLabel showGrade_13;
	private JLabel showGrade_14;
	private JLabel showGrade_15;
	private static int j = 0;
	private int gCredit;

	Student[] stu = new Student[15];
	Teacher[] teachers = new Teacher[3];
	Manager[] managers = new Manager[3];
	Course[] courses = new Course[3];
	Grade[][] grades = new Grade[3][15];

	JButton btn1;
	JButton btn2;
	JButton btn3;

	public teacherEditon() {

		initInfo();
		frame = new JFrame("学生管理系统(教师版)");
		JLabel to = new JLabel("-------------------------------------------------------------------------------");
		to.setBounds(10, 85, 600, 5);
		frame.add(to);

		JLabel nameJLabel = new JLabel("姓名：");
		nameJLabel.setBounds(50, 20, 60, 20);
		nameJLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		frame.add(nameJLabel);

		JLabel numberLabel = new JLabel("编号：");
		numberLabel.setBounds(50, 50, 60, 20);
		numberLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		frame.add(numberLabel);

		nameField = new JTextField();
		nameField.setBounds(100, 20, 150, 20);
		nameField.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(nameField);

		numberField = new JTextField();
		numberField.setBounds(100, 50, 150, 20);
		numberField.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(numberField);

		btn1 = new JButton("确定");
		btn1.setBounds(270, 50, 60, 20);
		btn1.setFont(new Font("宋体", Font.PLAIN, 12));
		frame.add(btn1);
		btn1.addActionListener(this);

		btn2 = new JButton("确定");
		btn2.setBounds(270, 50, 60, 20);
		btn2.setFont(new Font("宋体", Font.PLAIN, 12));
		frame.add(btn2);
		btn2.setVisible(false);

		btn3 = new JButton("成绩修改");
		btn3.setBounds(450, 10, 120, 20);
		btn3.setFont(new Font("宋体", Font.PLAIN, 12));
		frame.add(btn3);
		btn3.setVisible(false);

		JLabel CNumber = new JLabel("课号");
		CNumber.setBounds(30, 100, 90, 20);
		CNumber.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CNumber);

		JLabel CName = new JLabel("课程", JLabel.CENTER);
		CName.setBounds(80, 100, 90, 20);
		CName.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CName);

		JLabel TName = new JLabel("学号", JLabel.CENTER);
		TName.setBounds(170, 100, 90, 20);
		TName.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(TName);

		JLabel CPeriod = new JLabel("学生", JLabel.CENTER);
		CPeriod.setBounds(260, 100, 90, 20);
		CPeriod.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CPeriod);

		JLabel Grade = new JLabel("成绩", JLabel.CENTER);
		Grade.setBounds(365, 100, 90, 20);
		Grade.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(Grade);

		JLabel CCredit = new JLabel("学分", JLabel.RIGHT);
		CCredit.setBounds(400, 100, 90, 20);
		CCredit.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CCredit);

		showGrade_1 = new JLabel();
		showGrade_1.setBounds(40, 130, 600, 20);
		frame.add(showGrade_1);

		showGrade_2 = new JLabel();
		showGrade_2.setBounds(40, 155, 600, 20);
		frame.add(showGrade_2);

		showGrade_3 = new JLabel();
		showGrade_3.setBounds(40, 180, 600, 20);
		frame.add(showGrade_3);

		showGrade_4 = new JLabel();
		showGrade_4.setBounds(40, 205, 600, 20);
		frame.add(showGrade_4);

		showGrade_5 = new JLabel();
		showGrade_5.setBounds(40, 230, 600, 20);
		frame.add(showGrade_5);

		showGrade_6 = new JLabel();
		showGrade_6.setBounds(40, 255, 600, 20);
		frame.add(showGrade_6);

		showGrade_7 = new JLabel();
		showGrade_7.setBounds(40, 280, 600, 20);
		frame.add(showGrade_7);

		showGrade_8 = new JLabel();
		showGrade_8.setBounds(40, 305, 600, 20);
		frame.add(showGrade_8);

		showGrade_9 = new JLabel();
		showGrade_9.setBounds(40, 330, 600, 20);
		frame.add(showGrade_9);

		showGrade_10 = new JLabel();
		showGrade_10.setBounds(40, 355, 600, 20);
		frame.add(showGrade_10);

		showGrade_11 = new JLabel();
		showGrade_11.setBounds(40, 380, 600, 20);
		frame.add(showGrade_11);

		showGrade_12 = new JLabel();
		showGrade_12.setBounds(40, 405, 600, 20);
		frame.add(showGrade_12);

		showGrade_13 = new JLabel();
		showGrade_13.setBounds(40, 430, 600, 20);
		frame.add(showGrade_13);

		showGrade_14 = new JLabel();
		showGrade_14.setBounds(40, 455, 600, 20);
		frame.add(showGrade_14);

		showGrade_15 = new JLabel();
		showGrade_15.setBounds(40, 480, 600, 20);
		frame.add(showGrade_15);

		frame.add(sex);
		frame.add(academy);
		frame.add(major);
		frame.add(birthdate);

		frame.setSize(600, 600);
		frame.setLocation(300, 100);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(66, 171, 145));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (Teacher t : teachers) {
			if (nameField.getText().equals(t.tName) && numberField.getText().equals(String.valueOf(t.tNumber))) {
				switch (Integer.parseInt(numberField.getText())) {
				case 100:
					showGrade_1.setText(String.valueOf(grades[0][0].getgNumber()) + "                  "
							+ grades[0][0].getgCourse() + "                " + stu[0].getStuNumber()
							+ "                     " + grades[0][0].getgStudent() + "                     "
							+ grades[0][0].getgGrade() + "                   "
							+ countCredit(grades[0][0].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_2.setText(String.valueOf(grades[0][1].getgNumber()) + "                  "
							+ grades[0][1].getgCourse() + "                " + stu[1].getStuNumber()
							+ "                     " + grades[0][1].getgStudent() + "                     "
							+ grades[0][1].getgGrade() + "                   "
							+ countCredit(grades[0][1].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_3.setText(String.valueOf(grades[0][2].getgNumber()) + "                  "
							+ grades[0][2].getgCourse() + "                " + stu[2].getStuNumber()
							+ "                     " + grades[0][2].getgStudent() + "                         "
							+ grades[0][2].getgGrade() + "                   "
							+ countCredit(grades[0][2].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_4.setText(String.valueOf(grades[0][3].getgNumber()) + "                  "
							+ grades[0][3].getgCourse() + "                " + stu[3].getStuNumber()
							+ "                     " + grades[0][3].getgStudent() + "                     "
							+ grades[0][3].getgGrade() + "                   "
							+ countCredit(grades[0][3].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_5.setText(String.valueOf(grades[0][4].getgNumber()) + "                  "
							+ grades[0][4].getgCourse() + "                " + stu[4].getStuNumber()
							+ "                     " + grades[0][4].getgStudent() + "                         "
							+ grades[0][4].getgGrade() + "                   "
							+ countCredit(grades[0][4].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_6.setText(String.valueOf(grades[0][5].getgNumber()) + "                  "
							+ grades[0][5].getgCourse() + "                " + stu[5].getStuNumber()
							+ "                     " + grades[0][5].getgStudent() + "                     "
							+ grades[0][5].getgGrade() + "                   "
							+ countCredit(grades[0][5].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_7.setText(String.valueOf(grades[0][6].getgNumber()) + "                  "
							+ grades[0][6].getgCourse() + "                " + stu[6].getStuNumber()
							+ "                     " + grades[0][6].getgStudent() + "                         "
							+ grades[0][6].getgGrade() + "                   "
							+ countCredit(grades[0][6].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_8.setText(String.valueOf(grades[0][7].getgNumber()) + "                  "
							+ grades[0][7].getgCourse() + "                " + stu[7].getStuNumber()
							+ "                     " + grades[0][7].getgStudent() + "                     "
							+ grades[0][7].getgGrade() + "                   "
							+ countCredit(grades[0][7].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_9.setText(String.valueOf(grades[0][8].getgNumber()) + "                  "
							+ grades[0][8].getgCourse() + "                " + stu[8].getStuNumber()
							+ "                     " + grades[0][8].getgStudent() + "                     "
							+ grades[0][8].getgGrade() + "                   "
							+ countCredit(grades[0][8].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_10.setText(String.valueOf(grades[0][9].getgNumber()) + "                  "
							+ grades[0][9].getgCourse() + "                " + stu[9].getStuNumber()
							+ "                     " + grades[0][9].getgStudent() + "                     "
							+ grades[0][9].getgGrade() + "                   "
							+ countCredit(grades[0][9].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_11.setText(String.valueOf(grades[0][10].getgNumber()) + "                  "
							+ grades[0][10].getgCourse() + "                " + stu[10].getStuNumber()
							+ "                     " + grades[0][10].getgStudent() + "                         "
							+ grades[0][10].getgGrade() + "                   "
							+ countCredit(grades[0][10].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_12.setText(String.valueOf(grades[0][11].getgNumber()) + "                  "
							+ grades[0][11].getgCourse() + "                " + stu[11].getStuNumber()
							+ "                     " + grades[0][11].getgStudent() + "                     "
							+ grades[0][11].getgGrade() + "                   "
							+ countCredit(grades[0][11].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_13.setText(String.valueOf(grades[0][12].getgNumber()) + "                  "
							+ grades[0][12].getgCourse() + "                " + stu[12].getStuNumber()
							+ "                     " + grades[0][12].getgStudent() + "                         "
							+ grades[0][12].getgGrade() + "                   "
							+ countCredit(grades[0][12].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_14.setText(String.valueOf(grades[0][13].getgNumber()) + "                  "
							+ grades[0][13].getgCourse() + "                " + stu[13].getStuNumber()
							+ "                     " + grades[0][13].getgStudent() + "                     "
							+ grades[0][13].getgGrade() + "                   "
							+ countCredit(grades[0][13].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());

					showGrade_15.setText(String.valueOf(grades[0][14].getgNumber()) + "                  "
							+ grades[0][14].getgCourse() + "                " + stu[14].getStuNumber()
							+ "                     " + grades[0][14].getgStudent() + "                     "
							+ grades[0][14].getgGrade() + "                   "
							+ countCredit(grades[0][14].getgGrade(), courses[0]) + "/" + courses[0].getcCredit());
					break;

				case 101:
					showGrade_1.setText(String.valueOf(grades[1][0].getgNumber()) + "                  "
							+ grades[1][0].getgCourse() + "                " + stu[0].getStuNumber()
							+ "                     " + grades[1][0].getgStudent() + "                     "
							+ grades[1][0].getgGrade() + "                   "
							+ countCredit(grades[1][0].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_2.setText(String.valueOf(grades[1][1].getgNumber()) + "                  "
							+ grades[1][1].getgCourse() + "                " + stu[1].getStuNumber()
							+ "                     " + grades[1][1].getgStudent() + "                     "
							+ grades[1][1].getgGrade() + "                   "
							+ countCredit(grades[1][1].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_3.setText(String.valueOf(grades[1][2].getgNumber()) + "                  "
							+ grades[1][2].getgCourse() + "                " + stu[2].getStuNumber()
							+ "                     " + grades[1][2].getgStudent() + "                         "
							+ grades[1][2].getgGrade() + "                   "
							+ countCredit(grades[1][2].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_4.setText(String.valueOf(grades[1][3].getgNumber()) + "                  "
							+ grades[1][3].getgCourse() + "                " + stu[3].getStuNumber()
							+ "                     " + grades[1][3].getgStudent() + "                     "
							+ grades[1][3].getgGrade() + "                   "
							+ countCredit(grades[1][3].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_5.setText(String.valueOf(grades[1][4].getgNumber()) + "                  "
							+ grades[1][4].getgCourse() + "                " + stu[4].getStuNumber()
							+ "                     " + grades[1][4].getgStudent() + "                         "
							+ grades[1][4].getgGrade() + "                   "
							+ countCredit(grades[1][4].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_6.setText(String.valueOf(grades[1][5].getgNumber()) + "                  "
							+ grades[1][5].getgCourse() + "                " + stu[5].getStuNumber()
							+ "                     " + grades[1][5].getgStudent() + "                     "
							+ grades[1][5].getgGrade() + "                   "
							+ countCredit(grades[1][5].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_7.setText(String.valueOf(grades[1][6].getgNumber()) + "                  "
							+ grades[1][6].getgCourse() + "                " + stu[6].getStuNumber()
							+ "                     " + grades[1][6].getgStudent() + "                         "
							+ grades[1][6].getgGrade() + "                   "
							+ countCredit(grades[1][6].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_8.setText(String.valueOf(grades[1][7].getgNumber()) + "                  "
							+ grades[1][7].getgCourse() + "                " + stu[7].getStuNumber()
							+ "                     " + grades[1][7].getgStudent() + "                     "
							+ grades[1][7].getgGrade() + "                   "
							+ countCredit(grades[1][7].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_9.setText(String.valueOf(grades[1][8].getgNumber()) + "                  "
							+ grades[1][8].getgCourse() + "                " + stu[8].getStuNumber()
							+ "                     " + grades[1][8].getgStudent() + "                     "
							+ grades[1][8].getgGrade() + "                   "
							+ countCredit(grades[1][8].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_10.setText(String.valueOf(grades[1][9].getgNumber()) + "                  "
							+ grades[1][9].getgCourse() + "                " + stu[9].getStuNumber()
							+ "                     " + grades[1][9].getgStudent() + "                     "
							+ grades[1][9].getgGrade() + "                   "
							+ countCredit(grades[1][9].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_11.setText(String.valueOf(grades[1][10].getgNumber()) + "                  "
							+ grades[1][10].getgCourse() + "                " + stu[10].getStuNumber()
							+ "                     " + grades[1][10].getgStudent() + "                         "
							+ grades[1][10].getgGrade() + "                   "
							+ countCredit(grades[1][10].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_12.setText(String.valueOf(grades[1][11].getgNumber()) + "                  "
							+ grades[1][11].getgCourse() + "                " + stu[11].getStuNumber()
							+ "                     " + grades[1][11].getgStudent() + "                     "
							+ grades[1][11].getgGrade() + "                   "
							+ countCredit(grades[1][11].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_13.setText(String.valueOf(grades[1][12].getgNumber()) + "                  "
							+ grades[1][12].getgCourse() + "                " + stu[12].getStuNumber()
							+ "                     " + grades[1][12].getgStudent() + "                         "
							+ grades[1][12].getgGrade() + "                   "
							+ countCredit(grades[1][12].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_14.setText(String.valueOf(grades[1][13].getgNumber()) + "                  "
							+ grades[1][13].getgCourse() + "                " + stu[13].getStuNumber()
							+ "                     " + grades[1][13].getgStudent() + "                     "
							+ grades[1][13].getgGrade() + "                   "
							+ countCredit(grades[1][13].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_15.setText(String.valueOf(grades[1][14].getgNumber()) + "                  "
							+ grades[1][14].getgCourse() + "                " + stu[14].getStuNumber()
							+ "                     " + grades[1][14].getgStudent() + "                     "
							+ grades[1][14].getgGrade() + "                   "
							+ countCredit(grades[1][14].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());
					break;

				case 102:
					showGrade_1.setText(String.valueOf(grades[2][0].getgNumber()) + "                  "
							+ grades[2][0].getgCourse() + "                " + stu[0].getStuNumber()
							+ "                     " + grades[2][0].getgStudent() + "                     "
							+ grades[2][0].getgGrade() + "                   "
							+ countCredit(grades[2][0].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_2.setText(String.valueOf(grades[2][1].getgNumber()) + "                  "
							+ grades[2][1].getgCourse() + "                " + stu[1].getStuNumber()
							+ "                     " + grades[2][1].getgStudent() + "                     "
							+ grades[2][1].getgGrade() + "                   "
							+ countCredit(grades[2][1].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_3.setText(String.valueOf(grades[2][2].getgNumber()) + "                  "
							+ grades[2][2].getgCourse() + "                " + stu[2].getStuNumber()
							+ "                     " + grades[2][2].getgStudent() + "                         "
							+ grades[2][2].getgGrade() + "                   "
							+ countCredit(grades[2][2].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_4.setText(String.valueOf(grades[2][3].getgNumber()) + "                  "
							+ grades[2][3].getgCourse() + "                " + stu[3].getStuNumber()
							+ "                     " + grades[2][3].getgStudent() + "                     "
							+ grades[2][3].getgGrade() + "                   "
							+ countCredit(grades[2][3].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_5.setText(String.valueOf(grades[2][4].getgNumber()) + "                  "
							+ grades[2][4].getgCourse() + "                " + stu[4].getStuNumber()
							+ "                     " + grades[2][4].getgStudent() + "                         "
							+ grades[2][4].getgGrade() + "                   "
							+ countCredit(grades[2][4].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_6.setText(String.valueOf(grades[2][5].getgNumber()) + "                  "
							+ grades[2][5].getgCourse() + "                " + stu[5].getStuNumber()
							+ "                     " + grades[2][5].getgStudent() + "                     "
							+ grades[2][5].getgGrade() + "                   "
							+ countCredit(grades[2][5].getgGrade(), courses[1]) + "/" + courses[1].getcCredit());

					showGrade_7.setText(String.valueOf(grades[2][6].getgNumber()) + "                  "
							+ grades[2][6].getgCourse() + "                " + stu[6].getStuNumber()
							+ "                     " + grades[2][6].getgStudent() + "                         "
							+ grades[2][6].getgGrade() + "                   "
							+ countCredit(grades[2][6].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_8.setText(String.valueOf(grades[2][7].getgNumber()) + "                  "
							+ grades[2][7].getgCourse() + "                " + stu[7].getStuNumber()
							+ "                     " + grades[2][7].getgStudent() + "                     "
							+ grades[2][7].getgGrade() + "                   "
							+ countCredit(grades[2][7].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_9.setText(String.valueOf(grades[2][8].getgNumber()) + "                  "
							+ grades[2][8].getgCourse() + "                " + stu[8].getStuNumber()
							+ "                     " + grades[2][8].getgStudent() + "                     "
							+ grades[2][8].getgGrade() + "                   "
							+ countCredit(grades[2][8].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_10.setText(String.valueOf(grades[2][9].getgNumber()) + "                  "
							+ grades[2][9].getgCourse() + "                " + stu[9].getStuNumber()
							+ "                     " + grades[2][9].getgStudent() + "                     "
							+ grades[2][9].getgGrade() + "                   "
							+ countCredit(grades[2][9].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_11.setText(String.valueOf(grades[2][10].getgNumber()) + "                  "
							+ grades[2][10].getgCourse() + "                " + stu[10].getStuNumber()
							+ "                     " + grades[2][10].getgStudent() + "                         "
							+ grades[2][10].getgGrade() + "                   "
							+ countCredit(grades[2][10].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_12.setText(String.valueOf(grades[2][11].getgNumber()) + "                  "
							+ grades[2][11].getgCourse() + "                " + stu[11].getStuNumber()
							+ "                     " + grades[2][11].getgStudent() + "                     "
							+ grades[2][11].getgGrade() + "                   "
							+ countCredit(grades[2][11].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_13.setText(String.valueOf(grades[2][12].getgNumber()) + "                  "
							+ grades[2][12].getgCourse() + "                " + stu[12].getStuNumber()
							+ "                     " + grades[2][12].getgStudent() + "                         "
							+ grades[2][12].getgGrade() + "                   "
							+ countCredit(grades[2][12].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_14.setText(String.valueOf(grades[2][13].getgNumber()) + "                  "
							+ grades[2][13].getgCourse() + "                " + stu[13].getStuNumber()
							+ "                     " + grades[2][13].getgStudent() + "                     "
							+ grades[2][13].getgGrade() + "                   "
							+ countCredit(grades[2][13].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());

					showGrade_15.setText(String.valueOf(grades[2][14].getgNumber()) + "                  "
							+ grades[2][14].getgCourse() + "                " + stu[14].getStuNumber()
							+ "                     " + grades[2][14].getgStudent() + "                     "
							+ grades[2][14].getgGrade() + "                   "
							+ countCredit(grades[2][14].getgGrade(), courses[2]) + "/" + courses[2].getcCredit());
					break;

				}

				nameField.setEditable(false);
				numberField.setEditable(false);

				academy.setText(t.gettAcademy());
				academy.setBounds(300, 50, 100, 20);

				major.setText(t.gettMajor());
				major.setBounds(400, 50, 100, 20);

				btn1.setVisible(false);
				btn2.setVisible(true);
				btn2.setBounds(500, 50, 60, 20);
				btn2.setText("修改");
				btn2.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						String op1 = JOptionPane.showInputDialog("请输入需修改内容序号\n1.名字\n2.编号\n3.学院\n4.专业\n");
						int op = Integer.parseInt(op1);
						if (op == 1) {
							String newName = JOptionPane.showInputDialog("更改名字为：");
							teachers[j].settName(newName);
							nameField.setText(teachers[j].tName);
						} else if (op == 2) {
							String newNumber = JOptionPane.showInputDialog("更改编号为：");
							int newnumber = Integer.parseInt(newNumber);
							numberField.setText(newNumber);
							teachers[j].settNumber(newnumber);
						} else if (op == 3) {
							String newAcademy = JOptionPane.showInputDialog("更改学院为：");
							teachers[j].settAcademy(newAcademy);
							academy.setText(teachers[j].gettAcademy());
						} else {
							String newMajor = JOptionPane.showInputDialog("更改专业为：");
							teachers[j].settMajor(newMajor);
							major.setText(teachers[j].gettMajor());
						}

						return;
					}
				});
				btn3.setBounds(450, 10, 120, 20);
				btn3.setVisible(true);
				btn3.setText("成绩修改");
				btn3.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						String op2 = JOptionPane.showInputDialog("请输入需要修改学生成绩的学号");
						int op = Integer.parseInt(op2);
						String newGrade = JOptionPane.showInputDialog("更改成绩为：");
						int newgrade = Integer.parseInt(newGrade);
						int changenumber = op - 1000;
						if (changenumber == 1) {
							showGrade_1.setText(String.valueOf(grades[j][0].getgNumber()) + "                  "
									+ grades[j][0].getgCourse() + "                " + stu[0].getStuNumber()
									+ "                     " + grades[j][0].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 2) {
							showGrade_2.setText(String.valueOf(grades[j][1].getgNumber()) + "                  "
									+ grades[j][1].getgCourse() + "                " + stu[1].getStuNumber()
									+ "                     " + grades[j][1].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 3) {
							showGrade_3.setText(String.valueOf(grades[j][2].getgNumber()) + "                  "
									+ grades[j][2].getgCourse() + "                " + stu[2].getStuNumber()
									+ "                     " + grades[j][2].getgStudent() + "                         "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 4) {
							showGrade_4.setText(String.valueOf(grades[j][3].getgNumber()) + "                  "
									+ grades[j][3].getgCourse() + "                " + stu[3].getStuNumber()
									+ "                     " + grades[j][3].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 5) {
							showGrade_5.setText(String.valueOf(grades[j][4].getgNumber()) + "                  "
									+ grades[j][4].getgCourse() + "                " + stu[4].getStuNumber()
									+ "                     " + grades[j][4].getgStudent() + "                         "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 6) {
							showGrade_6.setText(String.valueOf(grades[j][5].getgNumber()) + "                  "
									+ grades[j][5].getgCourse() + "                " + stu[5].getStuNumber()
									+ "                     " + grades[j][5].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 7) {
							showGrade_7.setText(String.valueOf(grades[j][6].getgNumber()) + "                  "
									+ grades[j][6].getgCourse() + "                " + stu[6].getStuNumber()
									+ "                     " + grades[j][6].getgStudent() + "                         "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 8) {
							showGrade_8.setText(String.valueOf(grades[j][7].getgNumber()) + "                  "
									+ grades[j][7].getgCourse() + "                " + stu[7].getStuNumber()
									+ "                     " + grades[j][7].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 9) {
							showGrade_9.setText(String.valueOf(grades[j][8].getgNumber()) + "                  "
									+ grades[j][8].getgCourse() + "                " + stu[8].getStuNumber()
									+ "                     " + grades[j][8].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 10) {
							showGrade_10.setText(String.valueOf(grades[j][9].getgNumber()) + "                  "
									+ grades[j][9].getgCourse() + "                " + stu[9].getStuNumber()
									+ "                     " + grades[j][9].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 11) {
							showGrade_11.setText(String.valueOf(grades[j][10].getgNumber()) + "                  "
									+ grades[j][10].getgCourse() + "                " + stu[10].getStuNumber()
									+ "                     " + grades[j][10].getgStudent() + "                         "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 12) {
							showGrade_12.setText(String.valueOf(grades[j][11].getgNumber()) + "                  "
									+ grades[j][11].getgCourse() + "                " + stu[11].getStuNumber()
									+ "                     " + grades[j][11].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 13) {
							showGrade_13.setText(String.valueOf(grades[j][12].getgNumber()) + "                  "
									+ grades[j][12].getgCourse() + "                " + stu[12].getStuNumber()
									+ "                     " + grades[j][12].getgStudent() + "                         "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 14) {
							showGrade_14.setText(String.valueOf(grades[j][13].getgNumber()) + "                  "
									+ grades[j][13].getgCourse() + "                " + stu[13].getStuNumber()
									+ "                     " + grades[j][13].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}

						else if (changenumber == 15) {
							showGrade_15.setText(String.valueOf(grades[j][14].getgNumber()) + "                  "
									+ grades[j][14].getgCourse() + "                " + stu[14].getStuNumber()
									+ "                     " + grades[j][14].getgStudent() + "                     "
									+ newgrade + "                   " + countCredit(newgrade, courses[j]) + "/"
									+ courses[j].getcCredit());
						}
						return;
					}
				});

				return;

			}
			j++;
		}
		JOptionPane.showMessageDialog(frame, "姓名或编号错误");

	}

	private int countCredit(int gGrade, Course course) {
		if (gGrade >= 60) {
			gCredit = course.getcCredit();
		} else {
			gCredit = 0;
		}
		return gCredit;
	}

	public void initInfo() {

		stu[0] = new Student(1001, 19970323, "曹玉峰", "男", "信软学院", "大型主机");
		stu[1] = new Student(1002, 19970225, "曾洪瑾", "男", "信软学院", "大型主机");
		stu[2] = new Student(1003, 19970818, "陈冰", "男", "信软学院", "大型主机");
		stu[3] = new Student(1004, 19970425, "陈丹丹", "女", "信软学院", "软件技术");
		stu[4] = new Student(1005, 19970817, "陈洁", "女", "信软学院", "软件技术");
		stu[5] = new Student(1006, 19970910, "陈新月", "女", "计科学院", "信息安全");
		stu[6] = new Student(1007, 19971015, "成诚", "男", "计科学院", "信息安全");
		stu[7] = new Student(1008, 19971201, "程楷文", "男", "计科学院", "计算机科学与技术");
		stu[8] = new Student(1009, 19970118, "董小月", "女", "计科学院", "计算机科学与技术");
		stu[9] = new Student(1010, 19971225, "房晓阳", "男", "计科学院", "计算机科学与技术");
		stu[10] = new Student(1011, 19971030, "冯成", "男", "物电学院", "电子信息工程");
		stu[11] = new Student(1012, 19970219, "高楚翘", "女", "物电学院", "电子信息工程");
		stu[12] = new Student(1013, 19971020, "高凡", "男", "物电学院", "电子信息工程");
		stu[13] = new Student(1014, 19970630, "顾凌飞", "男", "物电学院", "应用物理");
		stu[14] = new Student(1015, 19970621, "郭仁斌", "男", "物电学院", "应用物理");

		teachers[0] = new Teacher(100, "董力", "信软学院", "软件技术");
		teachers[1] = new Teacher(101, "任燕", "计科学院", "信息安全");
		teachers[2] = new Teacher(102, "王飞", "物电学院", "应用物理");

		courses[0] = new Course(10, 64, 4, "软件工程");
		courses[1] = new Course(11, 48, 2, "信息安全");
		courses[2] = new Course(12, 64, 4, "大学物理");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 15; j++) {
				grades[i][j] = new Grade(i + 1, 0, courses[i].getcName(), teachers[i].gettName(), stu[j].getStuName());
			}
		}

		grades[0][0].setgGrade(98);
		grades[0][1].setgGrade(85);
		grades[0][2].setgGrade(42);
		grades[0][3].setgGrade(60);
		grades[0][4].setgGrade(71);
		grades[0][5].setgGrade(53);
		grades[0][6].setgGrade(65);
		grades[0][7].setgGrade(32);
		grades[0][8].setgGrade(81);
		grades[0][9].setgGrade(83);
		grades[0][10].setgGrade(44);
		grades[0][11].setgGrade(55);
		grades[0][12].setgGrade(66);
		grades[0][13].setgGrade(46);
		grades[0][14].setgGrade(31);

		grades[1][0].setgGrade(78);
		grades[1][1].setgGrade(85);
		grades[1][2].setgGrade(94);
		grades[1][3].setgGrade(46);
		grades[1][4].setgGrade(52);
		grades[1][5].setgGrade(76);
		grades[1][6].setgGrade(51);
		grades[1][7].setgGrade(84);
		grades[1][8].setgGrade(80);
		grades[1][9].setgGrade(19);
		grades[1][10].setgGrade(66);
		grades[1][11].setgGrade(65);
		grades[1][12].setgGrade(32);
		grades[1][13].setgGrade(54);
		grades[1][14].setgGrade(91);

		grades[2][0].setgGrade(81);
		grades[2][1].setgGrade(83);
		grades[2][2].setgGrade(44);
		grades[2][3].setgGrade(55);
		grades[2][4].setgGrade(66);
		grades[2][5].setgGrade(46);
		grades[2][6].setgGrade(31);
		grades[2][7].setgGrade(52);
		grades[2][8].setgGrade(76);
		grades[2][9].setgGrade(51);
		grades[2][10].setgGrade(84);
		grades[2][11].setgGrade(80);
		grades[2][12].setgGrade(19);
		grades[2][13].setgGrade(66);
		grades[2][14].setgGrade(65);

	}

}
