import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			
			int read = Integer.parseInt(scanner.nextLine());
			if(read == 0) {
				break;
			}
			
			sum += read;
			System.out.println("Sum now " + sum);
			
			
		}
		System.out.println("Sum in the end: "+ sum);
		
		

	}

}
