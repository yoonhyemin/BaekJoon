/*
 * 버블소트_수 정렬 
 * https://www.acmicpc.net/problem/10989
 */
import java.util.Scanner;

public class baekJoon_10989 {
	static int InputNumber;
	static int[] Numbers = new int[21];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InputNumber = scan.nextInt();
		
		for ( int i = 1; i <= InputNumber; i++ ) 
			Numbers[i] = scan.nextInt();
		
		baekJoon_10989();
	}

	private static void baekJoon_10989() {
		for (int i = 0; i < InputNumber - 1; i++ ) {
			for (int j = 0; j < InputNumber - 1 - i; j++ ) {				
				if ( Numbers[j] > Numbers[j + 1] ) {
					int TEMP = Numbers[j];
					Numbers[j] = Numbers[j + 1];
					Numbers[j + 1] = TEMP;
				}
			}
		}
		for ( int i = 1; i <= InputNumber; i++ ) 
			System.out.println(Numbers[i]);
	}
}
