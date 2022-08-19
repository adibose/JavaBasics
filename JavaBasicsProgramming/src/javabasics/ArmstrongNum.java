package javabasics;

public class ArmstrongNum {

	public static void main(String[] args) {
		
		for(int i = 100;i<=999;i++) {
			checkArmstrong(i);
		}

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
			System.out.println(sum);
		}
		
	}

}
