import java.util.*;

public class Task8 {

	public static void main(String[] args) {
		drawStarsPiramid(5);
		System.out.println();
		drawStarsPiramidInverted(5);
		

	}
	
	
	public static void drawStarsPiramid(int rows) {
		
		for(int i = 0; i<= rows; i++) {
			
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}
	
public static void drawStarsPiramidInverted(int rows) {
		
		for(int i = rows - 1; i >= 0; i--) {
			
			for(int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
	}
	

}
