package LineItemApp;

public class Book {
	double price;
	boolean taxable;
	double taxRate;
	
	public Book(){
		price = 0.0;
		taxable = true;
		taxRate = 0.0;
	}
	
	public Book(double p, double t, boolean ta){
		price = p;
		taxable = ta;
		taxRate = t;
	}
	
	public void setPrice(double p){
		price = p;
	}
	public double getPrice(){
		return price;
	}
	
	public void setTaxable(boolean t){
		taxable = t;
	}
	public boolean getTaxable(){
		return taxable;
	}
	
	public void setTaxRate(double t){
		taxRate = t;
	}
	public double getTaxRate(){
		return taxRate;
	}
}
