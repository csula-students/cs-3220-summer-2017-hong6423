package Hw2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Order{
	public final int ID;
	public final String Item;
	public final String Customer;
	
	public Order(int id, String item, String customer) {
		super();
			this.ID = id;
			this.Item = item;
			this.Customer = customer;
	}
	public int getID() {
		return ID;
	}
	public String getitem() {
		return Item;
	}
	public String Customer() {
		return Customer;
	}
	public String getcompletedstatus() {
		// TODO Auto-generated method stub
		return null;
	}
}