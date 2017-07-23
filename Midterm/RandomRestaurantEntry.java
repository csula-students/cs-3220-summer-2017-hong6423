package midterm;



public class RandomRestaurantEntry{
	public final int id;
	public final String name;
	public final String URL;
	public final String designRatings;
	public final String tasteRatings;

	public RandomRestaurantEntry(int id, String name, String URL, String designRatings, String tasteRatings) {
		this.id = id;
		this.name = name;
		this.URL = URL;
		this.designRatings = designRatings;
		this.tasteRatings = tasteRatings;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String URL() {
		return URL;
	}
	public String getdesignRatings() {
		return designRatings;
	}
	public String gettasteRatings() {
		return tasteRatings;
	}
}
