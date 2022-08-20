package javabasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\shila\\OneDrive\\Documents\\IT Returns\\Output.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			String data = sc.nextLine();
			System.out.println(data);
		}
		

	}

}
