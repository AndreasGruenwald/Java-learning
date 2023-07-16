package src.lesson4;

public class Person {
    private String mr = "mr ";
    private String name = "Max";
    
    public String getName() {
        return mr + name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
