package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n = 5;
		int count =0;
		
		for (int i = 1; i <= n; i++) {
			
			if (n%i==0) {
				count++;
			}
			
		}
		
		if (count==2) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}
}
	

