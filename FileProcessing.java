//Michael Jay Marajas
//COP 2805C

import java.io.File;  
import java.io.FileNotFoundException;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileProcessing {
		
public void mainMethod() throws FileNotFoundException{  
		// Creating a file object for the sorted output text file
		PrintStream o = new PrintStream(new File("C:\\Users\\steel\\eclipse-workspace\\FileProcessing\\src\\sortedresults.txt")); 
		
		 // Store the System.out before you assigned it a new value
        PrintStream console = System.out; 
        
		Scanner file = null;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			file = new Scanner(new File("C:\\Users\\steel\\eclipse-workspace\\FileProcessing\\src\\readandsort.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Actual algorithm to record the integers
		while(file.hasNext()){
			if (file.hasNextInt()) list.add(file.nextInt());
			else file.next();
		}
		
		//Collections sort method to sort the integers
		Collections.sort(list);
		
		//Prints the sorted list to the console
		for (Integer i: list) 
			System.out.println(i);
		
		//Sets the Output to the PrintStream to set the output to a text file
		System.setOut(o);
		for (Integer i: list) 
			System.out.println(i);
			
		return;
		}
	}

