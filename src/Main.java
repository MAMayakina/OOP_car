public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada Grante", "Lada", 0, "Россия", 1.7, "желтый");
        Car car2 = new Car("Audi A8 50 L TDI quattro", "Audi", 2020, "Германия", 3.0, "черный");
        Car car3 = new Car("BMW Z8", "BMW", 2021, "Германия", 3.0, "черный");
        Car car4 = new Car("Kia Sportage 4", "Kia", 2018, "Южная Корея", 2.4, "красный");
        Car car5 = new Car("Hyundai Avante", "Hyundai", 2016, "Южная Корея", 1.6, "оранжевый");

        car1.informationAboutCar();
        car2.informationAboutCar();
        car3.informationAboutCar();
        car4.informationAboutCar();
        car5.informationAboutCar();
    }
}