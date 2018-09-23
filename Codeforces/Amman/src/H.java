import java.util.*;
public class H {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		
		for (int i = 0 ; i < T ; i++) {
			int n = scanner.nextInt();
			int numFriends = n * 2;
			int[] happiness = new int[numFriends];
			
			for (int j = 0 ; j < numFriends ; j++) {
				happiness[j] = scanner.nextInt();
			}
			int maxHappiness = 0;
			int curr;
			for (int j = 0 ; j < n ; j++) {
				curr = happiness[j] + happiness[numFriends - (j+1)];
				if (curr > maxHappiness) {
					maxHappiness = curr;
				}
			}
			
			System.out.println(maxHappiness);
		}		
	}
}

/*
1
3
2 4 5 6 7 8
*/
