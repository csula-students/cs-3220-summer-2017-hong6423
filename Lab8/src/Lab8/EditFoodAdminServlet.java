package Lab8;


import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/guestbook/edit")
public class EditFoodAdminServlet  extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<FoodItemEntry> entries = (List<FoodItemEntry>) getServletContext().getAttribute("entries");
		FoodItemEntry leEntry = null;
		for (FoodItemEntry entry: entries) {
			if (entry.getId() == id) {
				leEntry = entry;
			}
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Editing Description</h1>");
		out.println("<form method=\"post\">");
		out.println("name: <input name='name' type='text' value='" + leEntry.getName() + "'/></br>");
		out.println("<textarea name='description'>" + leEntry.getDescription() + "</textarea></br>");
		out.println("<button>Edit</button>");
		out.println("</form>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<FoodItemEntry> entries = (List<FoodItemEntry>) getServletContext().getAttribute("entries");
		FoodItemEntry leEntry = null;
		int index = -1;
		for (int i = 0; i < entries.size(); i ++) {
			if (entries.get(i).getId() == id) {
				leEntry = entries.get(i);
				index = i;
			}
		}
		entries.set(index, new FoodItemEntry(
			leEntry.getId(),
			request.getParameter("name"),
			request.getParameter("desctiption"),
			request.getParameter("url"),
			request.getParameter("price")
		));
		getServletContext().setAttribute("entries", entries);

		response.sendRedirect("../food");
	}
}