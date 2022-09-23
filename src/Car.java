public class Car {
    String brand;
    String model;
    int productionYear;
    String productionCountry;
    String color;
    double engineVolume;

    public Car(String model, String brand, int productionYear, String productionCountry, double engineVolume, String color) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void informationAboutCar() {
        System.out.println(model + " (бренд " + brand + "), год выпуска " + productionYear + ", страна сборки " + productionCountry + ", цвет " + color + ", объем двигателя " + engineVolume + "л");
    }
}
