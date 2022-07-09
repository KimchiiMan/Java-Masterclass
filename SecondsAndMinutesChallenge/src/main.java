public class main {
    public static void main(String[] args) {
        System.out.println(getDurationString(210, 45));
        System.out.println(getDurationString(255));
    }
    private static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
