package HW4;

public class Order{
	public final int id;
	public final String Name;
	public final String Description;
	public final String Url;
	public final String Price;
	public final String CustomerName;
	
	public Order (int id, String Name, String Description, String Url, String Price, String CustomerName) {
		this.id = id;
		this.Name = Name;
		this.Description = Description;
		this.Url = Url;
		this.Price = Price;
		this.CustomerName = CustomerName;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public String getDescription() {
		return Description;
	}
	public String getUrl() {
		return Url;
	}
	public String getPrice() {
		return Price;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public String toString() {
		return id + Name + Description + Url + Price + CustomerName;
	}
	
}
	