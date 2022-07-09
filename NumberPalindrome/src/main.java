public class main {
    public static void main(String[] args) {
        if(isPalindrome(111))
            System.out.println("Is a Palindrome");
    }

    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number *= -1;
        }
        int reverse = 0;
        int stored = number;
        while(stored != 0) {
            int lastDigit = stored % 10;
            reverse = reverse * 10 + lastDigit;
            stored /= 10;
        }
        if(number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
