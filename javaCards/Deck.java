package javaCards;

import java.util.Random;

public class Deck {
    //Properties
    private boolean DEBUG = false;
    private byte maxCards = 52;
    public Card[] deck = new Card[maxCards];
    private String[] availableSuits = {"Hearts", "Clubs", "Spades", "Diamonds"};
    private String[] availableColors = {"Red", "Black"};
    private String[] availableVisualValues = {"Ace", "Two", "Three", "Four", "Five", "Six",
    "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    //Methods
    public void shuffle () {
        Random random = new Random();
        int[] newCardPositions = new int[maxCards];
        
    }

    public void setBlackJackScoring(){
        int scoringValue;
        for (byte mainLoop = 0; mainLoop < maxCards; mainLoop++){
            switch (deck[mainLoop].getVisualValue()){
                case "Ace":
                    scoringValue = 1;
                    break;
                case "Two":
                    scoringValue = 2;
                    break;
                case "Three":
                    scoringValue = 3;
                    break;
                case "Four":
                    scoringValue = 4;
                    break;
                case "Five":
                    scoringValue = 5;
                    break;
                case "Six":
                    scoringValue = 6;
                    break;
                case "Seven":
                    scoringValue = 7;
                    break;
                case "Eight":
                    scoringValue = 8;
                    break;
                case "Nine":
                    scoringValue = 9;
                    break;
                case "Ten":
                    scoringValue = 10;
                    break;
                case "Jack":
                    scoringValue = 10;
                    break;
                case "Queen":
                    scoringValue = 10;
                    break;
                case "King":
                    scoringValue = 10;
                    break;
                default:
                    scoringValue = -1;
                    break;
            }
            deck[mainLoop].setScoringValue(scoringValue);
        }
    }
    
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
            String creationLocation = "Deck";
            int creationLocationPosition = creationIndex;
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
            creationColor, creationLocation, creationLocationPosition);

            
            visualValueCounter++;
            if(visualValueCounter == availableVisualValues.length){ visualValueCounter = 0; }
        }
    }
}
