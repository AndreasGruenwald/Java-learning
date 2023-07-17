package src.Loto;

import java.util.Random;

public class Card {
    private int countOfBonesInCard = 10;
    private int countOfBonesInGame = 100;
    private int[] bones = new int[countOfBonesInCard];
    
    private void generator() {
        for (int i = 0; i < countOfBonesInCard; i++) {
            manager(i);
        }
    }
    
    private boolean diversityCheck(int bone) {
        for (int i = 0; i < countOfBonesInCard; i++) {
            if (bone == bones[i]) {
                return false;
            }
        }
        return true;
    }
    
    private void manager(int iteration) {
        Random random = new Random();
        int randomCount = random.nextInt(countOfBonesInGame + 1);
        if (diversityCheck(randomCount)) {
            bones[iteration] = randomCount;
        }
        else {
            manager(iteration);
        }
    }
    
    public int[] getBones() {
        generator();
        return bones;
    }
    
    public int getCountOfBonesInCard() {
        return countOfBonesInCard;
    }
    
    public void setCountOfBonesInCard(int countOfBones) {
        this.countOfBonesInCard = countOfBones;
    }
    
    public int getCountOfBonesInGame() {
        return countOfBonesInGame;
    }
    
    public void setCountOfBonesInGame(int countOfBonesInCard) {
        this.countOfBonesInGame = countOfBonesInCard;
    }
}
