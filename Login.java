package stuManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame {

	public Login() {
		super("学生管理系统");
		JButton studentButton = new JButton("Student");
		JButton teacherButton = new JButton("Teacher");
		JButton managerButton = new JButton("Manager");

		JLabel startLabel = new JLabel("学 生 管 理 系 统");

		// 所有界面通用
		setSize(600, 400);
		setLocation(300, 100);
		setLayout(null);
		this.getContentPane().setBackground(new Color(66, 171, 145));
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		startLabel.setFont(new Font("宋体", Font.BOLD, 20));
		startLabel.setBounds(220, 50, 300, 50);
		studentButton.setBounds(100, 150, 100, 100);
		teacherButton.setBounds(250, 150, 100, 100);
		managerButton.setBounds(400, 150, 100, 100);

		add(startLabel);
		add(managerButton);
		add(teacherButton);
		add(studentButton);

		// 设置监听 跳转到不同版本的学生管理系统
		studentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentEditon();
			}
		});
		teacherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new teacherEditon();
			}
		});
		managerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new managerEditon();
			}
		});

	}

	public static void main(String[] args) {
		new Login();
	}

}
