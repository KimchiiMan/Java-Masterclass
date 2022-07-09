public class SpeedConverter {
    public static long toMilesPerHour(Double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("That's an invalid value!");
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(Double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("That's an invalid value!");
        } else {
            long milesPerHour =  toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
