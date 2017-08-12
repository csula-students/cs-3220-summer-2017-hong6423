package Lab8;


import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/foods/delete")
public class DeleteFoodServlet extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<FoodItemEntry> entries = (List<FoodItemEntry>) getServletContext().getAttribute("entries");
		int index = -1;
		for (int i = 0; i < entries.size(); i ++) {
			if (entries.get(i).getId() == id) {
				index = i;
			}
		}
		entries.remove(index);
		getServletContext().setAttribute("entries", entries);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<a href='/app/foods'>go back </a>");
	}
}