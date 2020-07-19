package factory.factorymethod;

public class Main {
    public static void main(String[] args) {
//        CarFactory factory = new CarFactory();
        PlaneFactory factory = new PlaneFactory();

        Moveable m = factory.create();
        m.go();
    }
}
