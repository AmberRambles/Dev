package javaCards;

public class JavaCards {
    public static void main(String[] args) {
        
        System.out.println("Hello, Amber.");
        Deck testDeck = new Deck();
        for(int i = 0; i < 52; i++){
            testDeck.deck[i].printCardInfo();
        }
    }
}
