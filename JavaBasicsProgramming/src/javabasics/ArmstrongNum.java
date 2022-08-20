package javabasics;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
			checkArmstrong(sc.nextInt());

	}

	private static void checkArmstrong(int num) {
		int rem = 0;
		int sum = 0;
		int i = num;
		while(i>0) {
			rem = i%10;
			sum += rem*rem*rem;
			i /= 10;
			}
		if(sum==num) {
			System.out.println("It is an Armstrong Number");
		}else {
			System.out.println("It is not an Armstrong Number");
		}
		
	}

}
