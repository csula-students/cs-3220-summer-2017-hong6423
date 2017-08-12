package HW4;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class OrderDao implements DAO<Order>{
	Connection c =null;
	private static final String update = "update Order set Name = ?, ";
	private static final String delete = "delete from Order id = ?";
	
	public List<Order> list(){
		Database db = new Database();
	    try (Connection c = db.connection()) {
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Order");
            while (rs.next()) {
                OrderDao list;
				list.add(new Order(
                    rs.getInt("id"),
                    rs.getString("Name"),
                    rs.getString("Description"),
                    rs.getString("Url"),
                    rs.getString("price"),
                    rs.getString("CustomerName")
                    
                ));
            }
        }catch (SQLException e) {
            e.printStackTrace();
            return list();
	}
	    return list();
	
}
	public void add(Order newEntry) {
		Database db = new Database();
        try (Connection c = db.connection()) {
        	 PreparedStatement pstmt = c.prepareStatement("INSERT INTO Order (id, Name, Description, Url, price, CustomerName) VALUES (?, ?,?,?,?,?)");
        	 pstmt.setLong(1, newEntry.getId());
        	 pstmt.setString(2, newEntry.getName());
        	 pstmt.setString(3, newEntry.getDescription());
        	 pstmt.setString(4, newEntry.getUrl());
        	 pstmt.setString(5, newEntry.getPrice());
        	 pstmt.setString(6, newEntry.getCustomerName());
        	 
        	   pstmt.executeUpdate();
        }catch (SQLException e) {
        	e.printStackTrace();
        }
		
	}




public Optional<Order> get(int id) {
	 return Optional.empty();
}


public void update(Order newEntry) {
	// TODO Auto-generated method stub
	try {
		PreparedStatement ps = c.prepareStatement(update);
	 ps.setInt(1, newEntry.getId());
	 ps.setString(2, newEntry.getName());
	 ps.setString(3, newEntry.getDescription());
	 ps.setString(4, newEntry.getUrl());
	 ps.setString(5, newEntry.getPrice());
	 ps.setString(6, newEntry.getCustomerName());
	
	   ps.executeUpdate();
	    ps.close();
	}catch (SQLException e) {
	//throw e;
	}
}


public void delete(int id) {
	// TODO Auto-generated method stub
	try {
		PreparedStatement ps = c.prepareStatement(delete);
		ps.setInt(1, id);
		   ps.executeUpdate();
		    ps.close();
		    
	}catch (SQLException e) {
		//throw e;
	}
}

}