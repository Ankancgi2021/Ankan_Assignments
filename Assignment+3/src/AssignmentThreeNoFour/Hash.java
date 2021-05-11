package AssignmentThreeNoFour;

// Java program to demonstrate
// adding elements to Hashtable

import java.io.*;
import java.util.*;

class Hash {
	public static void main(String args[])
	{
		// No need to mention the
		// Generic type twice
		Hashtable<String, String> ht1 = new Hashtable<>();

	
		// Inserting the Elements
		// using put() method
		ht1.put("2017-05-21", "A");
		ht1.put("2018-03-09", "B");
		ht1.put("2018-03-15", "C");


		// Print mappings to the console
		System.out.println("Mappings of ht1 : " + ht1);
	}
}
