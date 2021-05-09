import java.sql.*;
import java.sql.DriverManager;

public class DB_connection {
	public static void main(String args[]) throws Exception, ClassNotFoundException{
	DB_connection obj_DB_connection=new DB_connection();
	Connection connection=null;
	connection=obj_DB_connection.get_connection();
	System.out.println(connection);
}
public Connection get_connection(){
	Connection connection=null;
	try {
	
Class.forName("com.mysql.jdbc.Driver");
connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfodb","System","shikha1234");
	}
		catch(Exception e) {
		System.out.println(e);
}
			return connection;
	}
}