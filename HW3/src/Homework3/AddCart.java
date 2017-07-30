package Homework3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCart
 */
@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init() {
    	List<FoodItem> foods = new ArrayList<>();
    	
    	List<FoodItem> Fooditem = new ArrayList<>();
    	getServletContext().setAttribute("Fooditem", Fooditem);
    		
    }
    
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id");
		List<FoodItem> Foods = (List<FoodItem>)getServletContext().getAttribute("Inventory");
		
			FoodItem entry = null;
			for(FoodItem fooditems: Foods) {
			if(fooditems.getId() == id) {
				entry = fooditems;
			}
			}
		List<FoodItem>Fooditem= (List<FoodItem>)getServletContext().getAttribute("Fooditem");
			
			Fooditem.add(new FoodItem(id, entry.name, entry.description, entry.url, entry.getPrice()));
				System.out.println(entry.name);
				System.out.println(entry.description);
				System.out.println(entry.url);
				System.out.println(entry.getPrice());
				
				
				response.sendRedirect("AddCart.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
