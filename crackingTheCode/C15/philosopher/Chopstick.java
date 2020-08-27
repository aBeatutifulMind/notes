import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Chopstick {
  private Lock lock;

  public Chopstick() {
    lock = new ReentrantLock();
  }

  public void pickUp() {
    System.out.println("action: pick up...")
    lock.lock();
  }

  public void putDown() {
    System.out.println("action: put down...")
    lock.unlock();
  }
}
