public class Main {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "черныйй", 2020, "Германия");
        Car bmw = new Car("Bmw", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "", 0 , "", -2016, "Южная Корея");
        lada.info();
        audi.info();
        bmw.info();
        kia.info();
        hyundai.info();
    }
}