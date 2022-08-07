package javabasics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long prime = sc.nextLong();
		
		sc.close();
		
		int c=2;
		while(c*c<=prime) {
			if(prime%c==0) {
				System.out.println("Not prime");
				break;
			}
			c+=1;
		}
		if(prime%c!=0) {
		System.out.println("Prime");
		}
		
		

	}

}
