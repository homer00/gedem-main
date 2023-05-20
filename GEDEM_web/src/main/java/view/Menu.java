package view;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
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
		response.setCharacterEncoding("utf8");
		response.setContentType("text/html");
		PrintStream out = new PrintStream(response.getOutputStream());
		out.println("<!DOCTYPE html><html><head>\r\n"
				+ "				\r\n"
				+ "				<title>menu</title>\r\n"
				+ "				<style>\r\n"
				+ "					#nav-bar {\r\n"
				+ "						display: flex;\r\n"
				+ "						flex-direction: column;\r\n"
				+ "						background-color: #ccc;\r\n"
				+ "						width: 80%;\r\n"
				+ "						margin: 0 auto;\r\n"
				+ "						\r\n"
				+ "					}");

		out.println("#nav-bar a {\r\n"
				+ "						padding: 10px;\r\n"
				+ "						text-decoration: none;\r\n"
				+ "						color: #000;\r\n"
				+ "					}\r\n"
				+ "					#nav-bar a:hover {\r\n"
				+ "						background-color: #000;\r\n"
				+ "						color: #FFF;\r\n"
				+ "					}")	;

		out.println("@media screen and (min-width: 350px) {\r\n"
				+ "						#nav-bar {\r\n"
				+ "							flex-flow: row wrap;\r\n"
				+ "						}\r\n"
				+ "						#nav-bar a {\r\n"
				+ "							flex: 1 0 auto;\r\n"
				+ "							text-align: center;\r\n"
				+ "						}\r\n"
				+ "					}\r\n"
				+ "				</style></head>");

out.println("<body>\r\n"
		+ "				<nav id=\"nav-bar\">\r\n"
		+ "					<a href=\"#\">GEDEM</a>\r\n"
		+ "					<a href=\"#\">PLANNING</a>\r\n"
		+ "					<a href=\"#\">EMARGEMENT</a>\r\n"
		+ "					<a href=\"#\">MON COMPTE</a>\r\n"
		+ "					<a href=\"#\">MA FORMATION</a>\r\n"
		+ "				</nav>\r\n"
		+ "				<br>\r\n"
		+ "				<nav id=\"nav-bar\">\r\n"
		+ "					<a href=\"/ListeFormations\" target=\"page\">Liste des formations</a>\r\n"
		+ "					<a href=\"/ListeFormateurs\" target=\"page\">Liste des formateurs</a>\r\n"
		+ "					<a href=\"/ListeStagiaires\" target=\"page\">Liste des stagiaires</a>\r\n"
		+ "				</nav>\r\n"
		+ "			</body>\r\n"
		+ "		</html>");

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
