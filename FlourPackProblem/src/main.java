public class main {
    public static void main(String[] args) {
        if(canPack(3, 1, 12)) {
            System.out.println("worked");
        } else {
            System.out.println("didn't work");
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int bigCountValue = 5;
        int smallCountValue = 1;

        while (bigCount > 0 && goal >= 5) {
            goal -= bigCountValue;
            bigCount--;
        }

        return smallCount >= goal;

    }
}
