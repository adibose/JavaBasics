package javabasics;
public class ThreadBasicsWithLambda {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
			
		});
		Thread t2 = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
			
		});
		
		
		t1.start();
		//try {Thread.sleep(200);} catch (InterruptedException e) {}
		t2.start();

		

	}

}
