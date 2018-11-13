package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.jws.WebMethod;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ejbs.BeanInterface;


@WebServlet("/SeriesDisplay")
public class SeriesDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private BeanInterface ejbs;

	public SeriesDisplay() {
	}

	@WebMethod	
	public List<String> listSerienames(){
		return ejbs.listSerienames();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		List<String> myListSeries = new ArrayList<String>();
		myListSeries = listSerienames();

		request.setAttribute("myListOfSeries", myListSeries);
		request.getRequestDispatcher("/Display.jsp").forward(request, response);
	}
}