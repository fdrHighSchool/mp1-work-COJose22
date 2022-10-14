
/**
 * Write a description of class Lanternfly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many threats did you kill this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("Bruh moment, you can do better than that!");
        } // end if statement
        if (num > 30) {
            System.out.println("Daaaaannnngg!!, you diserve a metal for doing such a thing");
        }
        else {
            System.out.println("Hey, thats epic, thanks for doing your part");
        } // end else statement
    } // end main method
} // end class
