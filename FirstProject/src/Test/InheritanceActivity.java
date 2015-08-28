package Test;
import java.util.ArrayList;
import java.util.Scanner;

public class InheritanceActivity {
	public static void main(String[] args){
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Software> softwareList = new ArrayList<Software>();
		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
		String choice = "";
		while(true){
			choice = Validator.getString(sc, "Enter \"book\" or \"software\" or \"end\" here: ");
			if(choice.equals("end")){
				System.out.println("Finish entering.");
				break;
			}else if(!choice.equals("book") && !choice.equals("software")){
				System.out.println("Invalid entering. Break.");
				break;			
		    }
			String code = Validator.getString(sc, "Enter the code here: ");
			String description = Validator.getString(sc,  "Enter the description here: ");
			double price = Validator.getDouble(sc, "Enter the price here: ");
			if(choice.equals("book")){
				String author = Validator.getString(sc, "Enter the author here: ");
				Book b = new Book(code, description, price, author);
				bookList.add(b);
			}else if(choice.equals("software")){
				String version = Validator.getString(sc, "Enter the version here: ");
				Software s = new Software(code, description, price, version);
				softwareList.add(s);
			}
		}
		
		for(int i = 0; i < bookList.size(); i++){
			Book b = bookList.get(i);
			System.out.println("For book: " + b.getCode());
			String output = Validator.getString(sc, "Enter \"simple\" or \"detail\": ");
			if(!output.equals("simple") && !output.equals("detail")){
				System.out.println("Invalid input. Break.");
				break;
			}
			System.out.println(b.toString(output));
		}
		
		for(int i = 0; i < softwareList.size(); i++){
			Software s = softwareList.get(i);
			System.out.println("For software: " + s.getCode());
			String output = Validator.getString(sc, "Enter \"simple\" or \"detail\": ");
			if(!output.equals("simple") && !output.equals("detail")){
				System.out.println("Invalid input. Break.");
				break;
			}
			System.out.println(s.toString(output));
		}
	}
}
