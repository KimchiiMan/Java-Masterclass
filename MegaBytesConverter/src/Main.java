public class Main {
    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);

        if(BarkingDog.shouldWakeUp(true, 7))
            System.out.println("Yes, you should wake up.");

        LeapYearCalculator.isLeapYear(2400);

        DecimalComparator.areEqualByThreeDecimalPlaces(3.21, 3.113);

        TeenNumberChecker.hasTeen(13, 14, 19);
        TeenNumberChecker.isTeen(13);
    }
}
