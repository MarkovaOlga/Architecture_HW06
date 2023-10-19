package bridge;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(new BMV());
        vehicle1.drive();
        Vehicle vehicle2 = new Motorcycle(new Honda());
        vehicle2.drive();
    }
}
