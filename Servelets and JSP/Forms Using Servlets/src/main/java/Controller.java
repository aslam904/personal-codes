

import java.io.IOException;
import java.io.PrintWriter;

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
		/*
		PrintWriter out=response.getWriter();
		out.print("Name: ");
		response.getWriter().println(request.getParameter("name"));
		out.print("Gender: ");
		response.getWriter().println(request.getParameter("gender"));
		out.print("Languages known: ");

		String[] lang=request.getParameterValues("langauge");
		if(lang != null){
			for(int i=0;i<lang.length;i++){
				out.print(lang[i]+" ");		
			}
		}else{
			out.print("None selected");
		}
		//can write "out.println()" instead of "response.getWriter().println()"
		//response.getWriter().println(request.getParameter("langauge"));
		out.println();
		out.print("Country: ");
		response.getWriter().println(request.getParameter("country"));
		*/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
