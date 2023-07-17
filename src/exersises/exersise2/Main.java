package src.exersises.exersise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[scanner.nextInt()];
    
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
    
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[elements.length - 1 - i]);
        }
        
    }
}
