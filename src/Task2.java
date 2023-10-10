import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int read;
		
		
		/*
		System.out.println("Enter first number");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number");
		int num2 = scanner.nextInt();
		System.out.println("Enter third number");
		int num3 = scanner.nextInt();
		
		sum = num1 + num2 + num3;
		*/
		
		for(int i = 0; i < 3;i++) {
			
			System.out.println("Enter number: ");
			read = scanner.nextInt();
			sum += read;
			
		}
		

		System.out.println("Sum: " + sum);
	}

}
