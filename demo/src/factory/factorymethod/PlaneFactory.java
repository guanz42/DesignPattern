package factory.factorymethod;

public class PlaneFactory {
    public Moveable create() {
        System.out.println("a new plane create");
        return new Plane();
    }
}
