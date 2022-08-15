package javabasics;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		System.out.print("Enter a fruit : ");
		Scanner sc = new Scanner(System.in);
		
		String fruit = sc.next().toLowerCase();
		
		switch(fruit) {
		case "mango" -> System.out.println("It is the king of fruits");
		case "apple" -> System.out.println("This fruit a day, keeps doctor away");
		case "orange" -> System.out.println("This fruit is famous in Nagpur and Darjeeling");
		case "litchi" -> System.out.println("Looks like strawberry and is generally produced during mango season");
		default -> System.out.println("Please enter a valid fruit");
		}
		
		System.out.print("Enter a day : ");
		int day = sc.nextInt();
		switch(day) {
		case 1,2,3,4,5 -> System.out.println("Keep on working as it is a weekday");
		case 6,7 -> System.out.println("Have fun!!! as it is weekend");
		}

	}

}
