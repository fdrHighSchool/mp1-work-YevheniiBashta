
/**
 * Write a description of class LanternFly here.
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
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("Are you really that weak? ");
            String word = input.nextLine();
              if (word.equals("Yes")) {
                 System.out.println("Well...");
              }
             else if (word.equals("No")) {
                 System.out.println("You can do better than that!");
              }
              else {
                System.out.println("Cmon, you gotta do something");
            }
        } // end if statement
        else if (num > 10) {
            System.out.println("Thanks for doing your part");
        } // end 2nd if statement
    
         else if ( num == 10 ) {
           System.out.println("Hmmmmmmmm, I guess you're good... ");
        }
        // end of 3ed if statement
        else
            System.out.println("Why are u writing that??? ");
        // end of else statement
        
    } // end main method

} // end class