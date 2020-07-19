package factory.factorymethod;

public class CarFactory {
    public Moveable create() {
        System.out.println("a new car create");
        return new Car();
    }
}
