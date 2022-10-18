
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
int password = 0;
    if (answer.equalsIgnoreCase("student")) {
      System.out.println("Your username is:  " + firstName.toLowerCase() + sInitial(lastName.toLowerCase()) + favNumber + "@nycstudents.net");
      System.out.println("Here is your unique password: " + generatePassword(password));
      s.close();
    } else {
      System.out.println("Your username is:  " + tInitial(firstName.toLowerCase()) + lastName.toLowerCase() + favNumber + "@schools.nyc.gov");
        System.out.println("Here is your unique password: " + generatePassword(password));
        s.close();
      }
  }

  public static String sInitial(String p) {
    return p.substring(0, 1);
  }
  public static String tInitial(String q) {
    return q.substring(0, 1);
  }


  public static String generatePassword(int  length) {
    String password = " ";
  for (length = 0; length < 16; length++) {
    //
    int variableType = (int) (Math.random() * 3 + 1);
    // 
    if ( variableType==1) {
      int rNum = (int)(Math.random()*10+1);
      password = password + rNum;
    }
    // 
    else if (variableType==2) {
      int rNum = (int)(Math.random()*2+1);
      if (rNum==1) {
        int min = 65;
        int max = 90;
        int rUpperChar = (int)(Math.random()*(max-min+1)+min);
        char upperChar = (char)rUpperChar;
        password = password + upperChar;
      }
      else {
        int min = 97;
        int max = 122;
        int rLowerChar = (int)(Math.random()*(max-min+1)+min);
        char lowerChar = (char)rLowerChar;
        password = password + lowerChar;
      }
    }
    else {
      int min = 33;
      int max = 47;
      int rSpecialChar = (int)(Math.random()*(max-min+1)+min);
      char specialChar = (char)rSpecialChar;
      password = password + specialChar;
    }
   }
    return password;
  }

}

