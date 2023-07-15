package src.lesson3;

public class Toyota extends Car {
    private int numOfSeats = 2;
    private String nameOfCar = "toyota";
    
    @Override
    public String getNameOfCar() {
        return nameOfCar;
    }
    @Override
    public int getNumOfSeats() {
        return numOfSeats;
    }
}
