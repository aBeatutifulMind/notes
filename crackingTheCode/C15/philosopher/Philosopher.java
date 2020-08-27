class Philosopher extends Thread {
  private int bites = 10;
  private Chopstick left, right;

  public Philosopher(Chopstick left, Chopstick right) {
    this.left = left;
    this.right = right;
  }

  public void eat() {
    System.out.println(this.toString() + " is about to eat: ");
    pickUp();
    chew();
    putDown();
  }

  public void pickUp() {
    left.pickUp();
    right.pickUp();
  }

  public void chew() { System.out.println(" Chewing! "); }

  public void putDown() {
    right.putDown();
    left.putDown();
  }

  public void run() {
    for (int i = 0; i < bites; i++) {
      eat();
    }
  }


  public static void main(String[] args) throws Exception {
    Philosopher p = new Philosopher();
    p.run();
  }
}
