package nagusia;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatuakBidaltzen
 */
@WebServlet("/DatuakBidaltzen")
public class DatuakBidaltzen extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatuakBidaltzen() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * con setAttribute enviamos preparamos atributos
		 * para enviar a la vista
		 */
		request.setAttribute("nombre", "eñaut");
		request.setAttribute("apellido", "agirre");
		
		ArrayList<String> pokemons = new ArrayList<String>();
		pokemons.add("charmander");
		pokemons.add("pikachu");
		pokemons.add("charizar");
		request.setAttribute("pokemons", pokemons);
		
		
		/*
		 * abrimos la vista
		 * se le enviarán los atributos nombre y apellido con sus valores
		 */
		request.getRequestDispatcher("DatuakBidaltzen.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
