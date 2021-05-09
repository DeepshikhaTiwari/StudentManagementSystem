import java.sql.*;

public class Connection_1013 {
public static void main(String[] args) {
	Connection_1013 obj_DAO=new Connection_1013();
	obj_DAO.Check_Data();
	}
public void Check_Data() {
	DB_connection obj_DB_connection=new DB_connection();
	Connection connection=obj_DB_connection.get_connection();
	PreparedStatement ps=null;
	try {
		String query="Select * from student_info";
		ps=connection.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("stu_firstname"+rs.getString("stu_firstname"));
			System.out.println("stu_lastname"+rs.getString("stu_lastname"));
			System.out.println("course_name"+rs.getString("course_name"));
			System.out.println("stu_regno"+rs.getString("stu_regno"));
			System.out.println("subject"+rs.getString("subject"));
			System.out.println("fees"+rs.getInt("fees"));
			}
	} catch(Exception e) {
		System.out.println(e);
		}
	}
}