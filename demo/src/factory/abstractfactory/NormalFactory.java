package factory.abstractfactory;

public class NormalFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Food createFood() {
        return new Tomato();
    }
}
