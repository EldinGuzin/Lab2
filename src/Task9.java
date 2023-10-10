import java.util.*;

public class Task9 {

	public static void main(String[] args) {
		
		drawNumbersPiramid(5);
		
		drawNumbersPiramid2(5);

	}
	
public static void drawNumbersPiramid(int rows) {
		
		for(int i = 0; i<= rows; i++) {
			
			for(int j = 0; j < i; j++) {
				
				System.out.print(j+1);
				
			}
			System.out.println();
		}
		
		
	}

public static void drawNumbersPiramid2(int rows) {
	
	for(int i = 0; i<= rows; i++) {
		
		for(int j = 0; j < i; j++) {
			
			System.out.print(i);
			
		}
		System.out.println();
	}
	
	
}

}
