/*
 * 소수 찾기  
 * https://www.acmicpc.net/problem/1978
 */
import java.util.Scanner;

public class baekJoon_1978 {
	static int InputNumber;
	static int[] primeNumbers = new int[100];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		InputNumber = scan.nextInt();
		
		for ( int i = 0; i < InputNumber; i++ ) {
			primeNumbers[i] = scan.nextInt();
			baekJoon_1978(primeNumbers[i]);
		}
	}

	private static void baekJoon_1978(int number) {
		int divisionNumber = 2;
		boolean isPrime = true;
		int count = 0;
		
		while (divisionNumber <= number) {
			isPrime = true;
			
			for (int n = 2; n < divisionNumber; n++) {
				if (divisionNumber % n == 0) {
					isPrime = false;
				}
				continue;
			}
			
			if (isPrime == true)
				count++;
			
			divisionNumber++;
		}
		System.out.println(count);
	}

}
