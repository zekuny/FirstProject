public class BookDB {
	public static Book getBook(String code){
		Book b = new Book();
		
		b.setBookCode(code);
		if(code.equalsIgnoreCase("java")){
			b.setDescription("Murach's Beginning Java");
			b.setPrice(49.50);
		}else if(code.equalsIgnoreCase("jsps")){
			b.setDescription("Murach's Java Servlets and JSP");
			b.setPrice(49.50);
		}else if(code.equalsIgnoreCase("mcb2")){
			b.setDescription("Murach's Mainframe COBOL");
			b.setPrice(59.50);
		}else{
			b.setDescription("Unknown");
		}
		return b;
	}
}
