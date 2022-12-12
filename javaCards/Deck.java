package javaCards;

public class Deck {
    //Properties
    private byte maxCards = 52;
    private byte[] cardIndexes = new byte[maxCards];
    private Card[] deck = new Card[maxCards];
    private String[] availableSuits = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private String[] availableColors = {"Red", "Black"};
    private String[] availableVisualValues = {"Ace", "Two", "Three", "Four", "Five", "Six",
     "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    //Constructor
    public Deck() {
        for (int i = 0; i < maxCards; i++){ 
            for (int j = 0; j < availableSuits.length; j++){

            }
        }
    }
}
