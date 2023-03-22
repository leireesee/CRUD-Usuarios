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
 * Servlet implementation class ControladorInsertarUsuario
 */
@WebServlet("/ControladorInsertarUsuario")
public class ControladorInsertarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorInsertarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.getRequestDispatcher("InsertarUsuario.jsp").forward(request, response);
	}
    

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ModeloUsuario bbdd = new ModeloUsuario();
		
		Usuario usuario = new Usuario();
		
		usuario.setNombre(request.getParameter("nombre"));
				
		bbdd.insertarUsuario(usuario);
		
		request.getRequestDispatcher("ControladorVerUsuarios").forward(request, response);
	}

}
