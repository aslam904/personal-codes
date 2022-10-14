

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String country=request.getParameter("country");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aslam","root","Muhammadpbuh@904");
			PreparedStatement pre=con.prepareStatement("insert into account values(?,?,?,?,?)");
			pre.setString(1,email);
			pre.setString(2,password);
			pre.setString(3,name);
			pre.setString(4,gender);
			pre.setString(5,country);
			int res=pre.executeUpdate();
			if(res>0) {
				System.out.println("Account created successfully");
				out.println("Account created");
			}else {
				System.out.println("Error");
				out.println("error");
			}
			
			
		}catch(Exception e) {
			out.println(e);
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aslam","root","Muhammadpbuh@904");
			PreparedStatement pre=con.prepareStatement("select * from account where email=? and password=?");
			pre.setString(1,email);
			pre.setString(2,password);
			ResultSet rs=pre.executeQuery();
			
			if(rs.next()) {
				out.println("successfully login");
			}else {
				out.println("Error");
			}
		
		
	}catch(Exception e) {
		System.out.println(e);
		out.println(e);
		
	}
	}
}


