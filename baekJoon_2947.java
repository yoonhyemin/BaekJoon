/*
 * 나무조각    
 * https://www.acmicpc.net/problem/2947
 */
import java.util.Scanner;

public class baekJoon_2947 {
	static int sizeOfNumbers = 5;
	static int[] Numbers = new int[6];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for ( int i = 0; i < sizeOfNumbers; i++ ) 
			Numbers[i] = scan.nextInt();
		
		baekJoon_2947();
	}

	private static void baekJoon_2947() {
		for (int i = 0; i < sizeOfNumbers - 1; i++ ) {
			for (int j = 0; j < sizeOfNumbers - 1 - i; j++ ) {				
				if ( Numbers[j] > Numbers[j + 1] ) {
					int TEMP = Numbers[j];
					Numbers[j] = Numbers[j + 1];
					Numbers[j + 1] = TEMP;
					
					for ( int k = 0; k < sizeOfNumbers; k++ ) {
						System.out.print(Numbers[k] +" ");
					}
					
					System.out.print("\n");
				}
			}
		}
	}
}
