public class BookApp {
	public static void main(String[] args){
		Book b = new Book();
		b.setBookCode("java");
		b.setTitle("Learn Java in 30 days.");
		b.setIsInStock(true);
		b.setPrice(5.0);
		
		double price = b.pricing(5);
		System.out.println(price);
	}  
}
