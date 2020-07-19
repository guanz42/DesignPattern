package factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
//        AbstractFactory factory = new ModernFactory();
        AbstractFactory factory = new NormalFactory();

        Vehicle vehicle = factory.createVehicle();
        vehicle.go();

        Food food = factory.createFood();
        food.eat();
    }
}
