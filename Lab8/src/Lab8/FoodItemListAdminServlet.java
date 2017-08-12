package Lab8;


import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup=1, urlPatterns={"/admin/foods/"})
public class FoodItemListAdminServlet extends HttpServlet {
	public void init() {
		// init the application scope to have pre-set values
		List<FoodItemEntry> entries = new ArrayList<>();
		entries.add(new FoodItemEntry(entries.size(), "BibimBap", "$9.99"));
		entries.add(new FoodItemEntry(entries.size(), "Grilled Back Ribs", "$15.99"));
		entries.add(new FoodItemEntry(entries.size(), "Beef Sasimi", "$19.99"));
		getServletContext().setAttribute("entries", entries);
	}

	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<FoodItemEntry> entries = (List<FoodItemEntry>) getServletContext().getAttribute("entries");
		// tell browser this is html document
		response.setContentType("text/html");

		out.println("<head>");
		out.println("<style>body { " +
		"}</style>");
		out.println("</head>");

		out.println("<h1>Hong's Restaurant </h1>");
		out.println("<table>");
		for (GuestBookEntry entry: entries) {
			out.println(
				"<tr>" + 
					"<td>" + entry.getName() + "</td>" + 
					"<td>" + entry.getDescription() + "</td>" +
					"<td>" + entry.getUrl() + "</td>"+
					"<td>" + entry.getPrice() + "</td>"+
					"<td><a href='edit?id=" + entry.getId() + "'>Edit</a> " + 
					"<a href='delete?id=" + entry.getId() + "'>Delete</a></td>" +
				"</tr>"
			);
		}
		out.println("</table>");
		out.println("<a href='create'>Add</a>");
	}
}