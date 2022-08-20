package javabasics;

import java.util.ArrayList;

public class ArrayListBasics {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(6);
		arr.add(3);
		arr.add(7);
		arr.add(1);
		
		
		System.out.println(arr.toString());
		
		System.out.println("Max value is : "+getMax(arr));
		String a = arr.toString();
		reverseArray(arr);
		
		System.out.println(arr.toString());
	

	}

	private static int getMax(ArrayList<Integer> arr) {
		int max = arr.get(0);
		for(int i : arr) {
			if(max<i) {
				max = i;
			}
		}
		
		return max;
		
	}
	
	private static void reverseArray(ArrayList<Integer> arr) {
		int start = 0;
		int end = arr.size() -1;
		
		while(start<=end) {
			int temp= arr.get(start);
			arr.set(start, arr.get(end));
			arr.set(end, temp);
			start++;
			end--;
		}
		
		
	}

}
