public class main {
    public static void main(String[] args) {
        System.out.println(sumDigits(123));
    }

    public static int sumDigits(int number) {
        if(number <= 10) {
            return -1;
        }
        int mySum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            mySum += lastDigit;
            number /= 10;
        }
        return mySum;

    }
}
