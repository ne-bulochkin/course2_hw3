package pro.sky;

public class Car extends Vehicle {
    public Car(String modelName, int wheelsCount) {
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
//    }
}