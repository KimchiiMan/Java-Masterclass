public class main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        //for(init; condition; increment) {}
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for(double i=1.0; i<9; i++) {
            System.out.println("10,000 at " + i + " interest = " + calculateInterest(10000.0, i));
        }

        for(double i=8.0; i>=2; i--) {
            System.out.println("10,000 at " + i + " interest = " + calculateInterest(10000.0, i));
        }

        int count = 0;
        for(int i=1; i<100; i++) {
            if(isPrime(i)){
                System.out.println(i + " is a prime number");
                count += 1;
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
