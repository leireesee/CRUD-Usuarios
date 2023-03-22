package nagusia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * recoer datos del form
		 * nos basamos en el atributo name de los imputs
		 */
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		/*
		 * logica de abrir una vista u otra
		 */
		if(usuario.equals("ikaslea") && password.equals("1234")) {
			request.getRequestDispatcher("login/loginOK.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("login/loginNOK.jsp").forward(request, response);
		}
	}

}
