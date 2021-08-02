package RegexJava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SampleEmail {

	static String regexNamePattern="^[A-Z][a-zA-Z]{2,}$";
	static String regexEmailPattern="^[A-Za-z0-9+_.-]+@[A-Za-z.-]+$";
	static String regexPhoneNumberPattern="^[0-9]{2}[\s]?[0-9]{10}$";
	static String regexPasswordPattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
	
	public static void main(String[] args) {
        System.out.println("Welcome to User Registration Program");
        firstNameCheck();
        secondNameCheck();
        emailCheck();
        phoneNumberCheck();
        passwordCheck();
        String[] emailArray= {"abc@yahoo.com","abc-100@gmail.co.in","abc()*@gmail.com","abc@%*.com"};
        emailSamplerCheck(emailArray);
	}
	
	private static void emailSamplerCheck(String[] mail0) {
		for(String m: mail0) {
		boolean check = Pattern.matches(regexEmailPattern, m);
        if (check)
            System.out.println("Email-ID is Validated");
        else
            System.out.println("Incorrect Email-ID,Try Again");
		}
	}

	private static void passwordCheck() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Enter the Valid Password: " );
        String  pwd = s.next();
        boolean check = Pattern.matches(regexPasswordPattern, pwd);
        if (check)
            System.out.println("Phone Number is Validated");
        else
            System.out.println("Incorrect Phone Number,Try Again");
	}

	private static void phoneNumberCheck() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Enter the Valid Phone Number: " );
        String  number = s.next();
        boolean check = Pattern.matches(regexPhoneNumberPattern, number);
        if (check)
            System.out.println("Phone Number is Validated");
        else
            System.out.println("Incorrect Phone Number,Try Again");
		
	}

	private static void emailCheck() {
		Scanner s = new Scanner(System.in);
    	System.out.print("Enter the Valid Email-ID: " );
        String  mail = s.next();
        boolean check = Pattern.matches(regexEmailPattern, mail);
        if (check)
            System.out.println("Email-ID is Validated");
        else
            System.out.println("Incorrect Email-ID,Try Again");
		
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

	private static void firstNameCheck(){
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
	    

