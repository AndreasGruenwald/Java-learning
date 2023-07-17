package src.Loto;

public class Program {
    public static void main(String[] args) {
        Card card = new Card();
        for (int bone : card.getBones()) {
            System.out.println(bone);
        }
    }
}
