public class main {
    public static void main(String[] args) {
        isLeapYear(2000);
        getDaysInMonth(2, 2018);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Invalid Value");
            return false;
        } else {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println("Is leap year");
                return true;
            } else {
                System.out.println("Is not a leap year");
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid Value");
            return -1;
        } else {
            switch(month) {
                case (1):
                    System.out.println("January has 31 days");
                    return 31;
                case (2):
                    if (isLeapYear(year)) {
                        System.out.println("February has 29 days (leap year)");
                        return 29;
                    } else {
                        System.out.println("February has 27 days");
                        return 28;
                    }
                case (3):
                    System.out.println("March has 31 days");
                    return 31;
                case (4):
                    System.out.println("April has 30 days");
                    return 30;
                case (5):
                    System.out.println("May has 31 days");
                    return 31;
                case (6):
                    System.out.println("June has 30 days");
                    return 30;
                case (7):
                    System.out.println("July has 31 days");
                    return 31;
                case (8):
                    System.out.println("August has 30 days");
                    return 31;
                case (9):
                    System.out.println("September has 31 days");
                    return 30;
                case (10):
                    System.out.println("October has 30 days");
                    return 31;
                case (11):
                    System.out.println("November has 31 days");
                    return 30;
                case (12):
                    System.out.println("December has 30 days");
                    return 31;
                default:
                    System.out.println("Something went wrong");
                    return -1;
            }
        }
    }
}
