package src.lesson3;

public class Main {
    public static void main(String[] args) {
        //Main main = new Main();
        useCar(new Car()); //Car car = new Car();
        useCar(new Toyota());
        useCar(new Bmw());
        useCar(new Lamborghini());
    }

    static void useCar(Car car) {
        System.out.println(car.getNameOfCar());
        car.driving();
        System.out.println("count of seats: " + car.getNumOfSeats());
        System.out.println();
    }

}
