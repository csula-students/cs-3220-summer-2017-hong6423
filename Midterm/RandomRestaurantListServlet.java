package midterm;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Test.Restaurant;

import java.io.*;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
/**
 * Servlet implementation class RandomRestaurantServlet
 */
@WebServlet(loadOnStartup=1, urlPatterns={"/suggest/restaurants/random/list"})
public class RandomRestaurantListServlet extends HttpServlet {

//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
	public void init() {
		List<RandomRestaurantEntry> entries = new ArrayList<>();
		entries.add(new RandomRestaurantEntry(entries.size(),"Feeling lucky", " "));
		entries.add(new RandomRestaurantEntry(entries.size(),"See the list", " "));
		getServletContext().setAttribute("entries", entries);
	}
	
//    public RandomRestaurantServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		throws ServletException, IOException{
			PrintWriter out = response.getWriter();
				List<RandomRestaurantEntry> entries = (List<RandomRestaurantEntry>) getServletContext().getAttribute("entries");
				response.setContentType("text/htm");
				
				out.println("<head>");
				out.println("<style>body {" +"}</style>");
				out.println("</head>");
				out.println("<h1> What's for lunch? </h1>");
				out.println("<table>");
				for(RandomRestaurantListServlet entry: entries) {
					out.println(
							"<tr>" + 
								"<td>" + entry.getId() + "</td>" +
								"<td>" + entry.getName() + " </td>" + 
								"<td>" + entry.getURL() + "</td>" +
								"<td>" + entry.getdesignRatings() + "</td>" +
								"<td>" + entry.gettasteRatings() + "</td>" +
								"<td><a href='guestbook/edit?id=" + entry.getId() + "'>click</a> " + 
								
							"</tr>"
						);
				}
				out.println("</table>");
				out.println("<a href='guestbook/create'>Add comemnt</a>");
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
	}


