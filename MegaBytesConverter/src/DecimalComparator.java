public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        int int1 = (int) (val1 * 1000);
        int int2 = (int) (val2 * 1000);
        if (int1 == int2){
            System.out.println("Values are equal");
            return true;
        } else {
            System.out.println("Invalid Value");
            return false;
        }
    }
}
