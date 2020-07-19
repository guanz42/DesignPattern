package factory.abstractfactory;

public class ModernFactory extends AbstractFactory {
    @Override
    Vehicle createVehicle() {
        return new Plane();
    }

    @Override
    Food createFood() {
        return new Bread();
    }
}
