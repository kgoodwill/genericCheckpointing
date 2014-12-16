package genericCheckpointing.util;

public class MyAllTypesFirst{
  private int myInt;
  private String myString;
  private double myDouble;
  private long myLong;
  private char myChar;

  //Constructor
  public MyAllTypesFirst(int myIntIn, String myStringIn, double myDoubleIn, long myLongIn, char myCharIn){
    myInt = myIntIn;
    myString = myStringIn;
    myDouble = myDoubleIn;
    myLong = myLongIn;
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

  public double getMyDouble(){
    return myDouble;
  }

  public void setMyDouble(double myDoubleIn){
    myDouble = myDoubleIn;
  }

  public long getMyLong(){
    return myLong;
  }

  public void setMyLong(long myLongIn){
    myLong = myLongIn;
  }

  public char getMyChar(){
    return myChar;
  }

  public void setMyChar(char myCharIn){
    myChar = myCharIn;
  }

}