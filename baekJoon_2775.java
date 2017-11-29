/*
 * 부녀회장이 될테야  
 * https://www.acmicpc.net/problem/2775
 * 
 * 변수 명 : floorNumber - 층수, houseNumber - 호실, apartmentBlocks[][] - 아파트 2차원배열, sumOfHabitant - 거주자의 합   
 * 풀이방법 : 
 * 		1) apartmentBlocks[0][1] ~ apartmentBlocks[0][14] : 1부터 14까지 채우기 
 * 		2) 재귀함수를 이용하여 거주자의 합을 구하였습니다.  
 * 		3) 재귀함수 구조 : 1 - 층수가 0 일 때, 1-14까지 넣어줬던 값을 리턴해줍니다.
 * 		 			    2 - 층수가 1 이상일 때, 재귀함수 호출해줍니다. 
 * 						((( 층수는 정해진 층수에서 -1해주고 호실은 for을 통 1부터 넣어주면서 거주자의 합에 더해줍니다.)))    
 * 						    					
 */
import java.util.Scanner;

public class baekJoon_2775 {
	static int testCase, floorNumber, houseNumber;
	static int[][] apartmentBlocks = new int[15][15];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		testCase = scan.nextInt();
		
		for ( int i = 1; i <=14 ; i++) { 
			apartmentBlocks[0][i] += i;
		}	
		
		while ( testCase >= 1 ) {
			floorNumber = scan.nextInt();
			houseNumber = scan.nextInt();
			
			baekJoon_2775( floorNumber, houseNumber );
			
			System.out.println(apartmentBlocks[floorNumber][houseNumber]);
			testCase--;	
		}
	}

	private static int baekJoon_2775( int floorNumber, int houseNumber ) {
		int sumOfHabitant = 0; 
		
		if ( floorNumber < 0 )
			return 0;
		
		else if ( floorNumber == 0) 
			return apartmentBlocks[floorNumber][houseNumber];
		
		else
			for ( int i = 1; i <= houseNumber; i++ ) {
				sumOfHabitant += baekJoon_2775( floorNumber - 1, i );
			}
		
		return apartmentBlocks[floorNumber][houseNumber] = sumOfHabitant;	
	}	
}

