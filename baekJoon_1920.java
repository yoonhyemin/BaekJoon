/*
 * 수 찾기 
 * https://www.acmicpc.net/problem/1920
 */
import java.util.Scanner;

public class baekJoon_1920 {
	static int inputNumberOfBasicNumber;
	static int[] basicNumbers = new int[20];
	static int inputNumberOfSearchNumber;
	static int[] searchNumbers = new int[20];
	static  int j;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		inputNumberOfBasicNumber = scan.nextInt();
		
		for ( int i = 0; i < inputNumberOfBasicNumber; i++ ) 
			basicNumbers[i] = scan.nextInt();
		
		inputNumberOfSearchNumber = scan.nextInt();
		
		for ( int i = 0; i < inputNumberOfSearchNumber; i++ ) 
			searchNumbers[i] = scan.nextInt();
		
		baekJoon_1920();
	}

	private static void baekJoon_1920() {
		for ( int i = 0; i < inputNumberOfSearchNumber; i++ ) {
			for ( j = 0; j < inputNumberOfBasicNumber; j++ ) {
				if ( searchNumbers[i] == basicNumbers[j] ) {
					System.out.println("1");
					break;
				}
			}
			if( searchNumbers[i] != basicNumbers[j] )
				System.out.println("0");
		}
	}
}
