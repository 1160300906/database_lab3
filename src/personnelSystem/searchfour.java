package personnelSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class searchfour {
	private JFrame frame;
	private JFrame frame1;
	
	public JFrame getFrame()
	{
		return frame;
	}
	public searchfour() throws ClassNotFoundException, SQLException {
		initialize();
	}
	private void initialize() throws ClassNotFoundException, SQLException {
		frame = new JFrame();
		frame.setTitle("��ѯ4����");
		frame.setForeground(Color.DARK_GRAY);
		frame.getContentPane().setFont(new Font("΢���ź�", Font.BOLD, 16));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setFont(null);
		frame.setBackground(Color.GRAY);
		frame.setBounds(200,200,500,400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					JTextField textField2;	
					JTextField textField3;	
					JTextPane textPane = new JTextPane();
					textPane.setBackground(SystemColor.control);
					textPane.setFont(new Font("����", Font.PLAIN, 14));
					textPane.setText("��ѯѡ��m�ſ���ƽ���ɼ�����n��Ա����Ա��������ƽ���ɼ�");
					textPane.setBounds(45, 42, 600, 22);
					frame.getContentPane().add(textPane);
					
					JTextPane textPane1 = new JTextPane();
					textPane1.setBackground(SystemColor.control);
					textPane1.setFont(new Font("����", Font.PLAIN, 14));
					textPane1.setText("m��n������������ݣ������·�����");
					textPane1.setBounds(45, 82, 600, 22);
					frame.getContentPane().add(textPane1);
										
					JTextPane textPane2 = new JTextPane();
					textPane2.setBackground(SystemColor.control);
					textPane2.setFont(new Font("����", Font.PLAIN, 20));
					textPane2.setText("�γ�����");
					textPane2.setBounds(25, 146,120, 32);
					frame.getContentPane().add(textPane2);
					//���������ı���
					textField2 = new JTextField();
					textField2.setBounds(148, 146, 178, 32);
					frame.getContentPane().add(textField2);
					textField2.setColumns(10);
								
					JTextPane textPane3 = new JTextPane();
					textPane3.setBackground(SystemColor.control);
					textPane3.setFont(new Font("����", Font.PLAIN, 20));
					textPane3.setText("�ɼ�");
					textPane3.setBounds(45, 198, 83, 32);
					frame.getContentPane().add(textPane3);
					//���������ı���
				   textField3 = new JTextField();
				   textField3.setBounds(148, 198, 178, 32);
				   frame.getContentPane().add(textField3);
				   textField3.setColumns(10);
				   
				   JButton btnNewButton = new JButton("ȷ��");
				   btnNewButton.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent l) {
				   String num3=textField2.getText();
				   String num4=textField3.getText();
					try {
						if(num3.equals(" ")||num4.equals(" ")) {
						JOptionPane.showMessageDialog(btnNewButton,"��ѯ��Ϣ���ܿ������������룡","Error", JOptionPane.ERROR_MESSAGE);
						}else {
							frame1=new JFrame("��ѯ4���");
							JTable table=PersonnelSystem.searchfour(num3,num4);
							frame1.add(new JScrollPane(table));
							frame1.setSize(400, 300); 
							frame1.setLocationRelativeTo(null); 
							frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							frame1.setVisible(true);
						}					
						textField2.setText("");
						textField3.setText("");
					} catch (ClassNotFoundException | SQLException e2) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(btnNewButton,"��ѯ���ִ������������룡","Error", JOptionPane.ERROR_MESSAGE);
						textField2.setText("");
						textField3.setText("");
						e2.printStackTrace();
					} }});
				   btnNewButton.setBounds(300, 250, 111, 38);
					frame.getContentPane().add(btnNewButton);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
	}
}