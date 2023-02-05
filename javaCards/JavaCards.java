public class JavaCards {
    public static void main(String[] args) {
        System.out.println("Beginning of JavaCards.");

        Solitaire testSolitaire = new Solitaire();
        
        for(int i = 0; i < 52; i++){ //this loop demonstrates that the deck is full and accurate
            testSolitaire.sDeck.deck[i].printCardInfo();
        }


    }
}
