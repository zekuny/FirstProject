import java.util.Scanner;

public class Bob {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter: ");
		int ans = -1;
		while(sc.hasNextInt()){
			ans = sc.nextInt();
			if(ans == 999){
				System.out.println("Yes.");
				break;
			}
			System.out.println("Continue.");
		}
		sc.close();
	}       
}