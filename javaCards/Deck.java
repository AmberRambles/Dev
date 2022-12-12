package javaCards;

public class Deck {
    //Properties
    private boolean DEBUG = false;
    private byte maxCards = 52;
    public Card[] deck = new Card[maxCards];
    private String[] availableSuits = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private String[] availableColors = {"Red", "Black"};
    private String[] availableVisualValues = {"Ace", "Two", "Three", "Four", "Five", "Six",
    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    //Constructor
    public Deck() {
        byte suitCounter = 0;
        byte visualValueCounter = 0;
        for (byte mainLoop = 0; mainLoop < maxCards; mainLoop++){ 
            //local card variables for constructing cards
            byte creationIndex = mainLoop;
            String creationVisualValue = "";
            String creationSuit = "";
            String creationColor = "";
            if(suitCounter < availableSuits.length){ creationSuit = availableSuits[suitCounter]; }
            else { System.out.println("suitCounter Error"); }

            if((suitCounter == 0) || (suitCounter == 3)){ creationColor = availableColors[0]; }
            else if((suitCounter == 1) || (suitCounter == 2)){ creationColor = availableColors[1]; }

            if(visualValueCounter < (availableVisualValues.length - 1)){ creationVisualValue = availableVisualValues[visualValueCounter]; }
            else if(visualValueCounter == (availableVisualValues.length - 1)){
                creationVisualValue = availableVisualValues[visualValueCounter];
                suitCounter++;
            }
            else{ System.out.println("visualValueCounter Error"); }

            if(DEBUG){
                System.out.print("mainLoop: ");
                System.out.println(String.valueOf(mainLoop));
                System.out.print("creationIndex: ");
                System.out.println(String.valueOf(creationIndex));
                System.out.print("creationVisualValue: ");
                System.out.println(creationVisualValue);
                System.out.print("creationSuit: ");
                System.out.println(creationSuit);
                System.out.print("creationColor: ");
                System.out.println(creationColor);
            }
            deck[mainLoop] = new Card(creationIndex, creationVisualValue, creationSuit, 
            creationColor);

            
            visualValueCounter++;
            if(visualValueCounter == availableVisualValues.length){ visualValueCounter = 0; }
        }
    }
}
