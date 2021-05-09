import java.util.*;
public class Student_info_1013 {
		private String stu_firstname;
		private String stu_lastname;
		private String course_name;
		private String stu_regno;
		private String subject;
		private int fees;
		private static int academicfees = 100000;
		
		public Student_info_1013() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Student first name: ");
			this.stu_firstname = sc.nextLine();
			
			System.out.println("Enter Student last name: ");
			this.stu_lastname = sc.nextLine();
			
			System.out.println("Enter course name: ");
			this.course_name = sc.nextLine();
			
			System.out.println("Enter Student reg no: ");
			this.stu_regno = sc.nextLine();
			
	  }
		
		public void enroll() {
			do {
				System.out.println("Enter Subject to enroll: ");
				Scanner sc = new Scanner(System.in);
				this.subject  = sc.nextLine();
				String subject = sc.nextLine();
				if(!subject.equals("Q"));{
				subject = subject + "\n  " + subject;
				fees = fees + academicfees;
				}
			{
			break;
			}
		}while(1 != 0);
   }
		public void viewTotalFees() {
			System.out.println("Your total fees is: "+fees);
		}
		public void payFees() {
			viewTotalFees();
			System.out.println("Enter Full Payment: Rs");
			Scanner sc = new Scanner(System.in);
			int payment  = sc.nextInt();
			fees = fees + payment;
			System.out.println("Thank you for your payment of Rs: " +payment);
			viewTotalFees();
		}
		public String toString() {
			return "Student name: "+ stu_firstname +" "+stu_lastname + 
					"\nCourse: "+course_name+
					"\nStudent registration no: "+stu_regno+
					"\nSubject Enrolled: "+subject+ 
					"\nFees: Rs"+ fees;
		}
}