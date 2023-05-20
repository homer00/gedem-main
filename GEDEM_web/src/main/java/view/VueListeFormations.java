package view;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VueAdmin
 */
@WebServlet("/VueListeFormations")
public class VueListeFormations extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public VueListeFormations() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintStream out = new PrintStream(response.getOutputStream());
		response.setContentType("text/html");
		response.setCharacterEncoding("utf8");
		out.println("<!DOCTYPE html><html><head>\r\n"
				+ "		<meta charset=\"UTF-8\">\r\n"
				+ "		<title>vue_12</title>\r\n"
				+ "		<style>");

		out.println("\r\n"
				+ "			table {\r\n"
				+ "			border-collapse: collapse;\r\n"
				+ "			width: 80%;\r\n"
				+ "			}\r\n"
				+ "			th, td { \r\n"
				+ "				 border-bottom: 1px solid #ddd;\r\n"
				+ "				 text-align: left;\r\n"
				+ "				 padding: 3px;\r\n"
				+ "			}\r\n"
				+ "			tr:nth-child(even) {\r\n"
				+ "			background-color: #f2f2f2;}");



			out.println(".btn {\r\n"
					+ "			  background-color: #1EA0B2; /* Green */\r\n"
					+ "			  border: none;\r\n"
					+ "			  color: white;\r\n"
					+ "			  padding: 2px 30px;\r\n"
					+ "			  text-align: right;\r\n"
					+ "			  text-decoration: none;\r\n"
					+ "			  display: inline-block;\r\n"
					+ "			  font-size: 14px;\r\n"
					+ "			  margin: 2px 2px;\r\n"
					+ "			  transition-duration: 0.4s;\r\n"
					+ "			  cursor: pointer;\r\n"
					+ "			}\r\n"
					+ "\r\n"
					+ "			.btn-valider {\r\n"
					+ "			  background-color: #1EA0B2; \r\n"
					+ "			  color: white; \r\n"
					+ "			  \r\n"
					+ "			}");

out.println(".btn-valider:hover {\r\n"
		+ "			  background-color: #4CAF50;\r\n"
		+ "			  color: white;\r\n"
		+ "			}\r\n"
		+ "						#nav-bar {\r\n"
		+ "				display: flex;\r\n"
		+ "				flex-direction: column;\r\n"
		+ "				background-color: #ccc;\r\n"
		+ "				width: 80%;\r\n"
		+ "				margin: 0 auto;\r\n"
		+ "				\r\n"
		+ "			}\r\n"
		+ "			\r\n"
		+ "		</style>\r\n"
		+ "	</head>\r\n"
		+ "	<body>");
		out.println("<h3><p align=\"center\">Gestion liste des formations</p></h3>");
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
