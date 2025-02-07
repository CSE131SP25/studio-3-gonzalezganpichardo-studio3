package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Choose a number between 1 to n?");
		int n = in.nextInt();

		boolean primes[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			primes[i] = true;

		}

		for (int i = 2; i <= n; i++) {
			
			for (int j = i * 2; j < primes.length; j = j + i ) {
				primes[j] = false;
				//j += n;
				

			}
			
				}
		for (int i = 0; i <= n; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			
			}
		}
	}
}
