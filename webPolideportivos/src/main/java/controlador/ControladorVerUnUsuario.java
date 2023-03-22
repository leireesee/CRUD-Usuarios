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
 * Servlet implementation class ControladorVerUnUsuario
 */
@WebServlet("/ControladorVerUnUsuario")
public class ControladorVerUnUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorVerUnUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		int id = Integer.parseInt(request.getParameter("id"));
		
		ModeloUsuario bbdd = new ModeloUsuario();
		
		Usuario usuario = bbdd.getUsuario(id);
		
		request.setAttribute("usuario", usuario);
		
		request.getRequestDispatcher("VerUnUsuario.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
