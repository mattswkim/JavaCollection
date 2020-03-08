public class Main {

  public static void main(String[] args) {
    String result = SecondAndMinutes.getDurationString(61,30);
    System.out.println(result);

    System.out.println(SecondAndMinutes.getDurationString(3600));
  }
}
