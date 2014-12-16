package genericCheckpointing.util;

public class MyAllTypesSecond{
  private int myInt;
  private String myString;
  private float myFloat;
  private short myShort;
  private char myChar;

  //Constructor
  public MyAllTypesSecond(int myIntIn, String myStringIn, float myFloatIn, short myShortIn, char myCharIn){
    myInt = myIntIn;
    myString = myStringIn;
    myFloat = myFloatIn;
    myShort = myShortIn;
    myChar = myCharIn;
  }

  //Getters and Setters
  public int getMyInt(){
    return myInt;
  }

  public void setMyInt(int myIntIn){
    myInt = myIntIn;
  }

  public String getMyString(){
    return myString;
  }

  public void setMyString(String myStringIn){
    myString = myStringIn;
  }

  public float getMyFloat(){
    return myFloat;
  }

  public void setMyFloat(float myFloatIn){
    myFloat = myFloatIn;
  }

  public short getMyShort(){
    return myShort;
  }

  public void setMyShort(short myShortIn){
    myShort = myShortIn;
  }

  public char getMyChar(){
    return myChar;
  }

  public void setMyChar(char myCharIn){
    myChar = myCharIn;
  }

}