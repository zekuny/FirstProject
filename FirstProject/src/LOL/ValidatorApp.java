package LOL;
import java.util.Scanner;


public class ValidatorApp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter personal information below: ");
		String name = Validator.getString(sc, "Please enter your name...");
		int age = Validator.getInt(sc, "Please enter your age...(inches)", 1, 100);
		int weight = Validator.getInt(sc, "please enter your weight...(lbs)", 36, 92);
		double decimal = Validator.getDouble(sc, "please enter your favorite decimal...(between 0 and 1)", 0, 1);
		
		System.out.println();
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("weight: " + weight);
		System.out.println("favorite decimal: " + decimal);
	}
}
