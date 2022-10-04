
/**
 * Random number game v1
 *
 * @Yevhenii Bashta
 * @10/03
 */
import java.util.Random;
import java.util.Scanner;

public class RNG {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 ( including both ). Can you guess what it is? ");
        Scanner g = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = g.nextInt();
        System.out.println("Your guess is: " + num);
        System.out.println("The number I was thinking of is: " + number);
        if ( num > number) {
          int one = ( num - number);
          System.out.println("You were off by " + one);
          }
        else {
          int two = ( number - num);
          System.out.println("You were of by " + two);
         }
    }   
}