package Hw2;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/shopping-cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2> Cart<h2>");
		out.println("<table>");
		out.println("<thead>" + "<tr>" + 
						"<td> Item </td>" 
							+"<td> Image </td>" 
								+ "<td> Description </td>"
									+"<td> Price </td>"			
				);
		out.println(
					"<tr>" +
						"<td> Grilled Back Ribs </td>"
							+"<td> <img src=\"http://d2ciprw05cjhos.cloudfront.net/files/v3/styles/gs_large/public/images/17/03/mukja2.jpg?itok=qcTrrlPG\" alt=\"Forest\" width=\"300\" height=\"300\" > </td>"
								+"<td> Pork Back Ribs, Cheese, Corn and Egg </td>"
									+"<td> $15.99 </td>"				
				);
		out.println(
				"<tr>" +
					"<td> Bibimbap </td>"
						+"<td>  <img src=\"http://www.danjee.com.au/home/wp-content/themes/theme/img/menu.png\" alt=\"Bibimbap\" width=\"300\" height=\"300\"> </td>"
							+"<td> Rice, Beef, Vegetable, Egg </td>"
								+"<td> $9.99 </td>"				
			);
		out.println(
				"<tr>" +
					"<td> Beef sasimi  </td>"
						+"<td> <img src=\"http://assets.coolhunting.com/coolhunting/2015/07/08/large_oiji-korean-restaurant-nyc-beef-tartare-2.jpg\" alt=\"Mountains\" width=\"300\" height=\"300\"> </td>"
							+"<td> Beef, Egg(yolk), sesame oil </td>"
								+"<td> $19.99 </td>"				
			);
		
		out.print("</table>");
		out.println("<button> Order </button>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
	}

}
