package socialnetwork;

import java.util.HashMap;


/*
Need the server to wrap all machines which store the data

*/
public class Server {
  HashMap<Integer, Machine> machines = new HashMap<Integer, Machine>();
  HashMap<Integer, Integer> personToMachineMap = new HashMap<>();

  public Machine getMachineWithId(int machineID) {
    return machines.get(machineID);
  }

  public getMachineIDForUser(int personID) {
    Integer machineID = personToMachineMap(personID);
    return machineID == null ? -1 : machineID;
  }








}
