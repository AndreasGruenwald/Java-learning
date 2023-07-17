package src.Loto;

public class Program {
    public static void main(String[] args) {
        Card card = new Card();
        card.setCountOfBonesInCard(11);
        card.setCountOfBonesInGame(20);
        
        for (int bone : card.getBones()) {
            System.out.println(bone);
        }
    }
}
