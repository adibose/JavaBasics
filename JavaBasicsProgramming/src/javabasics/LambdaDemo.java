package javabasics;

@FunctionalInterface
interface F{
	void show();
	
	//can be overridden
	default void display() {
		System.out.println("Method implementation inside interface");
	}
}


class Fimpl implements F,Runnable{

	@Override
	public void show() {
			System.out.println("Inside class");
		}
	
	
	public void display() {
		System.out.println("Inside class Fimpl");
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
		
	}
	

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lambda Expression
		F f = () -> System.out.println("Learning Lambda!!!!");

		
		f.show();
		f.display();
	}

}
