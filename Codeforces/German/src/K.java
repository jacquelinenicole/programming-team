import java.awt.*;
import java.util.*;

public class K {
	//public static int numFired = 0;
	//public static boolean[] employees;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int d = scanner.nextInt();
		int k = scanner.nextInt();
		
		Point[] employees = new Point[n];
		
		for (int i = 0 ; i < n ; i++) {
			employees[i] = new Point(scanner.next(), scanner.nextInt());
			//System.out.println("x: " + employees[i].x + " y: " + employees[i].y);
		}	
		
		for (int i = 0 ; i < employees.length ; i++) {
			for (int j = 0 ; j < employees.length - i - 1 ; j++) {
				if (employees[j].y > employees[j+1].y) {
					Point temp = new Point(employees[j].x, employees[j].y);
					employees[j] = employees[j+1];
					employees[j+1] = temp;
				}
			}
		}
		/*
		for (int i = 0 ; i < employees.length ; i++) {
			System.out.println("x: " + employees[i].x + " y: " + employees[i].y);
		}
		*/
		
		int cost = 0;
		
		if (d == 0) {
			System.out.println("0");
		} else {
			for (int i = employees.length-1 ; employees.length - i <= k && i >= 0 ; i--) {
				cost += employees[i].y;
				//System.out.println(cost);
				if (cost >= d) {
					System.out.println(employees.length - i);
					for (int j = employees.length-1 ; j >= i ; j--) {
						System.out.println(employees[j].x + ", YOU ARE FIRED!");
					}
					return;
				}
			}
			
			System.out.println("impossible");
		}
	}
}

class Point {
	public String x;
	public int y;
	
	Point(String x, int y) {
		this.x = x;
		this.y = y;
	}
}
		
		
		/*
		fire(salaries, new boolean[n], 0, 0, d, k, 0);
		
		if (numFired == 0) {
			System.out.println("impossible");
		} else {
			System.out.println(numFired);
			for (int j = 0 ; j < employees.length ; j++) {
				//System.out.println(employees[j]);
				if (employees[j]) {
					System.out.println(names[j] + ", YOU ARE FIRED!");
				}
			}
		}
	}
	
	
	public static void fire(int[] salaries, boolean[] chosen, int index, int inc, int d, int k, int cost) {
		if (inc <= k && (numFired == 0 || inc < numFired) && cost >= d) {
			employees = new boolean[chosen.length];
			numFired = inc;
			for (int q = 0 ; q < chosen.length ; q++) {
				employees[q] = chosen[q];
			}
			return;
		} 
		
		if (index < salaries.length && inc < k) {
			chosen[index] = true;
			fire(salaries, chosen, index+1, inc+1, d, k, cost + salaries[index]);
			chosen[index] = false;
			fire(salaries, chosen, index+1, inc, d, k, cost);
		}
	}
	
}
	*/


/*
5 2000 3
John 999
Lyndon 450
Richard 1234
Jimmy 300
Gerald 1001

3 5555 2
Ronald 1000
George 2000
Bill 3000

*/