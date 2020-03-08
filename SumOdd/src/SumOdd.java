public class SumOdd {


  public static boolean isOdd(int number) {

    if(number < 0) {
      return false;
    } else {
      if(number % 2 == 0) {
        return false;
      }
    } return true;
  }

  public static int sumOdd(int start, int end) {

    int sumNum = 0;

    if(end < start || start < 0 || end <0) {
      return -1;
    }
    for(int i = start; i <= end; i++) {

      if (isOdd(i)) {
        sumNum += i;

      }
    }
    return sumNum;
  }

}
