package javabasics;

import java.util.Arrays;

public class Shadowing {
	static int x = 50;
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x);
		int a[]= {3,6,9,12,15};
		System.out.println(Arrays.toString(a));
		fun(1,3,4,6,9);

	}
	
	
	static void fun(int ...v) {
		System.out.println(x);
		//for(int a:v) {
			System.out.print(Arrays.toString(v)+" ");
		//}
	}

}
