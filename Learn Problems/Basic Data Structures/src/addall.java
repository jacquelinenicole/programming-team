import java.util.*;
public class addall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for (int i = 0 ; i < T ; i++) {
			int N = scanner.nextInt();
			PriorityQueue<Long> nums = new PriorityQueue<>();
			
			for (int j = 0 ; j < N ; j++) {
				nums.offer(scanner.nextLong());
			}
			
			long sum = 0;
			long curr;
			
			while(nums.size() > 1) {
				curr = nums.poll() + nums.poll();
				sum += curr;
				nums.offer(curr);
			}
			
			System.out.println(sum);
		}
	}
}	


/*
2
3
1 2 3
4 
1 2 3 4

1
1
100

*/