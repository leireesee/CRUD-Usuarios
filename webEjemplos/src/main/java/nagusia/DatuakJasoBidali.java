package nagusia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatuakJasoBidali
 */
@WebServlet("/DatuakJasoBidali")
public class DatuakJasoBidali extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatuakJasoBidali() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * desde un form con el method GET se han enviado dos parametros
		 * nombre y apellido1
		 */
		String nombre = request.getParameter("nombre");
		String apellido1 = request.getParameter("apellido1");
		
		//una consulta a la base de datos y me devulva el segundo apellido
		String apellido2 = "Arrizabalaga";
		
		/*
		 * a la vista se van a enviar 3 parametros
		 * nombre, apellido1 apellido2
		 */
		request.setAttribute("nombre", nombre);
		request.setAttribute("apellido1", apellido1);
		request.setAttribute("apellido2", apellido2);
		
		/*
		 * los parametros se van ha enviar a DatuakJasoBidali.jsp
		 */
		request.getRequestDispatcher("DatuakJasoBidali.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
