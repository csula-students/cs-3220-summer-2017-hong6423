package Lab8;


import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(loadOnStartup=1, urlPatterns={"/menu"})
public class FoodMenuServlet extends HttpServlet {
	public void init() {
		// init the application scope to have pre-set values
		List<FoodItemEntry> entries = new ArrayList<>();
		entries.add(new FoodItemEntry(entries.size(), "Bibimbap", 
													   "Rice, Beef, Vegetable, Egg",
													   "http://www.danjee.com.au/home/wp-content/themes/theme/img/menu.png",
													   "$9.99 "));
		entries.add(new FoodItemEntry(entries.size(),	"Grilled Back Ribs",
														"http://d2ciprw05cjhos.cloudfront.net/files/v3/styles/gs_large/public/images/17/03/mukja2.jpg?itok=qcTrrlPG",
														"Pork Back Ribs, Cheese, Corn and Egg",
														"$15.99"));
		entries.add(new FoodItemEntry(entries.size(),	"Beef sasimi",
														"http://assets.coolhunting.com/coolhunting/2015/07/08/large_oiji-korean-restaurant-nyc-beef-tartare-2.jpg",
														"Beef, Egg(yolk), sesame oil",
														"$19.99"));
	
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

		out.println("<h1> Hong's Restaurant </h1>");
		out.println("<table>");
		out.println("<thead>" + "<th>Name</th>" + "<th>Description</th>" + "<th>URL</th>" +"<th>Price</th>" + "</thead>" );
		for (FoodItemEntry entry: entries) {
			out.println(
				"<tr>" + 
					"<td>" + entry.getName() + "</td>" + 
					"<td>" + entry.getDescription() + "</td>" +
					"<td>" + entry.getUrl() + "</td>" + 
					"<td>" + entry.getPrice() + "</td>" 
					"<td><a href='edit?id=" + entry.getId() + "'>Edit</a> " + 
					"<a href='delete?id=" + entry.getId() + "'>Delete</a></td>" +
				"</tr>"
			);
		}
		out.println("</table>");
		out.println("<a href='create'>Add</a>");
	}
}