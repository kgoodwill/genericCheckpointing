package genericCheckpointing.util;

import genericCheckpointing.server.StoreRestoreI;
import genericCheckpointing.server.RestoreI;
import genericCheckpointing.server.StoreI;
import genericCheckpointing.xmlStoreRestore.StoreRestoreHandler;
import java.lang.reflect.Proxy;

public class ProxyCreator{
  
  //Constructor
  public ProxyCreator(){

  }

  public StoreRestoreI createProxy(){
    StoreRestoreHandler handler = new StoreRestoreHandler();
    Class[] interfaceArray = new Class[] {StoreI.class, RestoreI.class};
    StoreRestoreI serDeserObj = (StoreRestoreI)Proxy.newProxyInstance(getClass().getClassLoader(), interfaceArray, handler);
    return serDeserObj;
  }

}