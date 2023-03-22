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
 * Servlet implementation class ControladorModificarUsuario
 */
@WebServlet("/ControladorModificarUsuario")
public class ControladorModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorModificarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ModeloUsuario bbdd = new ModeloUsuario();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Usuario usuario = bbdd.getUsuario(id);
		
		request.setAttribute("usuario", usuario);
		
		request.getRequestDispatcher("ModificarUsuario.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ModeloUsuario bbdd = new ModeloUsuario();
		
		Usuario usuario = new Usuario();
		
		usuario.setNombre(request.getParameter("nombre"));
		usuario.setId(Integer.parseInt(request.getParameter("id")));
		usuario.setNombre(request.getParameter("contrasena"));
				
		bbdd.modificarUsuario(usuario);
		
		
		request.getRequestDispatcher("ControladorVerUsuarios").forward(request, response);
		
	}

}
