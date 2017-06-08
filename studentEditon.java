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
		frame = new JFrame("ѧ������ϵͳ(ѧ����)");
		JLabel to = new JLabel("-------------------------------------------------------------------------------");
		to.setBounds(10,85,600,5);
		frame.add(to);
		
		JLabel nameJLabel = new JLabel("������");
		nameJLabel.setBounds(50, 20, 60, 20);
		nameJLabel.setFont(new Font("����", Font.PLAIN, 16));
		frame.add(nameJLabel);
		
		JLabel numberLabel = new JLabel("ѧ�ţ�");
		numberLabel.setBounds(50,50,60,20);
		numberLabel.setFont(new Font("����", Font.PLAIN, 16));
		frame.add(numberLabel);
		
		nameField = new JTextField();
		nameField.setBounds(100, 20, 150, 20);
		nameField.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(nameField);
		
		numberField = new JTextField();
		numberField.setBounds(100, 50, 150, 20);
		numberField.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(numberField);
		
		btn1 = new JButton("ȷ��");
		btn1.setBounds(270,50,60,20);
		btn1.setFont(new Font("����", Font.PLAIN, 12));
		frame.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("ȷ��");
		btn2.setBounds(270,50,60,20);
		btn2.setFont(new Font("����", Font.PLAIN, 12));
		frame.add(btn2);
		btn2.setVisible(false);
		
	    
		JLabel CNumber = new JLabel("�κ�");
		CNumber.setBounds(30, 100, 90, 20);
		CNumber.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(CNumber);

		JLabel CName = new JLabel("�γ�", JLabel.CENTER);
		CName.setBounds(80, 100, 90, 20);
		CName.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(CName);

		JLabel TName = new JLabel("��ʦ", JLabel.CENTER);
		TName.setBounds(170, 100, 90, 20);
		TName.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(TName);

		JLabel CPeriod = new JLabel("ѧ��", JLabel.CENTER);
		CPeriod.setBounds(260, 100, 90, 20);
		CPeriod.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(CPeriod);

		JLabel Grade = new JLabel("�ɼ�", JLabel.CENTER);
		Grade.setBounds(335, 100, 90, 20);
		Grade.setFont(new Font("����", Font.PLAIN, 14));
		frame.add(Grade);

		JLabel CCredit = new JLabel("ѧ��", JLabel.RIGHT);
		CCredit.setBounds(375, 100, 90, 20);
		CCredit.setFont(new Font("����", Font.PLAIN, 14));
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
				btn2.setText("�޸�");
				btn2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						String op1= JOptionPane.showInputDialog("���������޸��������\n1.����\n2.ѧ��\n3.�Ա�\n4.����\n5.ѧԺ\n6.רҵ\n");
						int op = Integer.parseInt(op1);
						if(op == 1){
							String newName=JOptionPane.showInputDialog("��������Ϊ��");
							stu[i].setStuName(newName);
							nameField.setText(stu[i].stuName);
						}else if (op == 2) {
							String newNumber=JOptionPane.showInputDialog("����ѧ��Ϊ��");
							int newnumber = Integer.parseInt(newNumber);
							numberField.setText(newNumber);
							stu[i].setStuNumber(newnumber);
						}else if (op == 3) {
							String newSex=JOptionPane.showInputDialog("�����Ա�Ϊ��");
							stu[i].setStuSex(newSex);
							sex .setText(stu[i].getStuSex());
						}else if (op == 4) {
							String newBirth=JOptionPane.showInputDialog("��������Ϊ��");
							int newbirth = Integer.parseInt(newBirth);
							stu[i].setStuBirthdate(newbirth);
							birthdate.setText(String.valueOf(stu[i].stuBirthdate));
						}else if (op == 5) {
							String newAcademy=JOptionPane.showInputDialog("����ѧԺΪ��");
							stu[i].setStuAcademy(newAcademy);
							academy .setText(stu[i].getStuAcademy());
						}else {
							String newMajor=JOptionPane.showInputDialog("����רҵΪ��");
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
		JOptionPane.showMessageDialog(frame, "������ѧ�Ŵ���");
		
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
		
		stu[0]= new Student(1001, 19970323, "�����", "��", "����ѧԺ", "��������");
		stu[1]= new Student(1002, 19970225, "�����", "��", "����ѧԺ", "��������");
		stu[2]= new Student(1003, 19970818, "�±�", "��", "����ѧԺ", "��������");
		stu[3]= new Student(1004, 19970425, "�µ���", "Ů", "����ѧԺ", "�������");
		stu[4]= new Student(1005, 19970817, "�½�", "Ů", "����ѧԺ", "�������");
		stu[5]= new Student(1006, 19970910, "������", "Ů", "�ƿ�ѧԺ", "��Ϣ��ȫ");
		stu[6]= new Student(1007, 19971015, "�ɳ�", "��","�ƿ�ѧԺ", "��Ϣ��ȫ");
		stu[7]= new Student(1008, 19971201, "�̿���", "��", "�ƿ�ѧԺ", "�������ѧ�뼼��");
		stu[8]= new Student(1009, 19970118, "��С��", "Ů", "�ƿ�ѧԺ", "�������ѧ�뼼��");
		stu[9]= new Student(1010, 19971225, "������", "��", "�ƿ�ѧԺ", "�������ѧ�뼼��");
		stu[10]= new Student(1011, 19971030, "���", "��", "���ѧԺ", "������Ϣ����");
		stu[11]= new Student(1012, 19970219, "�߳���", "Ů", "���ѧԺ", "������Ϣ����");
		stu[12]= new Student(1013, 19971020, "�߷�", "��", "���ѧԺ", "������Ϣ����");
		stu[13]= new Student(1014, 19970630, "�����", "��", "���ѧԺ", "Ӧ������");
		stu[14]= new Student(1015, 19970621, "���ʱ�", "��","���ѧԺ", "Ӧ������");
		
		teachers[0]= new Teacher(100, "����", "����ѧԺ", "�������");
		teachers[1]= new Teacher(101, "����", "�ƿ�ѧԺ", "��Ϣ��ȫ");
		teachers[2]= new Teacher(102, "����", "���ѧԺ", "Ӧ������");
		
		courses[0]= new Course(10, 64, 4, "�������");
		courses[1]= new Course(11, 48,2,"��Ϣ��ȫ");
		courses[2]= new Course(12, 64, 4, "��ѧ����");
		
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
