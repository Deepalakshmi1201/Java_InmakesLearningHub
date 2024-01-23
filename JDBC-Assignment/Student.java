
import java.sql.*;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Student {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException
	{
		System.out.println(" 1 - create/Insert student 2 - Read student 3 - Update student 4 - Delete Student ");
			int option = sc.nextInt();
			
					switch(option) 
					{
						case 1:
							System.out.println("Enter a Student id: ");
							int id = sc.nextInt();
							System.out.println("Enter a Student Name: ");
							String name = sc.next();
							System.out.println("Enter a Student place: ");
							String place = sc.next();
							System.out.println("Enter a Student Course: ");
							String course = sc.next();
							System.out.println("Enter a Student ContactNo: ");
							String contactNo = sc.next();
							createStudent( id, name, place, course, contactNo);
							break;
						case 2:
							readStudent();
							break;
						case 3:
							System.out.println("Enter a Student id: ");
							int id1 = sc.nextInt();
							System.out.println("Enter a Student place: ");
							String place1 = sc.next();
							UpdateStudent(id1,place1);
							break;
						case 4:
							System.out.println("Enter a Student id: ");
							int id2 = sc.nextInt();
							deleteStudent(id2);
					}
				
		
		}
		
			
	public static void createStudent(int id,String name,String place,String course,String contactNo) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Corona@123");
			Statement stm = con.createStatement();
			CallableStatement cstm = con.prepareCall("{call create_stu(?,?,?,?,?)}");
			cstm.setInt(1, id);
			cstm.setString(2,name);
			cstm.setString(3,place);
			cstm.setString(4,course);
			cstm.setString(5,contactNo);
			cstm.executeQuery();
			System.out.println("Student created Sucessfully");
			readStudent();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void readStudent() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Corona@123");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select*from student");
			System.out.println("id"+"     "+"name"+"     "+"place"+"     "+"course"+"     "+"contactNo");
			while(rs.next()) {
				int id =  rs.getInt(1);
				String name = rs.getString(2);
				String place = rs.getString(3);
				String course = rs.getString(4);
				String contactNo = rs.getString(5);
				System.out.println(id+"     "+name+"     "+place+"     "+course+"     "+contactNo);
			}
			System.out.println("Student details ");
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void UpdateStudent(int id,String place) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Corona@123");
			Statement stm = con.createStatement();
			CallableStatement cstm = con.prepareCall("{call update_stu(?,?)}");
			cstm.setInt(1,id);
			cstm.setString(2,place);
			cstm.execute();
			System.out.println("Student details updated sucessfully ");
			readStudent();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static void deleteStudent(int id) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Corona@123");
			Statement stm = con.createStatement();
			CallableStatement cstm = con.prepareCall("{call delete_stu(?)}");
			cstm.setInt(1,id);
			cstm.execute();
			System.out.println("Student deleted sucessfully ");
			readStudent();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}

