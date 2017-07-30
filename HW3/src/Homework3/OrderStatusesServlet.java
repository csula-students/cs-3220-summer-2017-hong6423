package Homework3;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderStatusesServlet
 */
@WebServlet("/orders")
public class OrderStatusesServlet extends HttpServlet {
	public class OrderStatusesAdminServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public OrderStatusesAdminServlet() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	    public void init() {
	    	List<Order> order = new ArrayList<>();
	    	order.add(new Order(order.size(), "Bibimbap","Choi"));
	    	order.add(new Order(order.size(), "Beef Sasimi","Hongsuk"));
	    	getServletContext().setAttribute("order", order);
	    }
	    

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//response.getWriter().append("Served at: ").append(request.getContextPath());
			PrintWriter out = response.getWriter();
			List<Order> orders = (List<Order>) getServletContext().getAttribute("order");
			
			out.println("<h1> Hong's resturant</h1>");
			out.println("<h2> food Items</h3>");
			out.println("<table>");
			out.println("<thead> " + "<tr>"
										+ "<td> food name </td>"
											+"<td> url </td>"
												+"<td> Description </td>"
													+"<td> Price </td>"
														+"</thead>"
			);
				out.println("</table>");
			}
			
			
		
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}
