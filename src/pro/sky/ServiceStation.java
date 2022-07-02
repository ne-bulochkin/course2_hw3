package pro.sky;

public class ServiceStation implements ServiceStationInterface{
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    @Override
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            updateTyre();
        }

        if(vehicle.getClass() == Car.class){
            checkEngine();
        }
        if(vehicle.getClass() == Truck.class){
            checkEngine();
            checkTrailer();
        }
    }
}
