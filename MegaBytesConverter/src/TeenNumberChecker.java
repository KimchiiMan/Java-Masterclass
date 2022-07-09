public class TeenNumberChecker {
    public static boolean hasTeen(int val1, int val2, int val3) {
        boolean checkVal1 = val1 >= 13 && val1 <= 19;
        boolean checkVal2 = val2 >= 13 && val2 <= 19;
        boolean checkVal3 = val3 >= 13 && val3 <= 19;
        if(checkVal1 || checkVal2 || checkVal3) {
            System.out.println("hasTeen: is teen");
            return true;
        } else {
            System.out.println("Invalid Value");
            return false;
        }
    }

    public static boolean isTeen(int val1) {
        return hasTeen(val1,val1,val1);
    }
}
