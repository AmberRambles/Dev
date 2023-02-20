public class Solitaire {
    //properties
    private boolean DEBUG = true;

    public String[] locations = {"Draw Pile", "Pile #1", "Pile #2", "Pile #3", "Pile #4", "Pile #5", "Pile #6",
            "Pile #7", "Home Pile #1", "Home Pile #2", "Home Pile #3", "Home Pile #4", "Waste Pile"};
    public Deck sDeck = new Deck();

    //methods
    public int getStackSize (String locationName){
        int stackPosition = -1;
        int topCardIndex = -1;
        topCardIndex = sDeck.getTopCard(locationName);
        if (topCardIndex == -1){
            return topCardIndex;
        }
        else{
            stackPosition = sDeck.deck[topCardIndex].getLocationPosition();
            return stackPosition;
        }
    }

    public byte initialDrawOne (){
        return sDeck.getTopCard("Deck");
    }

    public void initialDeal(){
        int stacksToFill = 6;
        for(int i = 1; i < 8; i++){
            byte topCard = -1;
            int currentStackSize = -1;
            //get next card from the top of the Deck
            topCard = initialDrawOne();
            //get stack size before moving in
            currentStackSize = getStackSize(locations[i]);
            sDeck.deck[topCard].setLocation(locations[i]);
            sDeck.deck[topCard].setLocationPosition(currentStackSize+1);
            //first card in each pass gets flipped face up
            sDeck.deck[topCard].setIsFaceUp(true);
            if(stacksToFill > 0){
                int stacksLeftThisPass = stacksToFill;
                int loopCount = 1;
                while(stacksLeftThisPass > 0){
                    topCard = initialDrawOne();
                    currentStackSize = getStackSize(locations[i + loopCount]);
                    sDeck.deck[topCard].setLocation(locations[i + loopCount]);
                    sDeck.deck[topCard].setLocationPosition(currentStackSize + 1);

                    loopCount++;
                    stacksLeftThisPass--;
                }
            }
            stacksToFill--;
        }
        //Go through the rest of the deck, changing "Deck" to "Draw Pile"
        for (byte currentCard = 0; currentCard < sDeck.maxCards; currentCard++){
            if (sDeck.deck[currentCard].getLocation()=="Deck"){
                sDeck.deck[currentCard].setLocation(locations[0]);
            }
        }
    }

    //default constructor
    public Solitaire(){
        sDeck.shuffle();
        if(DEBUG) {
            System.out.println("Cards after shuffle, before dealing: ");
            sDeck.printDeck();
            System.out.print("Dealing... ");
        }
        initialDeal();
        if (DEBUG){
            System.out.println("Cards after initial deal:");
            sDeck.printDeck();
        }
        //TODO: nicely print the board
        //TODO: impliment check for win condition, end game if needed
        //TODO: check if cards remain in the draw pile, then offer available moves
    }
}
//TODO: create drawOne and drawThree method options
//TODO: create a method to check for the win condition