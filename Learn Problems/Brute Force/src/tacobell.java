import java.util.*;
public class tacobell {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0 ; i < T ; i++) {
			int numUnique = scanner.nextInt();
			int numBuy = scanner.nextInt();
			
			String[] items = new String[numUnique];
			for (int j = 0 ; j < numUnique ; j++) {
				items[j] = scanner.next();
			}
			
			Arrays.sort(items);
			combinations(items, new boolean[items.length], 0, 0, numBuy);
			System.out.println();
		}
	}
	
	public static void combinations(String[] items, boolean[] chosen, int index, int included, int k) {
		if (included == k) {
			for (int i = 0 ; i < chosen.length ; i++) {
				if (chosen[i]) {
					System.out.print(items[i] + " ");
				}
			}
			System.out.println();
		} else if (index < chosen.length) {
			chosen[index] = true;
			combinations(items, chosen, index+1, included+1, k);
			chosen[index] = false;
			combinations(items, chosen, index+1, included, k);
		}
	}
}


/*
2
3 2
taco
burrito
nachos
4 4
chalupa
softshelltaco
gordita
pizza

*/
