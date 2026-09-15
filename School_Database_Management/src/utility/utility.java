package utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class utility {

    // For int
    public static int readInt(Scanner sc, String message) {

        while (true) {
            try {
                System.out.print(message);
                int value = sc.nextInt();
                sc.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
            }
        }
    }


    // For double
    public static double readDouble(Scanner sc, String message) {

        while (true) {
            try {
                System.out.print(message);
                double value = sc.nextDouble();
                sc.nextLine();
                return value;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Enter a decimal number.");
                sc.nextLine();
            }
        }
    }


    // For String_word
    public static String readString_word(Scanner sc, String message) {

        while (true) {
            System.out.print(message);
            String value = sc.nextLine();

            if (value.trim().isEmpty()) {
                 System.out.println("Cannot be empty ! Enter a word ");
            }
			else if(!value.matches("[a-zA-Z]+")){
			     System.out.println("Numbers not accepted ");
		    }
            else{
			    return value;
			}
			}
			}
			
	 // For String_number
	 public static String readPhone_number(Scanner sc, String message) {
	     
		 while (true) {
		     System.out.println(message);
			 String value = sc.nextLine();
			 
			 if(value.matches("[0-9]{10}")) {
			     return value;
			 }
			 
			 System.out.println("Phone number should be 10 digits");
			 
			 }
		}
            
}