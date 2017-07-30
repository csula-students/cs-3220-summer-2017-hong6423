package Homework3;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteCart
 */
@WebServlet("/DeleteCart")
public class DeleteCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteCart() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int Id = Integer.parseInt(request.getParameter("Id"));
		List<FoodItem> Entry = (List<FoodItem>) getServletContext().getAttribute("Fooditem");
			int index = -1;
		for(int i = 0; i<Entry.size(); i++) {
			if(Entry.get(i).getId() ==Id) {
				index = i;
			}
		}
		Entry.remove(index);
		
		response.sendRedirect("delete.jsp");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
