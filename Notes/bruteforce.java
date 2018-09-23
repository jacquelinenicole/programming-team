import java.util.*;

public class bruteforce {
	final public static String[] CANDY = {"snickers", "mandms", "reeses", "kitkat", "payday", "twix"};


	public static void main(String[] args) {
		combinations(new int[6], 0, 2);
		//permutation(new int[4], new boolean[4], 0);
		//upwards(new char[5], 2, 0);
	}

	public static void permutationWithRepeats(int[] odom, int k, int numD) {
		if (k == odom.length) {
			for (int i = 0 ; i < odom.length ; i++) {
				System.out.print(CANDY[i] + " ");	
			}
			System.out.println();
			return;
		}

		for (int i = 0 ; i < numD ; i++) {
			odom[k] = i;
			combinations(odom, k+1, numD);
		}
	}

	public static void combinations(int[] odom, int k, int numD) {
		if (k == odom.length) {
			for (int i = 0 ; i < odom.length ; i++) {
				
				// this if statement makes it so only different combinations print
				if (odom[i] == 1) {
					System.out.print(CANDY[i] + " ");	
				}
			}
			System.out.println();
			return;
		}

		for (int i = 0 ; i < numD ; i++) {
			odom[k] = i;
			combinations(odom, k+1, numD);
		}
	}

	public static void permutation(int[] perm, boolean[] used, int k) {
		if (k == perm.length) {
			for (int i = 0 ; i < perm.length ; i++) {
				System.out.print(CANDY[perm[i]] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0 ; i < perm.length ; i++) {
			if (used[i]) {
				continue;
			}

			used[i] = true;
			perm[k] = i;

			permutation(perm, used, k+1);
			used[i] = false;
		}
	}


	// permutations where no item is in original spot
	public static void derrangements(int[] perm, boolean[] used, int k) {
		if (k == perm.length) {
			for (int i = 0 ; i < perm.length ; i++) {
				System.out.print(perm[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0 ; i < perm.length ; i++) {
			if (used[i] || i == k) {
				continue;
			}

			used[i] = true;
			perm[k] = i;

			derrangements(perm, used, k+1);
			used[i] = false;
		}
	}

	public static void upwards(char[] word, int level, int k) {
		if (k == word.length) {
			System.out.println(new String(word));
			return;
		}

		char start = 'a';
		if (k > 0) {
			start = (char)(word[k-1] + level + 1);
		}

		for (char ch = start ; ch <= 'z' ; ch++) {
			word[k] = ch;
			upwards(word, level, k+1);
		}
		
	}
}