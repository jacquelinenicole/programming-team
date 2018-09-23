import java.util.*;
public class addall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0 ; i < T ; i++) {
			int N = scanner.nextInt();
			int[] nums = new int[N];
			
			for (int j = 0 ; j < N ; j++) {
				nums[j] = scanner.nextInt();
			}
			
			int sum = 0;
			
			
			Arrays.sort(nums);
			
			while(nums.length > 1) {
				
				
				Arrays.sort(nums);
			}
		}
	}
}	
