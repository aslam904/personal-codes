

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		switch(action) {
		
		case "Login": //this is going to login page from home page
			request.getRequestDispatcher("login.jsp").forward(request, response);
			break;
		case "Create"://this is going to account creation page from home page
			request.getRequestDispatcher("signup.jsp").forward(request, response);
			break;
			
		case "create":  //this is going to account creation page from login page
			//getServletContext().getRequestDispatcher("/signup.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath()+"/SiteController?action=Create");
			//since we have the url for going to signup.jsp by calling action=Create we use that link here 
			break;
			
		
						
		default: break;
		}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action) {
		
		case "accCreate":// this is the function of the button that is in the signup page to create a account successfully  
			createAccount(request,response);
			break;
			
		case "authentiate":
			authentiate(request,response);
			break;	
			
		default: break;	
		}
	}
	
	
	public void authentiate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aslam","root","Muhammadpbuh@904");
			PreparedStatement pre=con.prepareStatement("select * from login where username=? and pswrd=?");
			pre.setString(1,username);
			pre.setString(2,password);
			ResultSet rs=pre.executeQuery();
			if(rs.next()){
				request.getSession().invalidate();
				HttpSession session=request.getSession(true);
				session.setMaxInactiveInterval(300);
				//if using session for logout then setAttribute should be used
				session.setAttribute("username", username);
			//should write cookie before redirecting or forwarding	
		/*
				Cookie cUsername= new Cookie("username",username);
				response.addCookie(cUsername);                     */
				
				//when cookies are disabled the authentiation cannot occur and we cannot log in so we encode the url  
				String encode=response.encodeURL(request.getContextPath());                   
				response.sendRedirect(encode+"/MemberAreaServlet?action=memberArea");
				
			}else { 
				response.sendRedirect(request.getContextPath()+"/SiteController?action=Login");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
	public void createAccount(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String country=request.getParameter("country");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aslam","root","Muhammadpbuh@904");
			PreparedStatement pre=con.prepareStatement("insert into login values(?,?,?,?,?)");
			pre.setString(1,username);
			pre.setString(2,password);
			pre.setString(3,name);
			pre.setString(4,gender);
			pre.setString(5,country);
			int res=pre.executeUpdate();
			if(res>0) {
				System.out.println("Account created successfully");
				response.sendRedirect(request.getContextPath()+"/SiteController?action=Login");
				
			}else {
				System.out.println("Error");
				out.println("error");
			}
			
			
		}catch(Exception e) {
			out.println(e);
			System.out.println(e);
		}

	}

}
