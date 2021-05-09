import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Student_info extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_info frame = new Student_info();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Student_info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		tf = new JTextField();
		tf.setBounds(31, 37, 202, 29);
		contentPane.add(tf);
		tf.setColumns(10);
		
		tf1 = new JTextField();
		tf1.setBounds(31, 115, 202, 29);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(31, 199, 202, 29);
		contentPane.add(tf2);
		tf2.setColumns(10);
		
		tf3 = new JTextField();
		tf3.setBounds(31, 288, 202, 29);
		contentPane.add(tf3);
		tf3.setColumns(10);
		
		tf4 = new JTextField();
		tf4.setBounds(31, 377, 202, 29);
		contentPane.add(tf4);
		tf4.setColumns(10);
		
		tf5 = new JTextField();
		tf5.setBounds(31, 455, 202, 29);
		contentPane.add(tf5);
		tf5.setColumns(10);
		
		JLabel FirstName = new JLabel("Enter the First name");
		FirstName.setBounds(31, 13, 126, 26);
		contentPane.add(FirstName);
		
		JLabel LastName = new JLabel("Enter the last name");
		LastName.setBounds(31, 87, 126, 26);
		contentPane.add(LastName);
		
		JLabel Course = new JLabel("Enter Your Course name");
		Course.setBounds(32, 172, 152, 26);
		contentPane.add(Course);
		
		JLabel Regno = new JLabel("Enter your registration no");
		Regno.setBounds(32, 262, 152, 26);
		contentPane.add(Regno);
		
		JLabel Subject = new JLabel("Enter the subjects");
		Subject.setBounds(31, 349, 126, 26);
		contentPane.add(Subject);
		
		JLabel Fees = new JLabel("Enter Hostel fees");
		Fees.setBounds(31, 428, 126, 26);
		contentPane.add(Fees);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try { 
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","System","shikha1234");
					PreparedStatement ps = conn.prepareStatement("insert into studentinfo (stu_firstname, stu_lastname, course_name, stu_reno, subject, Fees) values(?,?,?,?,?,?);");
					ps.setString(1, FirstName.getText());
					ps.setString(1, LastName.getText());
					ps.setString(1, Course.getText());
					ps.setString(1, Regno.getText());
					ps.setString(1, Subject.getText());
					ps.setString(1, Fees.getText());
					
						int x = ps.executeUpdate();
						if(x>0) {
							System.out.println("Information is sucessfully enterd");
						}else {
							System.out.println("Information can not be enterd");
						}
				}catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnSubmit.setBounds(285, 239, 97, 25);
		contentPane.add(btnSubmit);
	}
}