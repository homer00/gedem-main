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
@WebServlet("/VueAdmin")
public class VueAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public VueAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("utf8");
		PrintStream out = new PrintStream(response.getOutputStream());
		
		String affichage = "<!DOCTYPE html><html><head><title>Formulaire Création Formation</title>";
		affichage += "<script type=\"text/javascript\" defer src=\"menu.js\"></script>";
		affichage += "		   <style>\r\n"
				+ "			body { width: 80%;\r\n"
				+ "				margin: 0 auto;\r\n	}"		
				+ "		          .button5 {border-radius: 50%;}\r\n"
				+ "			      .button5 {background: green}\r\n"
				+ "		   </style>\r\n"
				+ "	 </head>\r\n";
		affichage +="	 <body>\r\n"
				+ "	        <table id='table' style=\"width:100%\">\r\n"
				+ "	       <tr>\r\n"
				+ "	       <th>Intitulé de la formation <input type=\"text\" name=\"formation\"></th><br>\r\n"
				+ "		   </tr>\r\n"
				+ "		   <th>Date de début <input type=\"text\" name=\"date\"></th>\r\n"
				+ "		   <th></th>\r\n"
				+ "            <th>Date de fin<input type=\"text\" name=\"formation\"></th>\r\n"
				+ "			</tr>\r\n"
				+ "			</table>\r\n"
				+ "		   <hr>\r\n"
				+ "		   <br>\r\n"
				+ "		   <table style=\"width:60%\">\r\n"
				+ "					     <tr>\r\n"
				+ "						  <th style=\"height:20px\"></th>\r\n"
				+ "					        <th>HORAIRE</th>\r\n"
				+ "                            <th></th>  							\r\n"
				+ "							<th>MATIN</th>\r\n"
				+ "                            <th></th>  							\r\n"
				+ "							<th>APRES-MIDI</th>\r\n"
				+ "                            	\r\n"
				+ "							<th>CRENEAU</th> \r\n"
				+ "						 </th>\r\n"
				+ "						  </tr>    \r\n"
				+ "							<tr>\r\n"
				+ "                            <th> </th> \r\n"
				+ "							<th> </th>							\r\n"
				+ "							<th>DEBUT</th>\r\n"
				+ "							<th><select id=\"am\"  name=\"heure\"> \r\n"
				+ "                                        <option value=\"1\">8h30</option>\r\n"
				+ "										<option value=\"2\">9h</option>\r\n"
				+ "										<option value=\"3\">9h30</option>\r\n"
				+ "										<option value=\"4\">10h</option>\r\n"
				+ "										<option value=\"5\">10h30</option>\r\n"
				+ "										<option value=\"6\">11h</option>\r\n"
				+ "										</select>\r\n"
				+ "							</th>			\r\n"
				+ "							\r\n"
				+ "                            <th>DEBUT</th>\r\n"
				+ "							<th><select id=\"am\"  name=\"heure\"> \r\n"
				+ "                                        <option value=\"1\">13h30</option>\r\n"
				+ "										<option value=\"2\">14h</option>\r\n"
				+ "										<option value=\"3\">15h30</option>\r\n"
				+ "										<option value=\"4\">16h</option>\r\n"
				+ "										<option value=\"5\">16h30</option>\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "                            <th>  <select id=\"am\"  name=\"heure\"> \r\n"
				+ "                                        <option value=\"1\">1h</option>\r\n"
				+ "										<option value=\"2\">1h30</option>\r\n"
				+ "										<option value=\"3\">2h</option>\r\n"
				+ "										<option value=\"4\">2h30</option>\r\n"
				+ "										<option value=\"5\">3h</option>\r\n"
				+ "										<option value=\"6\">3h30</option>\r\n"
				+ "										</select>\r\n"
				+ "                            </th>\r\n"
				+ "                            </tr>\r\n"
				+ "                             <th> </th> \r\n"
				+ "							<th> </th>								\r\n"
				+ "							<th>FIN</th> \r\n"
				+ "							<th>  <select id=\"pm\"  name=\"heure\"> \r\n"
				+ "                                        <option value=\"1\">9h30</option>\r\n"
				+ "										<option value=\"2\">10h</option>\r\n"
				+ "										<option value=\"3\">10h30</option>\r\n"
				+ "										<option value=\"4\">11h</option>\r\n"
				+ "										<option value=\"5\">11h30</option>\r\n"
				+ "										<option value=\"6\">12h</option>\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "														\r\n"
				+ "							<th>FIN</th>\r\n"
				+ "							<th>    <select id=\"pm\"  name=\"heure\"> \r\n"
				+ "                                       <option value=\"1\">14h30</option>\r\n"
				+ "										<option value=\"2\">15h</option>\r\n"
				+ "										<option value=\"3\">15h30</option>\r\n"
				+ "										<option value=\"4\">16h</option>\r\n"
				+ "										<option value=\"5\">16h30</option>\r\n"
				+ "										<option value=\"6\">17h</option>\r\n"
				+ "										</select></th>			\r\n"
				+ "							<th>  <select id=\"am\"  name=\"heure\"> \r\n"
				+ "                                        <option value=\"1\">1h</option>\r\n"
				+ "										<option value=\"2\">1h30</option>\r\n"
				+ "										<option value=\"3\">2h</option>\r\n"
				+ "										<option value=\"4\">2h30</option>\r\n"
				+ "										<option value=\"5\">3h</option>\r\n"
				+ "										<option value=\"6\">3h30</option>\r\n"
				+ "										</select>\r\n"
				+ "                            </th>\r\n"
				+ "						\r\n"
				+ "						    </tr>\r\n"
				+ "							\r\n"
				+ "            </table>\r\n"
				+ "            <hr>\r\n"
				+ "            <br>			\r\n"
				+ "           <table style=\"width:60%\">\r\n"
				+ "					     <tr>\r\n"
				+ "						  <th style=\"height:20px\"></th>\r\n"
				+ "					        <th>MATIERES</th> \r\n"
				+ "							 							\r\n"
				+ "							<th><select   name=\"matière\" value=\"matière\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">Eco-droit</option>\r\n"
				+ "                                        <option value=\"3\">Support info</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>	\r\n"
				+ "							<th>FORMATEURS</th> \r\n"
				+ "							\r\n"
				+ "							<th><select   name=\"formateurs\" value=\"formateur\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">René DUMONT</option>\r\n"
				+ "                                        <option value=\"3\">Jeannie LONGO</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "							</tr>\r\n"
				+ "							<tr>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>	\r\n"
				+ "							  \r\n"
				+ "								\r\n"
				+ "							<th><select   name=\"matière\" value=\"matière\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">Eco-droit</option>\r\n"
				+ "                                        <option value=\"3\">Support info</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>\r\n"
				+ "							<th> </th>						  \r\n"
				+ "							\r\n"
				+ "                            <th><select   name=\"formateurs\" value=\"formateur\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">René DUMONT</option>\r\n"
				+ "                                        <option value=\"3\">Jeannie LONGO</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "                            </tr> 							\r\n"
				+ "                            <tr>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>\r\n"
				+ "							\r\n"
				+ "								\r\n"
				+ "							<th><select   name=\"matière\" value=\"matière\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">Eco-droit</option>\r\n"
				+ "                                        <option value=\"3\">Support info</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							\r\n"
				+ "                            <th><select   name=\"formateurs\" value=\"formateur\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">René DUMONT</option>\r\n"
				+ "                                        <option value=\"3\">Jeannie LONGO</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "                            </tr> 	\r\n"
				+ "							<tr>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>\r\n"
				+ "							\r\n"
				+ "								\r\n"
				+ "							<th><select   name=\"matière\" value=\"matière\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">Eco-droit</option>\r\n"
				+ "                                        <option value=\"3\">Support info</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "							 <th> </th> \r\n"
				+ "							<th> </th>\r\n"
				+ "							<th> </th>\r\n"
				+ "                            							\r\n"
				+ "                            <th><select   name=\"formateurs\" value=\"formateur\">\r\n"
				+ "							            <option value=\"1\"></option> \r\n"
				+ "							            <option value=\"2\">René DUMONT</option>\r\n"
				+ "                                        <option value=\"3\">Jeannie LONGO</option>										\r\n"
				+ "										</select>\r\n"
				+ "							</th>\r\n"
				+ "                            </tr>\r\n"
				+ "                            <br>\r\n"
				+ "                            			\r\n"
				+ "                            <tr>\r\n"
				+ "							<th></th>\r\n"
				+ "							\r\n"
				+ "							<th><button class=\"button button5\">+</button> Ajouter une matière </th>\r\n"
				+ "                            <th></th>\r\n"
				+ "                            <th></th>\r\n"
				+ "							 <th></th>\r\n"
				+ "                            						\r\n"
				+ "							<th><button class=\"button button5\">+</button> Ajouter un formateur </th> \r\n"
				+ "							</tr>	  							\r\n"
				+ "            </table>\r\n"
				+ "            <br>\r\n"
				+ "			<br>\r\n"
				+ "			<hr>\r\n"
				+ "			<input type=\"submit\" value=\"valider\"> 	\r\n"
				+ "	</body>\r\n"
				+ "	 \r\n"
				+ "</html>	";
		out.println(affichage);
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
