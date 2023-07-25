package src.Lotto;

public class Program {
    public static void main(String[] args) {
        Card cardObject = new Card();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        showCard(cardObject.getCard(), cardObject);
        System.out.println();
        
    }
    
    private static void showCard(int[][] card, Card cardObject) {
        for (int i = 0; i < cardObject.getLINES(); i++) {
            for (int j = 0; j < cardObject.getROWS(); j++) {
                if (j == 0 && card[i][j] == 99) {
                    System.out.print("_ ");
                }
                else if (card[i][j] == 99) {
                    System.out.print("__ ");
                }
                else {
                    System.out.print(card[i][j] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
