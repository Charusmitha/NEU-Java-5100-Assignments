package assignment8;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LoadStudentDetailsView extends JFrame{

	private JLabel enterDetails; 
	private JLabel firstName;
	private JLabel lastName; 
	private JLabel studentID; 
	private JLabel genderLabel;
	
	private JButton clickToConfirm;
	private JButton clickToAddMoreStudents;
	private JButton viewStudentsList;
	
	static JTextField firstNameTextField;
	static JTextField lastNameTextField;
	static JTextField studentIDTextField;
	
	private static JRadioButton maleRB;
	private static JRadioButton femaleRB;
	
	private Font font;
	
	static String fName;
	static String lName;
	static String gender;
	static String sID;
	
	private static JFrame frame;
	private Container c;
	public static Students s;
	
	private static boolean First = true;
	
	public LoadStudentDetailsView() {
		
		frame = new JFrame();
 		frame.setTitle("Northeastern University");
 		
 		c = frame.getContentPane();
 		
		createComponents();
 		setLayout();
 		addComponents();
	
 		maleRB.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				gender = "Male";
			}

 		});
 		femaleRB.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				gender = "Female";
			}

 		});
 		ConfirmClicked cc = new ConfirmClicked();
 		clickToConfirm.addActionListener(cc);
		
 	    MoreStudentsClicked msc = new MoreStudentsClicked();
 	    clickToAddMoreStudents.addActionListener(msc);
 	    
 	    ViewStudentsClicked vsc = new ViewStudentsClicked();
 	    viewStudentsList.addActionListener(vsc);
 		
		frame.setSize(400, 400);
		frame.setVisible(true);
	
	}	

	
	private void createComponents() {
 		font = new Font("TimesRoman", Font.PLAIN, 20);
 		firstNameTextField = new JTextField(20);
 		lastNameTextField = new JTextField(20);
 		studentIDTextField = new JTextField(20);
 		firstNameTextField.setFont(font);
 		lastNameTextField.setFont(font);
 		studentIDTextField.setFont(font);
 		
		enterDetails = new JLabel("Enter Student Details");
		enterDetails.setFont(font);
		firstName = new JLabel("First Name");
		firstName.setFont(font);
		lastName = new JLabel("Last Name");
		lastName.setFont(font);
		studentID = new JLabel("Student ID");
		studentID.setFont(font);
		genderLabel = new JLabel("Select Gender");
		genderLabel.setFont(font);
		
		maleRB = new JRadioButton("Male");
		femaleRB = new JRadioButton("Female");
		
		clickToConfirm = new JButton("Click To Confirm");
		clickToAddMoreStudents = new JButton("Click To Add More Students");
		viewStudentsList = new JButton("Click To View Students List");
	}
		
 	private void setLayout() {
 	 	GridLayout gl = new GridLayout(7, 1);
 	 	Container c = frame.getContentPane();
 	 	c.setLayout(gl);
 	 	
 	 }
 	
 	private void addComponents() {
 		
 		JPanel p =  new JPanel();
 		p.add(enterDetails);
 		c.add(p);

 		JPanel p1 = new JPanel();
 		p1.add(firstName);
 		p1.add(firstNameTextField);
 		c.add(p1);

 		JPanel p2 = new JPanel();
 		p2.add(lastName);
 		p2.add(lastNameTextField);
 		c.add(p2);

 		JPanel p3 = new JPanel();
 		p3.add(studentID);
 		p3.add(studentIDTextField);
 		c.add(p3);

 		JPanel p4 = new JPanel();
 		p4.add(genderLabel);
 		p4.add(maleRB);
 		p4.add(femaleRB);
 		c.add(p4);
 		
 		JPanel p5 = new JPanel();
 		p5.add(clickToConfirm);
 		p5.add(clickToAddMoreStudents);
 		c.add(p5);
 		
 		JPanel p6 = new JPanel();
 		p6.add(viewStudentsList);
 		c.add(p6);
 		
 	}
 	
 	public static void main(String[] args) {
 		
 		s = new Students();
		new LoadStudentDetailsView();	
		
	}
 	
 	static class ConfirmClicked implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(frame.getComponent(0), "Student Details Saved");
			
			fName = firstNameTextField.getText();
	 		lName = lastNameTextField.getText();
	 		sID = studentIDTextField.getText();
			
	 		s.addStudent(new Student(fName, lName, sID, gender));
			
			fName = "";
			lName = "";
			sID = "";
			gender = "";
			
		}
 		
 	}
 	
 	static class MoreStudentsClicked implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			firstNameTextField.setText("");
		 	lastNameTextField.setText("");
		 	studentIDTextField.setText("");
		 	
			new LoadStudentDetailsView();	
			
		}
		}
		
 	static class ViewStudentsClicked implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			new StudentsApplication(s);
			
		}
		}
 	
 	static class Students {
 		
 		Collection<Student> students = new ArrayList<Student>();
 		
 		public Collection<Student> getStudents() {
 			return students;

 		}

 		public void addStudent(Student s) {
 			students.add(s);
 		}

 		public int getNumberOfStudents() {
 			return getStudents().size();
 		}

 	}
 	
 	static class Student {
 		String first;
 		String last;
 		String sID;
 		String gender;

 		public Student(String first, String last, String sID, String gender) {
 			this.first = first;
 			this.last = last;
 			this.sID = sID;
 			this.gender = gender;
 		}
 	}

}



