package pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_test {
public static void main(String[] args) {
	String url="jdbc:mysql://127.0.0.1:3306/aug4th2025";
	String user="root";
	String password="root";
	try{
		Connection con=DriverManager.getConnection(url,user,password);
		System.out.println("Connected");
		//Inserting values in the students table
		/*
		 String sql="INSERT INTO students(stu_id,stu_name,stu_age) VALUES(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 104);
		ps.setString(2, "Deep");
		ps.setInt(3, 23);
		int result=ps.executeUpdate();
		
		System.out.println("Values inserted"+result);
		 */
		
		//Executing query to display data in a table
		/*String sql="SELECT * FROM students";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println("ID : "+rs.getInt(1));
			System.out.println("Student Name: "+rs.getString(2));
			System.out.println("Student Age: "+rs.getInt(3));
		}
*/
		//Updating Students table
		/*String sql="UPDATE students SET stu_age=? WHERE stu_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 20);
		ps.setInt(2,101 );
		ps.executeUpdate();*/
		//Delete Student details
		String sql="DELETE FROM students WHERE stu_id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 104);
		ps.executeUpdate();
		} catch (Exception e) {
		// TODO: handle exception
	}
}
}
