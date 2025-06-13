package lab1;

public class Problem2 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020, "Petrol");
        Car car2 = new Car("Tesla");

        car1.printInfo();
        car2.printInfo();

        System.out.println("Total cars made: " + Car.totalCars);
    }
}

class Car {
    private String model;
    private final int year;
    private String engineType;
    static int totalCars = 0;

    {
        totalCars = totalCars + 1;
    }

    public Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engineType = engineType;
    }

    public Car(String model) {
        this(model, 2023, "Electric");
    }

    public void printInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + this.year);
        System.out.println("Engine: " + engineType);
        System.out.println();
    }
}
