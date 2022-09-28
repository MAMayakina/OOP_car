import Transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada Grante", "Lada", 0, "Россия", 1.7, "желтый", "механическая", "седан", "х231ао512", 5, "летние");
        Car car2 = new Car("Audi A8 50 L TDI quattro", "Audi", 2020, "Германия", 3.0, "черный", "автоматическая", "седан", "р245пт512", 5, "летние");
        Car car3 = new Car("BMW Z8", "BMW", 2021, "Германия", 3.0, "черный", "автоматическая", "сродстер", "т3085п52", 2, "зимние");
        Car car4 = new Car("Kia Sportage 4", "Kia", 2018, "Южная Корея", 2.4, "красный", "автоматическая", "5-дверный универсал", "ал543о11", 5, "зимние");
        Car car5 = new Car("Hyundai Avante", "Hyundai", 2016, "Южная Корея", 1.6, "оранжевый", null, null, null, 0, null);

        System.out.println("Полная информация об автомобилях:");
        car1.getInformationAboutCar();
        car2.getInformationAboutCar();
        car3.getInformationAboutCar();
        car4.getInformationAboutCar();
        car5.getInformationAboutCar();

        //проверка номеров машин
        System.out.println("Рег. номера автомобилей");
        System.out.println(car1.getRegistrationNumber());
        System.out.println(car2.getRegistrationNumber());
        System.out.println(car3.getRegistrationNumber());
        System.out.println(car4.getRegistrationNumber());
        System.out.println(car5.getRegistrationNumber());


        // смена шин на сезонные (пример машина 3)
        System.out.println("До смены шин: "+car3.getTypeOfTires());
        car3.changeCarTires();
        System.out.println("После смены шин: "+car3.getTypeOfTires());

        //ключ
        Car.Key keyWithFeatures = new Car.Key("есть", "есть");
        Car.Key keyWithoutFeatures = new Car.Key("нет", "нет");
        System.out.println("Автомобиль с ключом:");
        car1.setKey(keyWithoutFeatures);
        car1.getInformationAboutCar();
        System.out.println("Автомобиль без ключа:");
        car2.setKey(keyWithFeatures);
        car2.getInformationAboutCar();
        System.out.println("Автомобиль с null:");
        car3.getInformationAboutCar();

    }
}