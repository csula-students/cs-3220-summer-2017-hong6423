package lab7;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.inject.Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Lab7.jaxrs.Order;
import Lab7.jaxrs.OrderDao;

@Path("OrderResource")
public class OrderResource{
	OrderDao dao = new OrderDao();
	
	@GET
    @Path("Order")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getOrder() {
        return Dao.list();
    }
	
	
	@GET
	@Path("order/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getOrder(@Path("Id") int id) {
        return Dao.get(id).get();
    }
	
	
	@POST
    @Path("Order")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addOrder(Order newOrder) {
        System.out.println(newOrder);
        users.add(newOrder);
        System.out.println(Order);
        return true;
    }
	
	
	
	
	
}




