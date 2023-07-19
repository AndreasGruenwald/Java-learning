package src.Lotto;

import java.util.Arrays;
import java.util.Random;

public class Card {
    final private int ROWS = 9;
    final private int LINES = 3;
    
    private int countOfKegsInCard = 27;
    private int countOfKegsInGame = 90;
    private int[][] card = new int[LINES][ROWS];
    private int[] kegs =  new int[countOfKegsInCard];
    
    private void manager(int iteration) {
        Random random = new Random();
        int randomCount = random.nextInt(countOfKegsInGame + 1);
        if (diversityCheck(randomCount) && quantityCheck(randomCount)) {
            kegs[iteration] = randomCount;
        }
        else {
            manager(iteration);
        }
    }
    
    private void generator() {
        for (int i = 0; i < countOfKegsInCard; i++) {
            manager(i);
        }
    }
    
    private boolean diversityCheck(int keg) {
        for (int i = 0; i < countOfKegsInCard; i++) {
            if (keg == kegs[i]) {
                return false;
            }
        }
        return true;
    }
    
    private boolean quantityCheck(int keg) {
        int numberOfCoincidences = 0;
        if (keg == 90) {
            for (int i = 0; i < countOfKegsInCard; i++) {
                if (8 == kegs[i] / 10) {
                    numberOfCoincidences++;
                }
            }
        }
        else if ((keg + "").length() == 1) {
            for (int i = 0; i < countOfKegsInCard; i++) {
                if ((kegs[i] + "").length() == 1 && kegs[i] != 0) {
                    numberOfCoincidences++;
                }
            }
        }
        else {
            for (int i = 0; i < countOfKegsInCard; i++) {
                if (keg / 10 == kegs[i] / 10) {
                    numberOfCoincidences++;
                }
            }
        }

        if (numberOfCoincidences >= 3) {
            return false;
        }
        return true;
    }
    
    private void createCard() {
        var counterForKegs = 0;
        for (int i = 0; i < LINES; i++) {
            for (int j = 0; j < ROWS; j++) {
                card[i][j] = kegs[counterForKegs];
                counterForKegs++;
            }
        }
    }
    
    private void sorter() {
        generator();
        int mainCounter = 0;
        
        int[] one = new int[3], ten = new int[3], twenty = new int[3], thirty = new int[3], forty = new int[3];
        int[] fifty = new int[3], sixty = new int[3], seventy = new int[3], eighty = new int[3];
        int oneCounter = 0, tenCounter = 0, twentyCounter = 0, thirtyCounter = 0, fortyCounter = 0;
        int fiftyCounter = 0, sixtyCounter = 0, seventyCounter = 0, eightyCounter = 0;
    
        for (int i = 0; i < countOfKegsInCard; i++) {
            if ((kegs[i] + "").length() == 1) {
                one[oneCounter] = kegs[i];
                oneCounter++;
            }
            else {
                switch (kegs[i] / 10) {
                    case 1:
                        ten[tenCounter] = kegs[i];
                        tenCounter++;
                        break;
                    case 2:
                        twenty[twentyCounter] = kegs[i];
                        twentyCounter++;
                        break;
                    case 3:
                        thirty[thirtyCounter] = kegs[i];
                        thirtyCounter++;
                        break;
                    case 4:
                        forty[fortyCounter] = kegs[i];
                        fortyCounter++;
                        break;
                    case 5:
                        fifty[fiftyCounter] = kegs[i];
                        fiftyCounter++;
                        break;
                    case 6:
                        sixty[sixtyCounter] = kegs[i];
                        sixtyCounter++;
                        break;
                    case 7:
                        seventy[seventyCounter] = kegs[i];
                        seventyCounter++;
                        break;
                    case 8:
                    case 9:
                        eighty[eightyCounter] = kegs[i];
                        eightyCounter++;
                        break;
                }
            }
        }
        
        oneCounter = 0; tenCounter = 0; twentyCounter = 0; thirtyCounter = 0; fortyCounter = 0;
        fiftyCounter = 0; sixtyCounter = 0; seventyCounter = 0; eightyCounter = 0;
        
        for (int i = 0; i < 3; i++) {
            kegs[mainCounter] = one[oneCounter];
            mainCounter++;
            oneCounter++;
            
            kegs[mainCounter] = ten[tenCounter];
            mainCounter++;
            tenCounter++;
            
            kegs[mainCounter] = twenty[twentyCounter];
            mainCounter++;
            twentyCounter++;
            
            kegs[mainCounter] = thirty[thirtyCounter];
            mainCounter++;
            thirtyCounter++;
            
            kegs[mainCounter] = forty[fortyCounter];
            mainCounter++;
            fortyCounter++;
            
            kegs[mainCounter] = fifty[fiftyCounter];
            mainCounter++;
            fiftyCounter++;
            
            kegs[mainCounter] = sixty[sixtyCounter];
            mainCounter++;
            sixtyCounter++;
            
            kegs[mainCounter] = seventy[seventyCounter];
            mainCounter++;
            seventyCounter++;
            
            kegs[mainCounter] = eighty[eightyCounter];
            mainCounter++;
            eightyCounter++;
        }
    }
    
    public int[][] getCard() {
        sorter();
        createCard();
        return card;
    }
    
    public int getCountOfKegsInCard() {
        return countOfKegsInCard;
    }
    
    public int getCountOfKegsInGame() {
        return countOfKegsInGame;
    }
    
    public int getROWS() {
        return ROWS;
    }
    
    public int getLINES() {
        return LINES;
    }
}
