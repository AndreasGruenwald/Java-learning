package src.exersises.exersise1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] elements = new int[20];
        Random rnd = new Random();
    
        for (int i = 0; i < elements.length; i++) {
            elements[i] = rnd.nextInt(10);
        }
    
        System.out.println(detector(elements));
    }
    
    static int detector(int[] elements) {
        int counter = 0;
        var scanner = new Scanner(System.in);
        int usersData = scanner.nextInt();
        
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == usersData) {
                counter++;
            }
        }
        
        return counter;
    }
}
