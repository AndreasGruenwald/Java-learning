package src.Lotto;

import java.util.Random;

public class Card {
    final private int ROWS = 9;
    final private int LINES = 3;
    
    private int countOfBarrelsInCard = 27;
    private int countOfBarrelsInGame = 90;
    private int[][] card = new int[LINES][ROWS];

    private void createCard() {
        cardSet();
        addZeroes();
    }  //main method
    
    private void cardSet() {
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < ROWS; j++) {
                card[i][j] = createRandomBarrel(i, j);
            }
        }
    }  //for createCard();
    
    private void addZeroes() {
        /*for (int i = 0; i < LINES; i++) {
            var arrayOfRandomCounters = arrayOfRandomCountersSet();
            for (int j = 0; j < 4; j++) {
                card[i][arrayOfRandomCounters[j]] = 99;
            }
        }*/
    }  //for createCard(); not ready
    
    private int createRandomBarrel(int i_Iteration, int j_Iteration) {
        Random random = new Random();
        var passedCount = 0;
        int randomCount;
        
        if (j_Iteration == 8) {
            randomCount = random.nextInt(11);
        } else {
            randomCount = random.nextInt(10);
        }
        
        if (Check(i_Iteration, j_Iteration, randomCount)) {
            passedCount = randomCount;
        }
        else {
            createRandomBarrel(i_Iteration, j_Iteration);
        }
        return j_Iteration * 10 + passedCount;
    }  //for cardSet();
    
    private boolean Check(int i_Iteration, int j_Iteration, int randomCount) {
        for (int i = 0; i < i_Iteration; i++) {
            if (j_Iteration * 10 + randomCount == card[i][j_Iteration]) {
                return false;
            }
        }
        return true;
    }  // for cardSet();
    
    private int[] arrayOfRandomCountersSet() {
        /*var arrayOfRandomCounters = new int[4];
        Random random = new Random();
        for (int i = 0; i < arrayOfRandomCounters.length; i++) {
            arrayOfRandomCounters[i] = random.nextInt(ROWS);
        }*/
        return new int[4];//arrayOfRandomCounters;
    }  //for addZeroes(); not ready
    
    public int[][] getCard() {
        createCard();
        return card;
    }
    
    public int getCountOfBarrelsInCard() {
        return countOfBarrelsInCard;
    }
    
    public int getCountOfBarrelsInGame() {
        return countOfBarrelsInGame;
    }
    
    public int getROWS() {
        return ROWS;
    }
    
    public int getLINES() {
        return LINES;
    }

    public String helloWorld(){
        return "Hello World";
    }
}
