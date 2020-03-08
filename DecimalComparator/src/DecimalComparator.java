public class DecimalComparator {
  public static boolean areEqualByThreeDecimalPlaces(double deciNum1, double deciNum2) {
    return (int)(deciNum1 * 1000) == (int)(deciNum2 * 1000);
  }
}
