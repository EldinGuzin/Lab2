import java.util.*;


public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String password = "carrot";
		while(true) {
			
			System.out.println("Enter the password: ");
			String user = scanner.nextLine();
			
			if(password.equals(user)) {
				
				System.out.println("Correct!");
				break;
			}
			
			
		}
		
	}

}
