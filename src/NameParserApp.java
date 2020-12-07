
/*
 * Author:   Amanda Martel
 * Date:     11/24/2020 
 *
 * Filename:   NameParserApp.java
 * Program will ask user for their name and parse the strings to display the name.   
 * 
 */

import java.util.Scanner; //import Scanner class 

public class NameParserApp { //create NameParserApp class 

    public static void main(String[] args) { //create main method 
        Scanner sc = new Scanner(System.in); //create new scanner object named sc

        //promt user to enter a name 
        System.out.print("Enter a name: ");
        //create name variable 
        String name = sc.nextLine(); 
        //print blank line 
        System.out.println();
        name = name.trim(); //remove spaces before and after name variable 
        
        int index1 = name.indexOf(" "); //create index1 
        if (index1 == -1) {
            System.out.println("Name not in valid format."); //print error message 
        }
        else {
            int index2 = name.indexOf(" ", index1 + 1); //create index2
            if (index2 == -1) {
               String firstName = name.substring(0 , index1); //create firstName variable
               String lastName = name.substring(index1 + 1); //create lastName variable 
               
               //print first name and last name 
               System.out.println("First Name: " + firstName);
               System.out.println("Last Name: " + lastName);               
               
            }
            else {
            int index3 = name.indexOf(" ", index2 + 1); //create index3 
            if (index3 == -1) {
               String firstName = name.substring(0 , index1); //create firstName variable 
               String middleName = name.substring(index1 + 1, index2); //create middle name variable 
               String lastName = name.substring(index2 + 1); //create last name variable 
               
               //print first, middle, and last names 
               System.out.println("First Name: " + firstName);
               System.out.println("Middle Name: " + middleName);
               System.out.println("Last Name: " + lastName);
            }
            else {
                //print error message 
               System.out.println("Name not in valid format.");
            }
            }
        }
    }
}
