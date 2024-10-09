import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        boolean valid = false;
        int num = (int) (Math.random() * 10) + 1;
        int guess = 0;

        System.out.println("Welcome! Let's play a game. \nTry to guess my number!");
        do {
            System.out.println("Enter a number 1-10:");
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                if (guess >= 1 && guess <= 10) {
                    valid = true;
                } else {
                    System.out.println("You have entered an invalid value. Please try again.");
                }
            } else {
                System.out.println("You have entered an invalid value. Please try again.");
            }
            scan.nextLine();
        } while (!valid);

        System.out.println("My number was " + num + ".");
        if (guess == num) {
            System.out.println("You got it right!");
        } else if (guess > num) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
    }
}