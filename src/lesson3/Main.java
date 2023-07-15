package src.lesson3;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.useCar(new Car()); //Car car = new Car();
        main.useCar(new Toyota());
        main.useCar(new Bmw());
        main.useCar(new Lamborghini());
    }

    void useCar(Car car) {
        System.out.println(car.getNameOfCar());
        car.driving();
        System.out.println("count of seats: " + car.getNumOfSeats());
        System.out.println();
    }

}
