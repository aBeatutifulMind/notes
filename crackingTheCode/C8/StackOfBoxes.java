import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Collections;


public class StackOfBoxes {


  // box class
  public class Box {
    int width;
    int height;
    int depth;

    public Box(int w, int h, int d) {
      width = w;
      height = h;
      depth = d;
    }

    @Override
    public String toString() {
      return width  + "\t" + height +  "\t" +  depth;
    }
  }


  // Comparator class
  public class BoxComparator implements Comparator<Box> {
    @Override
    public int compare(Box x, Box y) {
      return y.height - x.height;
    }
  }


  public List<Box> randomCreateBoxes(int number) {
    if (number < 0) { throw new IllegalArgumentException(); }
    List<Box> boxes = new ArrayList<>();
    Random rg = new Random();
    int counter = 0;
    while (counter < number) {
      counter++;
      Box box = new Box(rg.nextInt(20), rg.nextInt(20), rg.nextInt(20));
      boxes.add(box);
    }
    return boxes;
  }

  public BoxComparator genBoxCom() {
    return new BoxComparator();
  }









  public static void main(String[] args) {
    StackOfBoxes s = new StackOfBoxes();
    List<Box> boxes = s.randomCreateBoxes(5);
    BoxComparator bc = s.genBoxCom();
    boxes.forEach((box) -> { System.out.println(box); });
    Collections.sort(boxes, bc);
    boxes.forEach((box) -> { System.out.println(box); });
  }// end of main
//
//

}// the end of class

ass
