package Transport;


import java.time.LocalDate;

import static java.lang.Character.isDigit;

public class Car {

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public Key(String remoteEngineStart, String keylessAccess) {
            if (remoteEngineStart == null || remoteEngineStart.isEmpty() || remoteEngineStart.isBlank()) {
                this.remoteEngineStart = "default";
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }
            if (keylessAccess == null || keylessAccess.isEmpty() || keylessAccess.isBlank()) {
                this.keylessAccess = "default";
            } else {
                this.keylessAccess = keylessAccess;
            }
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя " + remoteEngineStart + ", бесключевой доступ " + keylessAccess;
        }

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }
    }

    public class Insurance {
        private String validityPeriod;
        private int cost;
        private String number;

        public Insurance(String validityPeriod, int cost, String number) {
            if (validityPeriod == null || validityPeriod.isEmpty() || validityPeriod.isBlank()) {
                this.validityPeriod = "default";
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            this.number = number;
        }

        @Override
        public String toString() {
            return "срок действия страховки " + validityPeriod + ", стоимость страховки " + cost + ", номер страховки " + number;
        }

        public String getValidityPeriod() {
            return validityPeriod;
        }

        public int getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }

    private String brand;
    private String model;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double engineVolume;
    private String transmission;
    private String carBodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String typeOfTires;
    private Key key;
    private Insurance insurance;


    public Car(String model, String brand, int productionYear, String productionCountry, double engineVolume, String color, String transmission, String carBodyType, String registrationNumber, int numberOfSeats, String typeOfTires) {
        this.brand = checkParametr(brand);
        this.model = checkParametr(model);
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.productionCountry = checkParametr(productionCountry);
        this.color = checkParametr(color);
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        this.transmission = checkParametr(transmission);
        this.carBodyType = checkParametr(carBodyType);

        // проверка номера на х000хх000
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank() && registrationNumber.length() == 9 && !isDigit(registrationNumber.charAt(0)) && !isDigit(registrationNumber.charAt(4)) && !isDigit(registrationNumber.charAt(5)) && isDigit(registrationNumber.charAt(1)) && isDigit(registrationNumber.charAt(2)) && isDigit(registrationNumber.charAt(3)) && isDigit(registrationNumber.charAt(6)) && isDigit(registrationNumber.charAt(7)) && isDigit(registrationNumber.charAt(8))) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "default";
        }

        if (numberOfSeats <= 0 || numberOfSeats > 20) {
            this.numberOfSeats = 0;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.typeOfTires = checkParametr(typeOfTires);
    }

    private String checkParametr(String parametr) {
        String checkParametr = parametr;
        if (parametr == null || parametr.isEmpty() || parametr.isBlank()) {
            checkParametr = "default";
        }
        return checkParametr;
    }

    public String checkParametrNumber(String registrationNumber) {
        String checkParametrNumber = null;
        if (this.registrationNumber.length() == 9) {
            if (!isDigit(this.registrationNumber.charAt(0)) && !isDigit(this.registrationNumber.charAt(4)) && !isDigit(this.registrationNumber.charAt(5)) && isDigit(this.registrationNumber.charAt(1)) && isDigit(this.registrationNumber.charAt(2)) && isDigit(this.registrationNumber.charAt(3)) && isDigit(this.registrationNumber.charAt(6)) && isDigit(this.registrationNumber.charAt(7)) && isDigit(this.registrationNumber.charAt(8))) {
                checkParametrNumber = this.registrationNumber;
            } else {
                checkParametrNumber = "default";
            }
        } else checkParametrNumber = "default";
        return checkParametrNumber;
    }

    public void getInformationAboutCar() {
        System.out.print(model);
        if (brand != "default") {
            System.out.print(" (бренд " + brand + ")");
        }
        System.out.print(", год выпуска " + productionYear);
        if (productionCountry != "default") {
            System.out.print(", страна сборки " + productionCountry);
        }
        if (color != "default") {
            System.out.print(", цвет " + color);
        }
        System.out.print(", объем двигателя " + engineVolume);
        if (transmission != "default") {
            System.out.print("л, коробка передач " + transmission);
        }
        if (carBodyType != "default") {
            System.out.print(", тип кузова " + carBodyType);
        }
        if (registrationNumber != "default") {
            System.out.print(", рег. номер " + registrationNumber);
        }
        if (numberOfSeats != 0) {
            System.out.print(", кол-во мест " + numberOfSeats);
        }
        if (typeOfTires != "default") {
            System.out.print(", шины " + typeOfTires);
        }
        System.out.println();
    }

    public void changeCarTires() {
        String month = String.valueOf(LocalDate.now().getMonth());
        if (month == "DECEMBER" || month == "JANUARY" || month == "FEBRUARY" || month == "MARCH") {
            typeOfTires = "зимние";
        } else {
            typeOfTires = "летние";
        }
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTypeOfTires() {
        return typeOfTires;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTypeOfTires(String typeOfTires) {
        this.typeOfTires = typeOfTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        try {
            LocalDate date = LocalDate.parse(insurance.validityPeriod);
            int result = date.compareTo(LocalDate.now());
            if (result < 0) {
                insurance.validityPeriod = "просрочен";
            }
        } catch (Exception e) {
            insurance.validityPeriod = "некорректен";
        }
        if (insurance.cost < 0) {
            insurance.cost = 0;
        }

        if (insurance.number.length() != 9) {
            insurance.number = "некорректный";
        }

        this.insurance = new Insurance(insurance.validityPeriod, insurance.cost, insurance.number);
    }
}


