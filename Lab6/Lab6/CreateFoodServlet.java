package Lab6;


//import edu.csula.cs3220.dao.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import java.util.List;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CreateFoodServlet")
public class CreateFoodServlet extends HttpServlet {
    public void doGet( HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/CreateFood.jsp")
            .forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String url = request.getParameter("url");
        String price = request.getParameter("price");
        
        FoodItem newEntry = new FoodItem(-1, name, description, url, price);
        
        FoodItemDao dao = new FoodItemDao();
        dao.add(newEntry);
        response.sendRedirect("../Inventory");
        
        
	}
}