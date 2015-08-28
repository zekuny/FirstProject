package LineItemApp;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class LineItemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> list = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		
		double price = 0.0;
		double taxRate = 0.0;
		boolean taxable = false;
		int count = 0;
		System.out.println("Entering price, taxRate, taxable below: ");
		while(sc.hasNext()){
			if(count == 0){
				price = sc.nextDouble();
				if(price == -1){
					System.out.println("Finish entering.");
					System.out.println("");
					break;
				}else{
					while(price < 0 || price >= 1000){		
						System.out.println("Price should be >= 0 and < 1000, please try again");
						price = sc.nextDouble();
					}
				}
				count++;				
			}else if(count == 1){
				taxRate = sc.nextDouble();
				while(taxRate < 0){
					System.out.println("taxrate should be >= 0, please try again");
					taxRate = sc.nextDouble();
				}
				count++;
			}else if(count == 2){
				int tmp = sc.nextInt();
				while(tmp != 1 && tmp != 0){
					System.out.println("please enter either 1 or 0, please try again");
					tmp = sc.nextInt();
				}
				taxable = taxable(tmp);
				Book b = new Book(price, taxRate, taxable);
				list.add(b);
				count = 0;
			}
		}
		if(sc != null){
			sc.close();
		}
		printInvoice(list);
	}
	
	private static boolean taxable(int x){
		if(x == 1){
			return true;
		}else{
			return false;
		}
	}
	
	private static void printInvoice(ArrayList<Book> list){
		double taxableSubtotal = 0.0;
		double untaxableSubtotal = 0.0;
		double tax = 0.0;
		double grandTotal = 0.0;
		int amount = 0;
		
		for(Book b : list){
			grandTotal += b.getPrice();
			if(b.getTaxable()){
				taxableSubtotal += b.getPrice();
				tax += b.getPrice() * b.getTaxRate();
			}else{
				untaxableSubtotal += b.getPrice();
			}
			amount++;
		}
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat quantities = NumberFormat.getNumberInstance();
		System.out.println("taxable subtotal: " + currency.format(taxableSubtotal));
		System.out.println("untaxable subtotal " + currency.format(untaxableSubtotal));
		System.out.println("tax: " + currency.format(tax));
		System.out.println("grand total: " + currency.format(grandTotal));
		System.out.println("quantities: " + quantities.format(amount));
	}

}
