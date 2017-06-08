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

public class studentEditon implements ActionListener{
	private JFrame frame;
	private JTextField nameField ;
	private JTextField numberField ;
	private JLabel sex= new JLabel();
	private JLabel birthdate = new JLabel();
	private JLabel academy= new JLabel();
	private JLabel major= new JLabel();
	
	private JLabel showGrade_1;
	private JLabel showGrade_2;
	private JLabel showGrade_3;
	private static int i= 0;
	private int gCredit;
	
	Student []stu = new Student[15];
	Teacher []teachers = new Teacher[3];
	Manager []managers = new Manager[3];
	Course []courses = new Course[3];
	Grade [][]grades = new Grade[3][15];
	
	JButton btn1; 
	JButton btn2;
	
	public studentEditon(){

		initInfo();
		frame = new JFrame("学生管理系统(学生版)");
		JLabel to = new JLabel("-------------------------------------------------------------------------------");
		to.setBounds(10,85,600,5);
		frame.add(to);
		
		JLabel nameJLabel = new JLabel("姓名：");
		nameJLabel.setBounds(50, 20, 60, 20);
		nameJLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		frame.add(nameJLabel);
		
		JLabel numberLabel = new JLabel("学号：");
		numberLabel.setBounds(50,50,60,20);
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
		btn1.setBounds(270,50,60,20);
		btn1.setFont(new Font("宋体", Font.PLAIN, 12));
		frame.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("确定");
		btn2.setBounds(270,50,60,20);
		btn2.setFont(new Font("宋体", Font.PLAIN, 12));
		frame.add(btn2);
		btn2.setVisible(false);
		
	    
		JLabel CNumber = new JLabel("课号");
		CNumber.setBounds(30, 100, 90, 20);
		CNumber.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CNumber);

