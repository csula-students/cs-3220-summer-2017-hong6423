package Hw2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditOrderStatusServlet
 */
@WebServlet("/admin/order/edit")
public class EditOrderStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditOrderStatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int id = Integer.parseInt(request.getParameter("ID"));
		List<Order> order = (List<Order>) getServletContext().getAttribute("order");
			Order Entry = null;
				for (Order entry: order) {
					if(entry.getID()== id) {
						Entry = entry;
					}
				}
	
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2> Order edit</h2>");
		out.println("<form method=\"post\">");
		out.println("Item " + Entry.getID() + "</br>");
		out.println("Customer" + Entry.getCustomer() + "</br>");
		out.println("Status <input name = 'status' type = 'option' " + Entry.getcompletedstatus() + "</br>");
		out.println("<button> edit it </button>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("ID"));
		List<Order> orders = (List<Order>)  getServletContext().getAttribute("orders");
		Order Entry = null;
		int index = -1;
		for (int i = 0; i < Order.size(); i++) {
			if(orders.get(i).getID() == id) {
				Entry = order.get(i);
					index = i;
			}
		}
		
		order.set(index, new Order(Entry.getID(), request.getParameter("item"), request.getParameter("name")));
		getServletContext().setAttribute("order", order);
		
		
		
	}

}
