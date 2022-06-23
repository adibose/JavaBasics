package javabasics;

class Counter{
	 static int count = 0;
	
	public synchronized void increment() {
		count++;
	}
}


public class ThreadSynchronization {

	public static void main(String[] args) throws Exception {
		
		Counter c  = new Counter();
		
		Thread t1 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=0;i<1000;i++) {
				c.increment();
			}
		});
		
		t1.start();
		//Thread.sleep(5);
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.print("Final Counter Value is :"+Counter.count);

	}

}
