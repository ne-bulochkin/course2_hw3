package pro.sky;

public class Truck extends Vehicle {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


//
//    @Override
//    public void check() {
//        System.out.println("Обслуживаем " + getModelName());
//        for (int i = 0; i < getWheelsCount(); i++) {
//            updateTyre();
//        }
//        checkEngine();
//        checkTrailer();
//    }
}