		JLabel CName = new JLabel("课程", JLabel.CENTER);
		CName.setBounds(80, 100, 90, 20);
		CName.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CName);

		JLabel TName = new JLabel("教师", JLabel.CENTER);
		TName.setBounds(170, 100, 90, 20);
		TName.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(TName);

		JLabel CPeriod = new JLabel("学生", JLabel.CENTER);
		CPeriod.setBounds(260, 100, 90, 20);
		CPeriod.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(CPeriod);

		JLabel Grade = new JLabel("成绩", JLabel.CENTER);
		Grade.setBounds(335, 100, 90, 20);
		Grade.setFont(new Font("宋体", Font.PLAIN, 14));
		frame.add(Grade);

		JLabel CCredit = new JLabel("学分", JLabel.RIGHT);
		CCredit.setBounds(375, 100, 90, 20);
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
		
		frame.add(sex);
		frame.add(academy);
		frame.add(major);
		frame.add(birthdate);
		
		frame.setSize(600,400);
		frame.setLocation(300,100);
		frame.setLayout(null);
		frame.getContentPane().setBackground(new Color(66,171,145));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for (Student s : stu) {
			if (nameField.getText().equals(s.stuName)&&numberField.getText().equals(String.valueOf(s.stuNumber))) {
				showGrade_1.setText(String.valueOf(grades[0][i].getgNumber())+"                  "+grades[0][i].getgCourse()+
			      "                "+grades[0][i].getgTeacher()+"                     "+courses[0].getcPeriod()+"                     "+
			      grades[0][i].getgGrade()+"                   "+countCredit(grades[0][i].getgGrade(),courses[0])+"/"+courses[0].getcCredit());
				
				showGrade_2.setText(String.valueOf(grades[1][i].getgNumber())+"                  "+grades[1][i].getgCourse()+
				  "                "+grades[1][i].getgTeacher()+"                     "+courses[1].getcPeriod()+"                     "+
				  grades[1][i].getgGrade()+"                   "+countCredit(grades[1][i].getgGrade(),courses[1])+"/"+courses[1].getcCredit());
				
				showGrade_3.setText(String.valueOf(grades[2][i].getgNumber())+"                  "+grades[2][i].getgCourse()+
				  "                "+grades[2][i].getgTeacher()+"                     "+courses[2].getcPeriod()+"                     "+
				  grades[2][i].getgGrade()+"                   "+countCredit(grades[2][i].getgGrade(),courses[2])+"/"+courses[0].getcCredit());
				
				nameField.setEditable(false);
				numberField.setEditable(false);
			
				birthdate.setText(String.valueOf(s.stuBirthdate));
				birthdate.setBounds(300,20,100,20);
				
				sex .setText(s.getStuSex());
				sex.setBounds(400,20,100,20);
				
			
				academy .setText(s.getStuAcademy());
				academy.setBounds(300,50,100,20);
				
			
				major .setText(s.getStuMajor());
				major.setBounds(400,50,100,20);
				
				btn1.setVisible(false);
				btn2.setVisible(true);
				btn2.setBounds(500,50,60,20);
				btn2.setText("修改");
				btn2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						String op1= JOptionPane.showInputDialog("请输入需修改内容序号\n1.名字\n2.学号\n3.性别\n4.生日\n5.学院\n6.专业\n");
						int op = Integer.parseInt(op1);
						if(op == 1){
							String newName=JOptionPane.showInputDialog("更改名字为：");
							stu[i].setStuName(newName);
							nameField.setText(stu[i].stuName);
						}else if (op == 2) {
							String newNumber=JOptionPane.showInputDialog("更改学号为：");
							int newnumber = Integer.parseInt(newNumber);
							numberField.setText(newNumber);
							stu[i].setStuNumber(newnumber);
						}else if (op == 3) {
							String newSex=JOptionPane.showInputDialog("更改性别为：");
							stu[i].setStuSex(newSex);
							sex .setText(stu[i].getStuSex());
						}else if (op == 4) {
							String newBirth=JOptionPane.showInputDialog("更改生日为：");
							int newbirth = Integer.parseInt(newBirth);
							stu[i].setStuBirthdate(newbirth);
							birthdate.setText(String.valueOf(stu[i].stuBirthdate));
						}else if (op == 5) {
							String newAcademy=JOptionPane.showInputDialog("更改学院为：");
							stu[i].setStuAcademy(newAcademy);
							academy .setText(stu[i].getStuAcademy());
						}else {
							String newMajor=JOptionPane.showInputDialog("更改专业为：");
							stu[i].setStuMajor(newMajor);
							major .setText(stu[i].getStuMajor());
						}
						
						
						
						
				       
				        
						return;
					}
					
				});
				
				return;
			
			}
			i++;
		}
		JOptionPane.showMessageDialog(frame, "姓名或学号错误");
		
	}
	
	private int  countCredit(int gGrade,Course course) {
		if (gGrade >= 60) {
			gCredit = course.getcCredit();
		}else  {
			gCredit = 0;
		}
	    return gCredit;
	}

	public void initInfo() {
		
		stu[0]= new Student(1001, 19970323, "曹玉峰", "男", "信软学院", "大型主机");
		stu[1]= new Student(1002, 19970225, "曾洪瑾", "男", "信软学院", "大型主机");
		stu[2]= new Student(1003, 19970818, "陈冰", "男", "信软学院", "大型主机");
		stu[3]= new Student(1004, 19970425, "陈丹丹", "女", "信软学院", "软件技术");
		stu[4]= new Student(1005, 19970817, "陈洁", "女", "信软学院", "软件技术");
		stu[5]= new Student(1006, 19970910, "陈新月", "女", "计科学院", "信息安全");
		stu[6]= new Student(1007, 19971015, "成诚", "男","计科学院", "信息安全");
		stu[7]= new Student(1008, 19971201, "程楷文", "男", "计科学院", "计算机科学与技术");
		stu[8]= new Student(1009, 19970118, "董小月", "女", "计科学院", "计算机科学与技术");
		stu[9]= new Student(1010, 19971225, "房晓阳", "男", "计科学院", "计算机科学与技术");
		stu[10]= new Student(1011, 19971030, "冯成", "男", "物电学院", "电子信息工程");
		stu[11]= new Student(1012, 19970219, "高楚翘", "女", "物电学院", "电子信息工程");
		stu[12]= new Student(1013, 19971020, "高凡", "男", "物电学院", "电子信息工程");
		stu[13]= new Student(1014, 19970630, "顾凌飞", "男", "物电学院", "应用物理");
		stu[14]= new Student(1015, 19970621, "郭仁斌", "男","物电学院", "应用物理");
		
		teachers[0]= new Teacher(100, "董力", "信软学院", "软件技术");
		teachers[1]= new Teacher(101, "任燕", "计科学院", "信息安全");
		teachers[2]= new Teacher(102, "王飞", "物电学院", "应用物理");
		
		courses[0]= new Course(10, 64, 4, "软件工程");
		courses[1]= new Course(11, 48,2,"信息安全");
		courses[2]= new Course(12, 64, 4, "大学物理");
		
		for(int i = 0;i <3 ; i++){
			for(int j = 0;j <15;j++){
			grades[i][j] = new Grade(i+1, 0, courses[i].getcName(), teachers[i].gettName(), stu[j].getStuName());
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
