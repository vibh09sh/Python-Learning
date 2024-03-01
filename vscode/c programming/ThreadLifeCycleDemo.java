public class ThreadLifeCycleDemo {
  public static void main(String[] args) {
  Thread thread = new Thread(new MyRunnable());
  System.out.println("Thread state: " + thread.getState());
  thread.start();
  System.out.println("Thread state: " + thread.getState());
  try {
  Thread.sleep(1000);
  System.out.println("Thread state: " + thread.getState());
  Thread.sleep(2000);
  System.out.println("Thread state: " + thread.getState());
  thread.join();
  System.out.println("Thread state: " + thread.getState());
  } catch (InterruptedException e) {
  e.printStackTrace();
  }
  }
  static class MyRunnable implements Runnable {
  public void run() {
  try {
  System.out.println("Thread state: " + Thread.currentThread().getState());
  Thread.sleep(3000);
  } catch (InterruptedException e) {
  e.printStackTrace();
  }
   }
   }
  }