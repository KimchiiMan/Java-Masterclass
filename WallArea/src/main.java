public class main {
    public static void main(String[] args) {
        Wall myWall = new Wall(5, 4);
        System.out.println("area= " + myWall.getArea());

        myWall.setHeight(-1.5);
        System.out.println("width= " + myWall.getWidth());
        System.out.println("height= " + myWall.getHeight());
        System.out.println("area= " + myWall.getArea());
    }
}
