import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] theArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(theArray));
        reverse(theArray);
        System.out.println(Arrays.toString(theArray));
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i<halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex -i] = temp;
        }
    }
}
