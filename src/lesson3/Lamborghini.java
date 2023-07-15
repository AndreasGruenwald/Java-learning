package src.lesson3;

public class Lamborghini extends Car {
    private int numOfSeats = 2;
    private String nameOfCar = "lamborghini";
    
    @Override
    public void driving() {
        System.out.println("drive vary vary vary fast");
    }
    
    @Override
    public String getNameOfCar() {
        return nameOfCar;
    }
    
    @Override
    public int getNumOfSeats() {
        return numOfSeats;
    }
}
