package assignment2;

import java.util.Scanner;

public class Assignment2 {

		public static void main(String[] args) {
			
			//1.Ask the USER for a string (it should print "Enter your First Name and Last Name”)
			//a.assume the user enters "His/her name"
				System.out.println("Enter Your Name");
				Scanner sc = new Scanner(System.in);
				String name = sc.next();
				System.out.println(name);
				
			//2.Convert that string to all uppercase and print it (it should print the input in uppercase)
				System.out.println(name.toUpperCase());
				
			//3.Print the length of that string (it should print as per the input given by user)
				System.out.println(name.length());
				
			//4.Replace 'y’ with ‘i’ (it should print as per the user input)
				String newname = name.replace("y", "i");
				System.out.println(newname);
				
			//5.Give the last char of the string (it should print last character of the input)
				int allchar = newname.length();
				String lastchar = newname.substring(allchar-2);
				System.out.println(lastchar);
				
			//6.Concatenate the string from step 1 with string "Test" (it should print User name +"Tester”)
				System.out.println(name + " Tester");
				
				System.out.println(name.charAt(5));
				
				
			

	}

}
