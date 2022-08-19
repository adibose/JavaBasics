package javabasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long prime = sc.nextLong();

		System.out.println(isPrime(prime));

		sc.close();
	}

	private static boolean isPrime(long prime) {
		if(prime<=1) {
			return false;
		}
		int c = 2;
		while(c*c<=prime) {

			if(prime%c==0) {
				return false;
			}
			c++;
		}

		return true;

	}

}
