/*
 * 아스키 코드  
 * https://www.acmicpc.net/problem/11654
 */
import java.util.Scanner;

public class baekJoon_11654 {
	static char data;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		data = scan.next().charAt(0);
		
		baekJoon_11654(data);
	}

	private static void baekJoon_11654(char data) {
		System.out.println((int)data);
	}
}