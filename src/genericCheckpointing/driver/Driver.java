package genericCheckpointing.driver;

public class Driver{

  //Constructor
  public Driver(){

  }

  public static void main(String[] args){
    if(args.length != 2){
      System.out.println("Usage: ant run -Dcommand=<input_command>");
    }
    if(args[1].equals("ser")){
      System.out.println("Serialize Me!");
    }
    else if(args[1].equals("deser")){
      System.out.println("Deserialize Me!");
    }
    else{
      System.out.println("Serialize then Deserialize");
    }
  }
}