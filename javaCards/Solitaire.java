public class Solitaire {
    //properties
    private boolean DEBUG = true;

    public String[] locations = {"Draw Pile", "Pile #1", "Pile #2", "Pile #3", "Pile #4", "Pile #5", "Pile #6",
            "Pile #7", "Home Pile #1", "Home Pile #2", "Home Pile #3", "Home Pile #4", "Waste Pile"};
    public Deck sDeck = new Deck();

    public byte activeCardIndex = -1;
    //methods
    public void initialDeal(){

    }

    //default constructor
    public Solitaire(){
        sDeck.shuffle();
        if(DEBUG) {
            sDeck.printDeck();
            System.out.print("The top card of the deck should be: ");
            activeCardIndex = sDeck.getTopCard("Deck");
            sDeck.deck[activeCardIndex].printCardInfo();

        }
    }
}
