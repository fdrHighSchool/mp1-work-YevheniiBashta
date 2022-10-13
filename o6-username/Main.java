
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Hello user, are you a Teacher or a Student? ");
    String answer = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.println("Enter you favorite number: ");
    int favNumber = s.nextInt();
    if (answer.equalsIgnoreCase("student")) {
      System.out.println("Your username is:  " + firstName.toLowerCase() + sInitial(lastName.toLowerCase()) + favNumber + "@nycstudents.net");
      s.close();
    }
    else {
      System.out.println("Your username is:  " + tInitial(firstName.toLowerCase()) + lastName.toLowerCase() + favNumber + "@schools.nyc.gov");
      s.close();

    }
  }

  public static String sInitial (String p){
    return p.substring(0, 1);
  }
  public static String tInitial (String q){
    return q.substring(0,1);
  }
}
