package javabasics;


class Cemo{
	int a;
	String b;
	
	static String ceo;
	
	static void display() {
		System.out.println("Inside 1");
		
	}
	
	
	static {
		ceo = "Larry";
		System.out.println("Inside B");
		
	}
	
	static {
		ceo = "Larry";
		System.out.println("Inside A");
		
	}
	

	
	
}



public class Sample {

	public static void main(String[] args) {
	
		Cemo c = new Cemo();
		Cemo.display();

	}

}
