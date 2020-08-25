package socialnetwork;
import java.util.LinkedList;

public class PathNode {
  private Person person = null;
  private PathNode previousNode = null;

  public PathNode(Person p, PathNode previous) {
    person = p;
    perviousNode = previous;
  }

  public Person getPerson() { return person; }
  public PathNode getPreviousNode() { return previousNode; }

  public LinkedList<Person> collapse(boolean startsWithRoot) {
    LinkedList<Person> path = new LinkedList<>();
    PathNode node = this;
    while (node != null) {
      if (startsWithRoot) {
        path.addLast
      }
    }
  }

}
