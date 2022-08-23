package javabasics;

public class ClassBasics {

	public static void main(String[] args) {
		final int arr[] = {1,3,4,5};
		arr[0] = 5;
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
		final Student s1 = new Student();
		final Integer i = 3;
		final int a = i;
		System.out.println(i.doubleValue());
		Student s2 = new Student();
		s2 = s1;
		System.out.println(s2);
		Integer m = 10;
		Integer n = 20;
		s2.swapIDs(m, n);
		System.out.println(m+" "+n);
		s1.name = "Avinash";
		s1.id = 765;
		s1.name = "Kunal";
		
		System.out.println(s2.name);

	}
	
	

}

class Student{
	String name;
	int id;
	String country = "India";
	
	public void swapIDs(Integer a,Integer b) {
		Integer temp = a;
		a = b;
		b = temp;
		System.out.println(a+" "+b);
	} 
	
	@Override
	public String toString() {
		return "Hey There";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Unused Object destroyed");
		super.finalize();
	}
}
