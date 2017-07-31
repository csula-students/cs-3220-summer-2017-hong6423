package Lab6;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FoodItem{
	public final int id;
	public final String name;
	public final String description;
	public final String url;
	public final String price;
	
	public FoodItem(int id, String name, String description, String url, String price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getImageurl() {
		return url;
	}
	public String getPrice() {
		return price;
	}
	
}