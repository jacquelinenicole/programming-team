import java.util.*;
public class politics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numCandidates = sc.nextInt();
		int numSupporters = sc.nextInt();
		
		HashMap<String, Integer> candidateOrder = new HashMap<>();
		
		for (int i = 0 ; i < numCandidates ; i++) {
			candidateOrder.put(sc.next(), i);
		}
		
		
	}
}
