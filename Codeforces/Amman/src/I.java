import java.util.*;
public class I {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0 ; i < T ; i++) {
			int x = scanner.nextInt();
			int n = scanner.nextInt();
			
			if (n > x || n == 0) {
				System.out.println("-1");
			} else {
				int[] list = smallestRange(x, n);
				
				for (Integer e : list) {
					System.out.print(e + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static int[] smallestRange(int x, int n) {
		int[] nums = new int[n];
		for (int i = 0 ; i < n ; i++) {
			nums[i] = x / (n-i);
			//System.out.println(nums[i]);
			x -= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
}

/*
1
5 3


1
5 1

*/
