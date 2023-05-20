package view;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DebugVueConnexion
 */
@WebServlet("/DebugVueConnexion")
public class DebugVueConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//protected HttpSession session = S_controlLogin.getSession();
	protected HttpSession session;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DebugVueConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		session = request.getSession();

		String pass = (String)session.getAttribute("str_pass_session");
		String login = (String)session.getAttribute("str_login_session");
		//session.getValue(str_login_session);
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("<html><head><title>VueConnexion</title></head>");
		out.println("<body style='background-color: antiquewhite;'>");
		out.println("<p>C'est le debug !</p>");
		out.println("Le login est : "+login+" et le mot de passe : "+pass+"<br>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
