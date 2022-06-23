package javabasics;

class Hi implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
	}

}

class Hello implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
		
	}
	
}


public class ThreadBasics {

	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = new Hi();
		Runnable obj2 = new Hello();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		//try {Thread.sleep(200);} catch (InterruptedException e) {}
		t2.start();
		
		t1.join();
		
		System.out.println("Bye");

		

	}

}
