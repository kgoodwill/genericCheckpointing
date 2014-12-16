package genericCheckpointing.util;

import genericCheckpointing.server.StoreRestoreI;

public class ProxyCreator{
  
  //Constructor
  public ProxyCreator(){

  }

  public Proxy createProxy(){
    StoreRestoreI serDeserObj = (StoreRestoreI)Proxy.newProxyInstance(
      getClass().getClassLoader(),
      interfaceArray,
      handler
    );
  }

}