class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.engine = true;
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Car -> Engine has been started";
    }

    public String accelerate() {
        return "Car -> is accelerating";
    }

    public String brake() {
        return "Car -> has stopped";
    }
}

class Porsche extends Car {
    public Porsche () {
        super("Porsche Carrera", 8);
    }

    @Override
    public String startEngine() {
        return "Porsche -> Engine has been started";
    }

    @Override
    public String accelerate() {
        return "Porsche -> is accelerating";
    }

    @Override
    public String brake() {
        return "Porsche -> has stopped";
    }
}

class Mercedes extends Car {
    public Mercedes() {
        super("Mercedes CLS", 6);
    }

    @Override
    public String startEngine() {
        return "Mercedes -> Engine has been started";
    }

    @Override
    public String accelerate() {
        return "Mercedes -> is accelerating";
    }

    @Override
    public String brake() {
        return "Mercedes -> has stopped";
    }
}

class VolksWagen extends Car {
    public VolksWagen() {
        super("Beetle", 6);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> Engine has been started";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> is accelerating";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> has stopped";
    }
}

public class main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Porsche porsche = new Porsche();
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Mercedes mercedes = new Mercedes();
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        VolksWagen volkswagen = new VolksWagen();
        System.out.println(volkswagen.startEngine());
        System.out.println(volkswagen.accelerate());
        System.out.println(volkswagen.brake());
    }
}
