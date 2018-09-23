// given decimal number n, find # bits needed to be flipped in 
// binary representation to go from n to n-1

import java.util.*;
public class C {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		int numTests = scanner.nextInt();
		
		for (int i = 0; i < numTests ; i++) {
			int givenNum = scanner.nextInt();
			
			String given = Integer.toBinaryString(givenNum);
			//System.out.println(given);
			
			System.out.println(editDistance(given));
		}
	}
	
	public static int editDistance(String given) {
		int count = 1;
		int lenGiven = given.length();
		
		for (int i = lenGiven-1 ; i >= 0 ; i--) {
			if (given.charAt(i) == '1') {
				break;
			}
			count++;
		}
		
		return count;
	}
}

/*
2
5
10

2
80
1000000000


2
1
54268

*/