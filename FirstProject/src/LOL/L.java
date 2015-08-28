package LOL;

import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;
public class L
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("Enter a question please...");
		String aa = sc.next();
		while(!aa.equalsIgnoreCase("no")){
			if(aa.equalsIgnoreCase("history")){
				for(String s : map.keySet()){
					System.out.println(" Question: " + s);
					System.out.println(" Answer: " + map.get(s));
				}
			}else{
				int choice = 1 + r.nextInt(15);
				String response = "";
		
				if ( choice == 1 )
					response = "It is certain";
				else if ( choice == 2 )
					response = "It is decidedly so";
				else if ( choice == 3 )
					response = "Without a doubt";
				else if ( choice == 4 )
					response = "Yes - definitely";
				else if ( choice == 5 )
					response = "You may rely on it";
				else if ( choice == 6 )
					response = "As I see it, yes";
				else if ( choice == 7 )
					response = "Most likely";
				else if ( choice == 8 )
					response = "Outlook good";
				else if ( choice == 9 )
					response = "Signs point to yes";
				else if ( choice == 10 )
					response = "Yes";
				else if ( choice == 11 )
					response = "Reply hazy, try again";
				else if ( choice == 12 )
					response = "Ask again later";
				else if ( choice == 13 )
					response = "Better not tell you now";
				else if ( choice == 14 )
					response = "Cannot predict now";
				else if ( choice == 15 )
					response = "Concentrate and ask again";
				else 
					response = "8-BALL ERROR!";
		
				System.out.println( "MAGIC 8-BALL SAYS: " + response );
				map.put(aa, response);
			}
			System.out.println("Ask a question or enter no to exist or enter history to review: ");
			aa = sc.next();
		}
		System.out.println();
		System.out.println("Game Over.");
	}
}



