package javabasics;

import java.util.Arrays;
import java.util.TimeZone;

public class StringBasics {

	public static void main(String[] args) {
//		String a = new String("Aditya");//creates a new string object and it won't be in the string pool
//		String b = new String("Aditya");//creates a new string object and it won't be in the string pool
//		
//		String c = "Bose";
//		String d = "Bose";
//		
//		System.out.println(a==b);// will print false because == operator checks whether both the variables point to the same object
//		System.out.println(c==d);// will print true because variables c and d point to the same String object - "Bose" in the string pool
//		
//		c = a;
//		d = b;
//		
//		System.out.println(a==c);
//		System.out.println(d==b);
//		
//		System.out.println(a.equals(b));// this will only compare the values of the 2 variables and thus will print true
//		
//		System.out.println(Arrays.toString(new int[] {1,2,3,4,5}));
//		System.out.println(5);
//		
//		System.out.printf("Hi, I am %s and I wish to be very %s","Shiladitya","rich");
//		System.out.println();
//		System.out.printf("Sum of 3 + 5 is : %d",3+5);
//		System.out.println();
		
//		StringBuilder sb = new StringBuilder();
//
//		for(int i=0;i<26;i++) {
//			char c = (char)('A' + i);
//			sb.append(c+" ");
//			
//		}
//		System.out.println(sb);
		
		String str = "Shiladitya Bose";
		StringBuilder sb = new StringBuilder();
		char []ch = str.toCharArray();
		for(int i=0;i<ch.length;i+=2) {
			sb.append(ch[i]);
		}
		
		System.out.println(sb.toString());
	}

}
