public class Book {	
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	private String bookCode;
	
	public Book(){
		title = "";
		author = "";
		description = "";
		price = 0.0;
		isInStock = false;
		bookCode = "";
	}
	
	
	public Book(String t, String a, String d, double p, boolean i, String b){
		title = t;
		author = a;
		description = d;
		price = p;
		isInStock = i;
		bookCode = b;
	}
	
	public void setTitle(String t){
		title = t;
	}
	public String getTitle(){
		return title;
	}
	
	public void setAuthor(String a){
		author = a;
	}
	public String getAuthor(){
		return author;
	}
	
	public void setDescription(String d){
		description = d;
	}
	public String getDescription(){
		return description;
	}
	
	public void setPrice(double p){
		price = p;
	}
	public double getPrice(){
		return price;
	}
	
	public void setIsInStock(boolean i){
		isInStock = i;
	}
	public boolean getIsInStock(){
		return isInStock;
	}
	
	public void setBookCode(String b){
		bookCode = b;
	}
	public String getBookCode(){
		return bookCode;
	}
	
	public double pricing(int number){
		if(isInStock){
			return number * price;
		}
		return -1;
	}
}