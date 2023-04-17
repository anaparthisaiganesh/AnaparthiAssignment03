package Threads;

public class ThreadExample implements Runnable{
public ThreadExample(){
}
public void run() {
System.out.println("thread started.");
} 

public class ThreadDriver {
public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Starting Main Thread...");
ThreadExample th = new ThreadExample();
Thread M = new Thread(th);
M.start();
System.out.println("End of Main Thread...");
}
}
}
