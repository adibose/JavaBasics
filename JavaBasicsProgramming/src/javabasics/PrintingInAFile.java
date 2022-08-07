package javabasics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintingInAFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\shila\\OneDrive\\Documents\\IT Returns\\Output.txt");
		PrintStream stream = new PrintStream(file);
		System.setOut(stream);
		System.out.println("O maaa turu love");
		
		


	}

}
