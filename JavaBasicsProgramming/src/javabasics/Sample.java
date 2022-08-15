package javabasics;

import java.util.Scanner;

public class Sample {

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        
        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }
        int i = 0;
        while(i<N) {
        		
        		while(sum(data[i])%4!=0) {
        		//int sum = sum(data[i]);
        		data[i]=data[i]+1;
        		}
        		System.out.println(data[i]);
        		i++;
        	}
        	

        return;
    }

	private static int sum(int i) {
		int s = 0;
		while(i>0) {
			s+=i%10;
			i=1/10;
		}
		return s;
	}
	

}
