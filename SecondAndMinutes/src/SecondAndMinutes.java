public class SecondAndMinutes {

  private static final String INVALID_VALUE_MESSAGE = "Invalid value";

  public static String getDurationString (int minutes, int seconds) {
    if(minutes < 0 || ((seconds < 0) || seconds > 59)) {
      return INVALID_VALUE_MESSAGE;
    }
    int hours = minutes / 60;
    minutes = (minutes % 60) + (seconds / 60);
    seconds = seconds % 60;

    return hours + "h " + minutes + "m " + seconds + " s" ;
  }

  public static String getDurationString (int seconds) {
    if(seconds < 0) {
      return INVALID_VALUE_MESSAGE;
    }
    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;

    return getDurationString(minutes,remainingSeconds);
  }









  public static String getDurationString1 (int min, int sec) {

    if (min >= 0 && sec >= 0 && sec <= 59)
    {

    }
    return "Invalid value";
  }



//   Create a method called getDurationString with two parameters, first parameter is minutes
//   and 2nd parameter is seconds
//   You should validate that the first parameter minutes is >= 0.
//   You should validate that the 2nd parameter seconds is >= 0 and <= 59.
//   Return "Invalid value" in the method if either of the above is not true
//   If the parameters are valid then calculate how many hours minutes and seconds
//   comprise the minutes and seconds passed to this method and return that value
//   as string in format "XXh XXm XXs" where XX represents a number of hours minutes and seconds
//
//
//   Create a 2nd method of the same name but with only one parameter seconds
//   Validate that it is >= 0, and return "invalid value" if it is not ture
//   If it is valid, then calculate how many minutes are in the seconds and then
//   call the other overloaded method passing the correct minutes and seconds calculated so
//   that it can calculate correctly
//   call both methods to print values in main method
//
//   Tips:
//   Use int or long for your number data types is probably a good idea
//   Methods should be static currently we are only using static methods
}
