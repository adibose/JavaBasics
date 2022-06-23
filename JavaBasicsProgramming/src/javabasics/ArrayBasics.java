package javabasics;

public class ArrayBasics {

	public static void main(String[] args) {
		int d[][] = {
				{1,2,3,4},
				{4,5,7},
				{8,9,20,11,12,13}
		};
		
		
		for(int i[]:d) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}

}
