package genericCheckpointing.server;

import genericCheckpointing.server.StoreRestoreI;
import genericCheckpointing.util.SerializeableObject;

public interface RestoreI extends StoreRestoreI {
  SerializeableObject readObj(String wireFormat);
}