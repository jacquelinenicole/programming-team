import java.util.*;
public class B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		
		for (int i = 0 ; i < T ; i++) {
			long x = scanner.nextLong();
			int n = scanner.nextInt();
			
			printCookies(x, n);
		}
	}
	
	public static void printCookies(long x, int n) {
		int slices = (2*n) - 2;
		long[] cookies = new long[n];
		
		if (slices == 0) { // 1 friend
			cookies[0] = x;
		} else {
			long share = (long)(x/slices);
			
			if (n > x) {
				for (int i = 0 ; i < x ; i++) {
					cookies[i]++;
				}
			} else if (n == 2) {
				cookies[0] = share;
				cookies[1] = share;
				if (x%2 == 1) {
					cookies[0]++;
				}
			} else if (n > 2) {
				cookies[0] = share;
				cookies[cookies.length - 1] = share;
				
				for (int i = 1 ; i < cookies.length - 1 ; i++) {
					cookies[i] = share*2;
				}
				
				long remaining = x - share * slices;
				long excess = remaining - cookies.length;
				for (int i = 0 ; i < remaining && i < cookies.length ; i++) {
					cookies[i]++;
				}
				
				int index = cookies.length-2;
				
				while (excess > 0) {
					cookies[index--]++;
					excess--;
				}
			}
		}
		
		for (int i = 0 ; i < cookies.length ; i++) {
			System.out.print(cookies[i] + " ");
		}
		
		System.out.println();
	}
}
/*
1
5 3

1
27 6

1
5 2

1
5 6
*/