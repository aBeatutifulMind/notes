import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.Collections;

/**
* what can be learned from this Q:
* 1. super brute force way to solve the problem
*
*/



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


  public ArrayList<Box> randomCreateBoxes(int number) {
    if (number < 0) { throw new IllegalArgumentException(); }
    ArrayList<Box> boxes = new ArrayList<>();
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

  public int createStack(ArrayList<Box> boxes, int bottomIndex) {
    Box bottom =boxes.get(bottomIndex);
    int maxHeight = 0;
    for (int i = bottomIndex + 1; i < boxes.size(); i++) {
      int height = createStack(boxes, i);
      maxHeight = Math.max(height, maxHeight);
    }
    maxHeight += bottom.height;
    return maxHeight;
  }

  public int createStack(ArrayList<Box> boxes) {
    Collections.sort(boxes, new BoxComparator());
    int maxHeight = 0;
    for (int i = 0; i < boxes.size(); i++) {
      int height = createStack(boxes, i);
      maxHeight = Math.max(height, maxHeight);
    }
    return maxHeight;
  }








  // 
  // public static void main(String[] args) {
  //   // StackOfBoxes s = new StackOfBoxes();
  //   // ArrayList<Box> boxes = s.randomCreateBoxes(5);
  //   // int height = s.createStack(boxes);
  //   // System.out.println(height);
  //   System.out.println("asb");
  // }










}
