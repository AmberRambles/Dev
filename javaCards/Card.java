package javaCards;

public class Card {
//declare and define attributes with default values
    private byte index = 53;
    private String visualValue = "UNINITIALIZED_VALUE";
    private int scoringValue = 0;
    private String suit = "UNINITIALIZED_SUIT";
    private String color = "UNINITIALIZED_COLOR";
//GET Methods
    public byte getIndex() {
        return index;
    }
    public String getVisualValue() {
        return visualValue;
    }
    public int getScoringValue() {
        return scoringValue;
    }
    public String getSuit() {
        return suit;
    }
    public String getColor() {
        return color;
    }
//SET Methods
    public void setIndex (byte inputIndex){
        index = inputIndex;
    }
    public void setVisualValue (String inputVisualValue){
        visualValue = inputVisualValue;
    }
    public void setScoringValue (int inputScoringValue){
        scoringValue = inputScoringValue;
    }
    public void setSuit (String inputSuit){
        suit = inputSuit;
    }
    public void setColor (String inputColor){
        color = inputColor;
    }
//PRINT Methods
    public void printCardInfo(){
        System.out.print("Index: ");
        System.out.println(String.valueOf(getIndex()));
        System.out.print("Color: ");
        System.out.println(getColor());
        System.out.print("Suit: ");
        System.out.println(getSuit());
        System.out.print("Visual Value: ");
        System.out.println(getVisualValue());
        System.out.print("Scoring Value: ");
        System.out.println(String.valueOf(getScoringValue()));
        System.out.println("");
    }
//CONSTRUCTOR Methods
    public Card(){
        //this is the default constructor method for this object
    }
    public Card(byte inputIndex, String inputVisualValue, String inputSuit, String inputColor){
        index = inputIndex;
        visualValue = inputVisualValue;
        suit = inputSuit;
        color = inputColor;
    }
    public Card(byte inputIndex, String inputVisualValue, int inputScoringValue, String inputSuit, String inputColor){
        index = inputIndex;
        visualValue = inputVisualValue;
        scoringValue = inputScoringValue;
        suit = inputSuit;
        color = inputColor;
    }
}
