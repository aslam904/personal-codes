

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberAreaServlet
 */
@WebServlet("/MemberAreaServlet")
public class MemberAreaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberAreaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
     
    //page forwarding redirection do in get method() because default method is get()
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch(action) {
		case "destroy":
			request.getSession().invalidate();
	/*		//logout using cookie
			Cookie[] cookies=request.getCookies();
			if(cookies!=null) {
				for(Cookie cookie:cookies) {
					
					if(cookie.getName().equals("username")) {
						cookie.setValue(null);
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
					
				}
			}
			*/
			//logout using sessionID invalidate and sendRedirect is enough  
			response.sendRedirect(request.getContextPath()+"/SiteController?action=Login");
			
			//when we have a url using servlet teh redirect can be used if we don t have a url then fowarding is used
			break;
		
		case "memberArea":
			request.getRequestDispatcher("memberArea.jsp").forward(request, response);
			break;
			
		default: break;	
		
		
	}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
}
}
