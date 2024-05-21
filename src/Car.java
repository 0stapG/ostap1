public class Car {
    private int horsepower;
    private double engineVolume;
    // Додаткові поля
    private String brand;
    private String model;
    private int year;
    private String color;
    private double fuelEfficiency;

    public Car(int horsepower, double engineVolume, String brand, String model, int year, String color,
               double fuelEfficiency) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelEfficiency = fuelEfficiency;

    }

    public static void main(String[] args) {
        // Створюємо 10 об'єктів класу Car
        Car car1 = new Car(245, 2.0, "BMW", "3-Series", 2014, "Gray", 13.5);
        Car car2 = new Car(210, 2.0, "Volkswagen", "Jetta", 2015, "White", 12.8);
        Car car3 = new Car(280, 3.2, "Audi", "A5", 2010, "Black", 15.0);
        Car car4 = new Car(600, 4.4, "BMW", "5-Series", 2012, "White", 23.0);
        Car car5 = new Car(400, 3.0, "Mercedes-Benz", "E-Class", 2018, "Silver", 18.2);
        Car car6 = new Car(400, 2.5, "Subaru", "Impreza WRX STI", 2013, "Blue", 14.5);
        Car car7 = new Car(600, 6.0, "BMW", "7-Series", 2019, "Gray", 27.5);
        Car car8 = new Car(600, 4.0, "Mercedes-Benz", "G-Class", 2019, "Yellow", 38.8);
        Car car9 = new Car(550, 4.8, "Porsche", "Panamera", 2014, "Brown", 37.3);
        Car car10 = new Car(640, 3.8, "Porsche", "911", 2018, "Orange", 28.0);

        // Обчислюємо суми об'ємів двигунів
        double totalEngineVolume = car1.engineVolume + car2.engineVolume + car3.engineVolume +
                car4.engineVolume + car5.engineVolume + car6.engineVolume + car7.engineVolume +
                car8.engineVolume + car9.engineVolume + car10.engineVolume;
        System.out.println("Сума об'ємів двигунів: " + totalEngineVolume);

        // Обчислюємо суми потужностей
        int totalHorsepower = car1.horsepower + car2.horsepower + car3.horsepower +
                car4.horsepower + car5.horsepower + car6.horsepower + car7.horsepower +
                car8.horsepower + car9.horsepower + car10.horsepower;
        System.out.println("Сума потужностей: " + totalHorsepower);
    }
}