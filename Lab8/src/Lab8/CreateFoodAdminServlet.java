package Lab8;


import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/admin/foods/create")
public class CreateFoodAdminServlet extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Create Food");
		out.println("<form method=\"post\">");
		out.println("Name: </br>");
		out.println("Name: <input name='name' type='text'/></br>");
		out.println("Description: </br>");
		out.println("Description: <input name='description' type='text'/></br>");
		out.println("URL: </br>");
		out.println("URL: <input name='url' type='url'/></br>");
		out.println("Price: </br>");
		out.println("Price: <input name='price' type='text'/></br>");
		out.println("<button>Add Food</button>");
		out.println("</form>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<FoodItemEntry> entries = (List<FoodItemEntry>) getServletContext().getAttribute("entries");
		entries.add(new FoodItemEntry(entries.size(), request.getParameter("name"), request.getParameter("description"), request.getParameter("url"), request.getParameter("price")));
		getServletContext().setAttribute("entries", entries);
		PrintWriter out = response.getWriter();
		out.println("<a href='list'>go back </a>");
	}
}