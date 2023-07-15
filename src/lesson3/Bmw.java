package src.lesson3;

public class Bmw extends Car {
    private int numOfSeats = 4;
    private String nameOfCar = "bmw";

    @Override
    public void driving() {
        System.out.println("drive vary fast");
    }
    
    @Override
    public String getNameOfCar() {
        return nameOfCar;
    }
}
