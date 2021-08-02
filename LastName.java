package RegexJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {

	static String regexNamePattern="^[A-Z][a-zA-Z]{2,}$";
	public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        firstNameCheck();
        secondNameCheck();
	}
	
	private static void secondNameCheck() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Enter the Valid Last Name: " );
        String  lName = s.next();
        boolean check = Pattern.matches(regexNamePattern, lName);
        if (check)
            System.out.println("Last Name is Validated");
        else
            System.out.println("Incorrect Last Name,Try Again");
	}

	public static void firstNameCheck(){
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter the Valid First Name: " );
        String  fName = s.next();
        boolean check = Pattern.matches(regexNamePattern, fName);
        if (check)
            System.out.println("First Name is Validated");
        else
            System.out.println("Incorrect First Name, Try Again");
       
	}
}	
	    
