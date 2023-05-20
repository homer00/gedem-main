package controller;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Controlleur1
 */
@WebServlet("/Controleur2")
public class Controleur2 extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	private String r1="";
	private String r2="";
	private static HttpSession session;
	private int r2Int;


	
	public Controleur2() {
		super();	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		r1 = request.getParameter("nom");
		r2 = request.getParameter("heures");
		//String to int : integer.parseInt() ou integer.valueOf()
		r2Int = Integer.parseInt(r2);

		//String variable = m.getIntitule();
		session = request.getSession(true); // création de l'objet httpSession "session"
		session.setAttribute("r1Attribute", r1); // on déclare une variable de session "r1Attribute"
		session.setAttribute("r2IntAttribute", r2Int); // on déclare une variable de session "r2IntAttribute"
		response.setContentType("text/html");
		response.setCharacterEncoding("utf8");
		PrintStream out = new PrintStream(response.getOutputStream());
		if (session != null) {
			out.println("<HTML><HEAD></HEAD><BODY>");
			out.println("<p>Le nom : "+session.getAttribute("r1Attribute")+" </p>");
			out.println("<p>Le nombre d'heures : "+session.getAttribute("r2IntAttribute")+" </p>");
			out.println("</BODY></HTML>");
		
		// à partir du paramètre récupéré de la request (r1)
			getServletContext().getRequestDispatcher("/View3").forward(request, response);
		}
		else {
			getServletContext().getRequestDispatcher("/Form").forward(request,response);
		}
		// session.invalidate();
		// session.logout();

	}
	
	/*
	public Controleur2() {
		Matiere m = new Matiere();
	}
	*/
}
