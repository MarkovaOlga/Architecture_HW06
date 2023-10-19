package bridge;

public class Motorcycle extends Vehicle {

    public Motorcycle(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("You are driving motorcycle");
    }
}
