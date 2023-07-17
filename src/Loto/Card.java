package src.Loto;

import java.util.Random;

public class Card {
    private int[] bones;
    private int countOfBones = 10;
    
    private void Generator() {
        Random random = new Random();
        for (int i = 0; i < countOfBones; i++) {
            bones[i] = random.nextInt(101);//  <-- here
        }
    }
    
    public int[] getBones() {
        return bones;
    }
    
    public int getCountOfBones() {
        return countOfBones;
    }
    
    public void setCountOfBones(int countOfBones) {
        this.countOfBones = countOfBones;
    }
}
