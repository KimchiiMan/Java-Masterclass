public class main {
    public static void main(String[] args) {
        SpecificCar outlander = new SpecificCar(36);

        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
