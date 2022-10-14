
/**
 * Write a description of class Username here.
 *
 * @author Jose_O
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Are you a student or teacher: type in student or teacher: ");
    String role = s.nextLine();
    System.out.print("Enter your favorite number: ");
    int num = s.nextInt();
    if (role.equals("student")) {
        System.out.println((firstName) + initialize(lastName) + (num) + "@nycstudents.net");
        s.close();
    }//end of if
    else if (role.equals("teacher")) {
        System.out.println(initialize(firstName) + (lastName) + (num) + "@schools.nyc.gov");
        s.close();
    }// end of else if
}// end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class
