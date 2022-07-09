public class Wall {
    private double width;
    private double height;

    public Wall() {
        System.out.println("Empty Constructor");
    }

    public Wall(double width, double height) {
        System.out.println("Constructor with parameters");
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
