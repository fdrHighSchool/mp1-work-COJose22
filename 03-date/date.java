
/**
 * Write a description of class date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    import java.util.Scanner;
    
    public class date
    {
            public static void main(String[] args) {
                Scanner x = new Scanner(System.in);
                
                System.out.println("enter the day of the week: ");
                String day = x.nextLine();
                
                System.out.println("enter the mouth: ");
                String mouth = x.nextLine();
                
                System.out.println("enter the year: ");
                String year = x.nextLine();
                
                System.out.println("enter the day of the mouth: ");
                String dayOfMouth = x.nextLine();
                
                System.out.println("American format: " + day + ", " + mouth + " " + dayOfMouth + ", " + year);
                
                System.out.println("European format: " + day + " " + mouth + " " + dayOfMouth + " "+ year);
        } 
    }