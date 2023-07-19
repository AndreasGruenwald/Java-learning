package src.exersises.exersise3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(plus(plus(0, 21), 13) + 12 + 13 + 11 + 14);
    }
    
    static int plus(int a, int length) {
        for (int i = 0; i < length; i++) {
            a += i;
            System.out.println(i);
        }
        return a;
    }
}
