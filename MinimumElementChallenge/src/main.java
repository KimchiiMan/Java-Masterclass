import java.util.Arrays;
import java.util.Scanner;

public class main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a count:");
        int count = sc.nextInt();
        sc.nextLine();
        int[] myArray = readIntegers(count);

        int myMinValueElement = findMin(myArray);
        System.out.println("min = " + myMinValueElement);
    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter elements to the array.");
        for(int i=0; i<array.length; i++) {
            int number = sc.nextInt();
            sc.nextLine();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i< array.length; i++) {
            int value = array[i];
            if(min > value) {
                min = value;
            }
        }
        return min;
    }
}
