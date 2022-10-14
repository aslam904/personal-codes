import java.sql.*;
import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args) {
		//should always use try and catch block or throws keyword
		try {//for old version connector use "com.mysql.jdbc.cj.Driver"
			Class.forName("com.mysql.cj.jdbc.Driver");//will show exception at first
			System.out.println("driver loaded");//have to add connector to avoid exception
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aslam","root","Muhammadpbuh@904");
			System.out.println("database is connected...");
			
			//enter values using Statement 
			Statement stmt=con.createStatement();
			int res=stmt.executeUpdate("insert into employee values(5,'anwar',222000)");//should give unique number for id because it is a primary key
			if(res>0) {
				System.out.println("records inserted sucessfully");
			}
			//if this part is executed more than once with the same details it will show exception because of the primary key 
			//thats why i deleted it in the next step
			int res1=stmt.executeUpdate("delete from employee where id=5");
			if(res1>0) {
				System.out.println("records deleted sucessfuly");
			}else {
				System.out.println("records not found");
			}
			
			//we have inserted a record named 'anwar' then deleted it on the next step
			int res2=stmt.executeUpdate("update  employee set salary =50000 where id=2");
			if(res2>0) {
				System.out.println("records updated sucessfuly");
			}else {
				System.out.println("records not found");
			}
			
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next()) {
				System.out.println("ID is "+rs.getInt(1)+" name is "+rs.getNString(2)+" salary is "+rs.getInt(3));
			}
			
			//enter values using prepared statement
			Scanner sc=new Scanner(System.in);
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			System.out.println("enter the id");
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			System.out.println("enter the name");
			String name=sc.nextLine();
			pstmt.setString(2, name);
			System.out.println("enter the salary");
			float salary=sc.nextFloat();
			pstmt.setFloat(3, salary);
			PreparedStatement pstmt1=con.prepareStatement("delete from employee where id=?");
			System.out.println("Enter id to delete");
			int ids=sc.nextInt();
			pstmt1.setInt(1, ids);
			int res3=pstmt1.executeUpdate();
			if(res3>0) {
				System.out.println("records deleted sucessfully");
			}else {
				System.out.println("records not present");
			}
			PreparedStatement pstmt2=con.prepareStatement("update employee set salary = ? where id = ?");
			System.out.println("Enter id to update");
			float salary1=sc.nextFloat();
			pstmt1.setFloat(1, salary1);
			int res4=pstmt2.executeUpdate();
			if(res4>0) {
				System.out.println("records updated sucessfully");
			}else {
				System.out.println("records not present");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
