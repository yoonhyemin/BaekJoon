/*
* 피보나치 수열
* https://www.acmicpc.net/problem/2747
*/
import java.util.Scanner;

public class baekJoon_2747 {
	static int NumberOfInputNumber;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberOfInputNumber = scan.nextInt();
		
		Fibonacci(NumberOfInputNumber);
	}

	private static void Fibonacci(int NumberOfInputNumber) {
		int[] Numbers = new int[100];
		Numbers[0] = 0;
		Numbers[1] = 1;
		
		for ( int i = 2; i <= NumberOfInputNumber ; i++ ) {
			Numbers[i] = Numbers[i - 1] + Numbers[i - 2]; 
		}	
		
		System.out.println( Numbers[ NumberOfInputNumber ] );	
	}

}
