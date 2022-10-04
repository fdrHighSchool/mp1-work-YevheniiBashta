
/**
 * Think Java; Chapter 2, Exercise 2 with input.
 *
 * @Yevhenii Bashta
 * @09/28/2022
 */

import java.util.Scanner;

public class Date
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print ("enter the day of the week: ");
        String day = s.nextLine();
        System.out.print ("enter the date of the month: ");
        String number = s.nextLine();
        System.out.print ("enter the month of the year: ");
        String month = s.nextLine();
        System.out.print ("enter the year: ");
        String year = s.nextLine();
        
        s.close();
        
        System.out.println("American format: " + day + ", " +  month + " " + number + ", " + year);
        System.out.println("European format: " + day + " " + number + " " + month + " " +  year);
        
    } //end of main class
 } //end of class