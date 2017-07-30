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
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Object Inventory = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cart() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		List<FoodItem> Fooditem = (List<FoodItem>)  getServletContext().getAttribute("Inventory");
			List<FoodItem> foodItems = new ArrayList<>();
	
				getServletContext().setAttribute("Inventory", Inventory);
				
					for (FoodItem entry : Fooditem) {
							System.out.println(entry.getName());
					}
					response.sendRedirect("orderstatus.jsp");
	}

}
