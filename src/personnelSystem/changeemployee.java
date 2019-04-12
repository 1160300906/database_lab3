package personnelSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class changeemployee {
	private JFrame frame;
	private String num1 = "";
	private String num2 = "";
	private String num3 = "";
//	private JPasswordField passwordField;
//	private JTable table=null;
//	private JFrame frame1;
//	private JTextField textField;
	
	public JFrame getFrame()
	{
		return frame;
	}
	public changeemployee() throws ClassNotFoundException, SQLException {
		initialize();
	}
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.setTitle("修改职工信息界面（*为不可改项）");
		frame.setForeground(Color.DARK_GRAY);
		frame.getContentPane().setFont(new Font("微软雅黑", Font.BOLD, 16));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setFont(null);
		frame.setBackground(Color.GRAY);
		frame.setBounds(200,200,700,700);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					JTextField textField;
					JTextField textField1;
					JTextField textField2;
					JTextField textField3;
					JTextField textField4;
					JTextField textField5;
					JTextField textField6;
					JTextField textField7;
					JTextField textField8;
					JTextField textField9;
					JTextField textField10;
					JTextField textField11;
					JTextField textField12;
					JTextPane textPane = new JTextPane();
					textPane.setBackground(SystemColor.control);
					textPane.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane.setText("职工号*");
					textPane.setBounds(45, 42, 105, 32);
					frame.getContentPane().add(textPane);
					//添加输入文本框
					textField = new JTextField();
					textField.setBounds(148, 42, 178,32);
					frame.getContentPane().add(textField);
					textField.setColumns(10);
					
					JTextPane textPane1 = new JTextPane();
					textPane1.setBackground(SystemColor.control);
					textPane1.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane1.setText(" 姓名*");
					textPane1.setBounds(55, 94, 85, 32);
					frame.getContentPane().add(textPane1);
					//添加输入文本框
					textField1 = new JTextField();
					textField1.setBounds(148, 94, 178, 32);
					frame.getContentPane().add(textField1);
					textField1.setColumns(10);
					
					JTextPane textPane2 = new JTextPane();
					textPane2.setBackground(SystemColor.control);
					textPane2.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane2.setText("身份证号*");
					textPane2.setBounds(25, 146,120, 32);
					frame.getContentPane().add(textPane2);
					//添加输入文本框
					textField2 = new JTextField();
					textField2.setBounds(148, 146, 178, 32);
					frame.getContentPane().add(textField2);
					textField2.setColumns(10);
					
					JTextPane textPane3 = new JTextPane();
					textPane3.setBackground(SystemColor.control);
					textPane3.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane3.setText(" 性别");
					textPane3.setBounds(45, 198, 83, 32);
					frame.getContentPane().add(textPane3);
					//添加输入文本框
				   textField3 = new JTextField();
				   textField3.setBounds(148, 198, 178, 32);
				   frame.getContentPane().add(textField3);
				   textField3.setColumns(10);
				   
				   JTextPane textPane4 = new JTextPane();
					textPane4.setBackground(SystemColor.control);
					textPane4.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane4.setText(" 年龄");
					textPane4.setBounds(45, 250, 83, 32);
					frame.getContentPane().add(textPane4);
					//添加输入文本框
				   textField4 = new JTextField();
				   textField4.setBounds(148, 250, 178, 32);
				   frame.getContentPane().add(textField4);
				   textField4.setColumns(10);
				   
				   JTextPane textPane5 = new JTextPane();
					textPane5.setBackground(SystemColor.control);
					textPane5.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane5.setText(" 生日");
					textPane5.setBounds(45, 302, 83, 32);
					frame.getContentPane().add(textPane5);
					//添加输入文本框
				   textField5 = new JTextField();
				   textField5.setBounds(148, 302, 178, 32);
				   frame.getContentPane().add(textField5);
				   textField5.setColumns(10);
				   
				   JTextPane textPane6 = new JTextPane();
					textPane6.setBackground(SystemColor.control);
					textPane6.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane6.setText(" 部门号");
					textPane6.setBounds(35, 354, 93, 32);
					frame.getContentPane().add(textPane6);
					//添加输入文本框
				   textField6 = new JTextField();
				   textField6.setBounds(148, 354, 178, 32);
				   frame.getContentPane().add(textField6);
				   textField6.setColumns(10);
				   
				   JTextPane textPane7 = new JTextPane();
					textPane7.setBackground(SystemColor.control);
					textPane7.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane7.setText(" 职务号");
					textPane7.setBounds(343, 42, 83, 32);
					frame.getContentPane().add(textPane7);
					//添加输入文本框
				   textField7 = new JTextField();
				   textField7.setBounds(450, 42, 178, 32);
				   frame.getContentPane().add(textField7);
				   textField7.setColumns(10);
				   
				   JTextPane textPane8= new JTextPane();
					textPane8.setBackground(SystemColor.control);
					textPane8.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane8.setText(" 民族");
					textPane8.setBounds(353, 94, 83, 32);
					frame.getContentPane().add(textPane8);
					//添加输入文本框
				   textField8= new JTextField();
				   textField8.setBounds(450, 94, 178, 32);
				   frame.getContentPane().add(textField8);
				   textField8.setColumns(10);
				   
				   JTextPane textPane9 = new JTextPane();
					textPane9.setBackground(SystemColor.control);
					textPane9.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane9.setText(" 政治面貌");
					textPane9.setBounds(333,146, 110, 32);
					frame.getContentPane().add(textPane9);
					//添加输入文本框
				   textField9 = new JTextField();
				   textField9.setBounds(450, 146, 178, 32);
				   frame.getContentPane().add(textField9);
				   textField9.setColumns(10);
				   
				   JTextPane textPane10 = new JTextPane();
					textPane10.setBackground(SystemColor.control);
					textPane10.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane10.setText(" 婚姻状况");
					textPane10.setBounds(333, 198, 110, 32);
					frame.getContentPane().add(textPane10);
					//添加输入文本框
				   textField10 = new JTextField();
				   textField10.setBounds(450, 198, 178, 32);
				   frame.getContentPane().add(textField10);
				   textField10.setColumns(10);
				   
				   JTextPane textPane11 = new JTextPane();
					textPane11.setBackground(SystemColor.control);
					textPane11.setFont(new Font("宋体", Font.PLAIN, 20));
					textPane11.setText(" 雇佣时间");
					textPane11.setBounds(333, 250, 110, 32);
					frame.getContentPane().add(textPane11);
					//添加输入文本框
				   textField11 = new JTextField();
				   textField11.setBounds(450, 250, 178, 32);
				   frame.getContentPane().add(textField11);
				   textField11.setColumns(10);
				   
				   JTextPane textPane12 = new JTextPane();
					textPane12.setBackground(SystemColor.control);
					textPane12.setFont(new Font("宋体", Font.PLAIN, 18));
					textPane12.setText(" 录入人员");
					textPane12.setBounds(333, 302, 110, 32);
					frame.getContentPane().add(textPane12);
					//添加输入文本框
				   textField12 = new JTextField();
				   textField12.setBounds(450, 302, 178, 32);
				   frame.getContentPane().add(textField12);
				   textField12.setColumns(10);
				   JButton btnNewButton = new JButton("确定");
				   btnNewButton.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent l) {
					   String num111=textField.getText();
						String num22=textField1.getText();
				   String num33=textField2.getText();
				   String num4=textField3.getText();
				   String num5=textField4.getText();
				   String num6=textField5.getText();
				   String num7=textField6.getText();
				   String num8=textField7.getText();
				   String num9=textField8.getText();
				   String num10=textField9.getText();
				   String num11=textField10.getText();
				   String num12=textField11.getText();
				   String num13=textField12.getText();
				 //  System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9+"\n"+num10+"\n"+num11+"\n"+num12+"\n"+num13);
					try {
						if(!num1.equals(num111) || !num2.equals(num22) || !num3.equals(num33)) {
							JOptionPane.showMessageDialog(btnNewButton,"带*信息不能更改填请重新输入！","Error", JOptionPane.ERROR_MESSAGE);
							}
						else {
					   PersonnelSystem.changeemployee(num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13);
						JOptionPane.showMessageDialog(btnNewButton,"修改成功");
							}				
						textField.setText("");
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						textField6.setText("");
						textField7.setText("");
						textField8.setText("");
						textField9.setText("");
						textField10.setText("");
						textField11.setText("");
						textField12.setText(""); // 
					} catch (ClassNotFoundException | SQLException e2) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(btnNewButton,"无法修改请重新输入！","Error", JOptionPane.ERROR_MESSAGE);
						textField.setText("");
						textField1.setText("");
						textField2.setText("");
						textField3.setText("");
						textField4.setText("");
						textField5.setText("");
						textField6.setText("");
						textField7.setText("");
						textField8.setText("");
						textField9.setText("");
						textField10.setText("");
						textField11.setText("");
						textField12.setText("");
					} }});
				   btnNewButton.setBounds(200, 500, 111, 38);
					frame.getContentPane().add(btnNewButton);
					   
					   JButton btnNewButton1 = new JButton("查看");
					   btnNewButton1.addActionListener(new ActionListener() {
						   public void actionPerformed(ActionEvent l) {
						   String numm=textField.getText();
						   num1=numm;
						try {
							ArrayList<String> list=PersonnelSystem.searchemployeebyID(numm);
							//System.out.println(list.toString());
							if(list.size()==12) {
							textField1.setText(list.get(0));
							num2=list.get(0);
							textField2.setText(list.get(1));
							num3=list.get(1);
							if(list.get(2)!="")
							textField3.setText(list.get(2));
							if(list.get(3)!="")
							textField4.setText(list.get(3));
							if(list.get(4)!="")
							textField5.setText(list.get(4));
							if(list.get(5)!="")
							textField6.setText(list.get(5));
							if(list.get(6)!="")
							textField7.setText(list.get(6));
							if(list.get(7)!="")
							textField8.setText(list.get(7));
							if(list.get(8)!="")
							textField9.setText(list.get(8));
							if(list.get(9)!="")
							textField10.setText(list.get(9));
							if(list.get(10)!="")
							textField11.setText(list.get(10));
							if(list.get(11)!="")
							textField12.setText(list.get(11));
							}
							else
							JOptionPane.showMessageDialog(btnNewButton1,"职工号名不存在请重新输入！","Error", JOptionPane.ERROR_MESSAGE);
						} catch (ClassNotFoundException | SQLException e2) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(btnNewButton1,"职工号名不存在请重新输入！","Error", JOptionPane.ERROR_MESSAGE);
							textField.setText("");
						} }});
					   btnNewButton1.setBounds(400, 500, 111, 38);
						frame.getContentPane().add(btnNewButton1);
		                frame.getContentPane().setLayout(null);
	}
}
