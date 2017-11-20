/*
 * 부분집합의 합
 * https://www.acmicpc.net/problem/1182
 */
import java.util.Scanner;

public class baekJoon_1182 {	
	static int NumberOfInputNumber, Sum, count, sumOfNumbers;
	static int[] Numbers = new int[21];
	
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		NumberOfInputNumber = scan.nextInt();
		Sum = scan.nextInt();
		
		for ( int i = 1; i <= NumberOfInputNumber; i++ ) 
			Numbers[i] = scan.nextInt();			
		
		baekJoon_1182(1);
		System.out.println(count);	
	}
	
	public static void baekJoon_1182( int n ) {
		if( n > NumberOfInputNumber )
			return;

		if ( sumOfNumbers + Numbers[ n ] == Sum ) 
			count++;

		baekJoon_1182( n + 1 );
		sumOfNumbers +=  Numbers[ n ];
		baekJoon_1182( n + 1 );
		sumOfNumbers -=  Numbers[ n ];
	}
}

