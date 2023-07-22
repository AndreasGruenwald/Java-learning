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
        for (int i = 0; i < LINES; i++) {
            var arrayOfRandomCounts = arrayOfRandomCountsSet();
            for (int j = 0; j < 4; j++) {
                card[i][arrayOfRandomCounts[j]] = 99;
            }
        }
    }  //for createCard();
    
    private int createRandomBarrel(int i_Iteration, int j_Iteration) {
        Random random = new Random();
        var passedCount = 0;
        int randomCount;
        
        if (j_Iteration == 8) {
            randomCount = random.nextInt(11);
        } else {
            randomCount = random.nextInt(10);
        }
        
        if (diversityCheckForCardSet(i_Iteration, j_Iteration, randomCount)) {
            passedCount = randomCount;
        }
        else {
            createRandomBarrel(i_Iteration, j_Iteration);
        }
        return j_Iteration * 10 + passedCount;
    }  //for cardSet();
    
    private boolean diversityCheckForCardSet(int i_Iteration, int j_Iteration, int randomCount) {
        for (int i = 0; i < i_Iteration; i++) {
            if (j_Iteration * 10 + randomCount == card[i][j_Iteration]) {
                return false;
            }
        }
        return true;
    }  // for cardSet().createRandomBarrel()
    
    private int[] arrayOfRandomCountsSet() {
        var arrayOfRandomCounts = new int[4];

        for (int i = 0; i < arrayOfRandomCounts.length; i++) {
            arrayOfRandomCounts[i] = randomCountSet(arrayOfRandomCounts);
        }
        return arrayOfRandomCounts;
    }  //for addZeroes();
    
    private boolean diversityCheckForAddZeroes(int[] array, int random) {
        for (int i = 0; i < array.length; i++) {
            if (random == array[i]) {
                return false;
            }
        }
        return true;
    }  //for addZeroes().arrayOfRandomCountsSet().randomCountSet()
    
    private int randomCountSet(int[] arrayOfRandomCounts) {
        Random random = new Random();
        int trueCount = 0;
        var randomCount = random.nextInt(ROWS);
        if (diversityCheckForAddZeroes(arrayOfRandomCounts, randomCount)) {
            trueCount = randomCount;
        }
        else {
            randomCountSet(arrayOfRandomCounts);
        }
        return trueCount;
    }  //for addZeroes().arrayOfRandomCountsSet()
    
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
    
    private String helloWorld(){
        return "Hello World";
    }
}