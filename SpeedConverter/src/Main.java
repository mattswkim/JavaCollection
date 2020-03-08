public class Main {

  public static void main(String[] args) {
//    SpeedConverter.printConversion(100);

//    int mySpeed = 100;
//
//    int mySpeedInMiles = (int) (mySpeed / 1.6);
//
//    System.out.println("mySpeed: " + mySpeed + " km/h in Miles : " + mySpeedInMiles + " m/h");
//
//    mySpeed = 120;
//    mySpeedInMiles = (int) (mySpeed / 1.6);
//
//    System.out.println("mySpeed2: " + mySpeed + " km/h in Miles : " + mySpeedInMiles + " m/h");


//    System.out.println(randString("Dennis"));

    String myNewStr = randString("Jason");

    System.out.println(myNewStr);

    int randNum = 1;

    System.out.println(randomMethod());

  }

  public static int randomMethod() {
    int randNum = 12;
    int newRand = randNum + 21;
//    System.out.println(newRand);
    return newRand;
  }
  public static String randString(String name) {

    String myStr = "Welcome back, " + name;

    return myStr;
  }

}
