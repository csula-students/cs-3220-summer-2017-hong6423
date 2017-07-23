package midterm;


import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//import Test.HttpServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet("/suggest/restaurants/random")
public class RandomRestaurantServlet extends HttpServlet {
	
	
	public void doGet( HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2> What;s for lunch</h2><br> ");
		out.println("<h2> you should go to:</h2><br>");
		
		out.println("Design:");
	    out.println("<input type='radio' name='design' id='design5' value='5'>");
        out.println("<label for='design5'>5</label><br>");
        out.println("<input type='radio' name='design' id='design4' value='5'>");
        out.println("<label for='design4'>4</label><br>");
        out.println("<input type='radio' name='design' id='design3' value='3'>");
        out.println("<label for='design3'>3</label><br>");
        out.println("<input type='radio' name='design' id='design2' value='2'>");
        out.println("<label for='design2'>2</label><br>");
        out.println("<input type='radio' name='design' id='design1' value='1'>");
        out.println("<label for='design1'>1</label><br><br>");

        out.println("Food taste:");
        out.println("<input type='radio' name='taste' id='taste5' value='5'>");
        out.println("<label for='taste5'>5</label><br>");
        out.println("<input type='radio' name='taste' id='taste4' value='4'>");
        out.println("<label for='taste4'>4</label><br>");
        out.println("<input type='radio' name='taste' id='taste3' value='3'>");
        out.println("<label for='taste3'>3</label><br>");
        out.println("<input type='radio' name='taste' id='taste2' value='2'>");
        out.println("<label for='taste2'>2</label><br>");
        out.println("<input type='radio' name='taste' id='taste1' value='1'>");
        out.println("<label for='taste1'>1</label><br><br>");
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<RandomRestaurantEntry> entries = (List<RandomRestaurantEntry>) getServletContext().getAttribute("entries");
		entries.add(new RandomRestaurantEntry(entries.size(), request.getParameter("name"), request.getParameter("URL"),request.getParameter("designRatings"),request.getParameter("id")));
		getServletContext().setAttribute("entries", entries);
		PrintWriter out = response.getWriter();
		out.println("<a href='/app/RandomRestaurantServlet'>go back to guestbook</a>");
	}
}