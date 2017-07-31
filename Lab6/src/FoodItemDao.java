package Lab6;

//import edu.csula.cs3220.dao.DAO;
//import edu.csula.cs3220.dao.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class FoodItemDao implements DAO<FoodItem>{
	public List<FoodItem> list(){
		Database db = new Database();
	    try (Connection c = db.connection()) {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM fooditem");
            while (rs.next()) {
                list.add(new FoodItem(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"),
                    rs.getString("url"),
                    rs.getString("price")
                ));
            }
        }catch (SQLException e) {
            e.printStackTrace();
            return list();
	}
	    return list();
	
}
	public void add(FoodItem newEntry) {
		Database db = new Database();
        try (Connection c = db.connection()) {
        	 PreparedStatement pstmt = c.prepareStatement("INSERT INTO foodiitem (name, description, url, price) VALUES (?, ?, ?, ?)");
        	 pstmt.setString(1, newEntry.getName());
        	 pstmt.setString(1, newEntry.getDescription());
        	 pstmt.setString(1, newEntry.getUrl());
        	 pstmt.setString(1, newEntry.getPrice());
        	   pstmt.executeUpdate();
        }catch (SQLException e) {
        	e.printStackTrace();
        }
		
	}




public Optional<FoodItem> get(int id) {
	 return Optional.empty();
}


public void update(FoodItem obj) {
	// TODO Auto-generated method stub
	
}


public void delete(int id) {
	// TODO Auto-generated method stub
	
}

}
