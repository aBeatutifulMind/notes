package socialnetwork;
import java.util.ArrayList;


public class Person {
  private ArrayList<Integer> friends = new ArrayList<>();
  private int personID;
  private String info;

  public Person(int id) { this.personID = id; }
  public int getPersonId() { return this.personID; }
  public String getInfo() { return this.info; }
  public void setInfo(String info) { this.info = info; }
  public ArrayList<Integer> getFriends() { return friends; }

  public void addFriend(int id) { friends.add(id); }
  public Integer removeFriend(int id) { return friends.remove(id); }


}
