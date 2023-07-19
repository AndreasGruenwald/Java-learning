package src.Loto;

import java.util.Random;

public class Card {
    final private int ROWS = 9;
    final private int LINES = 3;
    
    private int countOfBonesInCard = 27;
    private int countOfBonesInGame = 90;
    private int[][] card = new int[LINES][ROWS];
    private int[] bones = new int[countOfBonesInCard];
    
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
    
    private void createCard() {
        var counterForBones = 0;
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < ROWS; j++) {
                card[i][j] = bones[counterForBones];
                counterForBones++;
            }
        }
    }
    
    public int[][] getCard() {
        generator();
        createCard();
        return card;
    }
    
    public int getCountOfBonesInCard() {
        return countOfBonesInCard;
    }
    
    public int getCountOfBonesInGame() {
        return countOfBonesInGame;
    }
    
    public int getROWS() {
        return ROWS;
    }
    
    public int getLINES() {
        return LINES;
    }
}
