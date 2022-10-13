
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Hello user, are you a Teacher or a Student? ");
    String answer = s.nextLine();
    if (answer.equalsIgnoreCase("student")) {
      System.out.print("Enter your first name: ");
      String firstName = s.nextLine();
      System.out.print("Enter your last name: ");
      String lastName = s.nextLine();
      System.out.println("Enter you favorite number: ");
      int favNumber = s.nextInt();
      System.out.println("Your username is:  " + sInitial1(firstName.toLowerCase()) + sInitial2(lastName.toLowerCase()) + favNumber + "@nycstudents.net");

      s.close();

    }
    else {
      System.out.print("Enter your first name: ");
      String firstName = s.nextLine();
      System.out.print("Enter your last name: ");
      String lastName = s.nextLine();
      System.out.println("Enter you favorite number: ");
      int favNumber = s.nextInt();
      System.out.println("Your username is:  " + tInitial1(firstName.toLowerCase()) + tInitial2(lastName.toLowerCase()) + favNumber + "@schools.nyc.gov");

      s.close();

    }
  }
  public static String sInitial1 (String n){
    return n;
  }
  public static String sInitial2 (String p){
    return p.substring(0, 1);
  }
  public static String tInitial1 (String q){
    return q.substring(0,1);
  }
  public static String tInitial2 (String w){
    return w;
  }
}
