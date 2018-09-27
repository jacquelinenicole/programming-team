import java.util.*;
public class polling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		TreeMap<String, Integer> votes = new TreeMap<>();
		
		String curr;
		int highestVotes = 1;
		for (int i = 0 ; i < n ; i++) {
			curr = sc.next();
			
			if (votes.get(curr) == null) {
				votes.put(curr, 1);
			} else {
				votes.put(curr, votes.get(curr)+1);
				if (votes.get(curr) > highestVotes) {
					highestVotes = votes.get(curr);
				}
			}
		}
		
		for (Map.Entry<String, Integer> entry : votes.entrySet()) {
			if (entry.getValue() == highestVotes) {
				System.out.println(entry.getKey());
			}
		}
	}
}


/*
5
FRED
BARNEY
FRED
FRED
BARNEY
*/