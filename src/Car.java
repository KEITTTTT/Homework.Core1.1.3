public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
    void info(){
        System.out.println("Автомобиль " + brand + " " + model + "," + year + " года выпуска, сборка страны " + country + "," + color + " цвет" +
                    ", объем двигателя " + engineVolume + "л." );
    }

}
