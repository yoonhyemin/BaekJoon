/*
 * Java vs C++  
 * https://www.acmicpc.net/problem/3613
 */
import java.util.Scanner;

public class baekJoon_3613 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data;
		data = scan.next();

		for ( int i = 0; i < data.length(); i++ ) {
			if( 65 <= (int)data.charAt(i) && (int)data.charAt(i) <= 90 ) {
				System.out.print('_');
				System.out.print( (char) ( (int)data.charAt(i) + 32 ) );
			}
			
			else if ( data.charAt(i) != '_' ) {
				System.out.print(data.charAt(i));
			}
			
			else if ( data.charAt(i) == '_' ) {
				System.out.print( (char) ( (int)data.charAt(i+1) - 32 ) );
				i++;
			}
			
			else {
				System.out.print("Error!");
			}			
		}
	}
}
