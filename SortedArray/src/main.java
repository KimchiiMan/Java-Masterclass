import java.util.Arrays;
import java.util.Scanner;

public class main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] unsortedArray = getIntegers(5);
        printArray(unsortedArray);
        int[] sortedArray = sortIntegers(unsortedArray);
        printArray(sortedArray);
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = sc.nextInt();
        }

        return values;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        // for(int i=0; i<array.length; i++) {
        //     sortedArray[i] = array[i];
        // }
        sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
