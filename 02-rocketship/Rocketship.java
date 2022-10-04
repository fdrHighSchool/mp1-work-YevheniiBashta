        
/**
 * Rocketship assignment
 *
 * @Yevhenii Bashta
 * @10/03
 */
class Rocketship {
  public static void main(String[] args) {
  double hour = 22.0;
  double minute = 35.0;
  double second = 40.0;
  double ssm = (hour * 60.0 * 60.0) + (minute * 60.0) + second;
  double srd = (24.0 * 60.0 * 60.0) - ((hour * 60.0 * 60.0) + (minute * 60.0) + second);
  double pfp = ((hour * 60.0 * 60.0) + (minute * 60.0) + second) / (((24.0 * 60.0 * 60.0) / 100.0));
  System.out.println("Seonds since midnight = " + ssm);
  System.out.println("Seconds remaining in the day = " + srd);
  System.out.println("Percentage of the day passed = " + pfp + " %");
  }
}