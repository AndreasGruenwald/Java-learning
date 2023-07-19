package src.Loto;

public class Program {
    public static void main(String[] args) {
        Card cardObject = new Card();
        showCard(cardObject.getCard(), cardObject);
    }
    
    private static void showCard(int[][] card, Card cardObject) {
        for (int i = 0; i < cardObject.getLINES(); i++) {
            for (int j = 0; j < cardObject.getROWS(); j++) {
                System.out.print(card[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
