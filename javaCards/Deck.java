package javaCards;

public class Deck {
    //Properties
    private byte maxCards = 52;
    public Card[] deck = new Card[maxCards];
    private String[] availableSuits = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private String[] availableColors = {"Red", "Black"};
    private String[] availableVisualValues = {"Ace", "Two", "Three", "Four", "Five", "Six",
    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    //Constructor
    public Deck() {
        for (byte mainLoop = 0; mainLoop < maxCards; mainLoop++){ 
            //local card variables for constructing cards
            byte creationIndex = mainLoop;
            String creationVisualValue = "";
            String creationSuit = "";
            String creationColor = "";
            for (int suitLoop = 0; suitLoop < availableSuits.length; suitLoop++){
                creationSuit = availableSuits[suitLoop];
                if((suitLoop == 0) || (suitLoop == 3)){ creationColor = availableColors[0]; }
                else if((suitLoop == 1) || (suitLoop == 2)){ creationColor = availableColors[1]; }
                for (int visualValueLoop = 0; visualValueLoop < availableVisualValues.length; 
                visualValueLoop++){
                    creationVisualValue = availableVisualValues[visualValueLoop];
                }
            }
            deck[mainLoop] = new Card(creationIndex, creationVisualValue, creationSuit, 
            creationColor);
        }
    }
}
