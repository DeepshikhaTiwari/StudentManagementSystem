import java.sql.*;
import java.util.*;

public class Student_system_1013 {
	public static void main(String[] args) {
		
		System.out.println("Enter number of a new student to enroll: ");
		Scanner sc = new Scanner(System.in);
		int numOfStudents = sc.nextInt();
		Student_info_1013[] stu1 = new Student_info_1013[numOfStudents];
		
		for(int i=0;i<numOfStudents;i++) {
			stu1[i] = new Student_info_1013();
			stu1[i].enroll();
			stu1[i].payFees();
			System.out.println(stu1[i].toString());
		}
	}
}