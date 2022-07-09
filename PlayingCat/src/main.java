public class main {
    public static void main(String[] args) {
        isCatPlaying(true, 26);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45){
            System.out.println("It's summer and the cats are playing");
            return true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            System.out.println("It's winter and the cats are playing");
            return true;
        } else {
            System.out.println("The cats are not playing");
            return false;
        }
    }
}
