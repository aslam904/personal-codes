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
			Scanner sc=new Scanner(System.in);
			Statement stmt=con.createStatement();
			int flag=0;
			while(flag==0) {
				
		
			System.out.println("Enter your choice: ");
			String choice=sc.next();
			switch(choice) {
				case "insert":
					PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
					System.out.println("enter the id");
					int id=sc.nextInt();
					pstmt.setInt(1, id);
					System.out.println("enter the name");
					String name=sc.next();
					pstmt.setString(2, name);
					System.out.println("enter the salary");
					float salary=sc.nextFloat();
					pstmt.setFloat(3, salary);
					int res=pstmt.executeUpdate();
					if(res>0) {
						System.out.println("records inserted sucessfully");
					}else {
						System.out.println("records not inserted");
					}
					
					break;
				
				case "select":
					ResultSet rs=stmt.executeQuery("select * from employee");
					while(rs.next()) {
						System.out.println("ID is "+rs.getInt(1)+" name is "+rs.getNString(2)+" salary is "+rs.getInt(3));
					}
					break;
					
				case "delete":
					PreparedStatement pstmt1=con.prepareStatement("delete from employee where id=?");
					System.out.println("Enter id to delete");
					int ids=sc.nextInt();
					pstmt1.setInt(1, ids);
					int res1=pstmt1.executeUpdate();
					if(res1>0) {
						System.out.println("records deleted sucessfully");
					}else {
						System.out.println("records not present");
					}
					break;
					
				case "update":
					PreparedStatement pstmt2=con.prepareStatement("update employee set salary = ? where id = ?");
					System.out.println("Enter id to update");
					int u_id=sc.nextInt();
					System.out.println("Enter salary to update");
					float salary1=sc.nextFloat();
					pstmt2.setFloat(1, salary1);
					pstmt2.setInt(2, u_id);
					int res2=pstmt2.executeUpdate();
					if(res2>0) {
						System.out.println("records updated sucessfully");
					}else {
						System.out.println("records not present");
					}
					break;	
					
				default:
					System.out.println("Invalid choice...");
					
			}
			System.out.println("If you want to continue enter 0 ");
			flag=sc.nextInt();
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
