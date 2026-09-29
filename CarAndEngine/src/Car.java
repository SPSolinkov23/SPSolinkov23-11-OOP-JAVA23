public class Car {
    //Fields
    String brand;
    String model;
    Engine engine;
    //Constructor
    Car(String brand, String model, String engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    void ShowCarInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        engine.ShowEngineInfo();
    }

    public static void main(String[] args) {
        Engine engine1 = new Engine("Petrol", 151);
        Engine engine2 = new Engine("Diesel", 787);
        Car car1 = new Car("Toyota", "Camry", engine1);
        Car car2 = new Car("Honda", "Civic", engine2)
        car1.ShowCarInfo();
        car2.ShowCarInfo();
    }
}
