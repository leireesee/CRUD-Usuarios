package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clases.ModeloUsuario;
import clases.Usuario;

/**
 * Servlet implementation class ControladorEliminarUsuario
 */
@WebServlet("/ControladorEliminarUsuario")
public class ControladorEliminarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEliminarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		ModeloUsuario bbdd = new ModeloUsuario();
		
		Usuario usuario = new Usuario();
		
		bbdd.eliminarUsuario(Integer.parseInt(request.getParameter("id")));
		
		request.getRequestDispatcher("ControladorVerUsuarios").forward(request, response);
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
