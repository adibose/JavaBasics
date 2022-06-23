package javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Stud implements Comparable<Stud>{
	int marks;
	String name;
	public Stud(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	public int compareTo(Stud s) {
		// TODO Auto-generated method stub
		return name.length()>s.name.length()?1:-1;
	}
	@Override
	public String toString() {
		return "Stud [marks=" + marks + ", name=" + name + "]";
	}

	
	
	
	
}

public class Collections_Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stud> students = new ArrayList<>();
		
		students.add(new Stud(65,"Mason"));
		
		students.add(new Stud(75,"Yulia"));
		
		students.add(new Stud(35,"Aditya"));
		
		Collections.sort(students,(i,j)->i.name.charAt(1)>j.name.charAt(1)?1:-1);
		
		
		for(Stud s: students) {
			System.out.println(s);
		}
		

	}

}
