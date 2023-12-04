
class SingletonExample {

  private static SingletonExample instance;
  private String message;

  private SingletonExample() {
    message = "Single instance";
  }

  public static SingletonExample getInstance() {
    if (instance == null) {
      synchronized (SingletonExample.class) {
        if (instance == null) {
          instance = new SingletonExample();
        }
      }

    }
    return instance;

  }

  public void displayMessage() {
    System.out.println(message);
  }
}

public class SingletonClient1 {

  public static void main(String[] args) {

    Thread thread1 = new Thread(() -> {
      SingletonExample example1 = SingletonExample.getInstance();
      example1.displayMessage();
    });

    Thread thread2 = new Thread(() -> {
      SingletonExample example2 = SingletonExample.getInstance();
      example2.displayMessage();
    });

    thread1.start();
    thread2.start();

  }

}
