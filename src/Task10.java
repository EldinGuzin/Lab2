import java.util.*;

public class Task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int secret = drawNumber();
		int user;
		
		while(true) {
			
			System.out.println("Guess a number: ");
			user = scanner.nextInt();
			
			if(user > secret) {
				
				System.out.println("The number is lesser! ");
			}
			
			if(user < secret) {
				
				System.out.println("The number is greater! ");
				
			}
			
			if (user == secret) {
				
				System.out.println("Correct! ");
				break;
				
			}
			count++;
			System.out.println("Number of guesses: "+ count);
			
		}
		

	}
	
	public static int drawNumber() {
		Random random = new Random();
		int number = random.nextInt(100);
		
		return number;
	}

}
