package javabasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		int [][]a = {
				{0,0,0,0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0,0,0,0}
		};
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]= sc.nextInt();
			}
		}
		
		for(int[] i:a) {
			System.out.println(Arrays.toString(i));
			
		}
		
	}

}
