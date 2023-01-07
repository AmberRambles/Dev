package javaCards;

public class Card {
//declare and define attributes with default values
    private byte index = 53; //default to invalid value for 52 card deck
    private String visualValue = "UNINITIALIZED_VALUE";
    private int scoringValue = 0; //defaults to a non-scoring card value
    private String suit = "UNINITIALIZED_SUIT";
    private String color = "UNINITIALIZED_COLOR";
    private String location = "UNINITIALIZED_LOCATION";
    private int locationPosition = -1; //default to invalid position in stack, normal flow is 0 = bottom and greatest value is the top of stack
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
    public String getLocation(){
        return location;
    }
    public int getLocationPosition(){
        return locationPosition;
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
    public void setLocation (String inputLocation){
        location = inputLocation;
    }
    public void setLocationPosition (int inputLocationPosition){
        locationPosition = inputLocationPosition;
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
        System.out.print("Location: ");
        System.out.println(getLocation());
        System.out.print("Location Position: ");
        System.out.println(String.valueOf(getLocationPosition()));
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
    public Card(byte inputIndex, String inputVisualValue, String inputSuit, String inputColor, String inputLocation){
        index = inputIndex;
        visualValue = inputVisualValue;
        suit = inputSuit;
        color = inputColor;
        location = inputLocation;
    }
    public Card(byte inputIndex, String inputVisualValue, String inputSuit, String inputColor, String inputLocation, int inputLocationPosition){
        index = inputIndex;
        visualValue = inputVisualValue;
        suit = inputSuit;
        color = inputColor;
        location = inputLocation;
        locationPosition = inputLocationPosition;
    }
    public Card(byte inputIndex, String inputVisualValue, int inputScoringValue, String inputSuit, String inputColor, String inputLocation){
        index = inputIndex;
        visualValue = inputVisualValue;
        scoringValue = inputScoringValue;
        suit = inputSuit;
        color = inputColor;
        location = inputLocation;
    }
    public Card(byte inputIndex, String inputVisualValue, int inputScoringValue, String inputSuit, String inputColor, String inputLocation, int inputLocationPosition){
        index = inputIndex;
        visualValue = inputVisualValue;
        scoringValue = inputScoringValue;
        suit = inputSuit;
        color = inputColor;
        location = inputLocation;
        locationPosition = inputLocationPosition;
    }
}
