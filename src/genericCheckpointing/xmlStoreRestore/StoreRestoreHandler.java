package genericCheckpointing.xmlStoreRestore;

import genericCheckpointing.server.StoreI;
import genericCheckpointing.server.RestoreI; 
import genericCheckpointing.util.FileProcessor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StoreRestoreHandler implements InvocationHandler{

  private String fileName;
  private FileProcessor processor;

  //Constructor
  public StoreRestoreHandler(){
    this.fileName = "";
    this.processor = null;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
    String methodName = method.getName();
    Class className = method.getDeclaringClass();

    if(className.equals(RestoreI.class) && methodName .equals("readObj")){
      System.out.println("Parse XML and Restore the Objects");
    }

    if(className.equals(StoreI.class) && methodName.equals("writeObj")){
      System.out.println("Read the Objects and Create XML from them");
    }
    return null;
  }
}