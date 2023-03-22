package nagusia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatuakJaso
 */
@WebServlet("/DatuakJaso")
public class DatuakJaso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatuakJaso() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * ha este servlet se le ha enviado un parametro llamado nombre
		 * en el ejemplo se recibe y en se muestra en la pantalla
		 */
		String nombre = request.getParameter("nombre"); //recibir parametro
		String apellido = request.getParameter("apellido");
		response.getWriter().append("El nombre  es este: " + nombre + " y el apellido " + apellido);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
