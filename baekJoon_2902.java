/*
 * KMP는 왜 KMP일까? 
 * https://www.acmicpc.net/problem/2902
 */
import java.util.Scanner;

public class baekJoon_2902 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data;
		data = scan.next();
		
		
		System.out.print(data.charAt(0));
		for ( int i = 1; i < data.length(); i++ ) {
			if ( data.charAt(i) == '-' ) {
				System.out.print(data.charAt(i+1));
			}
		}	
	}
}