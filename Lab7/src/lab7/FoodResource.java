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

//import edu.csula.cs3220.examples.jaxrs.models.User;
import Lab7.jaxrs.FoodItem;
import Lab7.jaxrs.FoodItemDao;


@Path("FoodResource")
@Singleton // used to keep resource between requests otherwise request cope
public class FoodResource {
    //private List<User> users = new ArrayList<>(Arrays.asList(new User("Eric", "Liao")));
	
	FoodItemDao Dao = new FoodItemDao();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<FoodItem> getUser() {
    	  return Dao.list();
    }
      
    

    @GET
    @Path("FoodItem/{Id}")
    @Produces(MediaType.APPLICATION_JSON)
    public FoodItem getFoodItem(@PathParam("Id") int id){
        return Dao.list();
    }

    @POST
    @Path("FoodItem")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public boolean addUser(FoodItem newFood) {
        System.out.println(newFood);
        Dao.add(newFood);
        System.out.println(Dao.list());
        return true;
    }