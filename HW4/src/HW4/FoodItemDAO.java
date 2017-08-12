package HW4;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class FoodItemDAO implements DAO<FoodItem>{
	Connection c =null;
	private static final String update = "update foodItem set id = ?, name = ?, description = ?, url = ?, price = ?";
	private static final String delete = "delete from foodItem id = ?";
	
	public List<FoodItem> list(){
		Database db = new Database();
	    try (Connection c = db.connection()) {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM fooditem");
            while (rs.next()) {
                FoodItemDAO list;
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


public void update(FoodItem newEntry) {
	// TODO Auto-generated method stub
	 PreparedStatement ps = c.prepareStatement(update);
	 ps.setInt(1, newEntry.getId());
	 ps.setString(2, newEntry.getName());
	 ps.setString(3, newEntry.getDescription());
	 ps.setString(4, newEntry.getUrl());
	 ps.setString(5, newEntry.getPrice());
	   ps.executeUpdate();
	    ps.close();
	}catch (SQLException e) {
	throw e;
}


public void delete(int id) {
	// TODO Auto-generated method stub
	try {
		PreparedStatement ps = c.prepareStatement(delete);
		ps.setInt(1, id);
		   ps.executeUpdate();
		    ps.close();
		    
	}catch (SQLException e) {
		throw e;
	}
}

}