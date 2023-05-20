package view;


import java.io.IOException;
import java.io.PrintStream;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form
 */
@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2() {
        super();
        // TODO Auto-generated constructor stub
  
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	    response.setContentType("text/html");
	    response.setCharacterEncoding("utf8");
	  

	    PrintStream out = new PrintStream(response.getOutputStream());
	    out.println("<html><body bgcolor=\"white\">");
	   // getServletContext().getRequestDispatcher("/session-part.html").include(request,response);
	   // out.println("<Form action='NomResultat' method='GET' enctype='application/x-www-form-urlencoded'>" );
	    out.println("<Form action='' method='GET' enctype='application/x-www-form-urlencoded'>" );
	    out.println("<h1>Hello World !</h1>");
	    out.println("<table border='0'><tr><td>");
	    out.println("<label>Nom : </label></td><td><input type='text' id='nom' name='nom'></td></tr>");
	    out.println("<tr><td><br><label>Nombre d'heures : </label></td><td><input type='number' id='heures' name='heures'></td>");
	    out.println("</tr><tr><td colspan='2'><input type='submit' name='submit_butt' value='Créer cette matière'");
	    out.println("</table></body></html>");
	    
	  }

		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
