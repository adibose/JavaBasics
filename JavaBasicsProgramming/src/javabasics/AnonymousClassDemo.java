package javabasics;


interface FI{
	void show();
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Anonymous Class
		FI f = new FI() {
			public void show() {
				System.out.println("Functional Interface baby!!!!");
			}
		};
		
		f.show();
	}

}
