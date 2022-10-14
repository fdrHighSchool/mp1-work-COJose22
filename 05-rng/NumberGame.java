import java.util.Random;
import java.util.Scanner;

public class NumberGame {
  public static void main(String[] args) {
    Random rand = new Random();
    int int_random = rand.nextInt(100);
    Scanner input = new
    Scanner(System.in);
    int guess;
    boolean win = false;

    while (win == false) {
    System.out.println("Guess a number between 1 and 100; ");
      guess = input.nextInt();
      if (guess == int_random) {
        win = true;
        System.out.println("You got it!");
      }
      else if (guess < int_random) {
        System.out.println("You have to guess higher");
      }
      else if (guess > int_random) {
        System.out.println("You have to guess lower");
      }
    }
  }
}