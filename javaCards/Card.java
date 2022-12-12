package javaCards;

public class Card {
//declare and define attributes with default values
    private byte index = 53;
    private String visualValue = "UNINITIALIZED_VALUE";
    private byte scoringValue = 0;
    private String suit = "UNINITIALIZED_SUIT";
    private String color = "UNINITIALIZED_COLOR";
//GET Methods
    public byte getIndex() {
        return index;
    }
    public String getVisualValue() {
        return visualValue;
    }
    public byte getScoringValue() {
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
    public void setScoringValue (byte inputScoringValue){
        scoringValue = inputScoringValue;
    }
    public void setSuit (String inputSuit){
        suit = inputSuit;
    }
    public void setColor (String inputColor){
        color = inputColor;
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
    public Card(byte inputIndex, String inputVisualValue, byte inputScoringValue, String inputSuit, String inputColor){
        index = inputIndex;
        visualValue = inputVisualValue;
        scoringValue = inputScoringValue;
        suit = inputSuit;
        color = inputColor;
    }
}
