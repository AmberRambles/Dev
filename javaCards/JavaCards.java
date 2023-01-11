package javaCards;

public class JavaCards {
    public static void main(String[] args) {
        System.out.println("Beginning of JavaCards.");

        Deck testDeck = new Deck();
        
        for(int i = 0; i < 52; i++){ //this loop demonstrates that the deck is full and accurate
            testDeck.deck[i].printCardInfo();
        }

        testDeck.shuffle();
        for(int i = 0; i < 52; i++){ //this loop demonstrates that the deck is full and accurate
            testDeck.deck[i].printCardInfo();
        }
    }
}
