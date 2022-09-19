/**
 *  Java Basic. Homework #4
 * 
 * @author Shvets Anton
 * @todo 17.09.22
 * @date  19.09.22
 */

import java.util.Random;
import java.util.Scanner;
 
class dz4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int guess = -1;


        do {
 
        number = random.nextInt();
        for (int i = 0; i < 3; i++ ) {
        System.out.print("Guess the number [0..9]: ");
        guess = scanner.nextInt();
        if (guess < number){
        System.out.println("Your number is less");
        } else if (guess > number) {
            System.out.println("Your number is bigger");
        } else {
            System.out.println("Your win, you guess my number");
        break;
        }
        }
        if (number != guess) {
            System.out.println("You lose.");
        }
            System.out.println("Repeat the game? Yes-1 No-2");
        } while ( scanner.nextInt() == 1);
    }
}
