package Test;
import java.util.Scanner;

public class Book2 {
	public static void main(String args[]){
		System.out.println("Welcome to the Line Item Calculator");
		System.out.println();
	
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			String productCode = Validator.getString(sc, "Enter product code: ");
			int quantity = Validator.getInt(sc, "Enter quantity: ");
			
			System.out.println(productCode);
			System.out.println(quantity);
			choice = Validator.getString(sc, "Continue? (y/n): ");
			System.out.println();
		}
	}
}
